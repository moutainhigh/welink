package com.welink.commons.persistence;

import com.welink.commons.domain.MikuMineScProductDO;
import com.welink.commons.domain.MikuMineScProductDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuMineScProductDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int countByExample(MikuMineScProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int deleteByExample(MikuMineScProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int insert(MikuMineScProductDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int insertSelective(MikuMineScProductDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    List<MikuMineScProductDO> selectByExampleWithRowbounds(MikuMineScProductDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    List<MikuMineScProductDO> selectByExample(MikuMineScProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    MikuMineScProductDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuMineScProductDO record, @Param("example") MikuMineScProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int updateByExample(@Param("record") MikuMineScProductDO record, @Param("example") MikuMineScProductDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int updateByPrimaryKeySelective(MikuMineScProductDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_sc_product
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    int updateByPrimaryKey(MikuMineScProductDO record);
}