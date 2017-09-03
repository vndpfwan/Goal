package com.goal.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CmdParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmdParamExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCmdKeyIsNull() {
            addCriterion("cmd_key is null");
            return (Criteria) this;
        }

        public Criteria andCmdKeyIsNotNull() {
            addCriterion("cmd_key is not null");
            return (Criteria) this;
        }

        public Criteria andCmdKeyEqualTo(String value) {
            addCriterion("cmd_key =", value, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyNotEqualTo(String value) {
            addCriterion("cmd_key <>", value, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyGreaterThan(String value) {
            addCriterion("cmd_key >", value, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyGreaterThanOrEqualTo(String value) {
            addCriterion("cmd_key >=", value, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyLessThan(String value) {
            addCriterion("cmd_key <", value, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyLessThanOrEqualTo(String value) {
            addCriterion("cmd_key <=", value, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyLike(String value) {
            addCriterion("cmd_key like", value, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyNotLike(String value) {
            addCriterion("cmd_key not like", value, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyIn(List<String> values) {
            addCriterion("cmd_key in", values, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyNotIn(List<String> values) {
            addCriterion("cmd_key not in", values, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyBetween(String value1, String value2) {
            addCriterion("cmd_key between", value1, value2, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdKeyNotBetween(String value1, String value2) {
            addCriterion("cmd_key not between", value1, value2, "cmdKey");
            return (Criteria) this;
        }

        public Criteria andCmdValueIsNull() {
            addCriterion("cmd_value is null");
            return (Criteria) this;
        }

        public Criteria andCmdValueIsNotNull() {
            addCriterion("cmd_value is not null");
            return (Criteria) this;
        }

        public Criteria andCmdValueEqualTo(String value) {
            addCriterion("cmd_value =", value, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueNotEqualTo(String value) {
            addCriterion("cmd_value <>", value, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueGreaterThan(String value) {
            addCriterion("cmd_value >", value, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueGreaterThanOrEqualTo(String value) {
            addCriterion("cmd_value >=", value, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueLessThan(String value) {
            addCriterion("cmd_value <", value, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueLessThanOrEqualTo(String value) {
            addCriterion("cmd_value <=", value, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueLike(String value) {
            addCriterion("cmd_value like", value, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueNotLike(String value) {
            addCriterion("cmd_value not like", value, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueIn(List<String> values) {
            addCriterion("cmd_value in", values, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueNotIn(List<String> values) {
            addCriterion("cmd_value not in", values, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueBetween(String value1, String value2) {
            addCriterion("cmd_value between", value1, value2, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCmdValueNotBetween(String value1, String value2) {
            addCriterion("cmd_value not between", value1, value2, "cmdValue");
            return (Criteria) this;
        }

        public Criteria andCreateTspIsNull() {
            addCriterion("create_tsp is null");
            return (Criteria) this;
        }

        public Criteria andCreateTspIsNotNull() {
            addCriterion("create_tsp is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTspEqualTo(Timestamp value) {
            addCriterion("create_tsp =", value, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspNotEqualTo(Timestamp value) {
            addCriterion("create_tsp <>", value, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspGreaterThan(Timestamp value) {
            addCriterion("create_tsp >", value, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_tsp >=", value, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspLessThan(Timestamp value) {
            addCriterion("create_tsp <", value, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_tsp <=", value, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspIn(List<Timestamp> values) {
            addCriterion("create_tsp in", values, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspNotIn(List<Timestamp> values) {
            addCriterion("create_tsp not in", values, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_tsp between", value1, value2, "createTsp");
            return (Criteria) this;
        }

        public Criteria andCreateTspNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_tsp not between", value1, value2, "createTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspIsNull() {
            addCriterion("change_tsp is null");
            return (Criteria) this;
        }

        public Criteria andChangeTspIsNotNull() {
            addCriterion("change_tsp is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTspEqualTo(Timestamp value) {
            addCriterion("change_tsp =", value, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspNotEqualTo(Timestamp value) {
            addCriterion("change_tsp <>", value, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspGreaterThan(Timestamp value) {
            addCriterion("change_tsp >", value, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("change_tsp >=", value, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspLessThan(Timestamp value) {
            addCriterion("change_tsp <", value, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspLessThanOrEqualTo(Timestamp value) {
            addCriterion("change_tsp <=", value, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspIn(List<Timestamp> values) {
            addCriterion("change_tsp in", values, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspNotIn(List<Timestamp> values) {
            addCriterion("change_tsp not in", values, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspBetween(Timestamp value1, Timestamp value2) {
            addCriterion("change_tsp between", value1, value2, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andChangeTspNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("change_tsp not between", value1, value2, "changeTsp");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdIsNull() {
            addCriterion("t_Commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdIsNotNull() {
            addCriterion("t_Commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdEqualTo(String value) {
            addCriterion("t_Commodity_id =", value, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdNotEqualTo(String value) {
            addCriterion("t_Commodity_id <>", value, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdGreaterThan(String value) {
            addCriterion("t_Commodity_id >", value, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_Commodity_id >=", value, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdLessThan(String value) {
            addCriterion("t_Commodity_id <", value, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("t_Commodity_id <=", value, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdLike(String value) {
            addCriterion("t_Commodity_id like", value, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdNotLike(String value) {
            addCriterion("t_Commodity_id not like", value, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdIn(List<String> values) {
            addCriterion("t_Commodity_id in", values, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdNotIn(List<String> values) {
            addCriterion("t_Commodity_id not in", values, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdBetween(String value1, String value2) {
            addCriterion("t_Commodity_id between", value1, value2, "tCommodityId");
            return (Criteria) this;
        }

        public Criteria andTCommodityIdNotBetween(String value1, String value2) {
            addCriterion("t_Commodity_id not between", value1, value2, "tCommodityId");
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