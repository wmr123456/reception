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
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int countByExample(MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int deleteByExample(MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int deleteByPrimaryKey(String merchandisecid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int insert(Merchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int insertSelective(Merchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    List<Merchandisecinfo> selectByExample(MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    Merchandisecinfo selectByPrimaryKey(String merchandisecid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int updateByExampleSelective(@Param("record") Merchandisecinfo record, @Param("example") MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int updateByExample(@Param("record") Merchandisecinfo record, @Param("example") MerchandisecinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int updateByPrimaryKeySelective(Merchandisecinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchandisecinfo
     *
     * @mbggenerated Tue Dec 30 09:13:22 CST 2014
     */
    int updateByPrimaryKey(Merchandisecinfo record);

    List<Merchandisecinfo> selectPage(MerchandisecinfoCriteria example);

    String selectMaxPrimaryKeyValue();
}