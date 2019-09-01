package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KwFileLogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public KwFileLogExample() {
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

        public Criteria andFiledIdIsNull() {
            addCriterion("FILED_ID is null");
            return (Criteria) this;
        }

        public Criteria andFiledIdIsNotNull() {
            addCriterion("FILED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFiledIdEqualTo(Integer value) {
            addCriterion("FILED_ID =", value, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdNotEqualTo(Integer value) {
            addCriterion("FILED_ID <>", value, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdGreaterThan(Integer value) {
            addCriterion("FILED_ID >", value, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FILED_ID >=", value, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdLessThan(Integer value) {
            addCriterion("FILED_ID <", value, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdLessThanOrEqualTo(Integer value) {
            addCriterion("FILED_ID <=", value, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdIn(List<Integer> values) {
            addCriterion("FILED_ID in", values, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdNotIn(List<Integer> values) {
            addCriterion("FILED_ID not in", values, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdBetween(Integer value1, Integer value2) {
            addCriterion("FILED_ID between", value1, value2, "filedId");
            return (Criteria) this;
        }

        public Criteria andFiledIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FILED_ID not between", value1, value2, "filedId");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPLOAD_TIME <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPLOAD_TIME in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPLOAD_TIME not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPLOAD_TIME between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPLOAD_TIME not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("SIZE is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Double value) {
            addCriterion("SIZE =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Double value) {
            addCriterion("SIZE <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Double value) {
            addCriterion("SIZE >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("SIZE >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Double value) {
            addCriterion("SIZE <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Double value) {
            addCriterion("SIZE <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Double> values) {
            addCriterion("SIZE in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Double> values) {
            addCriterion("SIZE not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Double value1, Double value2) {
            addCriterion("SIZE between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Double value1, Double value2) {
            addCriterion("SIZE not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andUploadUserIsNull() {
            addCriterion("UPLOAD_USER is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIsNotNull() {
            addCriterion("UPLOAD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserEqualTo(String value) {
            addCriterion("UPLOAD_USER =", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotEqualTo(String value) {
            addCriterion("UPLOAD_USER <>", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserGreaterThan(String value) {
            addCriterion("UPLOAD_USER >", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_USER >=", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserLessThan(String value) {
            addCriterion("UPLOAD_USER <", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_USER <=", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserLike(String value) {
            addCriterion("UPLOAD_USER like", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotLike(String value) {
            addCriterion("UPLOAD_USER not like", value, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserIn(List<String> values) {
            addCriterion("UPLOAD_USER in", values, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotIn(List<String> values) {
            addCriterion("UPLOAD_USER not in", values, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserBetween(String value1, String value2) {
            addCriterion("UPLOAD_USER between", value1, value2, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUserNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_USER not between", value1, value2, "uploadUser");
            return (Criteria) this;
        }

        public Criteria andUploadUseridIsNull() {
            addCriterion("UPLOAD_USERID is null");
            return (Criteria) this;
        }

        public Criteria andUploadUseridIsNotNull() {
            addCriterion("UPLOAD_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUseridEqualTo(String value) {
            addCriterion("UPLOAD_USERID =", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridNotEqualTo(String value) {
            addCriterion("UPLOAD_USERID <>", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridGreaterThan(String value) {
            addCriterion("UPLOAD_USERID >", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_USERID >=", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridLessThan(String value) {
            addCriterion("UPLOAD_USERID <", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_USERID <=", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridLike(String value) {
            addCriterion("UPLOAD_USERID like", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridNotLike(String value) {
            addCriterion("UPLOAD_USERID not like", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridIn(List<String> values) {
            addCriterion("UPLOAD_USERID in", values, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridNotIn(List<String> values) {
            addCriterion("UPLOAD_USERID not in", values, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridBetween(String value1, String value2) {
            addCriterion("UPLOAD_USERID between", value1, value2, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_USERID not between", value1, value2, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andSaveurlIsNull() {
            addCriterion("SAVEURL is null");
            return (Criteria) this;
        }

        public Criteria andSaveurlIsNotNull() {
            addCriterion("SAVEURL is not null");
            return (Criteria) this;
        }

        public Criteria andSaveurlEqualTo(String value) {
            addCriterion("SAVEURL =", value, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlNotEqualTo(String value) {
            addCriterion("SAVEURL <>", value, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlGreaterThan(String value) {
            addCriterion("SAVEURL >", value, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlGreaterThanOrEqualTo(String value) {
            addCriterion("SAVEURL >=", value, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlLessThan(String value) {
            addCriterion("SAVEURL <", value, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlLessThanOrEqualTo(String value) {
            addCriterion("SAVEURL <=", value, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlLike(String value) {
            addCriterion("SAVEURL like", value, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlNotLike(String value) {
            addCriterion("SAVEURL not like", value, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlIn(List<String> values) {
            addCriterion("SAVEURL in", values, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlNotIn(List<String> values) {
            addCriterion("SAVEURL not in", values, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlBetween(String value1, String value2) {
            addCriterion("SAVEURL between", value1, value2, "saveurl");
            return (Criteria) this;
        }

        public Criteria andSaveurlNotBetween(String value1, String value2) {
            addCriterion("SAVEURL not between", value1, value2, "saveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNull() {
            addCriterion("DOCUMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNotNull() {
            addCriterion("DOCUMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE =", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE <>", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThan(String value) {
            addCriterion("DOCUMENT_TYPE >", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE >=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThan(String value) {
            addCriterion("DOCUMENT_TYPE <", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TYPE <=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLike(String value) {
            addCriterion("DOCUMENT_TYPE like", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotLike(String value) {
            addCriterion("DOCUMENT_TYPE not like", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIn(List<String> values) {
            addCriterion("DOCUMENT_TYPE in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotIn(List<String> values) {
            addCriterion("DOCUMENT_TYPE not in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TYPE between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TYPE not between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdIsNull() {
            addCriterion("DOUCMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdIsNotNull() {
            addCriterion("DOUCMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdEqualTo(Integer value) {
            addCriterion("DOUCMENT_ID =", value, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdNotEqualTo(Integer value) {
            addCriterion("DOUCMENT_ID <>", value, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdGreaterThan(Integer value) {
            addCriterion("DOUCMENT_ID >", value, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOUCMENT_ID >=", value, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdLessThan(Integer value) {
            addCriterion("DOUCMENT_ID <", value, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("DOUCMENT_ID <=", value, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdIn(List<Integer> values) {
            addCriterion("DOUCMENT_ID in", values, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdNotIn(List<Integer> values) {
            addCriterion("DOUCMENT_ID not in", values, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdBetween(Integer value1, Integer value2) {
            addCriterion("DOUCMENT_ID between", value1, value2, "doucmentId");
            return (Criteria) this;
        }

        public Criteria andDoucmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DOUCMENT_ID not between", value1, value2, "doucmentId");
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