package com.welink.commons.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MikuMineQoptionsDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected Integer limit;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public MikuMineQoptionsDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
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
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andOptionNameIsNull() {
            addCriterion("option_name is null");
            return (Criteria) this;
        }

        public Criteria andOptionNameIsNotNull() {
            addCriterion("option_name is not null");
            return (Criteria) this;
        }

        public Criteria andOptionNameEqualTo(String value) {
            addCriterion("option_name =", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameNotEqualTo(String value) {
            addCriterion("option_name <>", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameGreaterThan(String value) {
            addCriterion("option_name >", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("option_name >=", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameLessThan(String value) {
            addCriterion("option_name <", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameLessThanOrEqualTo(String value) {
            addCriterion("option_name <=", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameLike(String value) {
            addCriterion("option_name like", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameNotLike(String value) {
            addCriterion("option_name not like", value, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameIn(List<String> values) {
            addCriterion("option_name in", values, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameNotIn(List<String> values) {
            addCriterion("option_name not in", values, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameBetween(String value1, String value2) {
            addCriterion("option_name between", value1, value2, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionNameNotBetween(String value1, String value2) {
            addCriterion("option_name not between", value1, value2, "optionName");
            return (Criteria) this;
        }

        public Criteria andOptionDesIsNull() {
            addCriterion("option_des is null");
            return (Criteria) this;
        }

        public Criteria andOptionDesIsNotNull() {
            addCriterion("option_des is not null");
            return (Criteria) this;
        }

        public Criteria andOptionDesEqualTo(String value) {
            addCriterion("option_des =", value, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesNotEqualTo(String value) {
            addCriterion("option_des <>", value, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesGreaterThan(String value) {
            addCriterion("option_des >", value, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesGreaterThanOrEqualTo(String value) {
            addCriterion("option_des >=", value, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesLessThan(String value) {
            addCriterion("option_des <", value, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesLessThanOrEqualTo(String value) {
            addCriterion("option_des <=", value, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesLike(String value) {
            addCriterion("option_des like", value, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesNotLike(String value) {
            addCriterion("option_des not like", value, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesIn(List<String> values) {
            addCriterion("option_des in", values, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesNotIn(List<String> values) {
            addCriterion("option_des not in", values, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesBetween(String value1, String value2) {
            addCriterion("option_des between", value1, value2, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionDesNotBetween(String value1, String value2) {
            addCriterion("option_des not between", value1, value2, "optionDes");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderIsNull() {
            addCriterion("option_show_order is null");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderIsNotNull() {
            addCriterion("option_show_order is not null");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderEqualTo(Byte value) {
            addCriterion("option_show_order =", value, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderNotEqualTo(Byte value) {
            addCriterion("option_show_order <>", value, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderGreaterThan(Byte value) {
            addCriterion("option_show_order >", value, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("option_show_order >=", value, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderLessThan(Byte value) {
            addCriterion("option_show_order <", value, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderLessThanOrEqualTo(Byte value) {
            addCriterion("option_show_order <=", value, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderIn(List<Byte> values) {
            addCriterion("option_show_order in", values, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderNotIn(List<Byte> values) {
            addCriterion("option_show_order not in", values, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderBetween(Byte value1, Byte value2) {
            addCriterion("option_show_order between", value1, value2, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("option_show_order not between", value1, value2, "optionShowOrder");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleIsNull() {
            addCriterion("option_show_style is null");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleIsNotNull() {
            addCriterion("option_show_style is not null");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleEqualTo(String value) {
            addCriterion("option_show_style =", value, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleNotEqualTo(String value) {
            addCriterion("option_show_style <>", value, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleGreaterThan(String value) {
            addCriterion("option_show_style >", value, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleGreaterThanOrEqualTo(String value) {
            addCriterion("option_show_style >=", value, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleLessThan(String value) {
            addCriterion("option_show_style <", value, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleLessThanOrEqualTo(String value) {
            addCriterion("option_show_style <=", value, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleLike(String value) {
            addCriterion("option_show_style like", value, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleNotLike(String value) {
            addCriterion("option_show_style not like", value, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleIn(List<String> values) {
            addCriterion("option_show_style in", values, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleNotIn(List<String> values) {
            addCriterion("option_show_style not in", values, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleBetween(String value1, String value2) {
            addCriterion("option_show_style between", value1, value2, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionShowStyleNotBetween(String value1, String value2) {
            addCriterion("option_show_style not between", value1, value2, "optionShowStyle");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlIsNull() {
            addCriterion("option_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlIsNotNull() {
            addCriterion("option_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlEqualTo(String value) {
            addCriterion("option_pic_url =", value, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlNotEqualTo(String value) {
            addCriterion("option_pic_url <>", value, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlGreaterThan(String value) {
            addCriterion("option_pic_url >", value, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("option_pic_url >=", value, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlLessThan(String value) {
            addCriterion("option_pic_url <", value, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlLessThanOrEqualTo(String value) {
            addCriterion("option_pic_url <=", value, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlLike(String value) {
            addCriterion("option_pic_url like", value, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlNotLike(String value) {
            addCriterion("option_pic_url not like", value, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlIn(List<String> values) {
            addCriterion("option_pic_url in", values, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlNotIn(List<String> values) {
            addCriterion("option_pic_url not in", values, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlBetween(String value1, String value2) {
            addCriterion("option_pic_url between", value1, value2, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionPicUrlNotBetween(String value1, String value2) {
            addCriterion("option_pic_url not between", value1, value2, "optionPicUrl");
            return (Criteria) this;
        }

        public Criteria andOptionValueIsNull() {
            addCriterion("option_value is null");
            return (Criteria) this;
        }

        public Criteria andOptionValueIsNotNull() {
            addCriterion("option_value is not null");
            return (Criteria) this;
        }

        public Criteria andOptionValueEqualTo(String value) {
            addCriterion("option_value =", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotEqualTo(String value) {
            addCriterion("option_value <>", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueGreaterThan(String value) {
            addCriterion("option_value >", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueGreaterThanOrEqualTo(String value) {
            addCriterion("option_value >=", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLessThan(String value) {
            addCriterion("option_value <", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLessThanOrEqualTo(String value) {
            addCriterion("option_value <=", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueLike(String value) {
            addCriterion("option_value like", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotLike(String value) {
            addCriterion("option_value not like", value, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueIn(List<String> values) {
            addCriterion("option_value in", values, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotIn(List<String> values) {
            addCriterion("option_value not in", values, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueBetween(String value1, String value2) {
            addCriterion("option_value between", value1, value2, "optionValue");
            return (Criteria) this;
        }

        public Criteria andOptionValueNotBetween(String value1, String value2) {
            addCriterion("option_value not between", value1, value2, "optionValue");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(Long value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(Long value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(Long value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(Long value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(Long value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<Long> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<Long> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(Long value1, Long value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(Long value1, Long value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
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
     * This class corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated do_not_delete_during_merge Thu May 19 17:52:21 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_mine_qoptions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
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