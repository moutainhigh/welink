package com.welink.commons.domain;

import java.util.Date;

public class MikuWalletDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.id
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.user_id
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.mobile
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.balance_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private Long balanceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.getpayed_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private Long getpayedFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.getpaying_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private Long getpayingFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.version
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.date_created
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_wallet.last_updated
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.id
     *
     * @return the value of miku_wallet.id
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.id
     *
     * @param id the value for miku_wallet.id
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.user_id
     *
     * @return the value of miku_wallet.user_id
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.user_id
     *
     * @param userId the value for miku_wallet.user_id
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.mobile
     *
     * @return the value of miku_wallet.mobile
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.mobile
     *
     * @param mobile the value for miku_wallet.mobile
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.balance_fee
     *
     * @return the value of miku_wallet.balance_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Long getBalanceFee() {
        return balanceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.balance_fee
     *
     * @param balanceFee the value for miku_wallet.balance_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setBalanceFee(Long balanceFee) {
        this.balanceFee = balanceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.getpayed_fee
     *
     * @return the value of miku_wallet.getpayed_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Long getGetpayedFee() {
        return getpayedFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.getpayed_fee
     *
     * @param getpayedFee the value for miku_wallet.getpayed_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setGetpayedFee(Long getpayedFee) {
        this.getpayedFee = getpayedFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.getpaying_fee
     *
     * @return the value of miku_wallet.getpaying_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Long getGetpayingFee() {
        return getpayingFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.getpaying_fee
     *
     * @param getpayingFee the value for miku_wallet.getpaying_fee
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setGetpayingFee(Long getpayingFee) {
        this.getpayingFee = getpayingFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.version
     *
     * @return the value of miku_wallet.version
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.version
     *
     * @param version the value for miku_wallet.version
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.date_created
     *
     * @return the value of miku_wallet.date_created
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.date_created
     *
     * @param dateCreated the value for miku_wallet.date_created
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_wallet.last_updated
     *
     * @return the value of miku_wallet.last_updated
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_wallet.last_updated
     *
     * @param lastUpdated the value for miku_wallet.last_updated
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}