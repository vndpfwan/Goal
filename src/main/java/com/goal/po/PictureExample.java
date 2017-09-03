package com.goal.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andPicTypeIsNull() {
            addCriterion("pic_type is null");
            return (Criteria) this;
        }

        public Criteria andPicTypeIsNotNull() {
            addCriterion("pic_type is not null");
            return (Criteria) this;
        }

        public Criteria andPicTypeEqualTo(String value) {
            addCriterion("pic_type =", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotEqualTo(String value) {
            addCriterion("pic_type <>", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeGreaterThan(String value) {
            addCriterion("pic_type >", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pic_type >=", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLessThan(String value) {
            addCriterion("pic_type <", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLessThanOrEqualTo(String value) {
            addCriterion("pic_type <=", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeLike(String value) {
            addCriterion("pic_type like", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotLike(String value) {
            addCriterion("pic_type not like", value, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeIn(List<String> values) {
            addCriterion("pic_type in", values, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotIn(List<String> values) {
            addCriterion("pic_type not in", values, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeBetween(String value1, String value2) {
            addCriterion("pic_type between", value1, value2, "picType");
            return (Criteria) this;
        }

        public Criteria andPicTypeNotBetween(String value1, String value2) {
            addCriterion("pic_type not between", value1, value2, "picType");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andShowAsIsNull() {
            addCriterion("show_as is null");
            return (Criteria) this;
        }

        public Criteria andShowAsIsNotNull() {
            addCriterion("show_as is not null");
            return (Criteria) this;
        }

        public Criteria andShowAsEqualTo(String value) {
            addCriterion("show_as =", value, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsNotEqualTo(String value) {
            addCriterion("show_as <>", value, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsGreaterThan(String value) {
            addCriterion("show_as >", value, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsGreaterThanOrEqualTo(String value) {
            addCriterion("show_as >=", value, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsLessThan(String value) {
            addCriterion("show_as <", value, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsLessThanOrEqualTo(String value) {
            addCriterion("show_as <=", value, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsLike(String value) {
            addCriterion("show_as like", value, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsNotLike(String value) {
            addCriterion("show_as not like", value, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsIn(List<String> values) {
            addCriterion("show_as in", values, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsNotIn(List<String> values) {
            addCriterion("show_as not in", values, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsBetween(String value1, String value2) {
            addCriterion("show_as between", value1, value2, "showAs");
            return (Criteria) this;
        }

        public Criteria andShowAsNotBetween(String value1, String value2) {
            addCriterion("show_as not between", value1, value2, "showAs");
            return (Criteria) this;
        }

        public Criteria andPicIndexIsNull() {
            addCriterion("pic_index is null");
            return (Criteria) this;
        }

        public Criteria andPicIndexIsNotNull() {
            addCriterion("pic_index is not null");
            return (Criteria) this;
        }

        public Criteria andPicIndexEqualTo(String value) {
            addCriterion("pic_index =", value, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexNotEqualTo(String value) {
            addCriterion("pic_index <>", value, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexGreaterThan(String value) {
            addCriterion("pic_index >", value, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexGreaterThanOrEqualTo(String value) {
            addCriterion("pic_index >=", value, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexLessThan(String value) {
            addCriterion("pic_index <", value, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexLessThanOrEqualTo(String value) {
            addCriterion("pic_index <=", value, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexLike(String value) {
            addCriterion("pic_index like", value, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexNotLike(String value) {
            addCriterion("pic_index not like", value, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexIn(List<String> values) {
            addCriterion("pic_index in", values, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexNotIn(List<String> values) {
            addCriterion("pic_index not in", values, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexBetween(String value1, String value2) {
            addCriterion("pic_index between", value1, value2, "picIndex");
            return (Criteria) this;
        }

        public Criteria andPicIndexNotBetween(String value1, String value2) {
            addCriterion("pic_index not between", value1, value2, "picIndex");
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