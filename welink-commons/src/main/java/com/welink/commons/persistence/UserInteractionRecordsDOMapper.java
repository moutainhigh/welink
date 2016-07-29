package com.welink.commons.persistence;

import com.welink.commons.domain.UserInteractionRecordsDO;
import com.welink.commons.domain.UserInteractionRecordsDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInteractionRecordsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int countByExample(UserInteractionRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int deleteByExample(UserInteractionRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int insert(UserInteractionRecordsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int insertSelective(UserInteractionRecordsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    List<UserInteractionRecordsDO> selectByExample(UserInteractionRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    UserInteractionRecordsDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int updateByExampleSelective(@Param("record") UserInteractionRecordsDO record, @Param("example") UserInteractionRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int updateByExample(@Param("record") UserInteractionRecordsDO record, @Param("example") UserInteractionRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int updateByPrimaryKeySelective(UserInteractionRecordsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_interaction_records
     *
     * @mbggenerated Mon Mar 09 15:35:12 CST 2015
     */
    int updateByPrimaryKey(UserInteractionRecordsDO record);
}