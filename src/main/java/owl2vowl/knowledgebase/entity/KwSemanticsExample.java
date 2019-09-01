package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class KwSemanticsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public KwSemanticsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeIsNull() {
            addCriterion("Semantics_Code is null");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeIsNotNull() {
            addCriterion("Semantics_Code is not null");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeEqualTo(String value) {
            addCriterion("Semantics_Code =", value, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeNotEqualTo(String value) {
            addCriterion("Semantics_Code <>", value, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeGreaterThan(String value) {
            addCriterion("Semantics_Code >", value, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Semantics_Code >=", value, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeLessThan(String value) {
            addCriterion("Semantics_Code <", value, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeLessThanOrEqualTo(String value) {
            addCriterion("Semantics_Code <=", value, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeLike(String value) {
            addCriterion("Semantics_Code like", value, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeNotLike(String value) {
            addCriterion("Semantics_Code not like", value, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeIn(List<String> values) {
            addCriterion("Semantics_Code in", values, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeNotIn(List<String> values) {
            addCriterion("Semantics_Code not in", values, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeBetween(String value1, String value2) {
            addCriterion("Semantics_Code between", value1, value2, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsCodeNotBetween(String value1, String value2) {
            addCriterion("Semantics_Code not between", value1, value2, "semanticsCode");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameIsNull() {
            addCriterion("Semantics_Name is null");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameIsNotNull() {
            addCriterion("Semantics_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameEqualTo(String value) {
            addCriterion("Semantics_Name =", value, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameNotEqualTo(String value) {
            addCriterion("Semantics_Name <>", value, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameGreaterThan(String value) {
            addCriterion("Semantics_Name >", value, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameGreaterThanOrEqualTo(String value) {
            addCriterion("Semantics_Name >=", value, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameLessThan(String value) {
            addCriterion("Semantics_Name <", value, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameLessThanOrEqualTo(String value) {
            addCriterion("Semantics_Name <=", value, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameLike(String value) {
            addCriterion("Semantics_Name like", value, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameNotLike(String value) {
            addCriterion("Semantics_Name not like", value, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameIn(List<String> values) {
            addCriterion("Semantics_Name in", values, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameNotIn(List<String> values) {
            addCriterion("Semantics_Name not in", values, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameBetween(String value1, String value2) {
            addCriterion("Semantics_Name between", value1, value2, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andSemanticsNameNotBetween(String value1, String value2) {
            addCriterion("Semantics_Name not between", value1, value2, "semanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("Relation_Type is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("Relation_Type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(String value) {
            addCriterion("Relation_Type =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(String value) {
            addCriterion("Relation_Type <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(String value) {
            addCriterion("Relation_Type >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Relation_Type >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(String value) {
            addCriterion("Relation_Type <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(String value) {
            addCriterion("Relation_Type <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLike(String value) {
            addCriterion("Relation_Type like", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotLike(String value) {
            addCriterion("Relation_Type not like", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<String> values) {
            addCriterion("Relation_Type in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<String> values) {
            addCriterion("Relation_Type not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(String value1, String value2) {
            addCriterion("Relation_Type between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(String value1, String value2) {
            addCriterion("Relation_Type not between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeIsNull() {
            addCriterion("Relation_Semantics_Code is null");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeIsNotNull() {
            addCriterion("Relation_Semantics_Code is not null");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeEqualTo(String value) {
            addCriterion("Relation_Semantics_Code =", value, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeNotEqualTo(String value) {
            addCriterion("Relation_Semantics_Code <>", value, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeGreaterThan(String value) {
            addCriterion("Relation_Semantics_Code >", value, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Relation_Semantics_Code >=", value, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeLessThan(String value) {
            addCriterion("Relation_Semantics_Code <", value, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeLessThanOrEqualTo(String value) {
            addCriterion("Relation_Semantics_Code <=", value, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeLike(String value) {
            addCriterion("Relation_Semantics_Code like", value, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeNotLike(String value) {
            addCriterion("Relation_Semantics_Code not like", value, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeIn(List<String> values) {
            addCriterion("Relation_Semantics_Code in", values, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeNotIn(List<String> values) {
            addCriterion("Relation_Semantics_Code not in", values, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeBetween(String value1, String value2) {
            addCriterion("Relation_Semantics_Code between", value1, value2, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsCodeNotBetween(String value1, String value2) {
            addCriterion("Relation_Semantics_Code not between", value1, value2, "relationSemanticsCode");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameIsNull() {
            addCriterion("Relation_Semantics_Name is null");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameIsNotNull() {
            addCriterion("Relation_Semantics_Name is not null");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameEqualTo(String value) {
            addCriterion("Relation_Semantics_Name =", value, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameNotEqualTo(String value) {
            addCriterion("Relation_Semantics_Name <>", value, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameGreaterThan(String value) {
            addCriterion("Relation_Semantics_Name >", value, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameGreaterThanOrEqualTo(String value) {
            addCriterion("Relation_Semantics_Name >=", value, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameLessThan(String value) {
            addCriterion("Relation_Semantics_Name <", value, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameLessThanOrEqualTo(String value) {
            addCriterion("Relation_Semantics_Name <=", value, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameLike(String value) {
            addCriterion("Relation_Semantics_Name like", value, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameNotLike(String value) {
            addCriterion("Relation_Semantics_Name not like", value, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameIn(List<String> values) {
            addCriterion("Relation_Semantics_Name in", values, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameNotIn(List<String> values) {
            addCriterion("Relation_Semantics_Name not in", values, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameBetween(String value1, String value2) {
            addCriterion("Relation_Semantics_Name between", value1, value2, "relationSemanticsName");
            return (Criteria) this;
        }

        public Criteria andRelationSemanticsNameNotBetween(String value1, String value2) {
            addCriterion("Relation_Semantics_Name not between", value1, value2, "relationSemanticsName");
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