package com.welink.commons.domain;

import java.util.Date;

public class MikuUserOneBuyDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.item_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.item_name
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private String itemName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.one_buy_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Long oneBuyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.user_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.start_code
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Long startCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.num
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.periods
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Integer periods;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.status
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.is_win
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Byte isWin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.trade_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Long tradeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.reward_date
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Date rewardDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.date_created
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_user_one_buy.last_updated
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.id
     *
     * @return the value of miku_user_one_buy.id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.id
     *
     * @param id the value for miku_user_one_buy.id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.item_id
     *
     * @return the value of miku_user_one_buy.item_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.item_id
     *
     * @param itemId the value for miku_user_one_buy.item_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.item_name
     *
     * @return the value of miku_user_one_buy.item_name
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.item_name
     *
     * @param itemName the value for miku_user_one_buy.item_name
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.one_buy_id
     *
     * @return the value of miku_user_one_buy.one_buy_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Long getOneBuyId() {
        return oneBuyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.one_buy_id
     *
     * @param oneBuyId the value for miku_user_one_buy.one_buy_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setOneBuyId(Long oneBuyId) {
        this.oneBuyId = oneBuyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.user_id
     *
     * @return the value of miku_user_one_buy.user_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.user_id
     *
     * @param userId the value for miku_user_one_buy.user_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.start_code
     *
     * @return the value of miku_user_one_buy.start_code
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Long getStartCode() {
        return startCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.start_code
     *
     * @param startCode the value for miku_user_one_buy.start_code
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setStartCode(Long startCode) {
        this.startCode = startCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.num
     *
     * @return the value of miku_user_one_buy.num
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.num
     *
     * @param num the value for miku_user_one_buy.num
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.periods
     *
     * @return the value of miku_user_one_buy.periods
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Integer getPeriods() {
        return periods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.periods
     *
     * @param periods the value for miku_user_one_buy.periods
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setPeriods(Integer periods) {
        this.periods = periods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.status
     *
     * @return the value of miku_user_one_buy.status
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.status
     *
     * @param status the value for miku_user_one_buy.status
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.is_win
     *
     * @return the value of miku_user_one_buy.is_win
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Byte getIsWin() {
        return isWin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.is_win
     *
     * @param isWin the value for miku_user_one_buy.is_win
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setIsWin(Byte isWin) {
        this.isWin = isWin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.trade_id
     *
     * @return the value of miku_user_one_buy.trade_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Long getTradeId() {
        return tradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.trade_id
     *
     * @param tradeId the value for miku_user_one_buy.trade_id
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.reward_date
     *
     * @return the value of miku_user_one_buy.reward_date
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Date getRewardDate() {
        return rewardDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.reward_date
     *
     * @param rewardDate the value for miku_user_one_buy.reward_date
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setRewardDate(Date rewardDate) {
        this.rewardDate = rewardDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.date_created
     *
     * @return the value of miku_user_one_buy.date_created
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.date_created
     *
     * @param dateCreated the value for miku_user_one_buy.date_created
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_user_one_buy.last_updated
     *
     * @return the value of miku_user_one_buy.last_updated
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_user_one_buy.last_updated
     *
     * @param lastUpdated the value for miku_user_one_buy.last_updated
     *
     * @mbggenerated Tue Dec 29 14:33:44 CST 2015
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}