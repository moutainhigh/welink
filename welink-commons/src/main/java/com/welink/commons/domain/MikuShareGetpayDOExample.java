package com.welink.commons.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MikuShareGetpayDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    protected Integer limit;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public MikuShareGetpayDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGetpayIdIsNull() {
            addCriterion("getpay_id is null");
            return (Criteria) this;
        }

        public Criteria andGetpayIdIsNotNull() {
            addCriterion("getpay_id is not null");
            return (Criteria) this;
        }

        public Criteria andGetpayIdEqualTo(Long value) {
            addCriterion("getpay_id =", value, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdNotEqualTo(Long value) {
            addCriterion("getpay_id <>", value, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdGreaterThan(Long value) {
            addCriterion("getpay_id >", value, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdGreaterThanOrEqualTo(Long value) {
            addCriterion("getpay_id >=", value, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdLessThan(Long value) {
            addCriterion("getpay_id <", value, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdLessThanOrEqualTo(Long value) {
            addCriterion("getpay_id <=", value, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdIn(List<Long> values) {
            addCriterion("getpay_id in", values, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdNotIn(List<Long> values) {
            addCriterion("getpay_id not in", values, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdBetween(Long value1, Long value2) {
            addCriterion("getpay_id between", value1, value2, "getpayId");
            return (Criteria) this;
        }

        public Criteria andGetpayIdNotBetween(Long value1, Long value2) {
            addCriterion("getpay_id not between", value1, value2, "getpayId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdIsNull() {
            addCriterion("sales_record_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdIsNotNull() {
            addCriterion("sales_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdEqualTo(Long value) {
            addCriterion("sales_record_id =", value, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdNotEqualTo(Long value) {
            addCriterion("sales_record_id <>", value, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdGreaterThan(Long value) {
            addCriterion("sales_record_id >", value, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sales_record_id >=", value, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdLessThan(Long value) {
            addCriterion("sales_record_id <", value, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("sales_record_id <=", value, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdIn(List<Long> values) {
            addCriterion("sales_record_id in", values, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdNotIn(List<Long> values) {
            addCriterion("sales_record_id not in", values, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdBetween(Long value1, Long value2) {
            addCriterion("sales_record_id between", value1, value2, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andSalesRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("sales_record_id not between", value1, value2, "salesRecordId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("date_created is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("date_created is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterion("date_created =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterion("date_created <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterion("date_created >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("date_created >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterion("date_created <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("date_created <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterion("date_created in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterion("date_created not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterion("date_created between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("date_created not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedIsNull() {
            addCriterion("last_updated is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedIsNotNull() {
            addCriterion("last_updated is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedEqualTo(Date value) {
            addCriterion("last_updated =", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedNotEqualTo(Date value) {
            addCriterion("last_updated <>", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedGreaterThan(Date value) {
            addCriterion("last_updated >", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("last_updated >=", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedLessThan(Date value) {
            addCriterion("last_updated <", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("last_updated <=", value, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedIn(List<Date> values) {
            addCriterion("last_updated in", values, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedNotIn(List<Date> values) {
            addCriterion("last_updated not in", values, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedBetween(Date value1, Date value2) {
            addCriterion("last_updated between", value1, value2, "lastUpdated");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("last_updated not between", value1, value2, "lastUpdated");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_share_getpay
     *
     * @mbggenerated do_not_delete_during_merge Mon Dec 07 14:29:47 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_share_getpay
     *
     * @mbggenerated Mon Dec 07 14:29:47 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}