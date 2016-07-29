package com.welink.commons.persistence;

import com.welink.commons.domain.MikuReturnGoodsDO;
import com.welink.commons.domain.MikuReturnGoodsDOExample;
import com.welink.commons.vo.MikuReturnGoodsVO;
import com.welink.commons.vo.MikuSalesRecordVO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MikuReturnGoodsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int countByExample(MikuReturnGoodsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int deleteByExample(MikuReturnGoodsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int insert(MikuReturnGoodsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int insertSelective(MikuReturnGoodsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    List<MikuReturnGoodsDO> selectByExampleWithRowbounds(MikuReturnGoodsDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    List<MikuReturnGoodsDO> selectByExample(MikuReturnGoodsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    MikuReturnGoodsDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int updateByExampleSelective(@Param("record") MikuReturnGoodsDO record, @Param("example") MikuReturnGoodsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int updateByExample(@Param("record") MikuReturnGoodsDO record, @Param("example") MikuReturnGoodsDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int updateByPrimaryKeySelective(MikuReturnGoodsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_return_goods
     *
     * @mbggenerated Wed Jan 13 15:59:19 CST 2016
     */
    int updateByPrimaryKey(MikuReturnGoodsDO record);
    
    /**
     * 
     * selectReturnGoodsVOList:(查询退货列表). <br/>
     *
     * @author LuoGuangChun
     * @param map
     */
    List<MikuReturnGoodsVO> getReturnGoodsVOList(Map<String,Object> map);
    
}