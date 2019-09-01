package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EntityInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public EntityInfoExample() {
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

        public Criteria andEntityCodeIsNull() {
            addCriterion("ENTITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEntityCodeIsNotNull() {
            addCriterion("ENTITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityCodeEqualTo(String value) {
            addCriterion("ENTITY_CODE =", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotEqualTo(String value) {
            addCriterion("ENTITY_CODE <>", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeGreaterThan(String value) {
            addCriterion("ENTITY_CODE >", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_CODE >=", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLessThan(String value) {
            addCriterion("ENTITY_CODE <", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_CODE <=", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLike(String value) {
            addCriterion("ENTITY_CODE like", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotLike(String value) {
            addCriterion("ENTITY_CODE not like", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeIn(List<String> values) {
            addCriterion("ENTITY_CODE in", values, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotIn(List<String> values) {
            addCriterion("ENTITY_CODE not in", values, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeBetween(String value1, String value2) {
            addCriterion("ENTITY_CODE between", value1, value2, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_CODE not between", value1, value2, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityNameIsNull() {
            addCriterion("ENTITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntityNameIsNotNull() {
            addCriterion("ENTITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntityNameEqualTo(String value) {
            addCriterion("ENTITY_NAME =", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotEqualTo(String value) {
            addCriterion("ENTITY_NAME <>", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameGreaterThan(String value) {
            addCriterion("ENTITY_NAME >", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_NAME >=", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLessThan(String value) {
            addCriterion("ENTITY_NAME <", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_NAME <=", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLike(String value) {
            addCriterion("ENTITY_NAME like", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotLike(String value) {
            addCriterion("ENTITY_NAME not like", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameIn(List<String> values) {
            addCriterion("ENTITY_NAME in", values, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotIn(List<String> values) {
            addCriterion("ENTITY_NAME not in", values, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameBetween(String value1, String value2) {
            addCriterion("ENTITY_NAME between", value1, value2, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotBetween(String value1, String value2) {
            addCriterion("ENTITY_NAME not between", value1, value2, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("ENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("ENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(String value) {
            addCriterion("ENTITY_TYPE =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(String value) {
            addCriterion("ENTITY_TYPE <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(String value) {
            addCriterion("ENTITY_TYPE >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_TYPE >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(String value) {
            addCriterion("ENTITY_TYPE <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_TYPE <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLike(String value) {
            addCriterion("ENTITY_TYPE like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotLike(String value) {
            addCriterion("ENTITY_TYPE not like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<String> values) {
            addCriterion("ENTITY_TYPE in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<String> values) {
            addCriterion("ENTITY_TYPE not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(String value1, String value2) {
            addCriterion("ENTITY_TYPE between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_TYPE not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityProIsNull() {
            addCriterion("ENTITY_PRO is null");
            return (Criteria) this;
        }

        public Criteria andEntityProIsNotNull() {
            addCriterion("ENTITY_PRO is not null");
            return (Criteria) this;
        }

        public Criteria andEntityProEqualTo(String value) {
            addCriterion("ENTITY_PRO =", value, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProNotEqualTo(String value) {
            addCriterion("ENTITY_PRO <>", value, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProGreaterThan(String value) {
            addCriterion("ENTITY_PRO >", value, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_PRO >=", value, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProLessThan(String value) {
            addCriterion("ENTITY_PRO <", value, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_PRO <=", value, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProLike(String value) {
            addCriterion("ENTITY_PRO like", value, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProNotLike(String value) {
            addCriterion("ENTITY_PRO not like", value, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProIn(List<String> values) {
            addCriterion("ENTITY_PRO in", values, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProNotIn(List<String> values) {
            addCriterion("ENTITY_PRO not in", values, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProBetween(String value1, String value2) {
            addCriterion("ENTITY_PRO between", value1, value2, "entityPro");
            return (Criteria) this;
        }

        public Criteria andEntityProNotBetween(String value1, String value2) {
            addCriterion("ENTITY_PRO not between", value1, value2, "entityPro");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(String value) {
            addCriterion("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(String value) {
            addCriterion("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(String value) {
            addCriterion("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(String value) {
            addCriterion("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(String value) {
            addCriterion("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLike(String value) {
            addCriterion("CREATEDATE like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotLike(String value) {
            addCriterion("CREATEDATE not like", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<String> values) {
            addCriterion("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<String> values) {
            addCriterion("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(String value1, String value2) {
            addCriterion("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(String value1, String value2) {
            addCriterion("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andOwlCodeIsNull() {
            addCriterion("OWL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOwlCodeIsNotNull() {
            addCriterion("OWL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOwlCodeEqualTo(String value) {
            addCriterion("OWL_CODE =", value, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeNotEqualTo(String value) {
            addCriterion("OWL_CODE <>", value, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeGreaterThan(String value) {
            addCriterion("OWL_CODE >", value, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OWL_CODE >=", value, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeLessThan(String value) {
            addCriterion("OWL_CODE <", value, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeLessThanOrEqualTo(String value) {
            addCriterion("OWL_CODE <=", value, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeLike(String value) {
            addCriterion("OWL_CODE like", value, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeNotLike(String value) {
            addCriterion("OWL_CODE not like", value, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeIn(List<String> values) {
            addCriterion("OWL_CODE in", values, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeNotIn(List<String> values) {
            addCriterion("OWL_CODE not in", values, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeBetween(String value1, String value2) {
            addCriterion("OWL_CODE between", value1, value2, "owlCode");
            return (Criteria) this;
        }

        public Criteria andOwlCodeNotBetween(String value1, String value2) {
            addCriterion("OWL_CODE not between", value1, value2, "owlCode");
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