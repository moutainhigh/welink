package com.welink.commons.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MikuWalletDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    protected Integer limit;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public MikuWalletDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
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
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeIsNull() {
            addCriterion("balance_fee is null");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeIsNotNull() {
            addCriterion("balance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeEqualTo(Long value) {
            addCriterion("balance_fee =", value, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeNotEqualTo(Long value) {
            addCriterion("balance_fee <>", value, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeGreaterThan(Long value) {
            addCriterion("balance_fee >", value, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("balance_fee >=", value, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeLessThan(Long value) {
            addCriterion("balance_fee <", value, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeLessThanOrEqualTo(Long value) {
            addCriterion("balance_fee <=", value, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeIn(List<Long> values) {
            addCriterion("balance_fee in", values, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeNotIn(List<Long> values) {
            addCriterion("balance_fee not in", values, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeBetween(Long value1, Long value2) {
            addCriterion("balance_fee between", value1, value2, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andBalanceFeeNotBetween(Long value1, Long value2) {
            addCriterion("balance_fee not between", value1, value2, "balanceFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeIsNull() {
            addCriterion("getpayed_fee is null");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeIsNotNull() {
            addCriterion("getpayed_fee is not null");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeEqualTo(Long value) {
            addCriterion("getpayed_fee =", value, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeNotEqualTo(Long value) {
            addCriterion("getpayed_fee <>", value, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeGreaterThan(Long value) {
            addCriterion("getpayed_fee >", value, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("getpayed_fee >=", value, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeLessThan(Long value) {
            addCriterion("getpayed_fee <", value, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeLessThanOrEqualTo(Long value) {
            addCriterion("getpayed_fee <=", value, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeIn(List<Long> values) {
            addCriterion("getpayed_fee in", values, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeNotIn(List<Long> values) {
            addCriterion("getpayed_fee not in", values, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeBetween(Long value1, Long value2) {
            addCriterion("getpayed_fee between", value1, value2, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayedFeeNotBetween(Long value1, Long value2) {
            addCriterion("getpayed_fee not between", value1, value2, "getpayedFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeIsNull() {
            addCriterion("getpaying_fee is null");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeIsNotNull() {
            addCriterion("getpaying_fee is not null");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeEqualTo(Long value) {
            addCriterion("getpaying_fee =", value, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeNotEqualTo(Long value) {
            addCriterion("getpaying_fee <>", value, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeGreaterThan(Long value) {
            addCriterion("getpaying_fee >", value, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("getpaying_fee >=", value, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeLessThan(Long value) {
            addCriterion("getpaying_fee <", value, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeLessThanOrEqualTo(Long value) {
            addCriterion("getpaying_fee <=", value, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeIn(List<Long> values) {
            addCriterion("getpaying_fee in", values, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeNotIn(List<Long> values) {
            addCriterion("getpaying_fee not in", values, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeBetween(Long value1, Long value2) {
            addCriterion("getpaying_fee between", value1, value2, "getpayingFee");
            return (Criteria) this;
        }

        public Criteria andGetpayingFeeNotBetween(Long value1, Long value2) {
            addCriterion("getpaying_fee not between", value1, value2, "getpayingFee");
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
     * This class corresponds to the database table miku_wallet
     *
     * @mbggenerated do_not_delete_during_merge Wed Jan 13 20:03:00 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_wallet
     *
     * @mbggenerated Wed Jan 13 20:03:00 CST 2016
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