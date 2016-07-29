package com.welink.commons.persistence;

import com.welink.commons.domain.WeiXinBackDO;
import com.welink.commons.domain.WeiXinBackDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeiXinBackDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int countByExample(WeiXinBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int deleteByExample(WeiXinBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int insert(WeiXinBackDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int insertSelective(WeiXinBackDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    List<WeiXinBackDO> selectByExample(WeiXinBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    WeiXinBackDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int updateByExampleSelective(@Param("record") WeiXinBackDO record, @Param("example") WeiXinBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int updateByExample(@Param("record") WeiXinBackDO record, @Param("example") WeiXinBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int updateByPrimaryKeySelective(WeiXinBackDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_back
     *
     * @mbggenerated Thu Feb 05 11:56:30 CST 2015
     */
    int updateByPrimaryKey(WeiXinBackDO record);
}