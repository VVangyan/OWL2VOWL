package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KwDocumentLableExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public KwDocumentLableExample() {
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

        public Criteria andLableIdIsNull() {
            addCriterion("LABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLableIdIsNotNull() {
            addCriterion("LABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLableIdEqualTo(Integer value) {
            addCriterion("LABLE_ID =", value, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdNotEqualTo(Integer value) {
            addCriterion("LABLE_ID <>", value, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdGreaterThan(Integer value) {
            addCriterion("LABLE_ID >", value, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LABLE_ID >=", value, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdLessThan(Integer value) {
            addCriterion("LABLE_ID <", value, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdLessThanOrEqualTo(Integer value) {
            addCriterion("LABLE_ID <=", value, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdIn(List<Integer> values) {
            addCriterion("LABLE_ID in", values, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdNotIn(List<Integer> values) {
            addCriterion("LABLE_ID not in", values, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdBetween(Integer value1, Integer value2) {
            addCriterion("LABLE_ID between", value1, value2, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LABLE_ID not between", value1, value2, "lableId");
            return (Criteria) this;
        }

        public Criteria andLableNameIsNull() {
            addCriterion("LABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLableNameIsNotNull() {
            addCriterion("LABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLableNameEqualTo(String value) {
            addCriterion("LABLE_NAME =", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameNotEqualTo(String value) {
            addCriterion("LABLE_NAME <>", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameGreaterThan(String value) {
            addCriterion("LABLE_NAME >", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameGreaterThanOrEqualTo(String value) {
            addCriterion("LABLE_NAME >=", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameLessThan(String value) {
            addCriterion("LABLE_NAME <", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameLessThanOrEqualTo(String value) {
            addCriterion("LABLE_NAME <=", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameLike(String value) {
            addCriterion("LABLE_NAME like", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameNotLike(String value) {
            addCriterion("LABLE_NAME not like", value, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameIn(List<String> values) {
            addCriterion("LABLE_NAME in", values, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameNotIn(List<String> values) {
            addCriterion("LABLE_NAME not in", values, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameBetween(String value1, String value2) {
            addCriterion("LABLE_NAME between", value1, value2, "lableName");
            return (Criteria) this;
        }

        public Criteria andLableNameNotBetween(String value1, String value2) {
            addCriterion("LABLE_NAME not between", value1, value2, "lableName");
            return (Criteria) this;
        }

        public Criteria andLablePreidIsNull() {
            addCriterion("LABLE_PREID is null");
            return (Criteria) this;
        }

        public Criteria andLablePreidIsNotNull() {
            addCriterion("LABLE_PREID is not null");
            return (Criteria) this;
        }

        public Criteria andLablePreidEqualTo(Integer value) {
            addCriterion("LABLE_PREID =", value, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidNotEqualTo(Integer value) {
            addCriterion("LABLE_PREID <>", value, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidGreaterThan(Integer value) {
            addCriterion("LABLE_PREID >", value, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LABLE_PREID >=", value, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidLessThan(Integer value) {
            addCriterion("LABLE_PREID <", value, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidLessThanOrEqualTo(Integer value) {
            addCriterion("LABLE_PREID <=", value, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidIn(List<Integer> values) {
            addCriterion("LABLE_PREID in", values, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidNotIn(List<Integer> values) {
            addCriterion("LABLE_PREID not in", values, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidBetween(Integer value1, Integer value2) {
            addCriterion("LABLE_PREID between", value1, value2, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLablePreidNotBetween(Integer value1, Integer value2) {
            addCriterion("LABLE_PREID not between", value1, value2, "lablePreid");
            return (Criteria) this;
        }

        public Criteria andLableDescIsNull() {
            addCriterion("LABLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andLableDescIsNotNull() {
            addCriterion("LABLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andLableDescEqualTo(String value) {
            addCriterion("LABLE_DESC =", value, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescNotEqualTo(String value) {
            addCriterion("LABLE_DESC <>", value, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescGreaterThan(String value) {
            addCriterion("LABLE_DESC >", value, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescGreaterThanOrEqualTo(String value) {
            addCriterion("LABLE_DESC >=", value, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescLessThan(String value) {
            addCriterion("LABLE_DESC <", value, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescLessThanOrEqualTo(String value) {
            addCriterion("LABLE_DESC <=", value, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescLike(String value) {
            addCriterion("LABLE_DESC like", value, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescNotLike(String value) {
            addCriterion("LABLE_DESC not like", value, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescIn(List<String> values) {
            addCriterion("LABLE_DESC in", values, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescNotIn(List<String> values) {
            addCriterion("LABLE_DESC not in", values, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescBetween(String value1, String value2) {
            addCriterion("LABLE_DESC between", value1, value2, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDescNotBetween(String value1, String value2) {
            addCriterion("LABLE_DESC not between", value1, value2, "lableDesc");
            return (Criteria) this;
        }

        public Criteria andLableDateIsNull() {
            addCriterion("LABLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLableDateIsNotNull() {
            addCriterion("LABLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLableDateEqualTo(Date value) {
            addCriterionForJDBCDate("LABLE_DATE =", value, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LABLE_DATE <>", value, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LABLE_DATE >", value, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LABLE_DATE >=", value, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateLessThan(Date value) {
            addCriterionForJDBCDate("LABLE_DATE <", value, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LABLE_DATE <=", value, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateIn(List<Date> values) {
            addCriterionForJDBCDate("LABLE_DATE in", values, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LABLE_DATE not in", values, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LABLE_DATE between", value1, value2, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LABLE_DATE not between", value1, value2, "lableDate");
            return (Criteria) this;
        }

        public Criteria andLableSortIsNull() {
            addCriterion("LABLE_SORT is null");
            return (Criteria) this;
        }

        public Criteria andLableSortIsNotNull() {
            addCriterion("LABLE_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andLableSortEqualTo(Integer value) {
            addCriterion("LABLE_SORT =", value, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortNotEqualTo(Integer value) {
            addCriterion("LABLE_SORT <>", value, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortGreaterThan(Integer value) {
            addCriterion("LABLE_SORT >", value, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("LABLE_SORT >=", value, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortLessThan(Integer value) {
            addCriterion("LABLE_SORT <", value, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortLessThanOrEqualTo(Integer value) {
            addCriterion("LABLE_SORT <=", value, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortIn(List<Integer> values) {
            addCriterion("LABLE_SORT in", values, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortNotIn(List<Integer> values) {
            addCriterion("LABLE_SORT not in", values, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortBetween(Integer value1, Integer value2) {
            addCriterion("LABLE_SORT between", value1, value2, "lableSort");
            return (Criteria) this;
        }

        public Criteria andLableSortNotBetween(Integer value1, Integer value2) {
            addCriterion("LABLE_SORT not between", value1, value2, "lableSort");
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