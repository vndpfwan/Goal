package com.goal.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCmdNameIsNull() {
            addCriterion("cmd_name is null");
            return (Criteria) this;
        }

        public Criteria andCmdNameIsNotNull() {
            addCriterion("cmd_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmdNameEqualTo(String value) {
            addCriterion("cmd_name =", value, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameNotEqualTo(String value) {
            addCriterion("cmd_name <>", value, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameGreaterThan(String value) {
            addCriterion("cmd_name >", value, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameGreaterThanOrEqualTo(String value) {
            addCriterion("cmd_name >=", value, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameLessThan(String value) {
            addCriterion("cmd_name <", value, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameLessThanOrEqualTo(String value) {
            addCriterion("cmd_name <=", value, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameLike(String value) {
            addCriterion("cmd_name like", value, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameNotLike(String value) {
            addCriterion("cmd_name not like", value, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameIn(List<String> values) {
            addCriterion("cmd_name in", values, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameNotIn(List<String> values) {
            addCriterion("cmd_name not in", values, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameBetween(String value1, String value2) {
            addCriterion("cmd_name between", value1, value2, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdNameNotBetween(String value1, String value2) {
            addCriterion("cmd_name not between", value1, value2, "cmdName");
            return (Criteria) this;
        }

        public Criteria andCmdDescIsNull() {
            addCriterion("cmd_desc is null");
            return (Criteria) this;
        }

        public Criteria andCmdDescIsNotNull() {
            addCriterion("cmd_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCmdDescEqualTo(String value) {
            addCriterion("cmd_desc =", value, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescNotEqualTo(String value) {
            addCriterion("cmd_desc <>", value, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescGreaterThan(String value) {
            addCriterion("cmd_desc >", value, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescGreaterThanOrEqualTo(String value) {
            addCriterion("cmd_desc >=", value, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescLessThan(String value) {
            addCriterion("cmd_desc <", value, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescLessThanOrEqualTo(String value) {
            addCriterion("cmd_desc <=", value, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescLike(String value) {
            addCriterion("cmd_desc like", value, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescNotLike(String value) {
            addCriterion("cmd_desc not like", value, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescIn(List<String> values) {
            addCriterion("cmd_desc in", values, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescNotIn(List<String> values) {
            addCriterion("cmd_desc not in", values, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescBetween(String value1, String value2) {
            addCriterion("cmd_desc between", value1, value2, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdDescNotBetween(String value1, String value2) {
            addCriterion("cmd_desc not between", value1, value2, "cmdDesc");
            return (Criteria) this;
        }

        public Criteria andCmdPriceIsNull() {
            addCriterion("cmd_price is null");
            return (Criteria) this;
        }

        public Criteria andCmdPriceIsNotNull() {
            addCriterion("cmd_price is not null");
            return (Criteria) this;
        }

        public Criteria andCmdPriceEqualTo(String value) {
            addCriterion("cmd_price =", value, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceNotEqualTo(String value) {
            addCriterion("cmd_price <>", value, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceGreaterThan(String value) {
            addCriterion("cmd_price >", value, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceGreaterThanOrEqualTo(String value) {
            addCriterion("cmd_price >=", value, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceLessThan(String value) {
            addCriterion("cmd_price <", value, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceLessThanOrEqualTo(String value) {
            addCriterion("cmd_price <=", value, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceLike(String value) {
            addCriterion("cmd_price like", value, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceNotLike(String value) {
            addCriterion("cmd_price not like", value, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceIn(List<String> values) {
            addCriterion("cmd_price in", values, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceNotIn(List<String> values) {
            addCriterion("cmd_price not in", values, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceBetween(String value1, String value2) {
            addCriterion("cmd_price between", value1, value2, "cmdPrice");
            return (Criteria) this;
        }

        public Criteria andCmdPriceNotBetween(String value1, String value2) {
            addCriterion("cmd_price not between", value1, value2, "cmdPrice");
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

        public Criteria andTCmdTypeId1IsNull() {
            addCriterion("t_Cmd_Type_id1 is null");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1IsNotNull() {
            addCriterion("t_Cmd_Type_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1EqualTo(String value) {
            addCriterion("t_Cmd_Type_id1 =", value, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1NotEqualTo(String value) {
            addCriterion("t_Cmd_Type_id1 <>", value, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1GreaterThan(String value) {
            addCriterion("t_Cmd_Type_id1 >", value, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1GreaterThanOrEqualTo(String value) {
            addCriterion("t_Cmd_Type_id1 >=", value, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1LessThan(String value) {
            addCriterion("t_Cmd_Type_id1 <", value, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1LessThanOrEqualTo(String value) {
            addCriterion("t_Cmd_Type_id1 <=", value, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1Like(String value) {
            addCriterion("t_Cmd_Type_id1 like", value, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1NotLike(String value) {
            addCriterion("t_Cmd_Type_id1 not like", value, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1In(List<String> values) {
            addCriterion("t_Cmd_Type_id1 in", values, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1NotIn(List<String> values) {
            addCriterion("t_Cmd_Type_id1 not in", values, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1Between(String value1, String value2) {
            addCriterion("t_Cmd_Type_id1 between", value1, value2, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTCmdTypeId1NotBetween(String value1, String value2) {
            addCriterion("t_Cmd_Type_id1 not between", value1, value2, "tCmdTypeId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1IsNull() {
            addCriterion("t_Brand_id1 is null");
            return (Criteria) this;
        }

        public Criteria andTBrandId1IsNotNull() {
            addCriterion("t_Brand_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andTBrandId1EqualTo(String value) {
            addCriterion("t_Brand_id1 =", value, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1NotEqualTo(String value) {
            addCriterion("t_Brand_id1 <>", value, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1GreaterThan(String value) {
            addCriterion("t_Brand_id1 >", value, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1GreaterThanOrEqualTo(String value) {
            addCriterion("t_Brand_id1 >=", value, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1LessThan(String value) {
            addCriterion("t_Brand_id1 <", value, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1LessThanOrEqualTo(String value) {
            addCriterion("t_Brand_id1 <=", value, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1Like(String value) {
            addCriterion("t_Brand_id1 like", value, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1NotLike(String value) {
            addCriterion("t_Brand_id1 not like", value, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1In(List<String> values) {
            addCriterion("t_Brand_id1 in", values, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1NotIn(List<String> values) {
            addCriterion("t_Brand_id1 not in", values, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1Between(String value1, String value2) {
            addCriterion("t_Brand_id1 between", value1, value2, "tBrandId1");
            return (Criteria) this;
        }

        public Criteria andTBrandId1NotBetween(String value1, String value2) {
            addCriterion("t_Brand_id1 not between", value1, value2, "tBrandId1");
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