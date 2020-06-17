package com.xr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartyProcessRiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyProcessRiskExample() {
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

        public Criteria andRiskIdIsNull() {
            addCriterion("risk_id is null");
            return (Criteria) this;
        }

        public Criteria andRiskIdIsNotNull() {
            addCriterion("risk_id is not null");
            return (Criteria) this;
        }

        public Criteria andRiskIdEqualTo(String value) {
            addCriterion("risk_id =", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdNotEqualTo(String value) {
            addCriterion("risk_id <>", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdGreaterThan(String value) {
            addCriterion("risk_id >", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdGreaterThanOrEqualTo(String value) {
            addCriterion("risk_id >=", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdLessThan(String value) {
            addCriterion("risk_id <", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdLessThanOrEqualTo(String value) {
            addCriterion("risk_id <=", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdLike(String value) {
            addCriterion("risk_id like", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdNotLike(String value) {
            addCriterion("risk_id not like", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdIn(List<String> values) {
            addCriterion("risk_id in", values, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdNotIn(List<String> values) {
            addCriterion("risk_id not in", values, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdBetween(String value1, String value2) {
            addCriterion("risk_id between", value1, value2, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdNotBetween(String value1, String value2) {
            addCriterion("risk_id not between", value1, value2, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskNameIsNull() {
            addCriterion("risk_name is null");
            return (Criteria) this;
        }

        public Criteria andRiskNameIsNotNull() {
            addCriterion("risk_name is not null");
            return (Criteria) this;
        }

        public Criteria andRiskNameEqualTo(String value) {
            addCriterion("risk_name =", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotEqualTo(String value) {
            addCriterion("risk_name <>", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameGreaterThan(String value) {
            addCriterion("risk_name >", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameGreaterThanOrEqualTo(String value) {
            addCriterion("risk_name >=", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLessThan(String value) {
            addCriterion("risk_name <", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLessThanOrEqualTo(String value) {
            addCriterion("risk_name <=", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameLike(String value) {
            addCriterion("risk_name like", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotLike(String value) {
            addCriterion("risk_name not like", value, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameIn(List<String> values) {
            addCriterion("risk_name in", values, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotIn(List<String> values) {
            addCriterion("risk_name not in", values, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameBetween(String value1, String value2) {
            addCriterion("risk_name between", value1, value2, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskNameNotBetween(String value1, String value2) {
            addCriterion("risk_name not between", value1, value2, "riskName");
            return (Criteria) this;
        }

        public Criteria andRiskYearsIsNull() {
            addCriterion("risk_years is null");
            return (Criteria) this;
        }

        public Criteria andRiskYearsIsNotNull() {
            addCriterion("risk_years is not null");
            return (Criteria) this;
        }

        public Criteria andRiskYearsEqualTo(Date value) {
            addCriterion("risk_years =", value, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsNotEqualTo(Date value) {
            addCriterion("risk_years <>", value, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsGreaterThan(Date value) {
            addCriterion("risk_years >", value, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsGreaterThanOrEqualTo(Date value) {
            addCriterion("risk_years >=", value, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsLessThan(Date value) {
            addCriterion("risk_years <", value, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsLessThanOrEqualTo(Date value) {
            addCriterion("risk_years <=", value, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsIn(List<Date> values) {
            addCriterion("risk_years in", values, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsNotIn(List<Date> values) {
            addCriterion("risk_years not in", values, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsBetween(Date value1, Date value2) {
            addCriterion("risk_years between", value1, value2, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskYearsNotBetween(Date value1, Date value2) {
            addCriterion("risk_years not between", value1, value2, "riskYears");
            return (Criteria) this;
        }

        public Criteria andRiskInfoIsNull() {
            addCriterion("risk_info is null");
            return (Criteria) this;
        }

        public Criteria andRiskInfoIsNotNull() {
            addCriterion("risk_info is not null");
            return (Criteria) this;
        }

        public Criteria andRiskInfoEqualTo(String value) {
            addCriterion("risk_info =", value, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoNotEqualTo(String value) {
            addCriterion("risk_info <>", value, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoGreaterThan(String value) {
            addCriterion("risk_info >", value, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoGreaterThanOrEqualTo(String value) {
            addCriterion("risk_info >=", value, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoLessThan(String value) {
            addCriterion("risk_info <", value, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoLessThanOrEqualTo(String value) {
            addCriterion("risk_info <=", value, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoLike(String value) {
            addCriterion("risk_info like", value, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoNotLike(String value) {
            addCriterion("risk_info not like", value, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoIn(List<String> values) {
            addCriterion("risk_info in", values, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoNotIn(List<String> values) {
            addCriterion("risk_info not in", values, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoBetween(String value1, String value2) {
            addCriterion("risk_info between", value1, value2, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andRiskInfoNotBetween(String value1, String value2) {
            addCriterion("risk_info not between", value1, value2, "riskInfo");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
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