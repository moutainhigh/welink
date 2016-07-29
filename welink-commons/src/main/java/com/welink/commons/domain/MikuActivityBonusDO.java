package com.welink.commons.domain;

import java.math.BigDecimal;
import java.util.Date;

public class MikuActivityBonusDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_activity_bonus.id
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_activity_bonus.number
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    private String number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_activity_bonus.m_number
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    private String mNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_activity_bonus.bonus
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    private BigDecimal bonus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_activity_bonus.is_win
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    private Boolean isWin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_activity_bonus.edit_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    private Date editTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_activity_bonus.win_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    private Date winTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_activity_bonus.add_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    private Date addTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_activity_bonus.id
     *
     * @return the value of miku_activity_bonus.id
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_activity_bonus.id
     *
     * @param id the value for miku_activity_bonus.id
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_activity_bonus.number
     *
     * @return the value of miku_activity_bonus.number
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_activity_bonus.number
     *
     * @param number the value for miku_activity_bonus.number
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_activity_bonus.m_number
     *
     * @return the value of miku_activity_bonus.m_number
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public String getmNumber() {
        return mNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_activity_bonus.m_number
     *
     * @param mNumber the value for miku_activity_bonus.m_number
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public void setmNumber(String mNumber) {
        this.mNumber = mNumber == null ? null : mNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_activity_bonus.bonus
     *
     * @return the value of miku_activity_bonus.bonus
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public BigDecimal getBonus() {
        return bonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_activity_bonus.bonus
     *
     * @param bonus the value for miku_activity_bonus.bonus
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_activity_bonus.is_win
     *
     * @return the value of miku_activity_bonus.is_win
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public Boolean getIsWin() {
        return isWin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_activity_bonus.is_win
     *
     * @param isWin the value for miku_activity_bonus.is_win
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public void setIsWin(Boolean isWin) {
        this.isWin = isWin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_activity_bonus.edit_time
     *
     * @return the value of miku_activity_bonus.edit_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_activity_bonus.edit_time
     *
     * @param editTime the value for miku_activity_bonus.edit_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_activity_bonus.win_time
     *
     * @return the value of miku_activity_bonus.win_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public Date getWinTime() {
        return winTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_activity_bonus.win_time
     *
     * @param winTime the value for miku_activity_bonus.win_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public void setWinTime(Date winTime) {
        this.winTime = winTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_activity_bonus.add_time
     *
     * @return the value of miku_activity_bonus.add_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_activity_bonus.add_time
     *
     * @param addTime the value for miku_activity_bonus.add_time
     *
     * @mbggenerated Wed Apr 06 16:36:00 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}