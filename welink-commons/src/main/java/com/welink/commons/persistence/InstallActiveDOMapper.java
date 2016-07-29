package com.welink.commons.persistence;

import com.welink.commons.domain.InstallActiveDO;
import com.welink.commons.domain.InstallActiveDOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstallActiveDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int countByExample(InstallActiveDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int deleteByExample(InstallActiveDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int insert(InstallActiveDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int insertSelective(InstallActiveDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    List<InstallActiveDO> selectByExample(InstallActiveDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    InstallActiveDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int updateByExampleSelective(@Param("record") InstallActiveDO record, @Param("example") InstallActiveDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int updateByExample(@Param("record") InstallActiveDO record, @Param("example") InstallActiveDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int updateByPrimaryKeySelective(InstallActiveDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table install_active
     *
     * @mbggenerated Tue Apr 07 18:07:58 CST 2015
     */
    int updateByPrimaryKey(InstallActiveDO record);
}