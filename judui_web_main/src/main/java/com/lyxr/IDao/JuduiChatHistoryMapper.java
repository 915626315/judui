package com.lyxr.IDao;

import com.lyxr.domain.JuduiChatHistory;

public interface JuduiChatHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_chat_history
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_chat_history
     *
     * @mbggenerated
     */
    int insert(JuduiChatHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_chat_history
     *
     * @mbggenerated
     */
    int insertSelective(JuduiChatHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_chat_history
     *
     * @mbggenerated
     */
    JuduiChatHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_chat_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JuduiChatHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table judui_chat_history
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JuduiChatHistory record);
}