package com.lyxr.domain;

import java.util.Date;

public class JuduiChatHistory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column judui_chat_history.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column judui_chat_history.uid
     *
     * @mbggenerated
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column judui_chat_history.mid
     *
     * @mbggenerated
     */
    private Integer mid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column judui_chat_history.history
     *
     * @mbggenerated
     */
    private String history;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column judui_chat_history.gid
     *
     * @mbggenerated
     */
    private Integer gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column judui_chat_history.chatdate
     *
     * @mbggenerated
     */
    private Date chatdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column judui_chat_history.id
     *
     * @return the value of judui_chat_history.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column judui_chat_history.id
     *
     * @param id the value for judui_chat_history.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column judui_chat_history.uid
     *
     * @return the value of judui_chat_history.uid
     *
     * @mbggenerated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column judui_chat_history.uid
     *
     * @param uid the value for judui_chat_history.uid
     *
     * @mbggenerated
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column judui_chat_history.mid
     *
     * @return the value of judui_chat_history.mid
     *
     * @mbggenerated
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column judui_chat_history.mid
     *
     * @param mid the value for judui_chat_history.mid
     *
     * @mbggenerated
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column judui_chat_history.history
     *
     * @return the value of judui_chat_history.history
     *
     * @mbggenerated
     */
    public String getHistory() {
        return history;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column judui_chat_history.history
     *
     * @param history the value for judui_chat_history.history
     *
     * @mbggenerated
     */
    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column judui_chat_history.gid
     *
     * @return the value of judui_chat_history.gid
     *
     * @mbggenerated
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column judui_chat_history.gid
     *
     * @param gid the value for judui_chat_history.gid
     *
     * @mbggenerated
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column judui_chat_history.chatdate
     *
     * @return the value of judui_chat_history.chatdate
     *
     * @mbggenerated
     */
    public Date getChatdate() {
        return chatdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column judui_chat_history.chatdate
     *
     * @param chatdate the value for judui_chat_history.chatdate
     *
     * @mbggenerated
     */
    public void setChatdate(Date chatdate) {
        this.chatdate = chatdate;
    }
}