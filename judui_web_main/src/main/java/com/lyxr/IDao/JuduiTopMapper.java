package com.lyxr.IDao;

import com.lyxr.domain.JuduiTop;

public interface JuduiTopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_top
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_top
     *
     * @mbggenerated
     */
    int insert(JuduiTop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_top
     *
     * @mbggenerated
     */
    int insertSelective(JuduiTop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_top
     *
     * @mbggenerated
     */
    JuduiTop selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_top
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JuduiTop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_top
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JuduiTop record);
}