package com.welink.commons.persistence;

import com.welink.commons.domain.MikuMineCourseSbDO;
import com.welink.commons.domain.MikuMineCourseSbDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuMineCourseSbDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int countByExample(MikuMineCourseSbDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int deleteByExample(MikuMineCourseSbDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int insert(MikuMineCourseSbDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int insertSelective(MikuMineCourseSbDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    List<MikuMineCourseSbDO> selectByExampleWithRowbounds(MikuMineCourseSbDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    List<MikuMineCourseSbDO> selectByExample(MikuMineCourseSbDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    MikuMineCourseSbDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuMineCourseSbDO record, @Param("example") MikuMineCourseSbDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int updateByExample(@Param("record") MikuMineCourseSbDO record, @Param("example") MikuMineCourseSbDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int updateByPrimaryKeySelective(MikuMineCourseSbDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_course_sb
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int updateByPrimaryKey(MikuMineCourseSbDO record);
}