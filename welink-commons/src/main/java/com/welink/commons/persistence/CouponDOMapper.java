package com.welink.commons.persistence;

import com.welink.commons.domain.CouponDO;
import com.welink.commons.domain.CouponDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int countByExample(CouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int deleteByExample(CouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int insert(CouponDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int insertSelective(CouponDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    List<CouponDO> selectByExampleWithRowbounds(CouponDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    List<CouponDO> selectByExample(CouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    CouponDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int updateByExampleSelective(@Param("record") CouponDO record, @Param("example") CouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int updateByExample(@Param("record") CouponDO record, @Param("example") CouponDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int updateByPrimaryKeySelective(CouponDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Fri Dec 18 10:20:03 CST 2015
     */
    int updateByPrimaryKey(CouponDO record);
}