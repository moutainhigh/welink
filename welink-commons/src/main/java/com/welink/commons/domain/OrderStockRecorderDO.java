package com.welink.commons.domain;

import java.util.Date;

public class OrderStockRecorderDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_stock_recorder.id
     *
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_stock_recorder.item_id
     *
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_stock_recorder.order_id
     *
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_stock_recorder.status
     *
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_stock_recorder.date_created
     *
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_stock_recorder.last_updated
     *
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    private Date lastUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_stock_recorder.version
     *
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    private Long version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_stock_recorder.id
     *
     * @return the value of order_stock_recorder.id
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_stock_recorder.id
     *
     * @param id the value for order_stock_recorder.id
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_stock_recorder.item_id
     *
     * @return the value of order_stock_recorder.item_id
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_stock_recorder.item_id
     *
     * @param itemId the value for order_stock_recorder.item_id
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_stock_recorder.order_id
     *
     * @return the value of order_stock_recorder.order_id
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_stock_recorder.order_id
     *
     * @param orderId the value for order_stock_recorder.order_id
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_stock_recorder.status
     *
     * @return the value of order_stock_recorder.status
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_stock_recorder.status
     *
     * @param status the value for order_stock_recorder.status
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_stock_recorder.date_created
     *
     * @return the value of order_stock_recorder.date_created
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_stock_recorder.date_created
     *
     * @param dateCreated the value for order_stock_recorder.date_created
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_stock_recorder.last_updated
     *
     * @return the value of order_stock_recorder.last_updated
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_stock_recorder.last_updated
     *
     * @param lastUpdated the value for order_stock_recorder.last_updated
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_stock_recorder.version
     *
     * @return the value of order_stock_recorder.version
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_stock_recorder.version
     *
     * @param version the value for order_stock_recorder.version
     * @mbggenerated Mon Jan 26 17:11:16 CST 2015
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}