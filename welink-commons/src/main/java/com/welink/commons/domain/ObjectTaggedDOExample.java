package com.welink.commons.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectTaggedDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    protected Integer limit;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public ObjectTaggedDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
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
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
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

        public Criteria andArtificialIdIsNull() {
            addCriterion("artificial_id is null");
            return (Criteria) this;
        }

        public Criteria andArtificialIdIsNotNull() {
            addCriterion("artificial_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtificialIdEqualTo(Long value) {
            addCriterion("artificial_id =", value, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdNotEqualTo(Long value) {
            addCriterion("artificial_id <>", value, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdGreaterThan(Long value) {
            addCriterion("artificial_id >", value, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdGreaterThanOrEqualTo(Long value) {
            addCriterion("artificial_id >=", value, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdLessThan(Long value) {
            addCriterion("artificial_id <", value, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdLessThanOrEqualTo(Long value) {
            addCriterion("artificial_id <=", value, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdIn(List<Long> values) {
            addCriterion("artificial_id in", values, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdNotIn(List<Long> values) {
            addCriterion("artificial_id not in", values, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdBetween(Long value1, Long value2) {
            addCriterion("artificial_id between", value1, value2, "artificialId");
            return (Criteria) this;
        }

        public Criteria andArtificialIdNotBetween(Long value1, Long value2) {
            addCriterion("artificial_id not between", value1, value2, "artificialId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andKvIsNull() {
            addCriterion("kv is null");
            return (Criteria) this;
        }

        public Criteria andKvIsNotNull() {
            addCriterion("kv is not null");
            return (Criteria) this;
        }

        public Criteria andKvEqualTo(String value) {
            addCriterion("kv =", value, "kv");
            return (Criteria) this;
        }

        public Criteria andKvNotEqualTo(String value) {
            addCriterion("kv <>", value, "kv");
            return (Criteria) this;
        }

        public Criteria andKvGreaterThan(String value) {
            addCriterion("kv >", value, "kv");
            return (Criteria) this;
        }

        public Criteria andKvGreaterThanOrEqualTo(String value) {
            addCriterion("kv >=", value, "kv");
            return (Criteria) this;
        }

        public Criteria andKvLessThan(String value) {
            addCriterion("kv <", value, "kv");
            return (Criteria) this;
        }

        public Criteria andKvLessThanOrEqualTo(String value) {
            addCriterion("kv <=", value, "kv");
            return (Criteria) this;
        }

        public Criteria andKvLike(String value) {
            addCriterion("kv like", value, "kv");
            return (Criteria) this;
        }

        public Criteria andKvNotLike(String value) {
            addCriterion("kv not like", value, "kv");
            return (Criteria) this;
        }

        public Criteria andKvIn(List<String> values) {
            addCriterion("kv in", values, "kv");
            return (Criteria) this;
        }

        public Criteria andKvNotIn(List<String> values) {
            addCriterion("kv not in", values, "kv");
            return (Criteria) this;
        }

        public Criteria andKvBetween(String value1, String value2) {
            addCriterion("kv between", value1, value2, "kv");
            return (Criteria) this;
        }

        public Criteria andKvNotBetween(String value1, String value2) {
            addCriterion("kv not between", value1, value2, "kv");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNull() {
            addCriterion("tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Long value) {
            addCriterion("tag_id =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Long value) {
            addCriterion("tag_id <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Long value) {
            addCriterion("tag_id >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tag_id >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Long value) {
            addCriterion("tag_id <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Long value) {
            addCriterion("tag_id <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Long> values) {
            addCriterion("tag_id in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Long> values) {
            addCriterion("tag_id not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Long value1, Long value2) {
            addCriterion("tag_id between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Long value1, Long value2) {
            addCriterion("tag_id not between", value1, value2, "tagId");
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

        public Criteria andActivityNumIsNull() {
            addCriterion("activity_num is null");
            return (Criteria) this;
        }

        public Criteria andActivityNumIsNotNull() {
            addCriterion("activity_num is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNumEqualTo(Integer value) {
            addCriterion("activity_num =", value, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumNotEqualTo(Integer value) {
            addCriterion("activity_num <>", value, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumGreaterThan(Integer value) {
            addCriterion("activity_num >", value, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_num >=", value, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumLessThan(Integer value) {
            addCriterion("activity_num <", value, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumLessThanOrEqualTo(Integer value) {
            addCriterion("activity_num <=", value, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumIn(List<Integer> values) {
            addCriterion("activity_num in", values, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumNotIn(List<Integer> values) {
            addCriterion("activity_num not in", values, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumBetween(Integer value1, Integer value2) {
            addCriterion("activity_num between", value1, value2, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivityNumNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_num not between", value1, value2, "activityNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumIsNull() {
            addCriterion("activity_sold_num is null");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumIsNotNull() {
            addCriterion("activity_sold_num is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumEqualTo(Integer value) {
            addCriterion("activity_sold_num =", value, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumNotEqualTo(Integer value) {
            addCriterion("activity_sold_num <>", value, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumGreaterThan(Integer value) {
            addCriterion("activity_sold_num >", value, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_sold_num >=", value, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumLessThan(Integer value) {
            addCriterion("activity_sold_num <", value, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumLessThanOrEqualTo(Integer value) {
            addCriterion("activity_sold_num <=", value, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumIn(List<Integer> values) {
            addCriterion("activity_sold_num in", values, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumNotIn(List<Integer> values) {
            addCriterion("activity_sold_num not in", values, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumBetween(Integer value1, Integer value2) {
            addCriterion("activity_sold_num between", value1, value2, "activitySoldNum");
            return (Criteria) this;
        }

        public Criteria andActivitySoldNumNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_sold_num not between", value1, value2, "activitySoldNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table object_tagged
     *
     * @mbggenerated do_not_delete_during_merge Mon Dec 07 09:54:38 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table object_tagged
     *
     * @mbggenerated Mon Dec 07 09:54:38 CST 2015
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