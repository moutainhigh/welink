package com.welink.web.resource.hpage;

import com.daniel.weixin.mp.api.WxMpService;
import com.daniel.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import com.daniel.weixin.mp.bean.result.WxMpUser;
import com.welink.biz.service.ProfileExtService;
import com.welink.biz.service.UserService;
import com.welink.biz.util.TimeUtils;
import com.welink.buy.utils.PhenixUserHander;
import com.welink.commons.Env;
import com.welink.commons.commons.BizConstants;
import com.welink.commons.domain.ProfileDO;
import com.welink.web.common.filter.Profiler;
import com.welink.web.common.util.ParameterUtil;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;

/**
 * Created by daniel on 15-3-6.
 */
@Controller
public class NewerGift {

    private static org.slf4j.Logger log = LoggerFactory.getLogger(NewerGift.class);

    @Resource
    private Env env;

    @Resource
    private WxMpService wxMpService;

    @Resource
    private UserService userService;

    @Resource
    private ProfileExtService profileExtService;

    @RequestMapping(value = {"/api/h/1.0/newerGift.htm"}, produces = "text/html;charset=utf-8")
    public String execute(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
        //params
        String code = ParameterUtil.getParameter(request, BizConstants.WX_PARAM_CODE);
        String state = ParameterUtil.getParameter(request, BizConstants.WX_PARAM_STATE);
        String openid = null;
        org.apache.shiro.subject.Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        if (StringUtils.isNotBlank(state) && !StringUtils.equalsIgnoreCase("null", state)) {
            session.setAttribute(BizConstants.WEIXIN_MP_STATE, state);
        }
        session.setTimeout(TimeUtils.TIME_1_MONTH_MILi);
        long profileId = -1l;
        if (null != session.getAttribute(BizConstants.PROFILE_ID)) {
            profileId = (long) session.getAttribute(BizConstants.PROFILE_ID);
            model.addAttribute(BizConstants.PROFILE_ID, session.getAttribute(BizConstants.PROFILE_ID));
            model.addAttribute(BizConstants.P_USER_ID, PhenixUserHander.encodeUserId((Long) session.getAttribute(BizConstants.PROFILE_ID)));
        }
        //设置Host参数
        setHost(model);
        //设置JS CSS时间参数
        model.addAttribute("ver", new Date().getTime() / (1000 * 60 * 60 * 24));
        model.addAttribute("time", new Date().getTime());
        //微信相关信息获取
        if (null != session && StringUtils.isNotBlank((String) session.getAttribute(BizConstants.OPENID))) {
            model.addAttribute(BizConstants.OPENID, (String) session.getAttribute(BizConstants.OPENID));
            if (null != session.getAttribute(BizConstants.PROFILE_ID)) {
                model.addAttribute(BizConstants.PROFILE_ID, session.getAttribute(BizConstants.PROFILE_ID));
            }
        } else {
            try {
                if (StringUtils.isNotBlank(code)) {
                    Profiler.enter(" fetch wechat user info  wechat oauth....  ");
                    log.info("user enter fetch wechat page code id is not null  ... sesionid:" + session.getId());
                    WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
                    Profiler.release();
                    if (null != wxMpOAuth2AccessToken) {
                        log.info("user enter fetch wechat page wxMpOAuth2 access token id is not null  ... sesionid:" + session.getId());
                        WxMpUser user = null;
                        openid = wxMpOAuth2AccessToken.getOpenId();
                        if (StringUtils.isNotEmpty(openid)) {
                            if (profileId>0){
                                profileExtService.updateOpenId(openid,profileId);
                            }
                            model.addAttribute(BizConstants.OPENID, openid);
                            user = wxMpService.userInfo(wxMpOAuth2AccessToken.getOpenId(), BizConstants.WX_LANG, state);
                            String unionId = null;
                            if (null != user) {
                                unionId = user.getUnionId();
                            }
                            //update微信存储信息
                            userService.updateProfileWechatInfo(user);
                            log.info("user enter fetch wechat page open id is not null  ... sesionid:" + session.getId() + ",openid:" + openid);
                            boolean hasFetchedWxInfo = userService.isOauthed(wxMpOAuth2AccessToken.getOpenId());
                            if (!hasFetchedWxInfo) {//未存储过微信用户信息profile wechat
                                //获取微信用户信息并存储
                                log.info("user enter fetch wechat page not store profile wechat info yet  ... sesionid:" + session.getId() + ",openid:" + openid);
                                Profiler.enter(" fetch wechat user info  wechat user....  ");
                                Profiler.release();
                                if (null != user) {
                                    log.info("user enter fetch wechat page user is not null  ... sesionid:" + session.getId() + ",openid:" + openid);
                                    if (!userService.addWechatInfoByToken(user, wxMpOAuth2AccessToken)) {
                                        log.error("insert wechat user info failed. openId:" + wxMpOAuth2AccessToken.getOpenId() + " sessionid:" + session.getId().toString());
                                    } else {
                                        session.setAttribute(BizConstants.OPENID, wxMpOAuth2AccessToken.getOpenId());
                                        Cookie cookie = new Cookie(BizConstants.JSESSION_ID, session.getId().toString());
                                        cookie.setMaxAge(TimeUtils.TIME_1_MONTH_SEC);
                                        cookie.setPath("/");
                                        response.addCookie(cookie);
                                        log.info("user enter fetch wechat page not store profile wechat info sucess  ... sesionid:" + session.getId() + ",openid:" + openid);
                                    }
                                } else {
                                    log.info("user enter fetch wechat page not store profile  user is null  ... sesionid:" + session.getId() + ",openid:" + openid);
                                    log.error("fetch wechat user info failed. maybe user refresh home page..." + " sessionid:" + session.getId().toString());
                                }
                            } else {//存储过profile wechat 用户微信信息
                                if (profileId < 0) {
                                    profileId = userService.fetchProfileIdByOpenid(openid);
                                }
                                if (profileId > 0) {
                                    profileExtService.updateLastLogin(profileId);
                                    session.setAttribute(BizConstants.PROFILE_ID, profileId);
                                    ProfileDO profileDO = userService.fetchProfileById(profileId);
                                    profileExtService.updateLastLogin(profileId);
                                    if(null != profileDO){
                                    	 session.setAttribute("isAgency", null == profileDO.getIsAgency() ? "0" : profileDO.getIsAgency());
                                    }
                                    model.addAttribute(BizConstants.PROFILE_ID, profileId);
                                    session.setAttribute(BizConstants.OPENID, wxMpOAuth2AccessToken.getOpenId());
                                    Cookie cookie = new Cookie(BizConstants.JSESSION_ID, session.getId().toString());
                                    cookie.setMaxAge(TimeUtils.TIME_1_MONTH_SEC);
                                    cookie.setPath("/");
                                    response.addCookie(cookie);
                                    log.info("user enter fetch wechat page has   profile id   ... sesionid:" + session.getId() + ",openid:" + openid);
                                } else {
                                    session.setAttribute(BizConstants.OPENID, wxMpOAuth2AccessToken.getOpenId());
                                    Cookie cookie = new Cookie(BizConstants.JSESSION_ID, session.getId().toString());
                                    cookie.setMaxAge(TimeUtils.TIME_1_MONTH_SEC);
                                    cookie.setPath("/");
                                    response.addCookie(cookie);
                                    log.info("user enter fetch wechat page  no profile id  ... sesionid:" + session.getId() + ",openid:" + openid);
                                }
                            }
                            if (profileId < 0) {
                                profileId = userService.checkWxMpBinded(unionId);
                            }
                            if (profileId > 0) {
                                session.setAttribute(BizConstants.PROFILE_ID, profileId);
                                ProfileDO profileDO = userService.fetchProfileById(profileId);
                                profileExtService.updateLastLogin(profileId);
                                if(null != profileDO){
                                	 session.setAttribute("isAgency", null == profileDO.getIsAgency() ? "0" : profileDO.getIsAgency());
                                }
                                model.addAttribute(BizConstants.PROFILE_ID, profileId);
                            }
                        } else {
                            log.error("从微信获取wxMpOauth2AccessToken failed.  openid is null..." + " sessionid:" + session.getId().toString());
                        }
                    }
                }
                //不在微信公众环境/获取不到微信信息
                else {
                    if (null != session) {
                        model.addAttribute(BizConstants.OPENID, (String) session.getAttribute(BizConstants.OPENID));
                        model.addAttribute(BizConstants.PROFILE_ID, session.getAttribute(BizConstants.PROFILE_ID));
                    }
                }
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                log.error("fetch wechat info failed. exp:" + e.getCause() + ",Message:" + e.getMessage() + " sessionid:" + session.getId().toString());
                buildStoredOpenid(session, response, model);
            }
        }
        if (null != session.getAttribute(BizConstants.PROFILE_ID)) {
            model.addAttribute(BizConstants.PROFILE_ID, session.getAttribute(BizConstants.PROFILE_ID));
        }
        //设置默认站点信息
        userService.setCommunity(model, session, response, profileId);
        return "newerGift";
    }

