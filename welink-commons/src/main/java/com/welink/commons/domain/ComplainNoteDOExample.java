package com.welink.commons.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplainNoteDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    protected Integer limit;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public ComplainNoteDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
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
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
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

        public Criteria andComplainIdIsNull() {
            addCriterion("complain_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainIdIsNotNull() {
            addCriterion("complain_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainIdEqualTo(Long value) {
            addCriterion("complain_id =", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotEqualTo(Long value) {
            addCriterion("complain_id <>", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThan(Long value) {
            addCriterion("complain_id >", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("complain_id >=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThan(Long value) {
            addCriterion("complain_id <", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThanOrEqualTo(Long value) {
            addCriterion("complain_id <=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdIn(List<Long> values) {
            addCriterion("complain_id in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotIn(List<Long> values) {
            addCriterion("complain_id not in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdBetween(Long value1, Long value2) {
            addCriterion("complain_id between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotBetween(Long value1, Long value2) {
            addCriterion("complain_id not between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andDateCreateIsNull() {
            addCriterion("date_create is null");
            return (Criteria) this;
        }

        public Criteria andDateCreateIsNotNull() {
            addCriterion("date_create is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreateEqualTo(Date value) {
            addCriterion("date_create =", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotEqualTo(Date value) {
            addCriterion("date_create <>", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateGreaterThan(Date value) {
            addCriterion("date_create >", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("date_create >=", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateLessThan(Date value) {
            addCriterion("date_create <", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateLessThanOrEqualTo(Date value) {
            addCriterion("date_create <=", value, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateIn(List<Date> values) {
            addCriterion("date_create in", values, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotIn(List<Date> values) {
            addCriterion("date_create not in", values, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateBetween(Date value1, Date value2) {
            addCriterion("date_create between", value1, value2, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDateCreateNotBetween(Date value1, Date value2) {
            addCriterion("date_create not between", value1, value2, "dateCreate");
            return (Criteria) this;
        }

        public Criteria andDealContentIsNull() {
            addCriterion("deal_content is null");
            return (Criteria) this;
        }

        public Criteria andDealContentIsNotNull() {
            addCriterion("deal_content is not null");
            return (Criteria) this;
        }

        public Criteria andDealContentEqualTo(String value) {
            addCriterion("deal_content =", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentNotEqualTo(String value) {
            addCriterion("deal_content <>", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentGreaterThan(String value) {
            addCriterion("deal_content >", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentGreaterThanOrEqualTo(String value) {
            addCriterion("deal_content >=", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentLessThan(String value) {
            addCriterion("deal_content <", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentLessThanOrEqualTo(String value) {
            addCriterion("deal_content <=", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentLike(String value) {
            addCriterion("deal_content like", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentNotLike(String value) {
            addCriterion("deal_content not like", value, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentIn(List<String> values) {
            addCriterion("deal_content in", values, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentNotIn(List<String> values) {
            addCriterion("deal_content not in", values, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentBetween(String value1, String value2) {
            addCriterion("deal_content between", value1, value2, "dealContent");
            return (Criteria) this;
        }

        public Criteria andDealContentNotBetween(String value1, String value2) {
            addCriterion("deal_content not between", value1, value2, "dealContent");
            return (Criteria) this;
        }

        public Criteria andPicUrlsIsNull() {
            addCriterion("pic_urls is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlsIsNotNull() {
            addCriterion("pic_urls is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlsEqualTo(String value) {
            addCriterion("pic_urls =", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsNotEqualTo(String value) {
            addCriterion("pic_urls <>", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsGreaterThan(String value) {
            addCriterion("pic_urls >", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("pic_urls >=", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsLessThan(String value) {
            addCriterion("pic_urls <", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsLessThanOrEqualTo(String value) {
            addCriterion("pic_urls <=", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsLike(String value) {
            addCriterion("pic_urls like", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsNotLike(String value) {
            addCriterion("pic_urls not like", value, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsIn(List<String> values) {
            addCriterion("pic_urls in", values, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsNotIn(List<String> values) {
            addCriterion("pic_urls not in", values, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsBetween(String value1, String value2) {
            addCriterion("pic_urls between", value1, value2, "picUrls");
            return (Criteria) this;
        }

        public Criteria andPicUrlsNotBetween(String value1, String value2) {
            addCriterion("pic_urls not between", value1, value2, "picUrls");
            return (Criteria) this;
        }

        public Criteria andReplyerIdIsNull() {
            addCriterion("replyer_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyerIdIsNotNull() {
            addCriterion("replyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyerIdEqualTo(Long value) {
            addCriterion("replyer_id =", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdNotEqualTo(Long value) {
            addCriterion("replyer_id <>", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdGreaterThan(Long value) {
            addCriterion("replyer_id >", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("replyer_id >=", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdLessThan(Long value) {
            addCriterion("replyer_id <", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdLessThanOrEqualTo(Long value) {
            addCriterion("replyer_id <=", value, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdIn(List<Long> values) {
            addCriterion("replyer_id in", values, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdNotIn(List<Long> values) {
            addCriterion("replyer_id not in", values, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdBetween(Long value1, Long value2) {
            addCriterion("replyer_id between", value1, value2, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerIdNotBetween(Long value1, Long value2) {
            addCriterion("replyer_id not between", value1, value2, "replyerId");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeIsNull() {
            addCriterion("replyer_type is null");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeIsNotNull() {
            addCriterion("replyer_type is not null");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeEqualTo(Byte value) {
            addCriterion("replyer_type =", value, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeNotEqualTo(Byte value) {
            addCriterion("replyer_type <>", value, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeGreaterThan(Byte value) {
            addCriterion("replyer_type >", value, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("replyer_type >=", value, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeLessThan(Byte value) {
            addCriterion("replyer_type <", value, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("replyer_type <=", value, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeIn(List<Byte> values) {
            addCriterion("replyer_type in", values, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeNotIn(List<Byte> values) {
            addCriterion("replyer_type not in", values, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeBetween(Byte value1, Byte value2) {
            addCriterion("replyer_type between", value1, value2, "replyerType");
            return (Criteria) this;
        }

        public Criteria andReplyerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("replyer_type not between", value1, value2, "replyerType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain_deal_notes
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 27 18:10:21 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain_deal_notes
     *
     * @mbggenerated Thu Nov 27 18:10:21 CST 2014
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