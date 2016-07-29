package com.welink.commons.domain;

import java.math.BigDecimal;
import java.util.Date;

public class MikuInstrumentMeasureLogDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.id
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.version
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.create_day
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Integer createDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.create_month
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Integer createMonth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.create_hour
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Integer createHour;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.create_week
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Integer createWeek;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.create_year
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Integer createYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.date_created
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.instrument_type
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Byte instrumentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.last_updated
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Date lastUpdated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.measure_type
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Byte measureType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.measure_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private BigDecimal measureValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.moisture_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private BigDecimal moistureValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.oil_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private BigDecimal oilValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.resilience_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private BigDecimal resilienceValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.senility_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private BigDecimal senilityValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.user_id
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_instrument_measure_log.test_position
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    private Byte testPosition;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.id
     *
     * @return the value of miku_instrument_measure_log.id
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.id
     *
     * @param id the value for miku_instrument_measure_log.id
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.version
     *
     * @return the value of miku_instrument_measure_log.version
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.version
     *
     * @param version the value for miku_instrument_measure_log.version
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.create_day
     *
     * @return the value of miku_instrument_measure_log.create_day
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Integer getCreateDay() {
        return createDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.create_day
     *
     * @param createDay the value for miku_instrument_measure_log.create_day
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setCreateDay(Integer createDay) {
        this.createDay = createDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.create_month
     *
     * @return the value of miku_instrument_measure_log.create_month
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Integer getCreateMonth() {
        return createMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.create_month
     *
     * @param createMonth the value for miku_instrument_measure_log.create_month
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setCreateMonth(Integer createMonth) {
        this.createMonth = createMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.create_hour
     *
     * @return the value of miku_instrument_measure_log.create_hour
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Integer getCreateHour() {
        return createHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.create_hour
     *
     * @param createHour the value for miku_instrument_measure_log.create_hour
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setCreateHour(Integer createHour) {
        this.createHour = createHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.create_week
     *
     * @return the value of miku_instrument_measure_log.create_week
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Integer getCreateWeek() {
        return createWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.create_week
     *
     * @param createWeek the value for miku_instrument_measure_log.create_week
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setCreateWeek(Integer createWeek) {
        this.createWeek = createWeek;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.create_year
     *
     * @return the value of miku_instrument_measure_log.create_year
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Integer getCreateYear() {
        return createYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.create_year
     *
     * @param createYear the value for miku_instrument_measure_log.create_year
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setCreateYear(Integer createYear) {
        this.createYear = createYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.date_created
     *
     * @return the value of miku_instrument_measure_log.date_created
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.date_created
     *
     * @param dateCreated the value for miku_instrument_measure_log.date_created
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.instrument_type
     *
     * @return the value of miku_instrument_measure_log.instrument_type
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Byte getInstrumentType() {
        return instrumentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.instrument_type
     *
     * @param instrumentType the value for miku_instrument_measure_log.instrument_type
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setInstrumentType(Byte instrumentType) {
        this.instrumentType = instrumentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.last_updated
     *
     * @return the value of miku_instrument_measure_log.last_updated
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.last_updated
     *
     * @param lastUpdated the value for miku_instrument_measure_log.last_updated
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.measure_type
     *
     * @return the value of miku_instrument_measure_log.measure_type
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Byte getMeasureType() {
        return measureType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.measure_type
     *
     * @param measureType the value for miku_instrument_measure_log.measure_type
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setMeasureType(Byte measureType) {
        this.measureType = measureType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.measure_value
     *
     * @return the value of miku_instrument_measure_log.measure_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public BigDecimal getMeasureValue() {
        return measureValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.measure_value
     *
     * @param measureValue the value for miku_instrument_measure_log.measure_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setMeasureValue(BigDecimal measureValue) {
        this.measureValue = measureValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.moisture_value
     *
     * @return the value of miku_instrument_measure_log.moisture_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public BigDecimal getMoistureValue() {
        return moistureValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.moisture_value
     *
     * @param moistureValue the value for miku_instrument_measure_log.moisture_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setMoistureValue(BigDecimal moistureValue) {
        this.moistureValue = moistureValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.oil_value
     *
     * @return the value of miku_instrument_measure_log.oil_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public BigDecimal getOilValue() {
        return oilValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.oil_value
     *
     * @param oilValue the value for miku_instrument_measure_log.oil_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setOilValue(BigDecimal oilValue) {
        this.oilValue = oilValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.resilience_value
     *
     * @return the value of miku_instrument_measure_log.resilience_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public BigDecimal getResilienceValue() {
        return resilienceValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.resilience_value
     *
     * @param resilienceValue the value for miku_instrument_measure_log.resilience_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setResilienceValue(BigDecimal resilienceValue) {
        this.resilienceValue = resilienceValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.senility_value
     *
     * @return the value of miku_instrument_measure_log.senility_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public BigDecimal getSenilityValue() {
        return senilityValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.senility_value
     *
     * @param senilityValue the value for miku_instrument_measure_log.senility_value
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setSenilityValue(BigDecimal senilityValue) {
        this.senilityValue = senilityValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.user_id
     *
     * @return the value of miku_instrument_measure_log.user_id
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.user_id
     *
     * @param userId the value for miku_instrument_measure_log.user_id
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_instrument_measure_log.test_position
     *
     * @return the value of miku_instrument_measure_log.test_position
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public Byte getTestPosition() {
        return testPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_instrument_measure_log.test_position
     *
     * @param testPosition the value for miku_instrument_measure_log.test_position
     *
     * @mbggenerated Tue Apr 19 16:45:46 CST 2016
     */
    public void setTestPosition(Byte testPosition) {
        this.testPosition = testPosition;
    }
}