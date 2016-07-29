package com.welink.commons.persistence;

import com.welink.commons.domain.MikuCsadClientsDO;
import com.welink.commons.domain.MikuCsadClientsDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuCsadClientsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_csad_clients
     *
     * @mbggenerated Fri May 20 14:25:37 CST 2016
     */
    int countByExample(MikuCsadClientsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_csad_clients
     *
     * @mbggenerated Fri May 20 14:25:37 CST 2016
     */
    int deleteByExample(MikuCsadClientsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_csad_clients
     *
     * @mbggenerated Fri May 20 14:25:37 CST 2016
     */
    int insert(MikuCsadClientsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_csad_clients
     *
     * @mbggenerated Fri May 20 14:25:37 CST 2016
     */
    int insertSelective(MikuCsadClientsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_csad_clients
     *
     * @mbggenerated Fri May 20 14:25:37 CST 2016
     */
    List<MikuCsadClientsDO> selectByExampleWithRowbounds(MikuCsadClientsDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_csad_clients
     *
     * @mbggenerated Fri May 20 14:25:37 CST 2016
     */
    List<MikuCsadClientsDO> selectByExample(MikuCsadClientsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_csad_clients
     *
     * @mbggenerated Fri May 20 14:25:37 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuCsadClientsDO record, @Param("example") MikuCsadClientsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_csad_clients
     *
     * @mbggenerated Fri May 20 14:25:37 CST 2016
     */
    int updateByExample(@Param("record") MikuCsadClientsDO record, @Param("example") MikuCsadClientsDOExample example);
}