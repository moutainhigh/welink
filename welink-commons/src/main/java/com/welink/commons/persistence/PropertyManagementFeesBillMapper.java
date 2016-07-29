package com.welink.commons.persistence;

import com.welink.commons.domain.PropertyManagementFeesBill;
import com.welink.commons.domain.PropertyManagementFeesBillExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyManagementFeesBillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int countByExample(PropertyManagementFeesBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByExample(PropertyManagementFeesBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insert(PropertyManagementFeesBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insertSelective(PropertyManagementFeesBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<PropertyManagementFeesBill> selectByExampleWithRowbounds(PropertyManagementFeesBillExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<PropertyManagementFeesBill> selectByExample(PropertyManagementFeesBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    PropertyManagementFeesBill selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") PropertyManagementFeesBill record, @Param("example") PropertyManagementFeesBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExample(@Param("record") PropertyManagementFeesBill record, @Param("example") PropertyManagementFeesBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKeySelective(PropertyManagementFeesBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pmf_bill
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKey(PropertyManagementFeesBill record);
}