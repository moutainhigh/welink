package com.welink.commons.persistence;

import com.welink.commons.domain.AlipayBackDO;
import com.welink.commons.domain.AlipayBackDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlipayBackDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int countByExample(AlipayBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int deleteByExample(AlipayBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int insert(AlipayBackDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int insertSelective(AlipayBackDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    List<AlipayBackDO> selectByExample(AlipayBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    AlipayBackDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int updateByExampleSelective(@Param("record") AlipayBackDO record, @Param("example") AlipayBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int updateByExample(@Param("record") AlipayBackDO record, @Param("example") AlipayBackDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int updateByPrimaryKeySelective(AlipayBackDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipay_back
     *
     * @mbggenerated Thu Jan 15 16:51:56 CST 2015
     */
    int updateByPrimaryKey(AlipayBackDO record);
}