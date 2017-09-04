package com.goal.po;

import java.util.ArrayList;
import java.util.List;

public class BrandHasCmdTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandHasCmdTypeExample() {
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

        public Criteria andTBrandIdIsNull() {
            addCriterion("t_Brand_id is null");
            return (Criteria) this;
        }

        public Criteria andTBrandIdIsNotNull() {
            addCriterion("t_Brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andTBrandIdEqualTo(String value) {
            addCriterion("t_Brand_id =", value, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdNotEqualTo(String value) {
            addCriterion("t_Brand_id <>", value, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdGreaterThan(String value) {
            addCriterion("t_Brand_id >", value, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_Brand_id >=", value, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdLessThan(String value) {
            addCriterion("t_Brand_id <", value, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdLessThanOrEqualTo(String value) {
            addCriterion("t_Brand_id <=", value, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdLike(String value) {
            addCriterion("t_Brand_id like", value, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdNotLike(String value) {
            addCriterion("t_Brand_id not like", value, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdIn(List<String> values) {
            addCriterion("t_Brand_id in", values, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdNotIn(List<String> values) {
            addCriterion("t_Brand_id not in", values, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdBetween(String value1, String value2) {
            addCriterion("t_Brand_id between", value1, value2, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTBrandIdNotBetween(String value1, String value2) {
            addCriterion("t_Brand_id not between", value1, value2, "tBrandId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdIsNull() {
            addCriterion("t_Cmd_Type_id is null");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdIsNotNull() {
            addCriterion("t_Cmd_Type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdEqualTo(String value) {
            addCriterion("t_Cmd_Type_id =", value, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdNotEqualTo(String value) {
            addCriterion("t_Cmd_Type_id <>", value, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdGreaterThan(String value) {
            addCriterion("t_Cmd_Type_id >", value, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_Cmd_Type_id >=", value, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdLessThan(String value) {
            addCriterion("t_Cmd_Type_id <", value, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdLessThanOrEqualTo(String value) {
            addCriterion("t_Cmd_Type_id <=", value, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdLike(String value) {
            addCriterion("t_Cmd_Type_id like", value, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdNotLike(String value) {
            addCriterion("t_Cmd_Type_id not like", value, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdIn(List<String> values) {
            addCriterion("t_Cmd_Type_id in", values, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdNotIn(List<String> values) {
            addCriterion("t_Cmd_Type_id not in", values, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdBetween(String value1, String value2) {
            addCriterion("t_Cmd_Type_id between", value1, value2, "tCmdTypeId");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeIdNotBetween(String value1, String value2) {
            addCriterion("t_Cmd_Type_id not between", value1, value2, "tCmdTypeId");
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