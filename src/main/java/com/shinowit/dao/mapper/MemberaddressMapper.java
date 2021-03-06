package com.shinowit.dao.mapper;

import com.shinowit.entity.Memberaddress;
import com.shinowit.entity.MemberaddressCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberaddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int countByExample(MemberaddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int deleteByExample(MemberaddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int deleteByPrimaryKey(String addressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int insert(Memberaddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int insertSelective(Memberaddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    List<Memberaddress> selectByExample(MemberaddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    Memberaddress selectByPrimaryKey(String addressid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int updateByExampleSelective(@Param("record") Memberaddress record, @Param("example") MemberaddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int updateByExample(@Param("record") Memberaddress record, @Param("example") MemberaddressCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int updateByPrimaryKeySelective(Memberaddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberaddress
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    int updateByPrimaryKey(Memberaddress record);

    List<Memberaddress> selectPage(MemberaddressCriteria example);

    String selectMaxPrimaryKeyValue();
}