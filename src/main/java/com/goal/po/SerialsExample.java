package com.goal.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SerialsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SerialsExample() {
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

        public Criteria andSerialTypeIsNull() {
            addCriterion("serial_type is null");
            return (Criteria) this;
        }

        public Criteria andSerialTypeIsNotNull() {
            addCriterion("serial_type is not null");
            return (Criteria) this;
        }

        public Criteria andSerialTypeEqualTo(String value) {
            addCriterion("serial_type =", value, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeNotEqualTo(String value) {
            addCriterion("serial_type <>", value, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeGreaterThan(String value) {
            addCriterion("serial_type >", value, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("serial_type >=", value, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeLessThan(String value) {
            addCriterion("serial_type <", value, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeLessThanOrEqualTo(String value) {
            addCriterion("serial_type <=", value, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeLike(String value) {
            addCriterion("serial_type like", value, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeNotLike(String value) {
            addCriterion("serial_type not like", value, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeIn(List<String> values) {
            addCriterion("serial_type in", values, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeNotIn(List<String> values) {
            addCriterion("serial_type not in", values, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeBetween(String value1, String value2) {
            addCriterion("serial_type between", value1, value2, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialTypeNotBetween(String value1, String value2) {
            addCriterion("serial_type not between", value1, value2, "serialType");
            return (Criteria) this;
        }

        public Criteria andSerialNameIsNull() {
            addCriterion("serial_name is null");
            return (Criteria) this;
        }

        public Criteria andSerialNameIsNotNull() {
            addCriterion("serial_name is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNameEqualTo(String value) {
            addCriterion("serial_name =", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameNotEqualTo(String value) {
            addCriterion("serial_name <>", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameGreaterThan(String value) {
            addCriterion("serial_name >", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameGreaterThanOrEqualTo(String value) {
            addCriterion("serial_name >=", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameLessThan(String value) {
            addCriterion("serial_name <", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameLessThanOrEqualTo(String value) {
            addCriterion("serial_name <=", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameLike(String value) {
            addCriterion("serial_name like", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameNotLike(String value) {
            addCriterion("serial_name not like", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameIn(List<String> values) {
            addCriterion("serial_name in", values, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameNotIn(List<String> values) {
            addCriterion("serial_name not in", values, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameBetween(String value1, String value2) {
            addCriterion("serial_name between", value1, value2, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameNotBetween(String value1, String value2) {
            addCriterion("serial_name not between", value1, value2, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialUrlIsNull() {
            addCriterion("serial_url is null");
            return (Criteria) this;
        }

        public Criteria andSerialUrlIsNotNull() {
            addCriterion("serial_url is not null");
            return (Criteria) this;
        }

        public Criteria andSerialUrlEqualTo(String value) {
            addCriterion("serial_url =", value, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlNotEqualTo(String value) {
            addCriterion("serial_url <>", value, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlGreaterThan(String value) {
            addCriterion("serial_url >", value, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlGreaterThanOrEqualTo(String value) {
            addCriterion("serial_url >=", value, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlLessThan(String value) {
            addCriterion("serial_url <", value, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlLessThanOrEqualTo(String value) {
            addCriterion("serial_url <=", value, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlLike(String value) {
            addCriterion("serial_url like", value, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlNotLike(String value) {
            addCriterion("serial_url not like", value, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlIn(List<String> values) {
            addCriterion("serial_url in", values, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlNotIn(List<String> values) {
            addCriterion("serial_url not in", values, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlBetween(String value1, String value2) {
            addCriterion("serial_url between", value1, value2, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialUrlNotBetween(String value1, String value2) {
            addCriterion("serial_url not between", value1, value2, "serialUrl");
            return (Criteria) this;
        }

        public Criteria andSerialLevelIsNull() {
            addCriterion("serial_level is null");
            return (Criteria) this;
        }

        public Criteria andSerialLevelIsNotNull() {
            addCriterion("serial_level is not null");
            return (Criteria) this;
        }

        public Criteria andSerialLevelEqualTo(String value) {
            addCriterion("serial_level =", value, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelNotEqualTo(String value) {
            addCriterion("serial_level <>", value, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelGreaterThan(String value) {
            addCriterion("serial_level >", value, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelGreaterThanOrEqualTo(String value) {
            addCriterion("serial_level >=", value, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelLessThan(String value) {
            addCriterion("serial_level <", value, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelLessThanOrEqualTo(String value) {
            addCriterion("serial_level <=", value, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelLike(String value) {
            addCriterion("serial_level like", value, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelNotLike(String value) {
            addCriterion("serial_level not like", value, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelIn(List<String> values) {
            addCriterion("serial_level in", values, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelNotIn(List<String> values) {
            addCriterion("serial_level not in", values, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelBetween(String value1, String value2) {
            addCriterion("serial_level between", value1, value2, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andSerialLevelNotBetween(String value1, String value2) {
            addCriterion("serial_level not between", value1, value2, "serialLevel");
            return (Criteria) this;
        }

        public Criteria andPSerialIdIsNull() {
            addCriterion("p_serial_id is null");
            return (Criteria) this;
        }

        public Criteria andPSerialIdIsNotNull() {
            addCriterion("p_serial_id is not null");
            return (Criteria) this;
        }

        public Criteria andPSerialIdEqualTo(String value) {
            addCriterion("p_serial_id =", value, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdNotEqualTo(String value) {
            addCriterion("p_serial_id <>", value, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdGreaterThan(String value) {
            addCriterion("p_serial_id >", value, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_serial_id >=", value, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdLessThan(String value) {
            addCriterion("p_serial_id <", value, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdLessThanOrEqualTo(String value) {
            addCriterion("p_serial_id <=", value, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdLike(String value) {
            addCriterion("p_serial_id like", value, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdNotLike(String value) {
            addCriterion("p_serial_id not like", value, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdIn(List<String> values) {
            addCriterion("p_serial_id in", values, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdNotIn(List<String> values) {
            addCriterion("p_serial_id not in", values, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdBetween(String value1, String value2) {
            addCriterion("p_serial_id between", value1, value2, "pSerialId");
            return (Criteria) this;
        }

        public Criteria andPSerialIdNotBetween(String value1, String value2) {
            addCriterion("p_serial_id not between", value1, value2, "pSerialId");
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