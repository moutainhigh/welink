package com.welink.commons.persistence;

import com.welink.commons.domain.MikuTopicItemDO;
import com.welink.commons.domain.MikuTopicItemDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuTopicItemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int countByExample(MikuTopicItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int deleteByExample(MikuTopicItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int insert(MikuTopicItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int insertSelective(MikuTopicItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    List<MikuTopicItemDO> selectByExampleWithRowbounds(MikuTopicItemDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    List<MikuTopicItemDO> selectByExample(MikuTopicItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    MikuTopicItemDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuTopicItemDO record, @Param("example") MikuTopicItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int updateByExample(@Param("record") MikuTopicItemDO record, @Param("example") MikuTopicItemDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int updateByPrimaryKeySelective(MikuTopicItemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_topic_item
     *
     * @mbggenerated Fri Apr 08 16:16:33 CST 2016
     */
    int updateByPrimaryKey(MikuTopicItemDO record);
}