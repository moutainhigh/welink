package com.welink.commons.domain;

import java.util.Date;

public class CartDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.id
     *
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.user_id
     *
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.item_id
     *
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.item_count
     *
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    private Long item_count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.date_created
     *
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.last_updated
     *
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    private Date lastUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.type
     *
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    private Byte type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.id
     *
     * @return the value of cart.id
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.id
     *
     * @param id the value for cart.id
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.user_id
     *
     * @return the value of cart.user_id
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.user_id
     *
     * @param userId the value for cart.user_id
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.item_id
     *
     * @return the value of cart.item_id
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.item_id
     *
     * @param itemId the value for cart.item_id
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.item_count
     *
     * @return the value of cart.item_count
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public Long getItem_count() {
        return item_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.item_count
     *
     * @param item_count the value for cart.item_count
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public void setItem_count(Long item_count) {
        this.item_count = item_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.date_created
     *
     * @return the value of cart.date_created
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.date_created
     *
     * @param dateCreated the value for cart.date_created
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.last_updated
     *
     * @return the value of cart.last_updated
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.last_updated
     *
     * @param lastUpdated the value for cart.last_updated
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.type
     *
     * @return the value of cart.type
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.type
     *
     * @param type the value for cart.type
     * @mbggenerated Mon Dec 29 04:36:14 CST 2014
     */
    public void setType(Byte type) {
        this.type = type;
    }
}