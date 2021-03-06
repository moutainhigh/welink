package com.welink.commons.persistence;

import com.welink.commons.domain.LinkNotifyDO;
import com.welink.commons.domain.LinkNotifyDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkNotifyDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int countByExample(LinkNotifyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByExample(LinkNotifyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insert(LinkNotifyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int insertSelective(LinkNotifyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<LinkNotifyDO> selectByExampleWithRowbounds(LinkNotifyDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    List<LinkNotifyDO> selectByExample(LinkNotifyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    LinkNotifyDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") LinkNotifyDO record, @Param("example") LinkNotifyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByExample(@Param("record") LinkNotifyDO record, @Param("example") LinkNotifyDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKeySelective(LinkNotifyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_notify_msg
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    int updateByPrimaryKey(LinkNotifyDO record);
}