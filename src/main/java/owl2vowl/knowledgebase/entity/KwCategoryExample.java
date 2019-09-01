package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class KwCategoryExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public KwCategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_ID not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("CATEGORY_NAME =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("CATEGORY_NAME <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("CATEGORY_NAME >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("CATEGORY_NAME <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("CATEGORY_NAME like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("CATEGORY_NAME not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("CATEGORY_NAME in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("CATEGORY_NAME not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIsNull() {
            addCriterion("CATEGORY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIsNotNull() {
            addCriterion("CATEGORY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescEqualTo(String value) {
            addCriterion("CATEGORY_DESC =", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotEqualTo(String value) {
            addCriterion("CATEGORY_DESC <>", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescGreaterThan(String value) {
            addCriterion("CATEGORY_DESC >", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_DESC >=", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLessThan(String value) {
            addCriterion("CATEGORY_DESC <", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_DESC <=", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLike(String value) {
            addCriterion("CATEGORY_DESC like", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotLike(String value) {
            addCriterion("CATEGORY_DESC not like", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIn(List<String> values) {
            addCriterion("CATEGORY_DESC in", values, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotIn(List<String> values) {
            addCriterion("CATEGORY_DESC not in", values, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescBetween(String value1, String value2) {
            addCriterion("CATEGORY_DESC between", value1, value2, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_DESC not between", value1, value2, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryLftIsNull() {
            addCriterion("CATEGORY_LFT is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLftIsNotNull() {
            addCriterion("CATEGORY_LFT is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLftEqualTo(Integer value) {
            addCriterion("CATEGORY_LFT =", value, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftNotEqualTo(Integer value) {
            addCriterion("CATEGORY_LFT <>", value, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftGreaterThan(Integer value) {
            addCriterion("CATEGORY_LFT >", value, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_LFT >=", value, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftLessThan(Integer value) {
            addCriterion("CATEGORY_LFT <", value, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_LFT <=", value, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftIn(List<Integer> values) {
            addCriterion("CATEGORY_LFT in", values, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftNotIn(List<Integer> values) {
            addCriterion("CATEGORY_LFT not in", values, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_LFT between", value1, value2, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryLftNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_LFT not between", value1, value2, "categoryLft");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtIsNull() {
            addCriterion("CATEGORY_RGT is null");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtIsNotNull() {
            addCriterion("CATEGORY_RGT is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtEqualTo(Integer value) {
            addCriterion("CATEGORY_RGT =", value, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtNotEqualTo(Integer value) {
            addCriterion("CATEGORY_RGT <>", value, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtGreaterThan(Integer value) {
            addCriterion("CATEGORY_RGT >", value, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_RGT >=", value, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtLessThan(Integer value) {
            addCriterion("CATEGORY_RGT <", value, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_RGT <=", value, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtIn(List<Integer> values) {
            addCriterion("CATEGORY_RGT in", values, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtNotIn(List<Integer> values) {
            addCriterion("CATEGORY_RGT not in", values, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_RGT between", value1, value2, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryRgtNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_RGT not between", value1, value2, "categoryRgt");
            return (Criteria) this;
        }

        public Criteria andCategoryDateIsNull() {
            addCriterion("CATEGORY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDateIsNotNull() {
            addCriterion("CATEGORY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDateEqualTo(Date value) {
            addCriterionForJDBCDate("CATEGORY_DATE =", value, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CATEGORY_DATE <>", value, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CATEGORY_DATE >", value, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CATEGORY_DATE >=", value, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateLessThan(Date value) {
            addCriterionForJDBCDate("CATEGORY_DATE <", value, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CATEGORY_DATE <=", value, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateIn(List<Date> values) {
            addCriterionForJDBCDate("CATEGORY_DATE in", values, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CATEGORY_DATE not in", values, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CATEGORY_DATE between", value1, value2, "categoryDate");
            return (Criteria) this;
        }

        public Criteria andCategoryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CATEGORY_DATE not between", value1, value2, "categoryDate");
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