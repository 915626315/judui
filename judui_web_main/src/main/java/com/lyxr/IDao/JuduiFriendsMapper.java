package com.lyxr.IDao;

import com.lyxr.domain.JuduiFriends;

public interface JuduiFriendsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_friends
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_friends
     *
     * @mbggenerated
     */
    int insert(JuduiFriends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_friends
     *
     * @mbggenerated
     */
    int insertSelective(JuduiFriends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_friends
     *
     * @mbggenerated
     */
    JuduiFriends selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_friends
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JuduiFriends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_friends
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JuduiFriends record);
}