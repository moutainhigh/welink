package com.welink.commons.persistence;

import com.welink.commons.domain.OrderEvaluateDO;
import com.welink.commons.domain.OrderEvaluateDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderEvaluateDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int countByExample(OrderEvaluateDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByExample(OrderEvaluateDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insert(OrderEvaluateDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insertSelective(OrderEvaluateDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<OrderEvaluateDO> selectByExampleWithRowbounds(OrderEvaluateDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<OrderEvaluateDO> selectByExample(OrderEvaluateDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    OrderEvaluateDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") OrderEvaluateDO record, @Param("example") OrderEvaluateDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExample(@Param("record") OrderEvaluateDO record, @Param("example") OrderEvaluateDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKeySelective(OrderEvaluateDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_evaluate
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKey(OrderEvaluateDO record);
}