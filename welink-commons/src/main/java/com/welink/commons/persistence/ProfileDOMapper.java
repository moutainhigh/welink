package com.welink.commons.persistence;

import com.welink.commons.domain.ProfileDO;
import com.welink.commons.domain.ProfileDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int countByExample(ProfileDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int deleteByExample(ProfileDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int insert(ProfileDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int insertSelective(ProfileDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    List<ProfileDO> selectByExampleWithRowbounds(ProfileDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    List<ProfileDO> selectByExample(ProfileDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    ProfileDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int updateByExampleSelective(@Param("record") ProfileDO record, @Param("example") ProfileDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int updateByExample(@Param("record") ProfileDO record, @Param("example") ProfileDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int updateByPrimaryKeySelective(ProfileDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Mon Jan 04 14:44:53 CST 2016
     */
    int updateByPrimaryKey(ProfileDO record);
}