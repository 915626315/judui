package com.lyxr.IDao;

import com.lyxr.domain.JuduiLogin;

public interface JuduiLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_login
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_login
     *
     * @mbggenerated
     */
    int insert(JuduiLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_login
     *
     * @mbggenerated
     */
    int insertSelective(JuduiLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_login
     *
     * @mbggenerated
     */
    JuduiLogin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_login
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JuduiLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_login
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JuduiLogin record);
}