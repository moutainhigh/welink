package com.welink.commons.domain;

import java.util.Date;

public class MikuMineQoptionsDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.question_id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private Long questionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.option_name
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private String optionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.option_des
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private String optionDes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.option_show_order
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private Byte optionShowOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.option_show_style
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private String optionShowStyle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.option_pic_url
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private String optionPicUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.option_value
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private String optionValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.creater_id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private Long createrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.version
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.date_created
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_qoptions.last_updated
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.id
     *
     * @return the value of miku_mine_qoptions.id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.id
     *
     * @param id the value for miku_mine_qoptions.id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.question_id
     *
     * @return the value of miku_mine_qoptions.question_id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.question_id
     *
     * @param questionId the value for miku_mine_qoptions.question_id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.option_name
     *
     * @return the value of miku_mine_qoptions.option_name
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.option_name
     *
     * @param optionName the value for miku_mine_qoptions.option_name
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.option_des
     *
     * @return the value of miku_mine_qoptions.option_des
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public String getOptionDes() {
        return optionDes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.option_des
     *
     * @param optionDes the value for miku_mine_qoptions.option_des
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOptionDes(String optionDes) {
        this.optionDes = optionDes == null ? null : optionDes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.option_show_order
     *
     * @return the value of miku_mine_qoptions.option_show_order
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Byte getOptionShowOrder() {
        return optionShowOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.option_show_order
     *
     * @param optionShowOrder the value for miku_mine_qoptions.option_show_order
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOptionShowOrder(Byte optionShowOrder) {
        this.optionShowOrder = optionShowOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.option_show_style
     *
     * @return the value of miku_mine_qoptions.option_show_style
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public String getOptionShowStyle() {
        return optionShowStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.option_show_style
     *
     * @param optionShowStyle the value for miku_mine_qoptions.option_show_style
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOptionShowStyle(String optionShowStyle) {
        this.optionShowStyle = optionShowStyle == null ? null : optionShowStyle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.option_pic_url
     *
     * @return the value of miku_mine_qoptions.option_pic_url
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public String getOptionPicUrl() {
        return optionPicUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.option_pic_url
     *
     * @param optionPicUrl the value for miku_mine_qoptions.option_pic_url
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOptionPicUrl(String optionPicUrl) {
        this.optionPicUrl = optionPicUrl == null ? null : optionPicUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.option_value
     *
     * @return the value of miku_mine_qoptions.option_value
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public String getOptionValue() {
        return optionValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.option_value
     *
     * @param optionValue the value for miku_mine_qoptions.option_value
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.creater_id
     *
     * @return the value of miku_mine_qoptions.creater_id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Long getCreaterId() {
        return createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.creater_id
     *
     * @param createrId the value for miku_mine_qoptions.creater_id
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.version
     *
     * @return the value of miku_mine_qoptions.version
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.version
     *
     * @param version the value for miku_mine_qoptions.version
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.date_created
     *
     * @return the value of miku_mine_qoptions.date_created
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.date_created
     *
     * @param dateCreated the value for miku_mine_qoptions.date_created
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_qoptions.last_updated
     *
     * @return the value of miku_mine_qoptions.last_updated
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_qoptions.last_updated
     *
     * @param lastUpdated the value for miku_mine_qoptions.last_updated
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}