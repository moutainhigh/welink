package com.welink.commons.domain;

import java.util.Date;

public class PropertyManagementFeesBill {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.id
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.version
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.arrears
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Integer arrears;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.building_id
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Long buildingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.community_id
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Long communityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.trade_id
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Long tradeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.date_created
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.start_time
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.deadline
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Date deadline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.months
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Integer months;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.has_penalty_fee
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Byte hasPenaltyFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.last_updated
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Date lastUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.penalty_fee
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Integer penaltyFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.remind_count
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Integer remindCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.trade_status
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Byte tradeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.payment
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Long payment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.status
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.unit_price
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Long unitPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pmf_bill.category_id
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    private Long categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.id
     *
     * @return the value of pmf_bill.id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.id
     *
     * @param id the value for pmf_bill.id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.version
     *
     * @return the value of pmf_bill.version
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.version
     *
     * @param version the value for pmf_bill.version
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.arrears
     *
     * @return the value of pmf_bill.arrears
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Integer getArrears() {
        return arrears;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.arrears
     *
     * @param arrears the value for pmf_bill.arrears
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setArrears(Integer arrears) {
        this.arrears = arrears;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.building_id
     *
     * @return the value of pmf_bill.building_id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Long getBuildingId() {
        return buildingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.building_id
     *
     * @param buildingId the value for pmf_bill.building_id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.community_id
     *
     * @return the value of pmf_bill.community_id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Long getCommunityId() {
        return communityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.community_id
     *
     * @param communityId the value for pmf_bill.community_id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.trade_id
     *
     * @return the value of pmf_bill.trade_id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Long getTradeId() {
        return tradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.trade_id
     *
     * @param tradeId the value for pmf_bill.trade_id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.date_created
     *
     * @return the value of pmf_bill.date_created
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.date_created
     *
     * @param dateCreated the value for pmf_bill.date_created
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.start_time
     *
     * @return the value of pmf_bill.start_time
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.start_time
     *
     * @param startTime the value for pmf_bill.start_time
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.deadline
     *
     * @return the value of pmf_bill.deadline
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.deadline
     *
     * @param deadline the value for pmf_bill.deadline
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.months
     *
     * @return the value of pmf_bill.months
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Integer getMonths() {
        return months;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.months
     *
     * @param months the value for pmf_bill.months
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setMonths(Integer months) {
        this.months = months;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.has_penalty_fee
     *
     * @return the value of pmf_bill.has_penalty_fee
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Byte getHasPenaltyFee() {
        return hasPenaltyFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.has_penalty_fee
     *
     * @param hasPenaltyFee the value for pmf_bill.has_penalty_fee
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setHasPenaltyFee(Byte hasPenaltyFee) {
        this.hasPenaltyFee = hasPenaltyFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.last_updated
     *
     * @return the value of pmf_bill.last_updated
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.last_updated
     *
     * @param lastUpdated the value for pmf_bill.last_updated
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.penalty_fee
     *
     * @return the value of pmf_bill.penalty_fee
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Integer getPenaltyFee() {
        return penaltyFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.penalty_fee
     *
     * @param penaltyFee the value for pmf_bill.penalty_fee
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setPenaltyFee(Integer penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.remind_count
     *
     * @return the value of pmf_bill.remind_count
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Integer getRemindCount() {
        return remindCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.remind_count
     *
     * @param remindCount the value for pmf_bill.remind_count
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setRemindCount(Integer remindCount) {
        this.remindCount = remindCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.trade_status
     *
     * @return the value of pmf_bill.trade_status
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Byte getTradeStatus() {
        return tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.trade_status
     *
     * @param tradeStatus the value for pmf_bill.trade_status
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setTradeStatus(Byte tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.payment
     *
     * @return the value of pmf_bill.payment
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Long getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.payment
     *
     * @param payment the value for pmf_bill.payment
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setPayment(Long payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.status
     *
     * @return the value of pmf_bill.status
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.status
     *
     * @param status the value for pmf_bill.status
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.unit_price
     *
     * @return the value of pmf_bill.unit_price
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Long getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.unit_price
     *
     * @param unitPrice the value for pmf_bill.unit_price
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pmf_bill.category_id
     *
     * @return the value of pmf_bill.category_id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pmf_bill.category_id
     *
     * @param categoryId the value for pmf_bill.category_id
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}