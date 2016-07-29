package com.welink.commons.domain;

import java.util.Date;

public class MikuMineScProductDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.id
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_name
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_type
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private Byte prodType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_spec
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodSpec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_pack
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodPack;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_ingredient
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodIngredient;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_effect
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodEffect;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_cost_price
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private Long prodCostPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_retail_price
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private Long prodRetailPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_note
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_skin_apply
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodSkinApply;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_show_status
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodShowStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_purpose
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodPurpose;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.prod_result
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private String prodResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.version
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.date_created
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_sc_product.last_updated
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.id
     *
     * @return the value of miku_mine_sc_product.id
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.id
     *
     * @param id the value for miku_mine_sc_product.id
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_name
     *
     * @return the value of miku_mine_sc_product.prod_name
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_name
     *
     * @param prodName the value for miku_mine_sc_product.prod_name
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_type
     *
     * @return the value of miku_mine_sc_product.prod_type
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public Byte getProdType() {
        return prodType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_type
     *
     * @param prodType the value for miku_mine_sc_product.prod_type
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdType(Byte prodType) {
        this.prodType = prodType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_spec
     *
     * @return the value of miku_mine_sc_product.prod_spec
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdSpec() {
        return prodSpec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_spec
     *
     * @param prodSpec the value for miku_mine_sc_product.prod_spec
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdSpec(String prodSpec) {
        this.prodSpec = prodSpec == null ? null : prodSpec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_pack
     *
     * @return the value of miku_mine_sc_product.prod_pack
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdPack() {
        return prodPack;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_pack
     *
     * @param prodPack the value for miku_mine_sc_product.prod_pack
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdPack(String prodPack) {
        this.prodPack = prodPack == null ? null : prodPack.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_ingredient
     *
     * @return the value of miku_mine_sc_product.prod_ingredient
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdIngredient() {
        return prodIngredient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_ingredient
     *
     * @param prodIngredient the value for miku_mine_sc_product.prod_ingredient
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdIngredient(String prodIngredient) {
        this.prodIngredient = prodIngredient == null ? null : prodIngredient.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_effect
     *
     * @return the value of miku_mine_sc_product.prod_effect
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdEffect() {
        return prodEffect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_effect
     *
     * @param prodEffect the value for miku_mine_sc_product.prod_effect
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdEffect(String prodEffect) {
        this.prodEffect = prodEffect == null ? null : prodEffect.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_cost_price
     *
     * @return the value of miku_mine_sc_product.prod_cost_price
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public Long getProdCostPrice() {
        return prodCostPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_cost_price
     *
     * @param prodCostPrice the value for miku_mine_sc_product.prod_cost_price
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdCostPrice(Long prodCostPrice) {
        this.prodCostPrice = prodCostPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_retail_price
     *
     * @return the value of miku_mine_sc_product.prod_retail_price
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public Long getProdRetailPrice() {
        return prodRetailPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_retail_price
     *
     * @param prodRetailPrice the value for miku_mine_sc_product.prod_retail_price
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdRetailPrice(Long prodRetailPrice) {
        this.prodRetailPrice = prodRetailPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_note
     *
     * @return the value of miku_mine_sc_product.prod_note
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdNote() {
        return prodNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_note
     *
     * @param prodNote the value for miku_mine_sc_product.prod_note
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdNote(String prodNote) {
        this.prodNote = prodNote == null ? null : prodNote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_skin_apply
     *
     * @return the value of miku_mine_sc_product.prod_skin_apply
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdSkinApply() {
        return prodSkinApply;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_skin_apply
     *
     * @param prodSkinApply the value for miku_mine_sc_product.prod_skin_apply
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdSkinApply(String prodSkinApply) {
        this.prodSkinApply = prodSkinApply == null ? null : prodSkinApply.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_show_status
     *
     * @return the value of miku_mine_sc_product.prod_show_status
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdShowStatus() {
        return prodShowStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_show_status
     *
     * @param prodShowStatus the value for miku_mine_sc_product.prod_show_status
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdShowStatus(String prodShowStatus) {
        this.prodShowStatus = prodShowStatus == null ? null : prodShowStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_purpose
     *
     * @return the value of miku_mine_sc_product.prod_purpose
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdPurpose() {
        return prodPurpose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_purpose
     *
     * @param prodPurpose the value for miku_mine_sc_product.prod_purpose
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdPurpose(String prodPurpose) {
        this.prodPurpose = prodPurpose == null ? null : prodPurpose.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.prod_result
     *
     * @return the value of miku_mine_sc_product.prod_result
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public String getProdResult() {
        return prodResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.prod_result
     *
     * @param prodResult the value for miku_mine_sc_product.prod_result
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setProdResult(String prodResult) {
        this.prodResult = prodResult == null ? null : prodResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.version
     *
     * @return the value of miku_mine_sc_product.version
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.version
     *
     * @param version the value for miku_mine_sc_product.version
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.date_created
     *
     * @return the value of miku_mine_sc_product.date_created
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.date_created
     *
     * @param dateCreated the value for miku_mine_sc_product.date_created
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_sc_product.last_updated
     *
     * @return the value of miku_mine_sc_product.last_updated
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_sc_product.last_updated
     *
     * @param lastUpdated the value for miku_mine_sc_product.last_updated
     *
     * @mbggenerated Fri May 20 09:53:42 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}