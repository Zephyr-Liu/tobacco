package com.xr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartyPositionRiskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyPositionRiskExample() {
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

        public Criteria andRiskIdEqualTo(Integer value) {
            addCriterion("risk_id =", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdNotEqualTo(Integer value) {
            addCriterion("risk_id <>", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdGreaterThan(Integer value) {
            addCriterion("risk_id >", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_id >=", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdLessThan(Integer value) {
            addCriterion("risk_id <", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdLessThanOrEqualTo(Integer value) {
            addCriterion("risk_id <=", value, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdIn(List<Integer> values) {
            addCriterion("risk_id in", values, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdNotIn(List<Integer> values) {
            addCriterion("risk_id not in", values, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdBetween(Integer value1, Integer value2) {
            addCriterion("risk_id between", value1, value2, "riskId");
            return (Criteria) this;
        }

        public Criteria andRiskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_id not between", value1, value2, "riskId");
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andRiskProjectIsNull() {
            addCriterion("risk_project is null");
            return (Criteria) this;
        }

        public Criteria andRiskProjectIsNotNull() {
            addCriterion("risk_project is not null");
            return (Criteria) this;
        }

        public Criteria andRiskProjectEqualTo(String value) {
            addCriterion("risk_project =", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectNotEqualTo(String value) {
            addCriterion("risk_project <>", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectGreaterThan(String value) {
            addCriterion("risk_project >", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectGreaterThanOrEqualTo(String value) {
            addCriterion("risk_project >=", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectLessThan(String value) {
            addCriterion("risk_project <", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectLessThanOrEqualTo(String value) {
            addCriterion("risk_project <=", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectLike(String value) {
            addCriterion("risk_project like", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectNotLike(String value) {
            addCriterion("risk_project not like", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectIn(List<String> values) {
            addCriterion("risk_project in", values, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectNotIn(List<String> values) {
            addCriterion("risk_project not in", values, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectBetween(String value1, String value2) {
            addCriterion("risk_project between", value1, value2, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectNotBetween(String value1, String value2) {
            addCriterion("risk_project not between", value1, value2, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeIsNull() {
            addCriterion("risk_describe is null");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeIsNotNull() {
            addCriterion("risk_describe is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeEqualTo(String value) {
            addCriterion("risk_describe =", value, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeNotEqualTo(String value) {
            addCriterion("risk_describe <>", value, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeGreaterThan(String value) {
            addCriterion("risk_describe >", value, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("risk_describe >=", value, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeLessThan(String value) {
            addCriterion("risk_describe <", value, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeLessThanOrEqualTo(String value) {
            addCriterion("risk_describe <=", value, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeLike(String value) {
            addCriterion("risk_describe like", value, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeNotLike(String value) {
            addCriterion("risk_describe not like", value, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeIn(List<String> values) {
            addCriterion("risk_describe in", values, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeNotIn(List<String> values) {
            addCriterion("risk_describe not in", values, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeBetween(String value1, String value2) {
            addCriterion("risk_describe between", value1, value2, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskDescribeNotBetween(String value1, String value2) {
            addCriterion("risk_describe not between", value1, value2, "riskDescribe");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueIsNull() {
            addCriterion("risk_may_value is null");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueIsNotNull() {
            addCriterion("risk_may_value is not null");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueEqualTo(String value) {
            addCriterion("risk_may_value =", value, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueNotEqualTo(String value) {
            addCriterion("risk_may_value <>", value, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueGreaterThan(String value) {
            addCriterion("risk_may_value >", value, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueGreaterThanOrEqualTo(String value) {
            addCriterion("risk_may_value >=", value, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueLessThan(String value) {
            addCriterion("risk_may_value <", value, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueLessThanOrEqualTo(String value) {
            addCriterion("risk_may_value <=", value, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueLike(String value) {
            addCriterion("risk_may_value like", value, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueNotLike(String value) {
            addCriterion("risk_may_value not like", value, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueIn(List<String> values) {
            addCriterion("risk_may_value in", values, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueNotIn(List<String> values) {
            addCriterion("risk_may_value not in", values, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueBetween(String value1, String value2) {
            addCriterion("risk_may_value between", value1, value2, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskMayValueNotBetween(String value1, String value2) {
            addCriterion("risk_may_value not between", value1, value2, "riskMayValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueIsNull() {
            addCriterion("risk_result_value is null");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueIsNotNull() {
            addCriterion("risk_result_value is not null");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueEqualTo(Integer value) {
            addCriterion("risk_result_value =", value, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueNotEqualTo(Integer value) {
            addCriterion("risk_result_value <>", value, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueGreaterThan(Integer value) {
            addCriterion("risk_result_value >", value, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_result_value >=", value, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueLessThan(Integer value) {
            addCriterion("risk_result_value <", value, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueLessThanOrEqualTo(Integer value) {
            addCriterion("risk_result_value <=", value, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueIn(List<Integer> values) {
            addCriterion("risk_result_value in", values, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueNotIn(List<Integer> values) {
            addCriterion("risk_result_value not in", values, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueBetween(Integer value1, Integer value2) {
            addCriterion("risk_result_value between", value1, value2, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskResultValueNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_result_value not between", value1, value2, "riskResultValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueIsNull() {
            addCriterion("risk_integrity_value is null");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueIsNotNull() {
            addCriterion("risk_integrity_value is not null");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueEqualTo(Integer value) {
            addCriterion("risk_integrity_value =", value, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueNotEqualTo(Integer value) {
            addCriterion("risk_integrity_value <>", value, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueGreaterThan(Integer value) {
            addCriterion("risk_integrity_value >", value, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_integrity_value >=", value, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueLessThan(Integer value) {
            addCriterion("risk_integrity_value <", value, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueLessThanOrEqualTo(Integer value) {
            addCriterion("risk_integrity_value <=", value, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueIn(List<Integer> values) {
            addCriterion("risk_integrity_value in", values, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueNotIn(List<Integer> values) {
            addCriterion("risk_integrity_value not in", values, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueBetween(Integer value1, Integer value2) {
            addCriterion("risk_integrity_value between", value1, value2, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskIntegrityValueNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_integrity_value not between", value1, value2, "riskIntegrityValue");
            return (Criteria) this;
        }

        public Criteria andRiskGradeIsNull() {
            addCriterion("risk_grade is null");
            return (Criteria) this;
        }

        public Criteria andRiskGradeIsNotNull() {
            addCriterion("risk_grade is not null");
            return (Criteria) this;
        }

        public Criteria andRiskGradeEqualTo(Integer value) {
            addCriterion("risk_grade =", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeNotEqualTo(Integer value) {
            addCriterion("risk_grade <>", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeGreaterThan(Integer value) {
            addCriterion("risk_grade >", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_grade >=", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeLessThan(Integer value) {
            addCriterion("risk_grade <", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeLessThanOrEqualTo(Integer value) {
            addCriterion("risk_grade <=", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeIn(List<Integer> values) {
            addCriterion("risk_grade in", values, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeNotIn(List<Integer> values) {
            addCriterion("risk_grade not in", values, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeBetween(Integer value1, Integer value2) {
            addCriterion("risk_grade between", value1, value2, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_grade not between", value1, value2, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andPreventionIsNull() {
            addCriterion("prevention is null");
            return (Criteria) this;
        }

        public Criteria andPreventionIsNotNull() {
            addCriterion("prevention is not null");
            return (Criteria) this;
        }

        public Criteria andPreventionEqualTo(Byte value) {
            addCriterion("prevention =", value, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionNotEqualTo(Byte value) {
            addCriterion("prevention <>", value, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionGreaterThan(Byte value) {
            addCriterion("prevention >", value, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionGreaterThanOrEqualTo(Byte value) {
            addCriterion("prevention >=", value, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionLessThan(Byte value) {
            addCriterion("prevention <", value, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionLessThanOrEqualTo(Byte value) {
            addCriterion("prevention <=", value, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionIn(List<Byte> values) {
            addCriterion("prevention in", values, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionNotIn(List<Byte> values) {
            addCriterion("prevention not in", values, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionBetween(Byte value1, Byte value2) {
            addCriterion("prevention between", value1, value2, "prevention");
            return (Criteria) this;
        }

        public Criteria andPreventionNotBetween(Byte value1, Byte value2) {
            addCriterion("prevention not between", value1, value2, "prevention");
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