package com.shinowit.dao.mapper;

import com.shinowit.entity.Chart;
import com.shinowit.entity.ChartCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int countByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int deleteByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int insert(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int insertSelective(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    List<Chart> selectByExample(ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    Chart selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int updateByExampleSelective(@Param("record") Chart record, @Param("example") ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int updateByExample(@Param("record") Chart record, @Param("example") ChartCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int updateByPrimaryKeySelective(Chart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Wed Jan 14 09:50:25 CST 2015
     */
    int updateByPrimaryKey(Chart record);

    List<Chart> selectPage(ChartCriteria example);

    String selectMaxPrimaryKeyValue();
}