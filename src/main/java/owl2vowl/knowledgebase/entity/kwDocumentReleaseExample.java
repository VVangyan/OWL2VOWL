package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class kwDocumentReleaseExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public kwDocumentReleaseExample() {
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

        public Criteria andReleaseIdIsNull() {
            addCriterion("RELEASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReleaseIdIsNotNull() {
            addCriterion("RELEASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseIdEqualTo(Integer value) {
            addCriterion("RELEASE_ID =", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotEqualTo(Integer value) {
            addCriterion("RELEASE_ID <>", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdGreaterThan(Integer value) {
            addCriterion("RELEASE_ID >", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RELEASE_ID >=", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdLessThan(Integer value) {
            addCriterion("RELEASE_ID <", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("RELEASE_ID <=", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdIn(List<Integer> values) {
            addCriterion("RELEASE_ID in", values, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotIn(List<Integer> values) {
            addCriterion("RELEASE_ID not in", values, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdBetween(Integer value1, Integer value2) {
            addCriterion("RELEASE_ID between", value1, value2, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RELEASE_ID not between", value1, value2, "releaseId");
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

        public Criteria andReleaseFromUseridIsNull() {
            addCriterion("RELEASE_FROM_USERID is null");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridIsNotNull() {
            addCriterion("RELEASE_FROM_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridEqualTo(String value) {
            addCriterion("RELEASE_FROM_USERID =", value, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridNotEqualTo(String value) {
            addCriterion("RELEASE_FROM_USERID <>", value, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridGreaterThan(String value) {
            addCriterion("RELEASE_FROM_USERID >", value, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE_FROM_USERID >=", value, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridLessThan(String value) {
            addCriterion("RELEASE_FROM_USERID <", value, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridLessThanOrEqualTo(String value) {
            addCriterion("RELEASE_FROM_USERID <=", value, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridLike(String value) {
            addCriterion("RELEASE_FROM_USERID like", value, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridNotLike(String value) {
            addCriterion("RELEASE_FROM_USERID not like", value, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridIn(List<String> values) {
            addCriterion("RELEASE_FROM_USERID in", values, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridNotIn(List<String> values) {
            addCriterion("RELEASE_FROM_USERID not in", values, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridBetween(String value1, String value2) {
            addCriterion("RELEASE_FROM_USERID between", value1, value2, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUseridNotBetween(String value1, String value2) {
            addCriterion("RELEASE_FROM_USERID not between", value1, value2, "releaseFromUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameIsNull() {
            addCriterion("RELEASE_FROM_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameIsNotNull() {
            addCriterion("RELEASE_FROM_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameEqualTo(String value) {
            addCriterion("RELEASE_FROM_USERNAME =", value, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameNotEqualTo(String value) {
            addCriterion("RELEASE_FROM_USERNAME <>", value, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameGreaterThan(String value) {
            addCriterion("RELEASE_FROM_USERNAME >", value, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE_FROM_USERNAME >=", value, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameLessThan(String value) {
            addCriterion("RELEASE_FROM_USERNAME <", value, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameLessThanOrEqualTo(String value) {
            addCriterion("RELEASE_FROM_USERNAME <=", value, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameLike(String value) {
            addCriterion("RELEASE_FROM_USERNAME like", value, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameNotLike(String value) {
            addCriterion("RELEASE_FROM_USERNAME not like", value, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameIn(List<String> values) {
            addCriterion("RELEASE_FROM_USERNAME in", values, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameNotIn(List<String> values) {
            addCriterion("RELEASE_FROM_USERNAME not in", values, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameBetween(String value1, String value2) {
            addCriterion("RELEASE_FROM_USERNAME between", value1, value2, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseFromUsernameNotBetween(String value1, String value2) {
            addCriterion("RELEASE_FROM_USERNAME not between", value1, value2, "releaseFromUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidIsNull() {
            addCriterion("RELEASE_TO_DETPID is null");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidIsNotNull() {
            addCriterion("RELEASE_TO_DETPID is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidEqualTo(String value) {
            addCriterion("RELEASE_TO_DETPID =", value, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidNotEqualTo(String value) {
            addCriterion("RELEASE_TO_DETPID <>", value, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidGreaterThan(String value) {
            addCriterion("RELEASE_TO_DETPID >", value, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE_TO_DETPID >=", value, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidLessThan(String value) {
            addCriterion("RELEASE_TO_DETPID <", value, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidLessThanOrEqualTo(String value) {
            addCriterion("RELEASE_TO_DETPID <=", value, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidLike(String value) {
            addCriterion("RELEASE_TO_DETPID like", value, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidNotLike(String value) {
            addCriterion("RELEASE_TO_DETPID not like", value, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidIn(List<String> values) {
            addCriterion("RELEASE_TO_DETPID in", values, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidNotIn(List<String> values) {
            addCriterion("RELEASE_TO_DETPID not in", values, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidBetween(String value1, String value2) {
            addCriterion("RELEASE_TO_DETPID between", value1, value2, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseToDetpidNotBetween(String value1, String value2) {
            addCriterion("RELEASE_TO_DETPID not between", value1, value2, "releaseToDetpid");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameIsNull() {
            addCriterion("RELEASE_DETPNAME is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameIsNotNull() {
            addCriterion("RELEASE_DETPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameEqualTo(String value) {
            addCriterion("RELEASE_DETPNAME =", value, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameNotEqualTo(String value) {
            addCriterion("RELEASE_DETPNAME <>", value, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameGreaterThan(String value) {
            addCriterion("RELEASE_DETPNAME >", value, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE_DETPNAME >=", value, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameLessThan(String value) {
            addCriterion("RELEASE_DETPNAME <", value, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameLessThanOrEqualTo(String value) {
            addCriterion("RELEASE_DETPNAME <=", value, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameLike(String value) {
            addCriterion("RELEASE_DETPNAME like", value, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameNotLike(String value) {
            addCriterion("RELEASE_DETPNAME not like", value, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameIn(List<String> values) {
            addCriterion("RELEASE_DETPNAME in", values, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameNotIn(List<String> values) {
            addCriterion("RELEASE_DETPNAME not in", values, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameBetween(String value1, String value2) {
            addCriterion("RELEASE_DETPNAME between", value1, value2, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseDetpnameNotBetween(String value1, String value2) {
            addCriterion("RELEASE_DETPNAME not between", value1, value2, "releaseDetpname");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridIsNull() {
            addCriterion("RELEASE_TO_USERID is null");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridIsNotNull() {
            addCriterion("RELEASE_TO_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridEqualTo(String value) {
            addCriterion("RELEASE_TO_USERID =", value, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridNotEqualTo(String value) {
            addCriterion("RELEASE_TO_USERID <>", value, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridGreaterThan(String value) {
            addCriterion("RELEASE_TO_USERID >", value, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE_TO_USERID >=", value, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridLessThan(String value) {
            addCriterion("RELEASE_TO_USERID <", value, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridLessThanOrEqualTo(String value) {
            addCriterion("RELEASE_TO_USERID <=", value, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridLike(String value) {
            addCriterion("RELEASE_TO_USERID like", value, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridNotLike(String value) {
            addCriterion("RELEASE_TO_USERID not like", value, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridIn(List<String> values) {
            addCriterion("RELEASE_TO_USERID in", values, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridNotIn(List<String> values) {
            addCriterion("RELEASE_TO_USERID not in", values, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridBetween(String value1, String value2) {
            addCriterion("RELEASE_TO_USERID between", value1, value2, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUseridNotBetween(String value1, String value2) {
            addCriterion("RELEASE_TO_USERID not between", value1, value2, "releaseToUserid");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameIsNull() {
            addCriterion("RELEASE_TO_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameIsNotNull() {
            addCriterion("RELEASE_TO_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameEqualTo(String value) {
            addCriterion("RELEASE_TO_USERNAME =", value, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameNotEqualTo(String value) {
            addCriterion("RELEASE_TO_USERNAME <>", value, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameGreaterThan(String value) {
            addCriterion("RELEASE_TO_USERNAME >", value, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE_TO_USERNAME >=", value, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameLessThan(String value) {
            addCriterion("RELEASE_TO_USERNAME <", value, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameLessThanOrEqualTo(String value) {
            addCriterion("RELEASE_TO_USERNAME <=", value, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameLike(String value) {
            addCriterion("RELEASE_TO_USERNAME like", value, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameNotLike(String value) {
            addCriterion("RELEASE_TO_USERNAME not like", value, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameIn(List<String> values) {
            addCriterion("RELEASE_TO_USERNAME in", values, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameNotIn(List<String> values) {
            addCriterion("RELEASE_TO_USERNAME not in", values, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameBetween(String value1, String value2) {
            addCriterion("RELEASE_TO_USERNAME between", value1, value2, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseToUsernameNotBetween(String value1, String value2) {
            addCriterion("RELEASE_TO_USERNAME not between", value1, value2, "releaseToUsername");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("RELEASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("RELEASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("RELEASE_DATE =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RELEASE_DATE <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RELEASE_DATE >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RELEASE_DATE >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("RELEASE_DATE <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RELEASE_DATE <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("RELEASE_DATE in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RELEASE_DATE not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RELEASE_DATE between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RELEASE_DATE not between", value1, value2, "releaseDate");
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