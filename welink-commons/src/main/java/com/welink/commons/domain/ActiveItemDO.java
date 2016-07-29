package com.welink.commons.domain;

import java.util.Date;

public class ActiveItemDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.id
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.item_id
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.active_id
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long activeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.pic
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.ref_price
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long refPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.price
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.sold_quantity
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long soldQuantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.num
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.version
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.date_created
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.last_updated
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Date lastUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column active_item.origin_price
     *
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    private Long originPrice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.id
     *
     * @return the value of active_item.id
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.id
     *
     * @param id the value for active_item.id
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.item_id
     *
     * @return the value of active_item.item_id
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.item_id
     *
     * @param itemId the value for active_item.item_id
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.active_id
     *
     * @return the value of active_item.active_id
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getActiveId() {
        return activeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.active_id
     *
     * @param activeId the value for active_item.active_id
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setActiveId(Long activeId) {
        this.activeId = activeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.pic
     *
     * @return the value of active_item.pic
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.pic
     *
     * @param pic the value for active_item.pic
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.ref_price
     *
     * @return the value of active_item.ref_price
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getRefPrice() {
        return refPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.ref_price
     *
     * @param refPrice the value for active_item.ref_price
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setRefPrice(Long refPrice) {
        this.refPrice = refPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.price
     *
     * @return the value of active_item.price
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.price
     *
     * @param price the value for active_item.price
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.sold_quantity
     *
     * @return the value of active_item.sold_quantity
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getSoldQuantity() {
        return soldQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.sold_quantity
     *
     * @param soldQuantity the value for active_item.sold_quantity
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setSoldQuantity(Long soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.num
     *
     * @return the value of active_item.num
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.num
     *
     * @param num the value for active_item.num
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setNum(Long num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.version
     *
     * @return the value of active_item.version
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.version
     *
     * @param version the value for active_item.version
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.date_created
     *
     * @return the value of active_item.date_created
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.date_created
     *
     * @param dateCreated the value for active_item.date_created
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.last_updated
     *
     * @return the value of active_item.last_updated
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.last_updated
     *
     * @param lastUpdated the value for active_item.last_updated
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column active_item.origin_price
     *
     * @return the value of active_item.origin_price
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public Long getOriginPrice() {
        return originPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column active_item.origin_price
     *
     * @param originPrice the value for active_item.origin_price
     * @mbggenerated Mon Feb 02 20:18:13 CST 2015
     */
    public void setOriginPrice(Long originPrice) {
        this.originPrice = originPrice;
    }
}