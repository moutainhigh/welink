package com.welink.commons.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MikuRedPackSettingDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    protected Integer limit;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public MikuRedPackSettingDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
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
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOnepackstrIsNull() {
            addCriterion("onepackstr is null");
            return (Criteria) this;
        }

        public Criteria andOnepackstrIsNotNull() {
            addCriterion("onepackstr is not null");
            return (Criteria) this;
        }

        public Criteria andOnepackstrEqualTo(String value) {
            addCriterion("onepackstr =", value, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrNotEqualTo(String value) {
            addCriterion("onepackstr <>", value, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrGreaterThan(String value) {
            addCriterion("onepackstr >", value, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrGreaterThanOrEqualTo(String value) {
            addCriterion("onepackstr >=", value, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrLessThan(String value) {
            addCriterion("onepackstr <", value, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrLessThanOrEqualTo(String value) {
            addCriterion("onepackstr <=", value, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrLike(String value) {
            addCriterion("onepackstr like", value, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrNotLike(String value) {
            addCriterion("onepackstr not like", value, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrIn(List<String> values) {
            addCriterion("onepackstr in", values, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrNotIn(List<String> values) {
            addCriterion("onepackstr not in", values, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrBetween(String value1, String value2) {
            addCriterion("onepackstr between", value1, value2, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepackstrNotBetween(String value1, String value2) {
            addCriterion("onepackstr not between", value1, value2, "onepackstr");
            return (Criteria) this;
        }

        public Criteria andOnepercentIsNull() {
            addCriterion("onepercent is null");
            return (Criteria) this;
        }

        public Criteria andOnepercentIsNotNull() {
            addCriterion("onepercent is not null");
            return (Criteria) this;
        }

        public Criteria andOnepercentEqualTo(Long value) {
            addCriterion("onepercent =", value, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentNotEqualTo(Long value) {
            addCriterion("onepercent <>", value, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentGreaterThan(Long value) {
            addCriterion("onepercent >", value, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentGreaterThanOrEqualTo(Long value) {
            addCriterion("onepercent >=", value, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentLessThan(Long value) {
            addCriterion("onepercent <", value, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentLessThanOrEqualTo(Long value) {
            addCriterion("onepercent <=", value, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentIn(List<Long> values) {
            addCriterion("onepercent in", values, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentNotIn(List<Long> values) {
            addCriterion("onepercent not in", values, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentBetween(Long value1, Long value2) {
            addCriterion("onepercent between", value1, value2, "onepercent");
            return (Criteria) this;
        }

        public Criteria andOnepercentNotBetween(Long value1, Long value2) {
            addCriterion("onepercent not between", value1, value2, "onepercent");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Long value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Long value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Long value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Long value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Long value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Long value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Long> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Long> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Long value1, Long value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Long value1, Long value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("begintime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("begintime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("begintime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("begintime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("begintime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begintime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("begintime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("begintime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("begintime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("begintime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("begintime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("begintime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRpmaxIsNull() {
            addCriterion("rpmax is null");
            return (Criteria) this;
        }

        public Criteria andRpmaxIsNotNull() {
            addCriterion("rpmax is not null");
            return (Criteria) this;
        }

        public Criteria andRpmaxEqualTo(Long value) {
            addCriterion("rpmax =", value, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxNotEqualTo(Long value) {
            addCriterion("rpmax <>", value, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxGreaterThan(Long value) {
            addCriterion("rpmax >", value, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxGreaterThanOrEqualTo(Long value) {
            addCriterion("rpmax >=", value, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxLessThan(Long value) {
            addCriterion("rpmax <", value, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxLessThanOrEqualTo(Long value) {
            addCriterion("rpmax <=", value, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxIn(List<Long> values) {
            addCriterion("rpmax in", values, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxNotIn(List<Long> values) {
            addCriterion("rpmax not in", values, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxBetween(Long value1, Long value2) {
            addCriterion("rpmax between", value1, value2, "rpmax");
            return (Criteria) this;
        }

        public Criteria andRpmaxNotBetween(Long value1, Long value2) {
            addCriterion("rpmax not between", value1, value2, "rpmax");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated do_not_delete_during_merge Tue Jan 05 13:49:01 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_redpacket_active
     *
     * @mbggenerated Tue Jan 05 13:49:01 CST 2016
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