package com.welink.commons.domain;

import java.util.Date;

public class MikuAdvertorialDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.id
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.version
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.advertorial_tile
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private String advertorialTile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.advertorial_type
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Byte advertorialType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.article_content
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private String articleContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.article_tile
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private String articleTile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.creater_id
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Long createrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.date_created
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.last_updated
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Date lastUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.mall_resource_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private String mallResourceUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.pics
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private String pics;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.sales_reward
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private String salesReward;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.is_delete
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.status
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.poster_pic_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private String posterPicUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.poster_product_pic_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private String posterProductPicUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_advertorial.redirect_type
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    private Integer redirectType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.id
     *
     * @return the value of miku_advertorial.id
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.id
     *
     * @param id the value for miku_advertorial.id
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.version
     *
     * @return the value of miku_advertorial.version
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.version
     *
     * @param version the value for miku_advertorial.version
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.advertorial_tile
     *
     * @return the value of miku_advertorial.advertorial_tile
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public String getAdvertorialTile() {
        return advertorialTile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.advertorial_tile
     *
     * @param advertorialTile the value for miku_advertorial.advertorial_tile
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setAdvertorialTile(String advertorialTile) {
        this.advertorialTile = advertorialTile == null ? null : advertorialTile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.advertorial_type
     *
     * @return the value of miku_advertorial.advertorial_type
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Byte getAdvertorialType() {
        return advertorialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.advertorial_type
     *
     * @param advertorialType the value for miku_advertorial.advertorial_type
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setAdvertorialType(Byte advertorialType) {
        this.advertorialType = advertorialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.article_content
     *
     * @return the value of miku_advertorial.article_content
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.article_content
     *
     * @param articleContent the value for miku_advertorial.article_content
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.article_tile
     *
     * @return the value of miku_advertorial.article_tile
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public String getArticleTile() {
        return articleTile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.article_tile
     *
     * @param articleTile the value for miku_advertorial.article_tile
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setArticleTile(String articleTile) {
        this.articleTile = articleTile == null ? null : articleTile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.creater_id
     *
     * @return the value of miku_advertorial.creater_id
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Long getCreaterId() {
        return createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.creater_id
     *
     * @param createrId the value for miku_advertorial.creater_id
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.date_created
     *
     * @return the value of miku_advertorial.date_created
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.date_created
     *
     * @param dateCreated the value for miku_advertorial.date_created
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.last_updated
     *
     * @return the value of miku_advertorial.last_updated
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.last_updated
     *
     * @param lastUpdated the value for miku_advertorial.last_updated
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.mall_resource_url
     *
     * @return the value of miku_advertorial.mall_resource_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public String getMallResourceUrl() {
        return mallResourceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.mall_resource_url
     *
     * @param mallResourceUrl the value for miku_advertorial.mall_resource_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setMallResourceUrl(String mallResourceUrl) {
        this.mallResourceUrl = mallResourceUrl == null ? null : mallResourceUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.pics
     *
     * @return the value of miku_advertorial.pics
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public String getPics() {
        return pics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.pics
     *
     * @param pics the value for miku_advertorial.pics
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.sales_reward
     *
     * @return the value of miku_advertorial.sales_reward
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public String getSalesReward() {
        return salesReward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.sales_reward
     *
     * @param salesReward the value for miku_advertorial.sales_reward
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setSalesReward(String salesReward) {
        this.salesReward = salesReward == null ? null : salesReward.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.is_delete
     *
     * @return the value of miku_advertorial.is_delete
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.is_delete
     *
     * @param isDelete the value for miku_advertorial.is_delete
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.status
     *
     * @return the value of miku_advertorial.status
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.status
     *
     * @param status the value for miku_advertorial.status
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.poster_pic_url
     *
     * @return the value of miku_advertorial.poster_pic_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public String getPosterPicUrl() {
        return posterPicUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.poster_pic_url
     *
     * @param posterPicUrl the value for miku_advertorial.poster_pic_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setPosterPicUrl(String posterPicUrl) {
        this.posterPicUrl = posterPicUrl == null ? null : posterPicUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.poster_product_pic_url
     *
     * @return the value of miku_advertorial.poster_product_pic_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public String getPosterProductPicUrl() {
        return posterProductPicUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.poster_product_pic_url
     *
     * @param posterProductPicUrl the value for miku_advertorial.poster_product_pic_url
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setPosterProductPicUrl(String posterProductPicUrl) {
        this.posterProductPicUrl = posterProductPicUrl == null ? null : posterProductPicUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_advertorial.redirect_type
     *
     * @return the value of miku_advertorial.redirect_type
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public Integer getRedirectType() {
        return redirectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_advertorial.redirect_type
     *
     * @param redirectType the value for miku_advertorial.redirect_type
     *
     * @mbggenerated Fri Apr 22 17:14:52 CST 2016
     */
    public void setRedirectType(Integer redirectType) {
        this.redirectType = redirectType;
    }
}