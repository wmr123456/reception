package com.shinowit.dao.mapper;

import com.shinowit.entity.Merchandisecinfo;
import com.shinowit.entity.MerchandisecinfoCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MerchandisecinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int countByExample(MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int deleteByExample(MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int deleteByPrimaryKey(String merchandisecid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int insert(Merchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int insertSelective(Merchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    List<Merchandisecinfo> selectByExample(MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    Merchandisecinfo selectByPrimaryKey(String merchandisecid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int updateByExampleSelective(@Param("record") Merchandisecinfo record, @Param("example") MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int updateByExample(@Param("record") Merchandisecinfo record, @Param("example") MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int updateByPrimaryKeySelective(Merchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int updateByPrimaryKey(Merchandisecinfo record);

    List<Merchandisecinfo> selectPage(MerchandisecinfoCriteria example);

    String selectMaxPrimaryKeyValue();

    //    自增
    List<Merchandisecinfo> selectMerchandisecinfo();
}