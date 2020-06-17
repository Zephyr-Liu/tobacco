package com.xr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartyRiskAssessmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyRiskAssessmentExample() {
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

        public Criteria andDeptInfoIsNull() {
            addCriterion("dept_info is null");
            return (Criteria) this;
        }

        public Criteria andDeptInfoIsNotNull() {
            addCriterion("dept_info is not null");
            return (Criteria) this;
        }

        public Criteria andDeptInfoEqualTo(Integer value) {
            addCriterion("dept_info =", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoNotEqualTo(Integer value) {
            addCriterion("dept_info <>", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoGreaterThan(Integer value) {
            addCriterion("dept_info >", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_info >=", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoLessThan(Integer value) {
            addCriterion("dept_info <", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoLessThanOrEqualTo(Integer value) {
            addCriterion("dept_info <=", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoIn(List<Integer> values) {
            addCriterion("dept_info in", values, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoNotIn(List<Integer> values) {
            addCriterion("dept_info not in", values, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoBetween(Integer value1, Integer value2) {
            addCriterion("dept_info between", value1, value2, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_info not between", value1, value2, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountIsNull() {
            addCriterion("first_risk_count is null");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountIsNotNull() {
            addCriterion("first_risk_count is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountEqualTo(Integer value) {
            addCriterion("first_risk_count =", value, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountNotEqualTo(Integer value) {
            addCriterion("first_risk_count <>", value, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountGreaterThan(Integer value) {
            addCriterion("first_risk_count >", value, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_risk_count >=", value, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountLessThan(Integer value) {
            addCriterion("first_risk_count <", value, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountLessThanOrEqualTo(Integer value) {
            addCriterion("first_risk_count <=", value, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountIn(List<Integer> values) {
            addCriterion("first_risk_count in", values, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountNotIn(List<Integer> values) {
            addCriterion("first_risk_count not in", values, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountBetween(Integer value1, Integer value2) {
            addCriterion("first_risk_count between", value1, value2, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andFirstRiskCountNotBetween(Integer value1, Integer value2) {
            addCriterion("first_risk_count not between", value1, value2, "firstRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountIsNull() {
            addCriterion("minor_risk_count is null");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountIsNotNull() {
            addCriterion("minor_risk_count is not null");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountEqualTo(Integer value) {
            addCriterion("minor_risk_count =", value, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountNotEqualTo(Integer value) {
            addCriterion("minor_risk_count <>", value, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountGreaterThan(Integer value) {
            addCriterion("minor_risk_count >", value, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("minor_risk_count >=", value, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountLessThan(Integer value) {
            addCriterion("minor_risk_count <", value, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountLessThanOrEqualTo(Integer value) {
            addCriterion("minor_risk_count <=", value, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountIn(List<Integer> values) {
            addCriterion("minor_risk_count in", values, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountNotIn(List<Integer> values) {
            addCriterion("minor_risk_count not in", values, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountBetween(Integer value1, Integer value2) {
            addCriterion("minor_risk_count between", value1, value2, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andMinorRiskCountNotBetween(Integer value1, Integer value2) {
            addCriterion("minor_risk_count not between", value1, value2, "minorRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountIsNull() {
            addCriterion("tertiary_risk_count is null");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountIsNotNull() {
            addCriterion("tertiary_risk_count is not null");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountEqualTo(Integer value) {
            addCriterion("tertiary_risk_count =", value, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountNotEqualTo(Integer value) {
            addCriterion("tertiary_risk_count <>", value, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountGreaterThan(Integer value) {
            addCriterion("tertiary_risk_count >", value, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tertiary_risk_count >=", value, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountLessThan(Integer value) {
            addCriterion("tertiary_risk_count <", value, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountLessThanOrEqualTo(Integer value) {
            addCriterion("tertiary_risk_count <=", value, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountIn(List<Integer> values) {
            addCriterion("tertiary_risk_count in", values, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountNotIn(List<Integer> values) {
            addCriterion("tertiary_risk_count not in", values, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountBetween(Integer value1, Integer value2) {
            addCriterion("tertiary_risk_count between", value1, value2, "tertiaryRiskCount");
            return (Criteria) this;
        }

        public Criteria andTertiaryRiskCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tertiary_risk_count not between", value1, value2, "tertiaryRiskCount");
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