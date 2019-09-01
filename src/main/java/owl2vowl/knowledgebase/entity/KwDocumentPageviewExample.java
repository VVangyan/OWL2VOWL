package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KwDocumentPageviewExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public KwDocumentPageviewExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPageviewIdIsNull() {
            addCriterion("PAGEVIEW_ID is null");
            return (Criteria) this;
        }

        public Criteria andPageviewIdIsNotNull() {
            addCriterion("PAGEVIEW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewIdEqualTo(Integer value) {
            addCriterion("PAGEVIEW_ID =", value, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdNotEqualTo(Integer value) {
            addCriterion("PAGEVIEW_ID <>", value, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdGreaterThan(Integer value) {
            addCriterion("PAGEVIEW_ID >", value, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAGEVIEW_ID >=", value, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdLessThan(Integer value) {
            addCriterion("PAGEVIEW_ID <", value, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAGEVIEW_ID <=", value, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdIn(List<Integer> values) {
            addCriterion("PAGEVIEW_ID in", values, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdNotIn(List<Integer> values) {
            addCriterion("PAGEVIEW_ID not in", values, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdBetween(Integer value1, Integer value2) {
            addCriterion("PAGEVIEW_ID between", value1, value2, "pageviewId");
            return (Criteria) this;
        }

        public Criteria andPageviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAGEVIEW_ID not between", value1, value2, "pageviewId");
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

        public Criteria andDocumentNameIsNull() {
            addCriterion("DOCUMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDocumentNameIsNotNull() {
            addCriterion("DOCUMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentNameEqualTo(String value) {
            addCriterion("DOCUMENT_NAME =", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotEqualTo(String value) {
            addCriterion("DOCUMENT_NAME <>", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameGreaterThan(String value) {
            addCriterion("DOCUMENT_NAME >", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_NAME >=", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLessThan(String value) {
            addCriterion("DOCUMENT_NAME <", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_NAME <=", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameLike(String value) {
            addCriterion("DOCUMENT_NAME like", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotLike(String value) {
            addCriterion("DOCUMENT_NAME not like", value, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameIn(List<String> values) {
            addCriterion("DOCUMENT_NAME in", values, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotIn(List<String> values) {
            addCriterion("DOCUMENT_NAME not in", values, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameBetween(String value1, String value2) {
            addCriterion("DOCUMENT_NAME between", value1, value2, "documentName");
            return (Criteria) this;
        }

        public Criteria andDocumentNameNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_NAME not between", value1, value2, "documentName");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeIsNull() {
            addCriterion("PAGEVIEW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeIsNotNull() {
            addCriterion("PAGEVIEW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PAGEVIEW_TIME =", value, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PAGEVIEW_TIME <>", value, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PAGEVIEW_TIME >", value, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAGEVIEW_TIME >=", value, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeLessThan(Date value) {
            addCriterionForJDBCDate("PAGEVIEW_TIME <", value, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAGEVIEW_TIME <=", value, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PAGEVIEW_TIME in", values, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PAGEVIEW_TIME not in", values, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAGEVIEW_TIME between", value1, value2, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAGEVIEW_TIME not between", value1, value2, "pageviewTime");
            return (Criteria) this;
        }

        public Criteria andPageviewIpIsNull() {
            addCriterion("PAGEVIEW_IP is null");
            return (Criteria) this;
        }

        public Criteria andPageviewIpIsNotNull() {
            addCriterion("PAGEVIEW_IP is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewIpEqualTo(String value) {
            addCriterion("PAGEVIEW_IP =", value, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpNotEqualTo(String value) {
            addCriterion("PAGEVIEW_IP <>", value, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpGreaterThan(String value) {
            addCriterion("PAGEVIEW_IP >", value, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpGreaterThanOrEqualTo(String value) {
            addCriterion("PAGEVIEW_IP >=", value, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpLessThan(String value) {
            addCriterion("PAGEVIEW_IP <", value, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpLessThanOrEqualTo(String value) {
            addCriterion("PAGEVIEW_IP <=", value, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpLike(String value) {
            addCriterion("PAGEVIEW_IP like", value, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpNotLike(String value) {
            addCriterion("PAGEVIEW_IP not like", value, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpIn(List<String> values) {
            addCriterion("PAGEVIEW_IP in", values, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpNotIn(List<String> values) {
            addCriterion("PAGEVIEW_IP not in", values, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpBetween(String value1, String value2) {
            addCriterion("PAGEVIEW_IP between", value1, value2, "pageviewIp");
            return (Criteria) this;
        }

        public Criteria andPageviewIpNotBetween(String value1, String value2) {
            addCriterion("PAGEVIEW_IP not between", value1, value2, "pageviewIp");
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