package com.lyxr.IDao;

import com.lyxr.domain.JuduiTaskBack;

public interface JuduiTaskBackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_task_back
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_task_back
     *
     * @mbggenerated
     */
    int insert(JuduiTaskBack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_task_back
     *
     * @mbggenerated
     */
    int insertSelective(JuduiTaskBack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_task_back
     *
     * @mbggenerated
     */
    JuduiTaskBack selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_task_back
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JuduiTaskBack record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_task_back
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JuduiTaskBack record);
}