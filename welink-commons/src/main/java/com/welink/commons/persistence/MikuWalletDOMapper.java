package com.welink.commons.persistence;

import com.welink.commons.domain.MikuWalletDO;
import com.welink.commons.domain.MikuWalletDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuWalletDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int countByExample(MikuWalletDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int deleteByExample(MikuWalletDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int insert(MikuWalletDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int insertSelective(MikuWalletDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    List<MikuWalletDO> selectByExampleWithRowbounds(MikuWalletDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    List<MikuWalletDO> selectByExample(MikuWalletDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    MikuWalletDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuWalletDO record, @Param("example") MikuWalletDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int updateByExample(@Param("record") MikuWalletDO record, @Param("example") MikuWalletDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int updateByPrimaryKeySelective(MikuWalletDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    int updateByPrimaryKey(MikuWalletDO record);
}