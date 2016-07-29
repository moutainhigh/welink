package com.welink.commons.domain;

import java.util.Date;

public class MikuCommentsReplyDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.version
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.comments_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private Long commentsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.content
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.pic_urls
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private String picUrls;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.user_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.user_name
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.user_mobile
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private String userMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.status
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.reply_user_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private Long replyUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.reply_user_name
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private String replyUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.reply_user_mobile
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private String replyUserMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.date_created
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_comments_reply.last_updated
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.id
     *
     * @return the value of miku_comments_reply.id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.id
     *
     * @param id the value for miku_comments_reply.id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.version
     *
     * @return the value of miku_comments_reply.version
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.version
     *
     * @param version the value for miku_comments_reply.version
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.comments_id
     *
     * @return the value of miku_comments_reply.comments_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public Long getCommentsId() {
        return commentsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.comments_id
     *
     * @param commentsId the value for miku_comments_reply.comments_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setCommentsId(Long commentsId) {
        this.commentsId = commentsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.content
     *
     * @return the value of miku_comments_reply.content
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.content
     *
     * @param content the value for miku_comments_reply.content
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.pic_urls
     *
     * @return the value of miku_comments_reply.pic_urls
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public String getPicUrls() {
        return picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.pic_urls
     *
     * @param picUrls the value for miku_comments_reply.pic_urls
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls == null ? null : picUrls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.user_id
     *
     * @return the value of miku_comments_reply.user_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.user_id
     *
     * @param userId the value for miku_comments_reply.user_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.user_name
     *
     * @return the value of miku_comments_reply.user_name
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.user_name
     *
     * @param userName the value for miku_comments_reply.user_name
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.user_mobile
     *
     * @return the value of miku_comments_reply.user_mobile
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.user_mobile
     *
     * @param userMobile the value for miku_comments_reply.user_mobile
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.status
     *
     * @return the value of miku_comments_reply.status
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.status
     *
     * @param status the value for miku_comments_reply.status
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.reply_user_id
     *
     * @return the value of miku_comments_reply.reply_user_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public Long getReplyUserId() {
        return replyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.reply_user_id
     *
     * @param replyUserId the value for miku_comments_reply.reply_user_id
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setReplyUserId(Long replyUserId) {
        this.replyUserId = replyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.reply_user_name
     *
     * @return the value of miku_comments_reply.reply_user_name
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public String getReplyUserName() {
        return replyUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.reply_user_name
     *
     * @param replyUserName the value for miku_comments_reply.reply_user_name
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setReplyUserName(String replyUserName) {
        this.replyUserName = replyUserName == null ? null : replyUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.reply_user_mobile
     *
     * @return the value of miku_comments_reply.reply_user_mobile
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public String getReplyUserMobile() {
        return replyUserMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.reply_user_mobile
     *
     * @param replyUserMobile the value for miku_comments_reply.reply_user_mobile
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setReplyUserMobile(String replyUserMobile) {
        this.replyUserMobile = replyUserMobile == null ? null : replyUserMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.date_created
     *
     * @return the value of miku_comments_reply.date_created
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.date_created
     *
     * @param dateCreated the value for miku_comments_reply.date_created
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_comments_reply.last_updated
     *
     * @return the value of miku_comments_reply.last_updated
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_comments_reply.last_updated
     *
     * @param lastUpdated the value for miku_comments_reply.last_updated
     *
     * @mbggenerated Thu Jan 07 16:40:59 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}