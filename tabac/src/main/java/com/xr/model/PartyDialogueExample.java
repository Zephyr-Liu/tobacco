package com.xr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartyDialogueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyDialogueExample() {
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

        public Criteria andOtherSideNameIsNull() {
            addCriterion("other_side_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameIsNotNull() {
            addCriterion("other_side_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameEqualTo(String value) {
            addCriterion("other_side_name =", value, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameNotEqualTo(String value) {
            addCriterion("other_side_name <>", value, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameGreaterThan(String value) {
            addCriterion("other_side_name >", value, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_side_name >=", value, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameLessThan(String value) {
            addCriterion("other_side_name <", value, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameLessThanOrEqualTo(String value) {
            addCriterion("other_side_name <=", value, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameLike(String value) {
            addCriterion("other_side_name like", value, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameNotLike(String value) {
            addCriterion("other_side_name not like", value, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameIn(List<String> values) {
            addCriterion("other_side_name in", values, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameNotIn(List<String> values) {
            addCriterion("other_side_name not in", values, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameBetween(String value1, String value2) {
            addCriterion("other_side_name between", value1, value2, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideNameNotBetween(String value1, String value2) {
            addCriterion("other_side_name not between", value1, value2, "otherSideName");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptIsNull() {
            addCriterion("other_side_dept is null");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptIsNotNull() {
            addCriterion("other_side_dept is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptEqualTo(Integer value) {
            addCriterion("other_side_dept =", value, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptNotEqualTo(Integer value) {
            addCriterion("other_side_dept <>", value, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptGreaterThan(Integer value) {
            addCriterion("other_side_dept >", value, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_side_dept >=", value, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptLessThan(Integer value) {
            addCriterion("other_side_dept <", value, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptLessThanOrEqualTo(Integer value) {
            addCriterion("other_side_dept <=", value, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptIn(List<Integer> values) {
            addCriterion("other_side_dept in", values, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptNotIn(List<Integer> values) {
            addCriterion("other_side_dept not in", values, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptBetween(Integer value1, Integer value2) {
            addCriterion("other_side_dept between", value1, value2, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideDeptNotBetween(Integer value1, Integer value2) {
            addCriterion("other_side_dept not between", value1, value2, "otherSideDept");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceIsNull() {
            addCriterion("other_side_face is null");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceIsNotNull() {
            addCriterion("other_side_face is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceEqualTo(String value) {
            addCriterion("other_side_face =", value, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceNotEqualTo(String value) {
            addCriterion("other_side_face <>", value, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceGreaterThan(String value) {
            addCriterion("other_side_face >", value, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceGreaterThanOrEqualTo(String value) {
            addCriterion("other_side_face >=", value, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceLessThan(String value) {
            addCriterion("other_side_face <", value, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceLessThanOrEqualTo(String value) {
            addCriterion("other_side_face <=", value, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceLike(String value) {
            addCriterion("other_side_face like", value, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceNotLike(String value) {
            addCriterion("other_side_face not like", value, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceIn(List<String> values) {
            addCriterion("other_side_face in", values, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceNotIn(List<String> values) {
            addCriterion("other_side_face not in", values, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceBetween(String value1, String value2) {
            addCriterion("other_side_face between", value1, value2, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideFaceNotBetween(String value1, String value2) {
            addCriterion("other_side_face not between", value1, value2, "otherSideFace");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocIsNull() {
            addCriterion("other_side_joc is null");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocIsNotNull() {
            addCriterion("other_side_joc is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocEqualTo(String value) {
            addCriterion("other_side_joc =", value, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocNotEqualTo(String value) {
            addCriterion("other_side_joc <>", value, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocGreaterThan(String value) {
            addCriterion("other_side_joc >", value, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocGreaterThanOrEqualTo(String value) {
            addCriterion("other_side_joc >=", value, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocLessThan(String value) {
            addCriterion("other_side_joc <", value, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocLessThanOrEqualTo(String value) {
            addCriterion("other_side_joc <=", value, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocLike(String value) {
            addCriterion("other_side_joc like", value, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocNotLike(String value) {
            addCriterion("other_side_joc not like", value, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocIn(List<String> values) {
            addCriterion("other_side_joc in", values, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocNotIn(List<String> values) {
            addCriterion("other_side_joc not in", values, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocBetween(String value1, String value2) {
            addCriterion("other_side_joc between", value1, value2, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andOtherSideJocNotBetween(String value1, String value2) {
            addCriterion("other_side_joc not between", value1, value2, "otherSideJoc");
            return (Criteria) this;
        }

        public Criteria andTalkTypeIsNull() {
            addCriterion("talk_type is null");
            return (Criteria) this;
        }

        public Criteria andTalkTypeIsNotNull() {
            addCriterion("talk_type is not null");
            return (Criteria) this;
        }

        public Criteria andTalkTypeEqualTo(Byte value) {
            addCriterion("talk_type =", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotEqualTo(Byte value) {
            addCriterion("talk_type <>", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeGreaterThan(Byte value) {
            addCriterion("talk_type >", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("talk_type >=", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeLessThan(Byte value) {
            addCriterion("talk_type <", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeLessThanOrEqualTo(Byte value) {
            addCriterion("talk_type <=", value, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeIn(List<Byte> values) {
            addCriterion("talk_type in", values, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotIn(List<Byte> values) {
            addCriterion("talk_type not in", values, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeBetween(Byte value1, Byte value2) {
            addCriterion("talk_type between", value1, value2, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("talk_type not between", value1, value2, "talkType");
            return (Criteria) this;
        }

        public Criteria andTalkDateIsNull() {
            addCriterion("talk_date is null");
            return (Criteria) this;
        }

        public Criteria andTalkDateIsNotNull() {
            addCriterion("talk_date is not null");
            return (Criteria) this;
        }

        public Criteria andTalkDateEqualTo(Date value) {
            addCriterion("talk_date =", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateNotEqualTo(Date value) {
            addCriterion("talk_date <>", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateGreaterThan(Date value) {
            addCriterion("talk_date >", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateGreaterThanOrEqualTo(Date value) {
            addCriterion("talk_date >=", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateLessThan(Date value) {
            addCriterion("talk_date <", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateLessThanOrEqualTo(Date value) {
            addCriterion("talk_date <=", value, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateIn(List<Date> values) {
            addCriterion("talk_date in", values, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateNotIn(List<Date> values) {
            addCriterion("talk_date not in", values, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateBetween(Date value1, Date value2) {
            addCriterion("talk_date between", value1, value2, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkDateNotBetween(Date value1, Date value2) {
            addCriterion("talk_date not between", value1, value2, "talkDate");
            return (Criteria) this;
        }

        public Criteria andTalkSiteIsNull() {
            addCriterion("talk_site is null");
            return (Criteria) this;
        }

        public Criteria andTalkSiteIsNotNull() {
            addCriterion("talk_site is not null");
            return (Criteria) this;
        }

        public Criteria andTalkSiteEqualTo(String value) {
            addCriterion("talk_site =", value, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteNotEqualTo(String value) {
            addCriterion("talk_site <>", value, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteGreaterThan(String value) {
            addCriterion("talk_site >", value, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteGreaterThanOrEqualTo(String value) {
            addCriterion("talk_site >=", value, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteLessThan(String value) {
            addCriterion("talk_site <", value, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteLessThanOrEqualTo(String value) {
            addCriterion("talk_site <=", value, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteLike(String value) {
            addCriterion("talk_site like", value, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteNotLike(String value) {
            addCriterion("talk_site not like", value, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteIn(List<String> values) {
            addCriterion("talk_site in", values, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteNotIn(List<String> values) {
            addCriterion("talk_site not in", values, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteBetween(String value1, String value2) {
            addCriterion("talk_site between", value1, value2, "talkSite");
            return (Criteria) this;
        }

        public Criteria andTalkSiteNotBetween(String value1, String value2) {
            addCriterion("talk_site not between", value1, value2, "talkSite");
            return (Criteria) this;
        }

        public Criteria andRecordProsonIsNull() {
            addCriterion("record_proson is null");
            return (Criteria) this;
        }

        public Criteria andRecordProsonIsNotNull() {
            addCriterion("record_proson is not null");
            return (Criteria) this;
        }

        public Criteria andRecordProsonEqualTo(String value) {
            addCriterion("record_proson =", value, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonNotEqualTo(String value) {
            addCriterion("record_proson <>", value, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonGreaterThan(String value) {
            addCriterion("record_proson >", value, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonGreaterThanOrEqualTo(String value) {
            addCriterion("record_proson >=", value, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonLessThan(String value) {
            addCriterion("record_proson <", value, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonLessThanOrEqualTo(String value) {
            addCriterion("record_proson <=", value, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonLike(String value) {
            addCriterion("record_proson like", value, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonNotLike(String value) {
            addCriterion("record_proson not like", value, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonIn(List<String> values) {
            addCriterion("record_proson in", values, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonNotIn(List<String> values) {
            addCriterion("record_proson not in", values, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonBetween(String value1, String value2) {
            addCriterion("record_proson between", value1, value2, "recordProson");
            return (Criteria) this;
        }

        public Criteria andRecordProsonNotBetween(String value1, String value2) {
            addCriterion("record_proson not between", value1, value2, "recordProson");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineIsNull() {
            addCriterion("talk_outline is null");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineIsNotNull() {
            addCriterion("talk_outline is not null");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineEqualTo(String value) {
            addCriterion("talk_outline =", value, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineNotEqualTo(String value) {
            addCriterion("talk_outline <>", value, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineGreaterThan(String value) {
            addCriterion("talk_outline >", value, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineGreaterThanOrEqualTo(String value) {
            addCriterion("talk_outline >=", value, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineLessThan(String value) {
            addCriterion("talk_outline <", value, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineLessThanOrEqualTo(String value) {
            addCriterion("talk_outline <=", value, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineLike(String value) {
            addCriterion("talk_outline like", value, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineNotLike(String value) {
            addCriterion("talk_outline not like", value, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineIn(List<String> values) {
            addCriterion("talk_outline in", values, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineNotIn(List<String> values) {
            addCriterion("talk_outline not in", values, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineBetween(String value1, String value2) {
            addCriterion("talk_outline between", value1, value2, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkOutlineNotBetween(String value1, String value2) {
            addCriterion("talk_outline not between", value1, value2, "talkOutline");
            return (Criteria) this;
        }

        public Criteria andTalkContentIsNull() {
            addCriterion("talk_content is null");
            return (Criteria) this;
        }

        public Criteria andTalkContentIsNotNull() {
            addCriterion("talk_content is not null");
            return (Criteria) this;
        }

        public Criteria andTalkContentEqualTo(String value) {
            addCriterion("talk_content =", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentNotEqualTo(String value) {
            addCriterion("talk_content <>", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentGreaterThan(String value) {
            addCriterion("talk_content >", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentGreaterThanOrEqualTo(String value) {
            addCriterion("talk_content >=", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentLessThan(String value) {
            addCriterion("talk_content <", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentLessThanOrEqualTo(String value) {
            addCriterion("talk_content <=", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentLike(String value) {
            addCriterion("talk_content like", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentNotLike(String value) {
            addCriterion("talk_content not like", value, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentIn(List<String> values) {
            addCriterion("talk_content in", values, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentNotIn(List<String> values) {
            addCriterion("talk_content not in", values, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentBetween(String value1, String value2) {
            addCriterion("talk_content between", value1, value2, "talkContent");
            return (Criteria) this;
        }

        public Criteria andTalkContentNotBetween(String value1, String value2) {
            addCriterion("talk_content not between", value1, value2, "talkContent");
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