package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KpinfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public KpinfoExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andKpIdIsNull() {
            addCriterion("KP_ID is null");
            return (Criteria) this;
        }

        public Criteria andKpIdIsNotNull() {
            addCriterion("KP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKpIdEqualTo(Integer value) {
            addCriterion("KP_ID =", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotEqualTo(Integer value) {
            addCriterion("KP_ID <>", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdGreaterThan(Integer value) {
            addCriterion("KP_ID >", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("KP_ID >=", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdLessThan(Integer value) {
            addCriterion("KP_ID <", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdLessThanOrEqualTo(Integer value) {
            addCriterion("KP_ID <=", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdIn(List<Integer> values) {
            addCriterion("KP_ID in", values, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotIn(List<Integer> values) {
            addCriterion("KP_ID not in", values, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdBetween(Integer value1, Integer value2) {
            addCriterion("KP_ID between", value1, value2, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("KP_ID not between", value1, value2, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpNameIsNull() {
            addCriterion("KP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKpNameIsNotNull() {
            addCriterion("KP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKpNameEqualTo(String value) {
            addCriterion("KP_NAME =", value, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameNotEqualTo(String value) {
            addCriterion("KP_NAME <>", value, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameGreaterThan(String value) {
            addCriterion("KP_NAME >", value, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameGreaterThanOrEqualTo(String value) {
            addCriterion("KP_NAME >=", value, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameLessThan(String value) {
            addCriterion("KP_NAME <", value, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameLessThanOrEqualTo(String value) {
            addCriterion("KP_NAME <=", value, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameLike(String value) {
            addCriterion("KP_NAME like", value, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameNotLike(String value) {
            addCriterion("KP_NAME not like", value, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameIn(List<String> values) {
            addCriterion("KP_NAME in", values, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameNotIn(List<String> values) {
            addCriterion("KP_NAME not in", values, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameBetween(String value1, String value2) {
            addCriterion("KP_NAME between", value1, value2, "kpName");
            return (Criteria) this;
        }

        public Criteria andKpNameNotBetween(String value1, String value2) {
            addCriterion("KP_NAME not between", value1, value2, "kpName");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("RELEASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("RELEASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("RELEASE_TIME =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("RELEASE_TIME <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("RELEASE_TIME >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RELEASE_TIME >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("RELEASE_TIME <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("RELEASE_TIME <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("RELEASE_TIME in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("RELEASE_TIME not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("RELEASE_TIME between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("RELEASE_TIME not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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