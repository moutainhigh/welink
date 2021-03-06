package com.welink.commons.persistence;

import com.welink.commons.domain.GrouponDO;
import com.welink.commons.domain.GrouponDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface GrouponDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int countByExample(GrouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByExample(GrouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insert(GrouponDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insertSelective(GrouponDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<GrouponDO> selectByExampleWithRowbounds(GrouponDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<GrouponDO> selectByExample(GrouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    GrouponDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") GrouponDO record, @Param("example") GrouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExample(@Param("record") GrouponDO record, @Param("example") GrouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKeySelective(GrouponDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table groupon
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKey(GrouponDO record);
}