package com.goal.po;

import java.util.ArrayList;
import java.util.List;

public class SerialsHasCmdPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SerialsHasCmdPicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTSerialsIdIsNull() {
            addCriterion("t_serials_id is null");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdIsNotNull() {
            addCriterion("t_serials_id is not null");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdEqualTo(String value) {
            addCriterion("t_serials_id =", value, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdNotEqualTo(String value) {
            addCriterion("t_serials_id <>", value, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdGreaterThan(String value) {
            addCriterion("t_serials_id >", value, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_serials_id >=", value, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdLessThan(String value) {
            addCriterion("t_serials_id <", value, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdLessThanOrEqualTo(String value) {
            addCriterion("t_serials_id <=", value, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdLike(String value) {
            addCriterion("t_serials_id like", value, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdNotLike(String value) {
            addCriterion("t_serials_id not like", value, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdIn(List<String> values) {
            addCriterion("t_serials_id in", values, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdNotIn(List<String> values) {
            addCriterion("t_serials_id not in", values, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdBetween(String value1, String value2) {
            addCriterion("t_serials_id between", value1, value2, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTSerialsIdNotBetween(String value1, String value2) {
            addCriterion("t_serials_id not between", value1, value2, "tSerialsId");
            return (Criteria) this;
        }

        public Criteria andTPicIdIsNull() {
            addCriterion("t_Pic_id is null");
            return (Criteria) this;
        }

        public Criteria andTPicIdIsNotNull() {
            addCriterion("t_Pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTPicIdEqualTo(String value) {
            addCriterion("t_Pic_id =", value, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdNotEqualTo(String value) {
            addCriterion("t_Pic_id <>", value, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdGreaterThan(String value) {
            addCriterion("t_Pic_id >", value, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_Pic_id >=", value, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdLessThan(String value) {
            addCriterion("t_Pic_id <", value, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdLessThanOrEqualTo(String value) {
            addCriterion("t_Pic_id <=", value, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdLike(String value) {
            addCriterion("t_Pic_id like", value, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdNotLike(String value) {
            addCriterion("t_Pic_id not like", value, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdIn(List<String> values) {
            addCriterion("t_Pic_id in", values, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdNotIn(List<String> values) {
            addCriterion("t_Pic_id not in", values, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdBetween(String value1, String value2) {
            addCriterion("t_Pic_id between", value1, value2, "tPicId");
            return (Criteria) this;
        }

        public Criteria andTPicIdNotBetween(String value1, String value2) {
            addCriterion("t_Pic_id not between", value1, value2, "tPicId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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