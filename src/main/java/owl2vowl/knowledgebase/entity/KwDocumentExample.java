package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KwDocumentExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;
    
    
    private String userName;

    private String departmentName;
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    

    public KwDocumentExample() {
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

        public Criteria andDocumentTitleIsNull() {
            addCriterion("DOCUMENT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleIsNotNull() {
            addCriterion("DOCUMENT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleEqualTo(String value) {
            addCriterion("DOCUMENT_TITLE =", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleNotEqualTo(String value) {
            addCriterion("DOCUMENT_TITLE <>", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleGreaterThan(String value) {
            addCriterion("DOCUMENT_TITLE >", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TITLE >=", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleLessThan(String value) {
            addCriterion("DOCUMENT_TITLE <", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_TITLE <=", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleLike(String value) {
            addCriterion("DOCUMENT_TITLE like", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleNotLike(String value) {
            addCriterion("DOCUMENT_TITLE not like", value, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleIn(List<String> values) {
            addCriterion("DOCUMENT_TITLE in", values, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleNotIn(List<String> values) {
            addCriterion("DOCUMENT_TITLE not in", values, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TITLE between", value1, value2, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentTitleNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_TITLE not between", value1, value2, "documentTitle");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginIsNull() {
            addCriterion("DOCUMENT_ORIGIN is null");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginIsNotNull() {
            addCriterion("DOCUMENT_ORIGIN is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginEqualTo(String value) {
            addCriterion("DOCUMENT_ORIGIN =", value, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginNotEqualTo(String value) {
            addCriterion("DOCUMENT_ORIGIN <>", value, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginGreaterThan(String value) {
            addCriterion("DOCUMENT_ORIGIN >", value, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_ORIGIN >=", value, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginLessThan(String value) {
            addCriterion("DOCUMENT_ORIGIN <", value, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_ORIGIN <=", value, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginLike(String value) {
            addCriterion("DOCUMENT_ORIGIN like", value, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginNotLike(String value) {
            addCriterion("DOCUMENT_ORIGIN not like", value, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginIn(List<String> values) {
            addCriterion("DOCUMENT_ORIGIN in", values, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginNotIn(List<String> values) {
            addCriterion("DOCUMENT_ORIGIN not in", values, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginBetween(String value1, String value2) {
            addCriterion("DOCUMENT_ORIGIN between", value1, value2, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentOriginNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_ORIGIN not between", value1, value2, "documentOrigin");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorIsNull() {
            addCriterion("DOCUMENT_AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorIsNotNull() {
            addCriterion("DOCUMENT_AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorEqualTo(String value) {
            addCriterion("DOCUMENT_AUTHOR =", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorNotEqualTo(String value) {
            addCriterion("DOCUMENT_AUTHOR <>", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorGreaterThan(String value) {
            addCriterion("DOCUMENT_AUTHOR >", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_AUTHOR >=", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorLessThan(String value) {
            addCriterion("DOCUMENT_AUTHOR <", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_AUTHOR <=", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorLike(String value) {
            addCriterion("DOCUMENT_AUTHOR like", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorNotLike(String value) {
            addCriterion("DOCUMENT_AUTHOR not like", value, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorIn(List<String> values) {
            addCriterion("DOCUMENT_AUTHOR in", values, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorNotIn(List<String> values) {
            addCriterion("DOCUMENT_AUTHOR not in", values, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorBetween(String value1, String value2) {
            addCriterion("DOCUMENT_AUTHOR between", value1, value2, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentAuthorNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_AUTHOR not between", value1, value2, "documentAuthor");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateIsNull() {
            addCriterion("DOCUMENT_UPLOAD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateIsNotNull() {
            addCriterion("DOCUMENT_UPLOAD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateEqualTo(Date value) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE =", value, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE <>", value, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE >", value, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE >=", value, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateLessThan(Date value) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE <", value, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE <=", value, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateIn(List<Date> values) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE in", values, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE not in", values, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE between", value1, value2, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentUploadDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DOCUMENT_UPLOAD_DATE not between", value1, value2, "documentUploadDate");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractIsNull() {
            addCriterion("DOCUMENT_ABSTRACT is null");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractIsNotNull() {
            addCriterion("DOCUMENT_ABSTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractEqualTo(String value) {
            addCriterion("DOCUMENT_ABSTRACT =", value, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractNotEqualTo(String value) {
            addCriterion("DOCUMENT_ABSTRACT <>", value, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractGreaterThan(String value) {
            addCriterion("DOCUMENT_ABSTRACT >", value, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_ABSTRACT >=", value, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractLessThan(String value) {
            addCriterion("DOCUMENT_ABSTRACT <", value, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_ABSTRACT <=", value, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractLike(String value) {
            addCriterion("DOCUMENT_ABSTRACT like", value, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractNotLike(String value) {
            addCriterion("DOCUMENT_ABSTRACT not like", value, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractIn(List<String> values) {
            addCriterion("DOCUMENT_ABSTRACT in", values, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractNotIn(List<String> values) {
            addCriterion("DOCUMENT_ABSTRACT not in", values, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractBetween(String value1, String value2) {
            addCriterion("DOCUMENT_ABSTRACT between", value1, value2, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentAbstractNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_ABSTRACT not between", value1, value2, "documentAbstract");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordIsNull() {
            addCriterion("DOCUMENT_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordIsNotNull() {
            addCriterion("DOCUMENT_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordEqualTo(String value) {
            addCriterion("DOCUMENT_KEYWORD =", value, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordNotEqualTo(String value) {
            addCriterion("DOCUMENT_KEYWORD <>", value, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordGreaterThan(String value) {
            addCriterion("DOCUMENT_KEYWORD >", value, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_KEYWORD >=", value, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordLessThan(String value) {
            addCriterion("DOCUMENT_KEYWORD <", value, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_KEYWORD <=", value, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordLike(String value) {
            addCriterion("DOCUMENT_KEYWORD like", value, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordNotLike(String value) {
            addCriterion("DOCUMENT_KEYWORD not like", value, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordIn(List<String> values) {
            addCriterion("DOCUMENT_KEYWORD in", values, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordNotIn(List<String> values) {
            addCriterion("DOCUMENT_KEYWORD not in", values, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordBetween(String value1, String value2) {
            addCriterion("DOCUMENT_KEYWORD between", value1, value2, "documentKeyword");
            return (Criteria) this;
        }

        public Criteria andDocumentKeywordNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_KEYWORD not between", value1, value2, "documentKeyword");
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

        public Criteria andDocumentSizeIsNull() {
            addCriterion("DOCUMENT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeIsNotNull() {
            addCriterion("DOCUMENT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeEqualTo(Integer value) {
            addCriterion("DOCUMENT_SIZE =", value, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeNotEqualTo(Integer value) {
            addCriterion("DOCUMENT_SIZE <>", value, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeGreaterThan(Integer value) {
            addCriterion("DOCUMENT_SIZE >", value, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_SIZE >=", value, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeLessThan(Integer value) {
            addCriterion("DOCUMENT_SIZE <", value, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeLessThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_SIZE <=", value, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeIn(List<Integer> values) {
            addCriterion("DOCUMENT_SIZE in", values, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeNotIn(List<Integer> values) {
            addCriterion("DOCUMENT_SIZE not in", values, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_SIZE between", value1, value2, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_SIZE not between", value1, value2, "documentSize");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksIsNull() {
            addCriterion("DOCUMENT_MARKS is null");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksIsNotNull() {
            addCriterion("DOCUMENT_MARKS is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksEqualTo(String value) {
            addCriterion("DOCUMENT_MARKS =", value, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksNotEqualTo(String value) {
            addCriterion("DOCUMENT_MARKS <>", value, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksGreaterThan(String value) {
            addCriterion("DOCUMENT_MARKS >", value, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_MARKS >=", value, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksLessThan(String value) {
            addCriterion("DOCUMENT_MARKS <", value, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_MARKS <=", value, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksLike(String value) {
            addCriterion("DOCUMENT_MARKS like", value, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksNotLike(String value) {
            addCriterion("DOCUMENT_MARKS not like", value, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksIn(List<String> values) {
            addCriterion("DOCUMENT_MARKS in", values, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksNotIn(List<String> values) {
            addCriterion("DOCUMENT_MARKS not in", values, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksBetween(String value1, String value2) {
            addCriterion("DOCUMENT_MARKS between", value1, value2, "documentMarks");
            return (Criteria) this;
        }

        public Criteria andDocumentMarksNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_MARKS not between", value1, value2, "documentMarks");
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

        public Criteria andDocumentSaveurlIsNull() {
            addCriterion("DOCUMENT_SAVEURL is null");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlIsNotNull() {
            addCriterion("DOCUMENT_SAVEURL is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlEqualTo(String value) {
            addCriterion("DOCUMENT_SAVEURL =", value, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlNotEqualTo(String value) {
            addCriterion("DOCUMENT_SAVEURL <>", value, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlGreaterThan(String value) {
            addCriterion("DOCUMENT_SAVEURL >", value, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_SAVEURL >=", value, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlLessThan(String value) {
            addCriterion("DOCUMENT_SAVEURL <", value, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENT_SAVEURL <=", value, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlLike(String value) {
            addCriterion("DOCUMENT_SAVEURL like", value, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlNotLike(String value) {
            addCriterion("DOCUMENT_SAVEURL not like", value, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlIn(List<String> values) {
            addCriterion("DOCUMENT_SAVEURL in", values, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlNotIn(List<String> values) {
            addCriterion("DOCUMENT_SAVEURL not in", values, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlBetween(String value1, String value2) {
            addCriterion("DOCUMENT_SAVEURL between", value1, value2, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentSaveurlNotBetween(String value1, String value2) {
            addCriterion("DOCUMENT_SAVEURL not between", value1, value2, "documentSaveurl");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryIsNull() {
            addCriterion("DOCUMENT_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryIsNotNull() {
            addCriterion("DOCUMENT_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryEqualTo(Integer value) {
            addCriterion("DOCUMENT_CATEGORY =", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryNotEqualTo(Integer value) {
            addCriterion("DOCUMENT_CATEGORY <>", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryGreaterThan(Integer value) {
            addCriterion("DOCUMENT_CATEGORY >", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_CATEGORY >=", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryLessThan(Integer value) {
            addCriterion("DOCUMENT_CATEGORY <", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_CATEGORY <=", value, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryIn(List<Integer> values) {
            addCriterion("DOCUMENT_CATEGORY in", values, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryNotIn(List<Integer> values) {
            addCriterion("DOCUMENT_CATEGORY not in", values, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_CATEGORY between", value1, value2, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_CATEGORY not between", value1, value2, "documentCategory");
            return (Criteria) this;
        }

        public Criteria andDocumentLableIsNull() {
            addCriterion("DOCUMENT_LABLE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentLableIsNotNull() {
            addCriterion("DOCUMENT_LABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentLableEqualTo(Integer value) {
            addCriterion("DOCUMENT_LABLE =", value, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableNotEqualTo(Integer value) {
            addCriterion("DOCUMENT_LABLE <>", value, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableGreaterThan(Integer value) {
            addCriterion("DOCUMENT_LABLE >", value, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_LABLE >=", value, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableLessThan(Integer value) {
            addCriterion("DOCUMENT_LABLE <", value, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableLessThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_LABLE <=", value, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableIn(List<Integer> values) {
            addCriterion("DOCUMENT_LABLE in", values, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableNotIn(List<Integer> values) {
            addCriterion("DOCUMENT_LABLE not in", values, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_LABLE between", value1, value2, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentLableNotBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_LABLE not between", value1, value2, "documentLable");
            return (Criteria) this;
        }

        public Criteria andDocumentStateIsNull() {
            addCriterion("DOCUMENT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDocumentStateIsNotNull() {
            addCriterion("DOCUMENT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentStateEqualTo(Integer value) {
            addCriterion("DOCUMENT_STATE =", value, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateNotEqualTo(Integer value) {
            addCriterion("DOCUMENT_STATE <>", value, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateGreaterThan(Integer value) {
            addCriterion("DOCUMENT_STATE >", value, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_STATE >=", value, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateLessThan(Integer value) {
            addCriterion("DOCUMENT_STATE <", value, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateLessThanOrEqualTo(Integer value) {
            addCriterion("DOCUMENT_STATE <=", value, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateIn(List<Integer> values) {
            addCriterion("DOCUMENT_STATE in", values, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateNotIn(List<Integer> values) {
            addCriterion("DOCUMENT_STATE not in", values, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_STATE between", value1, value2, "documentState");
            return (Criteria) this;
        }

        public Criteria andDocumentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("DOCUMENT_STATE not between", value1, value2, "documentState");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("DEPARTMENT_NAME >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("DEPARTMENT_NAME <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("DEPARTMENT_NAME like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("DEPARTMENT_NAME not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME not between", value1, value2, "departmentName");
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