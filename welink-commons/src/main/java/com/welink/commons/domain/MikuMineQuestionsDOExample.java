package com.welink.commons.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MikuMineQuestionsDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected Integer offset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected Integer limit;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public MikuMineQuestionsDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
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
     * This method corresponds to the database table miku_mine_questions
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
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
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
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miku_mine_questions
     *
     * @mbggenerated Thu May 19 17:52:21 CST 2016
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table miku_mine_questions
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

        public Criteria andScProblemIdIsNull() {
            addCriterion("sc_problem_id is null");
            return (Criteria) this;
        }

        public Criteria andScProblemIdIsNotNull() {
            addCriterion("sc_problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andScProblemIdEqualTo(Long value) {
            addCriterion("sc_problem_id =", value, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdNotEqualTo(Long value) {
            addCriterion("sc_problem_id <>", value, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdGreaterThan(Long value) {
            addCriterion("sc_problem_id >", value, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sc_problem_id >=", value, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdLessThan(Long value) {
            addCriterion("sc_problem_id <", value, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdLessThanOrEqualTo(Long value) {
            addCriterion("sc_problem_id <=", value, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdIn(List<Long> values) {
            addCriterion("sc_problem_id in", values, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdNotIn(List<Long> values) {
            addCriterion("sc_problem_id not in", values, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdBetween(Long value1, Long value2) {
            addCriterion("sc_problem_id between", value1, value2, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andScProblemIdNotBetween(Long value1, Long value2) {
            addCriterion("sc_problem_id not between", value1, value2, "scProblemId");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderIsNull() {
            addCriterion("question_show_order is null");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderIsNotNull() {
            addCriterion("question_show_order is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderEqualTo(Integer value) {
            addCriterion("question_show_order =", value, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderNotEqualTo(Integer value) {
            addCriterion("question_show_order <>", value, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderGreaterThan(Integer value) {
            addCriterion("question_show_order >", value, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_show_order >=", value, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderLessThan(Integer value) {
            addCriterion("question_show_order <", value, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderLessThanOrEqualTo(Integer value) {
            addCriterion("question_show_order <=", value, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderIn(List<Integer> values) {
            addCriterion("question_show_order in", values, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderNotIn(List<Integer> values) {
            addCriterion("question_show_order not in", values, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderBetween(Integer value1, Integer value2) {
            addCriterion("question_show_order between", value1, value2, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionShowOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("question_show_order not between", value1, value2, "questionShowOrder");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNull() {
            addCriterion("question_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNotNull() {
            addCriterion("question_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameEqualTo(String value) {
            addCriterion("question_name =", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotEqualTo(String value) {
            addCriterion("question_name <>", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThan(String value) {
            addCriterion("question_name >", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThanOrEqualTo(String value) {
            addCriterion("question_name >=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThan(String value) {
            addCriterion("question_name <", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThanOrEqualTo(String value) {
            addCriterion("question_name <=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLike(String value) {
            addCriterion("question_name like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotLike(String value) {
            addCriterion("question_name not like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIn(List<String> values) {
            addCriterion("question_name in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotIn(List<String> values) {
            addCriterion("question_name not in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameBetween(String value1, String value2) {
            addCriterion("question_name between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotBetween(String value1, String value2) {
            addCriterion("question_name not between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameIsNull() {
            addCriterion("question_short_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameIsNotNull() {
            addCriterion("question_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameEqualTo(String value) {
            addCriterion("question_short_name =", value, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameNotEqualTo(String value) {
            addCriterion("question_short_name <>", value, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameGreaterThan(String value) {
            addCriterion("question_short_name >", value, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("question_short_name >=", value, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameLessThan(String value) {
            addCriterion("question_short_name <", value, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameLessThanOrEqualTo(String value) {
            addCriterion("question_short_name <=", value, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameLike(String value) {
            addCriterion("question_short_name like", value, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameNotLike(String value) {
            addCriterion("question_short_name not like", value, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameIn(List<String> values) {
            addCriterion("question_short_name in", values, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameNotIn(List<String> values) {
            addCriterion("question_short_name not in", values, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameBetween(String value1, String value2) {
            addCriterion("question_short_name between", value1, value2, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionShortNameNotBetween(String value1, String value2) {
            addCriterion("question_short_name not between", value1, value2, "questionShortName");
            return (Criteria) this;
        }

        public Criteria andQuestionDesIsNull() {
            addCriterion("question_des is null");
            return (Criteria) this;
        }

        public Criteria andQuestionDesIsNotNull() {
            addCriterion("question_des is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionDesEqualTo(String value) {
            addCriterion("question_des =", value, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesNotEqualTo(String value) {
            addCriterion("question_des <>", value, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesGreaterThan(String value) {
            addCriterion("question_des >", value, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesGreaterThanOrEqualTo(String value) {
            addCriterion("question_des >=", value, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesLessThan(String value) {
            addCriterion("question_des <", value, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesLessThanOrEqualTo(String value) {
            addCriterion("question_des <=", value, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesLike(String value) {
            addCriterion("question_des like", value, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesNotLike(String value) {
            addCriterion("question_des not like", value, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesIn(List<String> values) {
            addCriterion("question_des in", values, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesNotIn(List<String> values) {
            addCriterion("question_des not in", values, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesBetween(String value1, String value2) {
            addCriterion("question_des between", value1, value2, "questionDes");
            return (Criteria) this;
        }

        public Criteria andQuestionDesNotBetween(String value1, String value2) {
            addCriterion("question_des not between", value1, value2, "questionDes");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeIsNull() {
            addCriterion("options_selectable_type is null");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeIsNotNull() {
            addCriterion("options_selectable_type is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeEqualTo(Byte value) {
            addCriterion("options_selectable_type =", value, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeNotEqualTo(Byte value) {
            addCriterion("options_selectable_type <>", value, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeGreaterThan(Byte value) {
            addCriterion("options_selectable_type >", value, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("options_selectable_type >=", value, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeLessThan(Byte value) {
            addCriterion("options_selectable_type <", value, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeLessThanOrEqualTo(Byte value) {
            addCriterion("options_selectable_type <=", value, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeIn(List<Byte> values) {
            addCriterion("options_selectable_type in", values, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeNotIn(List<Byte> values) {
            addCriterion("options_selectable_type not in", values, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeBetween(Byte value1, Byte value2) {
            addCriterion("options_selectable_type between", value1, value2, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("options_selectable_type not between", value1, value2, "optionsSelectableType");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumIsNull() {
            addCriterion("options_selectable_maxnum is null");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumIsNotNull() {
            addCriterion("options_selectable_maxnum is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumEqualTo(Integer value) {
            addCriterion("options_selectable_maxnum =", value, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumNotEqualTo(Integer value) {
            addCriterion("options_selectable_maxnum <>", value, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumGreaterThan(Integer value) {
            addCriterion("options_selectable_maxnum >", value, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("options_selectable_maxnum >=", value, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumLessThan(Integer value) {
            addCriterion("options_selectable_maxnum <", value, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("options_selectable_maxnum <=", value, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumIn(List<Integer> values) {
            addCriterion("options_selectable_maxnum in", values, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumNotIn(List<Integer> values) {
            addCriterion("options_selectable_maxnum not in", values, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumBetween(Integer value1, Integer value2) {
            addCriterion("options_selectable_maxnum between", value1, value2, "optionsSelectableMaxnum");
            return (Criteria) this;
        }

        public Criteria andOptionsSelectableMaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("options_selectable_maxnum not between", value1, value2, "optionsSelectableMaxnum");
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
     * This class corresponds to the database table miku_mine_questions
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
     * This class corresponds to the database table miku_mine_questions
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