package com.xr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartyReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyReportExample() {
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

        public Criteria andPetitionIdIsNull() {
            addCriterion("petition_id is null");
            return (Criteria) this;
        }

        public Criteria andPetitionIdIsNotNull() {
            addCriterion("petition_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetitionIdEqualTo(String value) {
            addCriterion("petition_id =", value, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdNotEqualTo(String value) {
            addCriterion("petition_id <>", value, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdGreaterThan(String value) {
            addCriterion("petition_id >", value, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdGreaterThanOrEqualTo(String value) {
            addCriterion("petition_id >=", value, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdLessThan(String value) {
            addCriterion("petition_id <", value, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdLessThanOrEqualTo(String value) {
            addCriterion("petition_id <=", value, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdLike(String value) {
            addCriterion("petition_id like", value, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdNotLike(String value) {
            addCriterion("petition_id not like", value, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdIn(List<String> values) {
            addCriterion("petition_id in", values, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdNotIn(List<String> values) {
            addCriterion("petition_id not in", values, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdBetween(String value1, String value2) {
            addCriterion("petition_id between", value1, value2, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionIdNotBetween(String value1, String value2) {
            addCriterion("petition_id not between", value1, value2, "petitionId");
            return (Criteria) this;
        }

        public Criteria andPetitionDateIsNull() {
            addCriterion("petition_date is null");
            return (Criteria) this;
        }

        public Criteria andPetitionDateIsNotNull() {
            addCriterion("petition_date is not null");
            return (Criteria) this;
        }

        public Criteria andPetitionDateEqualTo(Date value) {
            addCriterion("petition_date =", value, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateNotEqualTo(Date value) {
            addCriterion("petition_date <>", value, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateGreaterThan(Date value) {
            addCriterion("petition_date >", value, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("petition_date >=", value, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateLessThan(Date value) {
            addCriterion("petition_date <", value, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateLessThanOrEqualTo(Date value) {
            addCriterion("petition_date <=", value, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateIn(List<Date> values) {
            addCriterion("petition_date in", values, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateNotIn(List<Date> values) {
            addCriterion("petition_date not in", values, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateBetween(Date value1, Date value2) {
            addCriterion("petition_date between", value1, value2, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andPetitionDateNotBetween(Date value1, Date value2) {
            addCriterion("petition_date not between", value1, value2, "petitionDate");
            return (Criteria) this;
        }

        public Criteria andVisitingNameIsNull() {
            addCriterion("visiting_name is null");
            return (Criteria) this;
        }

        public Criteria andVisitingNameIsNotNull() {
            addCriterion("visiting_name is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingNameEqualTo(String value) {
            addCriterion("visiting_name =", value, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameNotEqualTo(String value) {
            addCriterion("visiting_name <>", value, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameGreaterThan(String value) {
            addCriterion("visiting_name >", value, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameGreaterThanOrEqualTo(String value) {
            addCriterion("visiting_name >=", value, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameLessThan(String value) {
            addCriterion("visiting_name <", value, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameLessThanOrEqualTo(String value) {
            addCriterion("visiting_name <=", value, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameLike(String value) {
            addCriterion("visiting_name like", value, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameNotLike(String value) {
            addCriterion("visiting_name not like", value, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameIn(List<String> values) {
            addCriterion("visiting_name in", values, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameNotIn(List<String> values) {
            addCriterion("visiting_name not in", values, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameBetween(String value1, String value2) {
            addCriterion("visiting_name between", value1, value2, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingNameNotBetween(String value1, String value2) {
            addCriterion("visiting_name not between", value1, value2, "visitingName");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptIsNull() {
            addCriterion("visiting_dept is null");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptIsNotNull() {
            addCriterion("visiting_dept is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptEqualTo(String value) {
            addCriterion("visiting_dept =", value, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptNotEqualTo(String value) {
            addCriterion("visiting_dept <>", value, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptGreaterThan(String value) {
            addCriterion("visiting_dept >", value, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptGreaterThanOrEqualTo(String value) {
            addCriterion("visiting_dept >=", value, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptLessThan(String value) {
            addCriterion("visiting_dept <", value, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptLessThanOrEqualTo(String value) {
            addCriterion("visiting_dept <=", value, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptLike(String value) {
            addCriterion("visiting_dept like", value, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptNotLike(String value) {
            addCriterion("visiting_dept not like", value, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptIn(List<String> values) {
            addCriterion("visiting_dept in", values, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptNotIn(List<String> values) {
            addCriterion("visiting_dept not in", values, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptBetween(String value1, String value2) {
            addCriterion("visiting_dept between", value1, value2, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingDeptNotBetween(String value1, String value2) {
            addCriterion("visiting_dept not between", value1, value2, "visitingDept");
            return (Criteria) this;
        }

        public Criteria andVisitingJocIsNull() {
            addCriterion("visiting_joc is null");
            return (Criteria) this;
        }

        public Criteria andVisitingJocIsNotNull() {
            addCriterion("visiting_joc is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingJocEqualTo(String value) {
            addCriterion("visiting_joc =", value, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocNotEqualTo(String value) {
            addCriterion("visiting_joc <>", value, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocGreaterThan(String value) {
            addCriterion("visiting_joc >", value, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocGreaterThanOrEqualTo(String value) {
            addCriterion("visiting_joc >=", value, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocLessThan(String value) {
            addCriterion("visiting_joc <", value, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocLessThanOrEqualTo(String value) {
            addCriterion("visiting_joc <=", value, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocLike(String value) {
            addCriterion("visiting_joc like", value, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocNotLike(String value) {
            addCriterion("visiting_joc not like", value, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocIn(List<String> values) {
            addCriterion("visiting_joc in", values, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocNotIn(List<String> values) {
            addCriterion("visiting_joc not in", values, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocBetween(String value1, String value2) {
            addCriterion("visiting_joc between", value1, value2, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingJocNotBetween(String value1, String value2) {
            addCriterion("visiting_joc not between", value1, value2, "visitingJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameIsNull() {
            addCriterion("be_reflected_name is null");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameIsNotNull() {
            addCriterion("be_reflected_name is not null");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameEqualTo(String value) {
            addCriterion("be_reflected_name =", value, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameNotEqualTo(String value) {
            addCriterion("be_reflected_name <>", value, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameGreaterThan(String value) {
            addCriterion("be_reflected_name >", value, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameGreaterThanOrEqualTo(String value) {
            addCriterion("be_reflected_name >=", value, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameLessThan(String value) {
            addCriterion("be_reflected_name <", value, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameLessThanOrEqualTo(String value) {
            addCriterion("be_reflected_name <=", value, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameLike(String value) {
            addCriterion("be_reflected_name like", value, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameNotLike(String value) {
            addCriterion("be_reflected_name not like", value, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameIn(List<String> values) {
            addCriterion("be_reflected_name in", values, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameNotIn(List<String> values) {
            addCriterion("be_reflected_name not in", values, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameBetween(String value1, String value2) {
            addCriterion("be_reflected_name between", value1, value2, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedNameNotBetween(String value1, String value2) {
            addCriterion("be_reflected_name not between", value1, value2, "beReflectedName");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptIsNull() {
            addCriterion("be_reflected_dept is null");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptIsNotNull() {
            addCriterion("be_reflected_dept is not null");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptEqualTo(String value) {
            addCriterion("be_reflected_dept =", value, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptNotEqualTo(String value) {
            addCriterion("be_reflected_dept <>", value, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptGreaterThan(String value) {
            addCriterion("be_reflected_dept >", value, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptGreaterThanOrEqualTo(String value) {
            addCriterion("be_reflected_dept >=", value, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptLessThan(String value) {
            addCriterion("be_reflected_dept <", value, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptLessThanOrEqualTo(String value) {
            addCriterion("be_reflected_dept <=", value, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptLike(String value) {
            addCriterion("be_reflected_dept like", value, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptNotLike(String value) {
            addCriterion("be_reflected_dept not like", value, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptIn(List<String> values) {
            addCriterion("be_reflected_dept in", values, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptNotIn(List<String> values) {
            addCriterion("be_reflected_dept not in", values, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptBetween(String value1, String value2) {
            addCriterion("be_reflected_dept between", value1, value2, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedDeptNotBetween(String value1, String value2) {
            addCriterion("be_reflected_dept not between", value1, value2, "beReflectedDept");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocIsNull() {
            addCriterion("be_reflected_joc is null");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocIsNotNull() {
            addCriterion("be_reflected_joc is not null");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocEqualTo(String value) {
            addCriterion("be_reflected_joc =", value, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocNotEqualTo(String value) {
            addCriterion("be_reflected_joc <>", value, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocGreaterThan(String value) {
            addCriterion("be_reflected_joc >", value, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocGreaterThanOrEqualTo(String value) {
            addCriterion("be_reflected_joc >=", value, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocLessThan(String value) {
            addCriterion("be_reflected_joc <", value, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocLessThanOrEqualTo(String value) {
            addCriterion("be_reflected_joc <=", value, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocLike(String value) {
            addCriterion("be_reflected_joc like", value, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocNotLike(String value) {
            addCriterion("be_reflected_joc not like", value, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocIn(List<String> values) {
            addCriterion("be_reflected_joc in", values, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocNotIn(List<String> values) {
            addCriterion("be_reflected_joc not in", values, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocBetween(String value1, String value2) {
            addCriterion("be_reflected_joc between", value1, value2, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andBeReflectedJocNotBetween(String value1, String value2) {
            addCriterion("be_reflected_joc not between", value1, value2, "beReflectedJoc");
            return (Criteria) this;
        }

        public Criteria andVisitingContentIsNull() {
            addCriterion("visiting_content is null");
            return (Criteria) this;
        }

        public Criteria andVisitingContentIsNotNull() {
            addCriterion("visiting_content is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingContentEqualTo(String value) {
            addCriterion("visiting_content =", value, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentNotEqualTo(String value) {
            addCriterion("visiting_content <>", value, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentGreaterThan(String value) {
            addCriterion("visiting_content >", value, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentGreaterThanOrEqualTo(String value) {
            addCriterion("visiting_content >=", value, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentLessThan(String value) {
            addCriterion("visiting_content <", value, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentLessThanOrEqualTo(String value) {
            addCriterion("visiting_content <=", value, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentLike(String value) {
            addCriterion("visiting_content like", value, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentNotLike(String value) {
            addCriterion("visiting_content not like", value, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentIn(List<String> values) {
            addCriterion("visiting_content in", values, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentNotIn(List<String> values) {
            addCriterion("visiting_content not in", values, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentBetween(String value1, String value2) {
            addCriterion("visiting_content between", value1, value2, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andVisitingContentNotBetween(String value1, String value2) {
            addCriterion("visiting_content not between", value1, value2, "visitingContent");
            return (Criteria) this;
        }

        public Criteria andContentSummaryIsNull() {
            addCriterion("content_summary is null");
            return (Criteria) this;
        }

        public Criteria andContentSummaryIsNotNull() {
            addCriterion("content_summary is not null");
            return (Criteria) this;
        }

        public Criteria andContentSummaryEqualTo(String value) {
            addCriterion("content_summary =", value, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryNotEqualTo(String value) {
            addCriterion("content_summary <>", value, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryGreaterThan(String value) {
            addCriterion("content_summary >", value, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("content_summary >=", value, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryLessThan(String value) {
            addCriterion("content_summary <", value, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryLessThanOrEqualTo(String value) {
            addCriterion("content_summary <=", value, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryLike(String value) {
            addCriterion("content_summary like", value, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryNotLike(String value) {
            addCriterion("content_summary not like", value, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryIn(List<String> values) {
            addCriterion("content_summary in", values, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryNotIn(List<String> values) {
            addCriterion("content_summary not in", values, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryBetween(String value1, String value2) {
            addCriterion("content_summary between", value1, value2, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andContentSummaryNotBetween(String value1, String value2) {
            addCriterion("content_summary not between", value1, value2, "contentSummary");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionIsNull() {
            addCriterion("monitor_opinion is null");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionIsNotNull() {
            addCriterion("monitor_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionEqualTo(String value) {
            addCriterion("monitor_opinion =", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionNotEqualTo(String value) {
            addCriterion("monitor_opinion <>", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionGreaterThan(String value) {
            addCriterion("monitor_opinion >", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_opinion >=", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionLessThan(String value) {
            addCriterion("monitor_opinion <", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionLessThanOrEqualTo(String value) {
            addCriterion("monitor_opinion <=", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionLike(String value) {
            addCriterion("monitor_opinion like", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionNotLike(String value) {
            addCriterion("monitor_opinion not like", value, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionIn(List<String> values) {
            addCriterion("monitor_opinion in", values, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionNotIn(List<String> values) {
            addCriterion("monitor_opinion not in", values, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionBetween(String value1, String value2) {
            addCriterion("monitor_opinion between", value1, value2, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinionNotBetween(String value1, String value2) {
            addCriterion("monitor_opinion not between", value1, value2, "monitorOpinion");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteIsNull() {
            addCriterion("monitor_opinio_dete is null");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteIsNotNull() {
            addCriterion("monitor_opinio_dete is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteEqualTo(Date value) {
            addCriterion("monitor_opinio_dete =", value, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteNotEqualTo(Date value) {
            addCriterion("monitor_opinio_dete <>", value, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteGreaterThan(Date value) {
            addCriterion("monitor_opinio_dete >", value, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteGreaterThanOrEqualTo(Date value) {
            addCriterion("monitor_opinio_dete >=", value, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteLessThan(Date value) {
            addCriterion("monitor_opinio_dete <", value, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteLessThanOrEqualTo(Date value) {
            addCriterion("monitor_opinio_dete <=", value, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteIn(List<Date> values) {
            addCriterion("monitor_opinio_dete in", values, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteNotIn(List<Date> values) {
            addCriterion("monitor_opinio_dete not in", values, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteBetween(Date value1, Date value2) {
            addCriterion("monitor_opinio_dete between", value1, value2, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andMonitorOpinioDeteNotBetween(Date value1, Date value2) {
            addCriterion("monitor_opinio_dete not between", value1, value2, "monitorOpinioDete");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioIsNull() {
            addCriterion("discipline_inspection_opinio is null");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioIsNotNull() {
            addCriterion("discipline_inspection_opinio is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioEqualTo(String value) {
            addCriterion("discipline_inspection_opinio =", value, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioNotEqualTo(String value) {
            addCriterion("discipline_inspection_opinio <>", value, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioGreaterThan(String value) {
            addCriterion("discipline_inspection_opinio >", value, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioGreaterThanOrEqualTo(String value) {
            addCriterion("discipline_inspection_opinio >=", value, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioLessThan(String value) {
            addCriterion("discipline_inspection_opinio <", value, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioLessThanOrEqualTo(String value) {
            addCriterion("discipline_inspection_opinio <=", value, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioLike(String value) {
            addCriterion("discipline_inspection_opinio like", value, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioNotLike(String value) {
            addCriterion("discipline_inspection_opinio not like", value, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioIn(List<String> values) {
            addCriterion("discipline_inspection_opinio in", values, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioNotIn(List<String> values) {
            addCriterion("discipline_inspection_opinio not in", values, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioBetween(String value1, String value2) {
            addCriterion("discipline_inspection_opinio between", value1, value2, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andDisciplineInspectionOpinioNotBetween(String value1, String value2) {
            addCriterion("discipline_inspection_opinio not between", value1, value2, "disciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioIsNull() {
            addCriterion("iscipline_inspection_opinio is null");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioIsNotNull() {
            addCriterion("iscipline_inspection_opinio is not null");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioEqualTo(Date value) {
            addCriterion("iscipline_inspection_opinio =", value, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioNotEqualTo(Date value) {
            addCriterion("iscipline_inspection_opinio <>", value, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioGreaterThan(Date value) {
            addCriterion("iscipline_inspection_opinio >", value, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioGreaterThanOrEqualTo(Date value) {
            addCriterion("iscipline_inspection_opinio >=", value, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioLessThan(Date value) {
            addCriterion("iscipline_inspection_opinio <", value, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioLessThanOrEqualTo(Date value) {
            addCriterion("iscipline_inspection_opinio <=", value, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioIn(List<Date> values) {
            addCriterion("iscipline_inspection_opinio in", values, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioNotIn(List<Date> values) {
            addCriterion("iscipline_inspection_opinio not in", values, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioBetween(Date value1, Date value2) {
            addCriterion("iscipline_inspection_opinio between", value1, value2, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andIsciplineInspectionOpinioNotBetween(Date value1, Date value2) {
            addCriterion("iscipline_inspection_opinio not between", value1, value2, "isciplineInspectionOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioIsNull() {
            addCriterion("bureau_opinio is null");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioIsNotNull() {
            addCriterion("bureau_opinio is not null");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioEqualTo(String value) {
            addCriterion("bureau_opinio =", value, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioNotEqualTo(String value) {
            addCriterion("bureau_opinio <>", value, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioGreaterThan(String value) {
            addCriterion("bureau_opinio >", value, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioGreaterThanOrEqualTo(String value) {
            addCriterion("bureau_opinio >=", value, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioLessThan(String value) {
            addCriterion("bureau_opinio <", value, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioLessThanOrEqualTo(String value) {
            addCriterion("bureau_opinio <=", value, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioLike(String value) {
            addCriterion("bureau_opinio like", value, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioNotLike(String value) {
            addCriterion("bureau_opinio not like", value, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioIn(List<String> values) {
            addCriterion("bureau_opinio in", values, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioNotIn(List<String> values) {
            addCriterion("bureau_opinio not in", values, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioBetween(String value1, String value2) {
            addCriterion("bureau_opinio between", value1, value2, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioNotBetween(String value1, String value2) {
            addCriterion("bureau_opinio not between", value1, value2, "bureauOpinio");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateIsNull() {
            addCriterion("bureau_opinio_date is null");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateIsNotNull() {
            addCriterion("bureau_opinio_date is not null");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateEqualTo(Date value) {
            addCriterion("bureau_opinio_date =", value, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateNotEqualTo(Date value) {
            addCriterion("bureau_opinio_date <>", value, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateGreaterThan(Date value) {
            addCriterion("bureau_opinio_date >", value, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bureau_opinio_date >=", value, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateLessThan(Date value) {
            addCriterion("bureau_opinio_date <", value, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateLessThanOrEqualTo(Date value) {
            addCriterion("bureau_opinio_date <=", value, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateIn(List<Date> values) {
            addCriterion("bureau_opinio_date in", values, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateNotIn(List<Date> values) {
            addCriterion("bureau_opinio_date not in", values, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateBetween(Date value1, Date value2) {
            addCriterion("bureau_opinio_date between", value1, value2, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andBureauOpinioDateNotBetween(Date value1, Date value2) {
            addCriterion("bureau_opinio_date not between", value1, value2, "bureauOpinioDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultIsNull() {
            addCriterion("transit_result is null");
            return (Criteria) this;
        }

        public Criteria andTransitResultIsNotNull() {
            addCriterion("transit_result is not null");
            return (Criteria) this;
        }

        public Criteria andTransitResultEqualTo(String value) {
            addCriterion("transit_result =", value, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultNotEqualTo(String value) {
            addCriterion("transit_result <>", value, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultGreaterThan(String value) {
            addCriterion("transit_result >", value, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultGreaterThanOrEqualTo(String value) {
            addCriterion("transit_result >=", value, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultLessThan(String value) {
            addCriterion("transit_result <", value, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultLessThanOrEqualTo(String value) {
            addCriterion("transit_result <=", value, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultLike(String value) {
            addCriterion("transit_result like", value, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultNotLike(String value) {
            addCriterion("transit_result not like", value, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultIn(List<String> values) {
            addCriterion("transit_result in", values, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultNotIn(List<String> values) {
            addCriterion("transit_result not in", values, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultBetween(String value1, String value2) {
            addCriterion("transit_result between", value1, value2, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultNotBetween(String value1, String value2) {
            addCriterion("transit_result not between", value1, value2, "transitResult");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateIsNull() {
            addCriterion("transit_result_date is null");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateIsNotNull() {
            addCriterion("transit_result_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateEqualTo(Date value) {
            addCriterion("transit_result_date =", value, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateNotEqualTo(Date value) {
            addCriterion("transit_result_date <>", value, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateGreaterThan(Date value) {
            addCriterion("transit_result_date >", value, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateGreaterThanOrEqualTo(Date value) {
            addCriterion("transit_result_date >=", value, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateLessThan(Date value) {
            addCriterion("transit_result_date <", value, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateLessThanOrEqualTo(Date value) {
            addCriterion("transit_result_date <=", value, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateIn(List<Date> values) {
            addCriterion("transit_result_date in", values, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateNotIn(List<Date> values) {
            addCriterion("transit_result_date not in", values, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateBetween(Date value1, Date value2) {
            addCriterion("transit_result_date between", value1, value2, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andTransitResultDateNotBetween(Date value1, Date value2) {
            addCriterion("transit_result_date not between", value1, value2, "transitResultDate");
            return (Criteria) this;
        }

        public Criteria andSelfResultIsNull() {
            addCriterion("self_result is null");
            return (Criteria) this;
        }

        public Criteria andSelfResultIsNotNull() {
            addCriterion("self_result is not null");
            return (Criteria) this;
        }

        public Criteria andSelfResultEqualTo(String value) {
            addCriterion("self_result =", value, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultNotEqualTo(String value) {
            addCriterion("self_result <>", value, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultGreaterThan(String value) {
            addCriterion("self_result >", value, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultGreaterThanOrEqualTo(String value) {
            addCriterion("self_result >=", value, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultLessThan(String value) {
            addCriterion("self_result <", value, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultLessThanOrEqualTo(String value) {
            addCriterion("self_result <=", value, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultLike(String value) {
            addCriterion("self_result like", value, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultNotLike(String value) {
            addCriterion("self_result not like", value, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultIn(List<String> values) {
            addCriterion("self_result in", values, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultNotIn(List<String> values) {
            addCriterion("self_result not in", values, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultBetween(String value1, String value2) {
            addCriterion("self_result between", value1, value2, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfResultNotBetween(String value1, String value2) {
            addCriterion("self_result not between", value1, value2, "selfResult");
            return (Criteria) this;
        }

        public Criteria andSelfDateIsNull() {
            addCriterion("self_date is null");
            return (Criteria) this;
        }

        public Criteria andSelfDateIsNotNull() {
            addCriterion("self_date is not null");
            return (Criteria) this;
        }

        public Criteria andSelfDateEqualTo(Date value) {
            addCriterion("self_date =", value, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateNotEqualTo(Date value) {
            addCriterion("self_date <>", value, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateGreaterThan(Date value) {
            addCriterion("self_date >", value, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateGreaterThanOrEqualTo(Date value) {
            addCriterion("self_date >=", value, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateLessThan(Date value) {
            addCriterion("self_date <", value, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateLessThanOrEqualTo(Date value) {
            addCriterion("self_date <=", value, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateIn(List<Date> values) {
            addCriterion("self_date in", values, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateNotIn(List<Date> values) {
            addCriterion("self_date not in", values, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateBetween(Date value1, Date value2) {
            addCriterion("self_date between", value1, value2, "selfDate");
            return (Criteria) this;
        }

        public Criteria andSelfDateNotBetween(Date value1, Date value2) {
            addCriterion("self_date not between", value1, value2, "selfDate");
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