    private void setHost(ModelMap model) {
        if (env.isProd()) {
            model.addAttribute(BizConstants.HOST, BizConstants.H5_SEVEN_NB_HOST);
        } else {
            model.addAttribute(BizConstants.HOST, BizConstants.H5_WEILINJIA_HOST);
        }
    }

    private void buildStoredOpenid(Session session, HttpServletResponse response, ModelMap model) {
        String openId;
        String tmpOpenid = (String) session.getAttribute(BizConstants.OPENID);
        if (StringUtils.isNotBlank(tmpOpenid)) {
            model.addAttribute(BizConstants.OPENID, tmpOpenid);
            openId = tmpOpenid;
            long profileId = userService.fetchProfileIdByOpenid(openId);
            if (profileId > 0) {
                profileExtService.updateLastLogin(profileId);
                session.setAttribute(BizConstants.PROFILE_ID, profileId);
                ProfileDO profileDO = userService.fetchProfileById(profileId);
                profileExtService.updateLastLogin(profileId);
                if(null != profileDO){
                	 session.setAttribute("isAgency", null == profileDO.getIsAgency() ? "0" : profileDO.getIsAgency());
                }
                model.addAttribute(BizConstants.PROFILE_ID, profileId);
                session.setAttribute(BizConstants.OPENID, openId);
                Cookie cookie = new Cookie(BizConstants.JSESSION_ID, session.getId().toString());
                cookie.setMaxAge(TimeUtils.TIME_1_MONTH_SEC);
                cookie.setPath("/");
                response.addCookie(cookie);
                log.info("pre fetch... user enter set sessionid and openid has profile ... sesionid:" + session.getId() + ",openid:" + openId);
            } else {
                session.setAttribute(BizConstants.OPENID, openId);
                Cookie cookie = new Cookie(BizConstants.JSESSION_ID, session.getId().toString());
                cookie.setMaxAge(TimeUtils.TIME_1_MONTH_SEC);
                cookie.setPath("/");
                response.addCookie(cookie);
                log.info("pre fetch ... user enter set sessionid and openid has profile ... sesionid:" + session.getId() + ",openid:" + openId);
            }
        } else {
            log.error("fetch tmpOpenid is null too ... sessionid:" + session.getId().toString());
        }
    }
}
