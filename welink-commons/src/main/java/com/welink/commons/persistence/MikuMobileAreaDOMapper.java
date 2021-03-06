package com.welink.commons.persistence;

import com.welink.commons.domain.MikuMobileAreaDO;
import com.welink.commons.domain.MikuMobileAreaDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuMobileAreaDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int countByExample(MikuMobileAreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int deleteByExample(MikuMobileAreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int insert(MikuMobileAreaDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int insertSelective(MikuMobileAreaDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    List<MikuMobileAreaDO> selectByExampleWithRowbounds(MikuMobileAreaDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    List<MikuMobileAreaDO> selectByExample(MikuMobileAreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    MikuMobileAreaDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuMobileAreaDO record, @Param("example") MikuMobileAreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int updateByExample(@Param("record") MikuMobileAreaDO record, @Param("example") MikuMobileAreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int updateByPrimaryKeySelective(MikuMobileAreaDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mobile_area
     *
     * @mbggenerated Mon Jan 04 15:12:58 CST 2016
     */
    int updateByPrimaryKey(MikuMobileAreaDO record);
}