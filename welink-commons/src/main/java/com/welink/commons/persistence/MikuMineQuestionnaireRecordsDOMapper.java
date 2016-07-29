package com.welink.commons.persistence;

import com.welink.commons.domain.MikuMineQuestionnaireRecordsDO;
import com.welink.commons.domain.MikuMineQuestionnaireRecordsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
@Repository
public interface MikuMineQuestionnaireRecordsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int countByExample(MikuMineQuestionnaireRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int deleteByExample(MikuMineQuestionnaireRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int insert(MikuMineQuestionnaireRecordsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int insertSelective(MikuMineQuestionnaireRecordsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    List<MikuMineQuestionnaireRecordsDO> selectByExampleWithRowbounds(MikuMineQuestionnaireRecordsDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    List<MikuMineQuestionnaireRecordsDO> selectByExample(MikuMineQuestionnaireRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    MikuMineQuestionnaireRecordsDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuMineQuestionnaireRecordsDO record, @Param("example") MikuMineQuestionnaireRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int updateByExample(@Param("record") MikuMineQuestionnaireRecordsDO record, @Param("example") MikuMineQuestionnaireRecordsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int updateByPrimaryKeySelective(MikuMineQuestionnaireRecordsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questionnaire_records
     *
     * @mbggenerated Sat May 21 14:03:33 CST 2016
     */
    int updateByPrimaryKey(MikuMineQuestionnaireRecordsDO record);
}