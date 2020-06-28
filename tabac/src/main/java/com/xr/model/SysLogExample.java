package com.xr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLogExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("Login_Id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("Login_Id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(Integer value) {
            addCriterion("Login_Id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(Integer value) {
            addCriterion("Login_Id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(Integer value) {
            addCriterion("Login_Id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Login_Id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(Integer value) {
            addCriterion("Login_Id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(Integer value) {
            addCriterion("Login_Id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<Integer> values) {
            addCriterion("Login_Id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<Integer> values) {
            addCriterion("Login_Id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(Integer value1, Integer value2) {
            addCriterion("Login_Id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Login_Id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameIsNull() {
            addCriterion("Login_userName is null");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameIsNotNull() {
            addCriterion("Login_userName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameEqualTo(String value) {
            addCriterion("Login_userName =", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameNotEqualTo(String value) {
            addCriterion("Login_userName <>", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameGreaterThan(String value) {
            addCriterion("Login_userName >", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Login_userName >=", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameLessThan(String value) {
            addCriterion("Login_userName <", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameLessThanOrEqualTo(String value) {
            addCriterion("Login_userName <=", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameLike(String value) {
            addCriterion("Login_userName like", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameNotLike(String value) {
            addCriterion("Login_userName not like", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameIn(List<String> values) {
            addCriterion("Login_userName in", values, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameNotIn(List<String> values) {
            addCriterion("Login_userName not in", values, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameBetween(String value1, String value2) {
            addCriterion("Login_userName between", value1, value2, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameNotBetween(String value1, String value2) {
            addCriterion("Login_userName not between", value1, value2, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andHttpMethodIsNull() {
            addCriterion("HTTP_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andHttpMethodIsNotNull() {
            addCriterion("HTTP_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andHttpMethodEqualTo(String value) {
            addCriterion("HTTP_METHOD =", value, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodNotEqualTo(String value) {
            addCriterion("HTTP_METHOD <>", value, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodGreaterThan(String value) {
            addCriterion("HTTP_METHOD >", value, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodGreaterThanOrEqualTo(String value) {
            addCriterion("HTTP_METHOD >=", value, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodLessThan(String value) {
            addCriterion("HTTP_METHOD <", value, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodLessThanOrEqualTo(String value) {
            addCriterion("HTTP_METHOD <=", value, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodLike(String value) {
            addCriterion("HTTP_METHOD like", value, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodNotLike(String value) {
            addCriterion("HTTP_METHOD not like", value, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodIn(List<String> values) {
            addCriterion("HTTP_METHOD in", values, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodNotIn(List<String> values) {
            addCriterion("HTTP_METHOD not in", values, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodBetween(String value1, String value2) {
            addCriterion("HTTP_METHOD between", value1, value2, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andHttpMethodNotBetween(String value1, String value2) {
            addCriterion("HTTP_METHOD not between", value1, value2, "httpMethod");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andClassMethodIsNull() {
            addCriterion("CLASS_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andClassMethodIsNotNull() {
            addCriterion("CLASS_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andClassMethodEqualTo(String value) {
            addCriterion("CLASS_METHOD =", value, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodNotEqualTo(String value) {
            addCriterion("CLASS_METHOD <>", value, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodGreaterThan(String value) {
            addCriterion("CLASS_METHOD >", value, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_METHOD >=", value, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodLessThan(String value) {
            addCriterion("CLASS_METHOD <", value, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodLessThanOrEqualTo(String value) {
            addCriterion("CLASS_METHOD <=", value, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodLike(String value) {
            addCriterion("CLASS_METHOD like", value, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodNotLike(String value) {
            addCriterion("CLASS_METHOD not like", value, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodIn(List<String> values) {
            addCriterion("CLASS_METHOD in", values, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodNotIn(List<String> values) {
            addCriterion("CLASS_METHOD not in", values, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodBetween(String value1, String value2) {
            addCriterion("CLASS_METHOD between", value1, value2, "classMethod");
            return (Criteria) this;
        }

        public Criteria andClassMethodNotBetween(String value1, String value2) {
            addCriterion("CLASS_METHOD not between", value1, value2, "classMethod");
            return (Criteria) this;
        }

        public Criteria andRequestArgsIsNull() {
            addCriterion("`REQUEST ARGS` is null");
            return (Criteria) this;
        }

        public Criteria andRequestArgsIsNotNull() {
            addCriterion("`REQUEST ARGS` is not null");
            return (Criteria) this;
        }

        public Criteria andRequestArgsEqualTo(String value) {
            addCriterion("`REQUEST ARGS` =", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsNotEqualTo(String value) {
            addCriterion("`REQUEST ARGS` <>", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsGreaterThan(String value) {
            addCriterion("`REQUEST ARGS` >", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsGreaterThanOrEqualTo(String value) {
            addCriterion("`REQUEST ARGS` >=", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsLessThan(String value) {
            addCriterion("`REQUEST ARGS` <", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsLessThanOrEqualTo(String value) {
            addCriterion("`REQUEST ARGS` <=", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsLike(String value) {
            addCriterion("`REQUEST ARGS` like", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsNotLike(String value) {
            addCriterion("`REQUEST ARGS` not like", value, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsIn(List<String> values) {
            addCriterion("`REQUEST ARGS` in", values, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsNotIn(List<String> values) {
            addCriterion("`REQUEST ARGS` not in", values, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsBetween(String value1, String value2) {
            addCriterion("`REQUEST ARGS` between", value1, value2, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andRequestArgsNotBetween(String value1, String value2) {
            addCriterion("`REQUEST ARGS` not between", value1, value2, "requestArgs");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("Create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("Create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("Create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("Create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("Create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("Create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("Create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("Create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("Create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("Create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("Create_date not between", value1, value2, "createDate");
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