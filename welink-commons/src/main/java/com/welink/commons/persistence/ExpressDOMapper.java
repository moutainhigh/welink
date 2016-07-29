package com.welink.commons.persistence;

import com.welink.commons.domain.ExpressDO;
import com.welink.commons.domain.ExpressDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpressDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int countByExample(ExpressDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByExample(ExpressDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insert(ExpressDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insertSelective(ExpressDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<ExpressDO> selectByExampleWithRowbounds(ExpressDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<ExpressDO> selectByExample(ExpressDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    ExpressDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") ExpressDO record, @Param("example") ExpressDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExample(@Param("record") ExpressDO record, @Param("example") ExpressDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKeySelective(ExpressDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKey(ExpressDO record);
}