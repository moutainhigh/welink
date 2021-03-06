package com.welink.commons.persistence;

import com.welink.commons.domain.MikuShareLevelDO;
import com.welink.commons.domain.MikuShareLevelDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuShareLevelDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int countByExample(MikuShareLevelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int deleteByExample(MikuShareLevelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int insert(MikuShareLevelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int insertSelective(MikuShareLevelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    List<MikuShareLevelDO> selectByExampleWithRowbounds(MikuShareLevelDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    List<MikuShareLevelDO> selectByExample(MikuShareLevelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    MikuShareLevelDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuShareLevelDO record, @Param("example") MikuShareLevelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int updateByExample(@Param("record") MikuShareLevelDO record, @Param("example") MikuShareLevelDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int updateByPrimaryKeySelective(MikuShareLevelDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_level
     *
     * @mbggenerated Sat Mar 05 16:40:43 CST 2016
     */
    int updateByPrimaryKey(MikuShareLevelDO record);
}