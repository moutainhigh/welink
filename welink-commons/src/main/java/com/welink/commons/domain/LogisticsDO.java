package com.welink.commons.domain;

import java.util.Date;

public class LogisticsDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.contact_name
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String contactName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.province
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.city
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.country
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.addr
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String addr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.zip_code
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String zipCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.phone
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.mobile
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.seller_company
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String sellerCompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.memo
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.get_def
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Byte getDef;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.cancel_def
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Byte cancelDef;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.community_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Long community_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.district_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Long districtId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.date_created
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.last_updated
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Date lastUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.user_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.version
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.consignee_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Long consigneeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.latitude
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.longitude
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.type
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.express_company
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String expressCompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.express_no
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String expressNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.id_card
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    private String idCard;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.id
     *
     * @return the value of logistics.id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.id
     *
     * @param id the value for logistics.id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.contact_name
     *
     * @return the value of logistics.contact_name
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.contact_name
     *
     * @param contactName the value for logistics.contact_name
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.province
     *
     * @return the value of logistics.province
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.province
     *
     * @param province the value for logistics.province
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.city
     *
     * @return the value of logistics.city
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.city
     *
     * @param city the value for logistics.city
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.country
     *
     * @return the value of logistics.country
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.country
     *
     * @param country the value for logistics.country
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.addr
     *
     * @return the value of logistics.addr
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.addr
     *
     * @param addr the value for logistics.addr
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.zip_code
     *
     * @return the value of logistics.zip_code
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.zip_code
     *
     * @param zipCode the value for logistics.zip_code
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.phone
     *
     * @return the value of logistics.phone
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.phone
     *
     * @param phone the value for logistics.phone
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.mobile
     *
     * @return the value of logistics.mobile
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.mobile
     *
     * @param mobile the value for logistics.mobile
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.seller_company
     *
     * @return the value of logistics.seller_company
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getSellerCompany() {
        return sellerCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.seller_company
     *
     * @param sellerCompany the value for logistics.seller_company
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setSellerCompany(String sellerCompany) {
        this.sellerCompany = sellerCompany == null ? null : sellerCompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.memo
     *
     * @return the value of logistics.memo
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.memo
     *
     * @param memo the value for logistics.memo
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.get_def
     *
     * @return the value of logistics.get_def
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Byte getGetDef() {
        return getDef;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.get_def
     *
     * @param getDef the value for logistics.get_def
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setGetDef(Byte getDef) {
        this.getDef = getDef;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.cancel_def
     *
     * @return the value of logistics.cancel_def
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Byte getCancelDef() {
        return cancelDef;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.cancel_def
     *
     * @param cancelDef the value for logistics.cancel_def
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setCancelDef(Byte cancelDef) {
        this.cancelDef = cancelDef;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.community_id
     *
     * @return the value of logistics.community_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Long getCommunity_id() {
        return community_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.community_id
     *
     * @param community_id the value for logistics.community_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setCommunity_id(Long community_id) {
        this.community_id = community_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.district_id
     *
     * @return the value of logistics.district_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.district_id
     *
     * @param districtId the value for logistics.district_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.date_created
     *
     * @return the value of logistics.date_created
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.date_created
     *
     * @param dateCreated the value for logistics.date_created
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.last_updated
     *
     * @return the value of logistics.last_updated
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.last_updated
     *
     * @param lastUpdated the value for logistics.last_updated
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.user_id
     *
     * @return the value of logistics.user_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.user_id
     *
     * @param userId the value for logistics.user_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.version
     *
     * @return the value of logistics.version
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.version
     *
     * @param version the value for logistics.version
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.consignee_id
     *
     * @return the value of logistics.consignee_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Long getConsigneeId() {
        return consigneeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.consignee_id
     *
     * @param consigneeId the value for logistics.consignee_id
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setConsigneeId(Long consigneeId) {
        this.consigneeId = consigneeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.latitude
     *
     * @return the value of logistics.latitude
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.latitude
     *
     * @param latitude the value for logistics.latitude
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.longitude
     *
     * @return the value of logistics.longitude
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.longitude
     *
     * @param longitude the value for logistics.longitude
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.type
     *
     * @return the value of logistics.type
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.type
     *
     * @param type the value for logistics.type
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.express_company
     *
     * @return the value of logistics.express_company
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getExpressCompany() {
        return expressCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.express_company
     *
     * @param expressCompany the value for logistics.express_company
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany == null ? null : expressCompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.express_no
     *
     * @return the value of logistics.express_no
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getExpressNo() {
        return expressNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.express_no
     *
     * @param expressNo the value for logistics.express_no
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.id_card
     *
     * @return the value of logistics.id_card
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.id_card
     *
     * @param idCard the value for logistics.id_card
     *
     * @mbggenerated Tue Mar 01 12:20:30 CST 2016
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }
}