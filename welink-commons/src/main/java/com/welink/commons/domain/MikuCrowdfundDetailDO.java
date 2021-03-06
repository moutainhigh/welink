package com.welink.commons.domain;

import java.util.Date;

public class MikuCrowdfundDetailDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.approve_status
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private Byte approveStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.crowdfund_id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private Long crowdfundId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.item_id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.sold_num
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private Integer soldNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.return_content
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private String returnContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.risk_tips
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private String riskTips;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.special_note
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private String specialNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.version
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.date_created
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_crowdfund_detail.last_updated
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.id
     *
     * @return the value of miku_crowdfund_detail.id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.id
     *
     * @param id the value for miku_crowdfund_detail.id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.approve_status
     *
     * @return the value of miku_crowdfund_detail.approve_status
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public Byte getApproveStatus() {
        return approveStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.approve_status
     *
     * @param approveStatus the value for miku_crowdfund_detail.approve_status
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setApproveStatus(Byte approveStatus) {
        this.approveStatus = approveStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.crowdfund_id
     *
     * @return the value of miku_crowdfund_detail.crowdfund_id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public Long getCrowdfundId() {
        return crowdfundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.crowdfund_id
     *
     * @param crowdfundId the value for miku_crowdfund_detail.crowdfund_id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setCrowdfundId(Long crowdfundId) {
        this.crowdfundId = crowdfundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.item_id
     *
     * @return the value of miku_crowdfund_detail.item_id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.item_id
     *
     * @param itemId the value for miku_crowdfund_detail.item_id
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.sold_num
     *
     * @return the value of miku_crowdfund_detail.sold_num
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public Integer getSoldNum() {
        return soldNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.sold_num
     *
     * @param soldNum the value for miku_crowdfund_detail.sold_num
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.return_content
     *
     * @return the value of miku_crowdfund_detail.return_content
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public String getReturnContent() {
        return returnContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.return_content
     *
     * @param returnContent the value for miku_crowdfund_detail.return_content
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent == null ? null : returnContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.risk_tips
     *
     * @return the value of miku_crowdfund_detail.risk_tips
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public String getRiskTips() {
        return riskTips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.risk_tips
     *
     * @param riskTips the value for miku_crowdfund_detail.risk_tips
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setRiskTips(String riskTips) {
        this.riskTips = riskTips == null ? null : riskTips.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.special_note
     *
     * @return the value of miku_crowdfund_detail.special_note
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public String getSpecialNote() {
        return specialNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.special_note
     *
     * @param specialNote the value for miku_crowdfund_detail.special_note
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote == null ? null : specialNote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.version
     *
     * @return the value of miku_crowdfund_detail.version
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.version
     *
     * @param version the value for miku_crowdfund_detail.version
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.date_created
     *
     * @return the value of miku_crowdfund_detail.date_created
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.date_created
     *
     * @param dateCreated the value for miku_crowdfund_detail.date_created
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_crowdfund_detail.last_updated
     *
     * @return the value of miku_crowdfund_detail.last_updated
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_crowdfund_detail.last_updated
     *
     * @param lastUpdated the value for miku_crowdfund_detail.last_updated
     *
     * @mbggenerated Mon Feb 22 15:53:17 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}