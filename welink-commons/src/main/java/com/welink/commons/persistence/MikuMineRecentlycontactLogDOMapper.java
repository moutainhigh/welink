package com.welink.commons.persistence;

import com.welink.commons.domain.MikuMineRecentlycontactLogDO;
import com.welink.commons.domain.MikuMineRecentlycontactLogDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuMineRecentlycontactLogDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int countByExample(MikuMineRecentlycontactLogDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int deleteByExample(MikuMineRecentlycontactLogDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int insert(MikuMineRecentlycontactLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int insertSelective(MikuMineRecentlycontactLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    List<MikuMineRecentlycontactLogDO> selectByExampleWithRowbounds(MikuMineRecentlycontactLogDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    List<MikuMineRecentlycontactLogDO> selectByExample(MikuMineRecentlycontactLogDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    MikuMineRecentlycontactLogDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuMineRecentlycontactLogDO record, @Param("example") MikuMineRecentlycontactLogDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int updateByExample(@Param("record") MikuMineRecentlycontactLogDO record, @Param("example") MikuMineRecentlycontactLogDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int updateByPrimaryKeySelective(MikuMineRecentlycontactLogDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_recentlycontact_log
     *
     * @mbggenerated Wed Apr 20 16:18:39 CST 2016
     */
    int updateByPrimaryKey(MikuMineRecentlycontactLogDO record);
}