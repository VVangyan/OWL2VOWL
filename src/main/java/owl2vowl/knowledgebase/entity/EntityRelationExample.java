package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EntityRelationExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public EntityRelationExample() {
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

        public Criteria andEntity1CodeIsNull() {
            addCriterion("ENTITY_1_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeIsNotNull() {
            addCriterion("ENTITY_1_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeEqualTo(String value) {
            addCriterion("ENTITY_1_CODE =", value, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeNotEqualTo(String value) {
            addCriterion("ENTITY_1_CODE <>", value, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeGreaterThan(String value) {
            addCriterion("ENTITY_1_CODE >", value, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_1_CODE >=", value, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeLessThan(String value) {
            addCriterion("ENTITY_1_CODE <", value, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_1_CODE <=", value, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeLike(String value) {
            addCriterion("ENTITY_1_CODE like", value, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeNotLike(String value) {
            addCriterion("ENTITY_1_CODE not like", value, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeIn(List<String> values) {
            addCriterion("ENTITY_1_CODE in", values, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeNotIn(List<String> values) {
            addCriterion("ENTITY_1_CODE not in", values, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeBetween(String value1, String value2) {
            addCriterion("ENTITY_1_CODE between", value1, value2, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity1CodeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_1_CODE not between", value1, value2, "entity1Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeIsNull() {
            addCriterion("ENTITY_2_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeIsNotNull() {
            addCriterion("ENTITY_2_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeEqualTo(String value) {
            addCriterion("ENTITY_2_CODE =", value, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeNotEqualTo(String value) {
            addCriterion("ENTITY_2_CODE <>", value, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeGreaterThan(String value) {
            addCriterion("ENTITY_2_CODE >", value, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_2_CODE >=", value, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeLessThan(String value) {
            addCriterion("ENTITY_2_CODE <", value, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_2_CODE <=", value, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeLike(String value) {
            addCriterion("ENTITY_2_CODE like", value, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeNotLike(String value) {
            addCriterion("ENTITY_2_CODE not like", value, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeIn(List<String> values) {
            addCriterion("ENTITY_2_CODE in", values, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeNotIn(List<String> values) {
            addCriterion("ENTITY_2_CODE not in", values, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeBetween(String value1, String value2) {
            addCriterion("ENTITY_2_CODE between", value1, value2, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity2CodeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_2_CODE not between", value1, value2, "entity2Code");
            return (Criteria) this;
        }

        public Criteria andEntity1NameIsNull() {
            addCriterion("ENTITY_1_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntity1NameIsNotNull() {
            addCriterion("ENTITY_1_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntity1NameEqualTo(String value) {
            addCriterion("ENTITY_1_NAME =", value, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameNotEqualTo(String value) {
            addCriterion("ENTITY_1_NAME <>", value, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameGreaterThan(String value) {
            addCriterion("ENTITY_1_NAME >", value, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_1_NAME >=", value, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameLessThan(String value) {
            addCriterion("ENTITY_1_NAME <", value, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_1_NAME <=", value, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameLike(String value) {
            addCriterion("ENTITY_1_NAME like", value, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameNotLike(String value) {
            addCriterion("ENTITY_1_NAME not like", value, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameIn(List<String> values) {
            addCriterion("ENTITY_1_NAME in", values, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameNotIn(List<String> values) {
            addCriterion("ENTITY_1_NAME not in", values, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameBetween(String value1, String value2) {
            addCriterion("ENTITY_1_NAME between", value1, value2, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity1NameNotBetween(String value1, String value2) {
            addCriterion("ENTITY_1_NAME not between", value1, value2, "entity1Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameIsNull() {
            addCriterion("ENTITY_2_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntity2NameIsNotNull() {
            addCriterion("ENTITY_2_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntity2NameEqualTo(String value) {
            addCriterion("ENTITY_2_NAME =", value, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameNotEqualTo(String value) {
            addCriterion("ENTITY_2_NAME <>", value, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameGreaterThan(String value) {
            addCriterion("ENTITY_2_NAME >", value, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_2_NAME >=", value, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameLessThan(String value) {
            addCriterion("ENTITY_2_NAME <", value, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_2_NAME <=", value, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameLike(String value) {
            addCriterion("ENTITY_2_NAME like", value, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameNotLike(String value) {
            addCriterion("ENTITY_2_NAME not like", value, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameIn(List<String> values) {
            addCriterion("ENTITY_2_NAME in", values, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameNotIn(List<String> values) {
            addCriterion("ENTITY_2_NAME not in", values, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameBetween(String value1, String value2) {
            addCriterion("ENTITY_2_NAME between", value1, value2, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andEntity2NameNotBetween(String value1, String value2) {
            addCriterion("ENTITY_2_NAME not between", value1, value2, "entity2Name");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("RELATION is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("RELATION is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("RELATION =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("RELATION <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("RELATION >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("RELATION <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("RELATION <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("RELATION like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("RELATION not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("RELATION in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("RELATION not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("RELATION between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("RELATION not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIsNull() {
            addCriterion("SYNC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIsNotNull() {
            addCriterion("SYNC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSyncFlagEqualTo(String value) {
            addCriterion("SYNC_FLAG =", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotEqualTo(String value) {
            addCriterion("SYNC_FLAG <>", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagGreaterThan(String value) {
            addCriterion("SYNC_FLAG >", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_FLAG >=", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLessThan(String value) {
            addCriterion("SYNC_FLAG <", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLessThanOrEqualTo(String value) {
            addCriterion("SYNC_FLAG <=", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLike(String value) {
            addCriterion("SYNC_FLAG like", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotLike(String value) {
            addCriterion("SYNC_FLAG not like", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIn(List<String> values) {
            addCriterion("SYNC_FLAG in", values, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotIn(List<String> values) {
            addCriterion("SYNC_FLAG not in", values, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagBetween(String value1, String value2) {
            addCriterion("SYNC_FLAG between", value1, value2, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotBetween(String value1, String value2) {
            addCriterion("SYNC_FLAG not between", value1, value2, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSecretflagIsNull() {
            addCriterion("SECRETFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSecretflagIsNotNull() {
            addCriterion("SECRETFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSecretflagEqualTo(Integer value) {
            addCriterion("SECRETFLAG =", value, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagNotEqualTo(Integer value) {
            addCriterion("SECRETFLAG <>", value, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagGreaterThan(Integer value) {
            addCriterion("SECRETFLAG >", value, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECRETFLAG >=", value, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagLessThan(Integer value) {
            addCriterion("SECRETFLAG <", value, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagLessThanOrEqualTo(Integer value) {
            addCriterion("SECRETFLAG <=", value, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagIn(List<Integer> values) {
            addCriterion("SECRETFLAG in", values, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagNotIn(List<Integer> values) {
            addCriterion("SECRETFLAG not in", values, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagBetween(Integer value1, Integer value2) {
            addCriterion("SECRETFLAG between", value1, value2, "secretflag");
            return (Criteria) this;
        }

        public Criteria andSecretflagNotBetween(Integer value1, Integer value2) {
            addCriterion("SECRETFLAG not between", value1, value2, "secretflag");
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