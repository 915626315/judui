package com.lyxr.IDao;

import com.lyxr.domain.JuduiGroupUser;

public interface JuduiGroupUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_group_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_group_user
     *
     * @mbggenerated
     */
    int insert(JuduiGroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_group_user
     *
     * @mbggenerated
     */
    int insertSelective(JuduiGroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_group_user
     *
     * @mbggenerated
     */
    JuduiGroupUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_group_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JuduiGroupUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_group_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JuduiGroupUser record);
}