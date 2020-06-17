package com.xr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PartySuperviseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartySuperviseExample() {
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

        public Criteria andItemsinthispaperIsNull() {
            addCriterion("Itemsinthispaper is null");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperIsNotNull() {
            addCriterion("Itemsinthispaper is not null");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperEqualTo(String value) {
            addCriterion("Itemsinthispaper =", value, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperNotEqualTo(String value) {
            addCriterion("Itemsinthispaper <>", value, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperGreaterThan(String value) {
            addCriterion("Itemsinthispaper >", value, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperGreaterThanOrEqualTo(String value) {
            addCriterion("Itemsinthispaper >=", value, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperLessThan(String value) {
            addCriterion("Itemsinthispaper <", value, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperLessThanOrEqualTo(String value) {
            addCriterion("Itemsinthispaper <=", value, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperLike(String value) {
            addCriterion("Itemsinthispaper like", value, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperNotLike(String value) {
            addCriterion("Itemsinthispaper not like", value, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperIn(List<String> values) {
            addCriterion("Itemsinthispaper in", values, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperNotIn(List<String> values) {
            addCriterion("Itemsinthispaper not in", values, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperBetween(String value1, String value2) {
            addCriterion("Itemsinthispaper between", value1, value2, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andItemsinthispaperNotBetween(String value1, String value2) {
            addCriterion("Itemsinthispaper not between", value1, value2, "itemsinthispaper");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionIsNull() {
            addCriterion("modeofexecution is null");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionIsNotNull() {
            addCriterion("modeofexecution is not null");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionEqualTo(String value) {
            addCriterion("modeofexecution =", value, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionNotEqualTo(String value) {
            addCriterion("modeofexecution <>", value, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionGreaterThan(String value) {
            addCriterion("modeofexecution >", value, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionGreaterThanOrEqualTo(String value) {
            addCriterion("modeofexecution >=", value, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionLessThan(String value) {
            addCriterion("modeofexecution <", value, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionLessThanOrEqualTo(String value) {
            addCriterion("modeofexecution <=", value, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionLike(String value) {
            addCriterion("modeofexecution like", value, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionNotLike(String value) {
            addCriterion("modeofexecution not like", value, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionIn(List<String> values) {
            addCriterion("modeofexecution in", values, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionNotIn(List<String> values) {
            addCriterion("modeofexecution not in", values, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionBetween(String value1, String value2) {
            addCriterion("modeofexecution between", value1, value2, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andModeofexecutionNotBetween(String value1, String value2) {
            addCriterion("modeofexecution not between", value1, value2, "modeofexecution");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(String value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(String value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(String value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(String value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(String value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(String value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLike(String value) {
            addCriterion("cost like", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotLike(String value) {
            addCriterion("cost not like", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<String> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<String> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(String value1, String value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(String value1, String value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andUndertakerIsNull() {
            addCriterion("undertaker is null");
            return (Criteria) this;
        }

        public Criteria andUndertakerIsNotNull() {
            addCriterion("undertaker is not null");
            return (Criteria) this;
        }

        public Criteria andUndertakerEqualTo(String value) {
            addCriterion("undertaker =", value, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerNotEqualTo(String value) {
            addCriterion("undertaker <>", value, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerGreaterThan(String value) {
            addCriterion("undertaker >", value, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerGreaterThanOrEqualTo(String value) {
            addCriterion("undertaker >=", value, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerLessThan(String value) {
            addCriterion("undertaker <", value, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerLessThanOrEqualTo(String value) {
            addCriterion("undertaker <=", value, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerLike(String value) {
            addCriterion("undertaker like", value, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerNotLike(String value) {
            addCriterion("undertaker not like", value, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerIn(List<String> values) {
            addCriterion("undertaker in", values, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerNotIn(List<String> values) {
            addCriterion("undertaker not in", values, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerBetween(String value1, String value2) {
            addCriterion("undertaker between", value1, value2, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakerNotBetween(String value1, String value2) {
            addCriterion("undertaker not between", value1, value2, "undertaker");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptIsNull() {
            addCriterion("undertakedept is null");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptIsNotNull() {
            addCriterion("undertakedept is not null");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptEqualTo(String value) {
            addCriterion("undertakedept =", value, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptNotEqualTo(String value) {
            addCriterion("undertakedept <>", value, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptGreaterThan(String value) {
            addCriterion("undertakedept >", value, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptGreaterThanOrEqualTo(String value) {
            addCriterion("undertakedept >=", value, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptLessThan(String value) {
            addCriterion("undertakedept <", value, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptLessThanOrEqualTo(String value) {
            addCriterion("undertakedept <=", value, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptLike(String value) {
            addCriterion("undertakedept like", value, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptNotLike(String value) {
            addCriterion("undertakedept not like", value, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptIn(List<String> values) {
            addCriterion("undertakedept in", values, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptNotIn(List<String> values) {
            addCriterion("undertakedept not in", values, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptBetween(String value1, String value2) {
            addCriterion("undertakedept between", value1, value2, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andUndertakedeptNotBetween(String value1, String value2) {
            addCriterion("undertakedept not between", value1, value2, "undertakedept");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNull() {
            addCriterion("auditopinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNotNull() {
            addCriterion("auditopinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionEqualTo(String value) {
            addCriterion("auditopinion =", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotEqualTo(String value) {
            addCriterion("auditopinion <>", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThan(String value) {
            addCriterion("auditopinion >", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThanOrEqualTo(String value) {
            addCriterion("auditopinion >=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThan(String value) {
            addCriterion("auditopinion <", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThanOrEqualTo(String value) {
            addCriterion("auditopinion <=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLike(String value) {
            addCriterion("auditopinion like", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotLike(String value) {
            addCriterion("auditopinion not like", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIn(List<String> values) {
            addCriterion("auditopinion in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotIn(List<String> values) {
            addCriterion("auditopinion not in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionBetween(String value1, String value2) {
            addCriterion("auditopinion between", value1, value2, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotBetween(String value1, String value2) {
            addCriterion("auditopinion not between", value1, value2, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationtime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("creationtime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("creationtime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("creationtime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creationtime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("creationtime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("creationtime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("creationtime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("creationtime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("creationtime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("creationtime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNull() {
            addCriterion("creatorname is null");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNotNull() {
            addCriterion("creatorname is not null");
            return (Criteria) this;
        }

        public Criteria andCreatornameEqualTo(String value) {
            addCriterion("creatorname =", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotEqualTo(String value) {
            addCriterion("creatorname <>", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThan(String value) {
            addCriterion("creatorname >", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThanOrEqualTo(String value) {
            addCriterion("creatorname >=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThan(String value) {
            addCriterion("creatorname <", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThanOrEqualTo(String value) {
            addCriterion("creatorname <=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLike(String value) {
            addCriterion("creatorname like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotLike(String value) {
            addCriterion("creatorname not like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameIn(List<String> values) {
            addCriterion("creatorname in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotIn(List<String> values) {
            addCriterion("creatorname not in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameBetween(String value1, String value2) {
            addCriterion("creatorname between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotBetween(String value1, String value2) {
            addCriterion("creatorname not between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`state` not between", value1, value2, "state");
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