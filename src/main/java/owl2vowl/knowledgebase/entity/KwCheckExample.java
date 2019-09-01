package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KwCheckExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public KwCheckExample() {
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

        public Criteria andCheckIdIsNull() {
            addCriterion("CHECK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("CHECK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(Integer value) {
            addCriterion("CHECK_ID =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(Integer value) {
            addCriterion("CHECK_ID <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(Integer value) {
            addCriterion("CHECK_ID >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_ID >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(Integer value) {
            addCriterion("CHECK_ID <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_ID <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<Integer> values) {
            addCriterion("CHECK_ID in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<Integer> values) {
            addCriterion("CHECK_ID not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_ID between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_ID not between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNull() {
            addCriterion("DOCUMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNotNull() {
            addCriterion("DOCUMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdEqualTo(Integer value) {
            addCriterion("DOCUMENT_ID =", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotEqualTo(Integer value) {
            addCriterion("DOCUMENT_ID <>", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThan(Integer value) {
            addCriterion("DOCUMENT_ID >", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_ID >=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThan(Integer value) {
            addCriterion("DOCUMENT_ID <", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_ID <=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIn(List<Integer> values) {
            addCriterion("DOCUMENT_ID in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotIn(List<Integer> values) {
            addCriterion("DOCUMENT_ID not in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_ID between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_ID not between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andCheckUseridIsNull() {
            addCriterion("CHECK_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCheckUseridIsNotNull() {
            addCriterion("CHECK_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUseridEqualTo(Integer value) {
            addCriterion("CHECK_USERID =", value, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridNotEqualTo(Integer value) {
            addCriterion("CHECK_USERID <>", value, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridGreaterThan(Integer value) {
            addCriterion("CHECK_USERID >", value, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_USERID >=", value, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridLessThan(Integer value) {
            addCriterion("CHECK_USERID <", value, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_USERID <=", value, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridIn(List<Integer> values) {
            addCriterion("CHECK_USERID in", values, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridNotIn(List<Integer> values) {
            addCriterion("CHECK_USERID not in", values, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_USERID between", value1, value2, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_USERID not between", value1, value2, "checkUserid");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameIsNull() {
            addCriterion("CHECK_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameIsNotNull() {
            addCriterion("CHECK_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameEqualTo(String value) {
            addCriterion("CHECK_USERNAME =", value, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameNotEqualTo(String value) {
            addCriterion("CHECK_USERNAME <>", value, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameGreaterThan(String value) {
            addCriterion("CHECK_USERNAME >", value, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_USERNAME >=", value, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameLessThan(String value) {
            addCriterion("CHECK_USERNAME <", value, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameLessThanOrEqualTo(String value) {
            addCriterion("CHECK_USERNAME <=", value, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameLike(String value) {
            addCriterion("CHECK_USERNAME like", value, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameNotLike(String value) {
            addCriterion("CHECK_USERNAME not like", value, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameIn(List<String> values) {
            addCriterion("CHECK_USERNAME in", values, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameNotIn(List<String> values) {
            addCriterion("CHECK_USERNAME not in", values, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameBetween(String value1, String value2) {
            addCriterion("CHECK_USERNAME between", value1, value2, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckUsernameNotBetween(String value1, String value2) {
            addCriterion("CHECK_USERNAME not between", value1, value2, "checkUsername");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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