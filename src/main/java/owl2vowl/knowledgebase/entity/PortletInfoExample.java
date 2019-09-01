package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PortletInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public PortletInfoExample() {
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

        public Criteria andPortletIdIsNull() {
            addCriterion("PORTLET_ID is null");
            return (Criteria) this;
        }

        public Criteria andPortletIdIsNotNull() {
            addCriterion("PORTLET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPortletIdEqualTo(Integer value) {
            addCriterion("PORTLET_ID =", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotEqualTo(Integer value) {
            addCriterion("PORTLET_ID <>", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdGreaterThan(Integer value) {
            addCriterion("PORTLET_ID >", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PORTLET_ID >=", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdLessThan(Integer value) {
            addCriterion("PORTLET_ID <", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdLessThanOrEqualTo(Integer value) {
            addCriterion("PORTLET_ID <=", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdIn(List<Integer> values) {
            addCriterion("PORTLET_ID in", values, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotIn(List<Integer> values) {
            addCriterion("PORTLET_ID not in", values, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdBetween(Integer value1, Integer value2) {
            addCriterion("PORTLET_ID between", value1, value2, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PORTLET_ID not between", value1, value2, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletCodeIsNull() {
            addCriterion("PORTLET_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPortletCodeIsNotNull() {
            addCriterion("PORTLET_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPortletCodeEqualTo(String value) {
            addCriterion("PORTLET_CODE =", value, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeNotEqualTo(String value) {
            addCriterion("PORTLET_CODE <>", value, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeGreaterThan(String value) {
            addCriterion("PORTLET_CODE >", value, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PORTLET_CODE >=", value, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeLessThan(String value) {
            addCriterion("PORTLET_CODE <", value, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeLessThanOrEqualTo(String value) {
            addCriterion("PORTLET_CODE <=", value, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeLike(String value) {
            addCriterion("PORTLET_CODE like", value, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeNotLike(String value) {
            addCriterion("PORTLET_CODE not like", value, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeIn(List<String> values) {
            addCriterion("PORTLET_CODE in", values, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeNotIn(List<String> values) {
            addCriterion("PORTLET_CODE not in", values, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeBetween(String value1, String value2) {
            addCriterion("PORTLET_CODE between", value1, value2, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletCodeNotBetween(String value1, String value2) {
            addCriterion("PORTLET_CODE not between", value1, value2, "portletCode");
            return (Criteria) this;
        }

        public Criteria andPortletNameIsNull() {
            addCriterion("PORTLET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPortletNameIsNotNull() {
            addCriterion("PORTLET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPortletNameEqualTo(String value) {
            addCriterion("PORTLET_NAME =", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameNotEqualTo(String value) {
            addCriterion("PORTLET_NAME <>", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameGreaterThan(String value) {
            addCriterion("PORTLET_NAME >", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameGreaterThanOrEqualTo(String value) {
            addCriterion("PORTLET_NAME >=", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameLessThan(String value) {
            addCriterion("PORTLET_NAME <", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameLessThanOrEqualTo(String value) {
            addCriterion("PORTLET_NAME <=", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameLike(String value) {
            addCriterion("PORTLET_NAME like", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameNotLike(String value) {
            addCriterion("PORTLET_NAME not like", value, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameIn(List<String> values) {
            addCriterion("PORTLET_NAME in", values, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameNotIn(List<String> values) {
            addCriterion("PORTLET_NAME not in", values, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameBetween(String value1, String value2) {
            addCriterion("PORTLET_NAME between", value1, value2, "portletName");
            return (Criteria) this;
        }

        public Criteria andPortletNameNotBetween(String value1, String value2) {
            addCriterion("PORTLET_NAME not between", value1, value2, "portletName");
            return (Criteria) this;
        }

        public Criteria andEditFlagIsNull() {
            addCriterion("EDIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEditFlagIsNotNull() {
            addCriterion("EDIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEditFlagEqualTo(String value) {
            addCriterion("EDIT_FLAG =", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotEqualTo(String value) {
            addCriterion("EDIT_FLAG <>", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagGreaterThan(String value) {
            addCriterion("EDIT_FLAG >", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EDIT_FLAG >=", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagLessThan(String value) {
            addCriterion("EDIT_FLAG <", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagLessThanOrEqualTo(String value) {
            addCriterion("EDIT_FLAG <=", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagLike(String value) {
            addCriterion("EDIT_FLAG like", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotLike(String value) {
            addCriterion("EDIT_FLAG not like", value, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagIn(List<String> values) {
            addCriterion("EDIT_FLAG in", values, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotIn(List<String> values) {
            addCriterion("EDIT_FLAG not in", values, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagBetween(String value1, String value2) {
            addCriterion("EDIT_FLAG between", value1, value2, "editFlag");
            return (Criteria) this;
        }

        public Criteria andEditFlagNotBetween(String value1, String value2) {
            addCriterion("EDIT_FLAG not between", value1, value2, "editFlag");
            return (Criteria) this;
        }

        public Criteria andPortlettypeIsNull() {
            addCriterion("PORTLETTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPortlettypeIsNotNull() {
            addCriterion("PORTLETTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPortlettypeEqualTo(String value) {
            addCriterion("PORTLETTYPE =", value, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeNotEqualTo(String value) {
            addCriterion("PORTLETTYPE <>", value, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeGreaterThan(String value) {
            addCriterion("PORTLETTYPE >", value, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeGreaterThanOrEqualTo(String value) {
            addCriterion("PORTLETTYPE >=", value, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeLessThan(String value) {
            addCriterion("PORTLETTYPE <", value, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeLessThanOrEqualTo(String value) {
            addCriterion("PORTLETTYPE <=", value, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeLike(String value) {
            addCriterion("PORTLETTYPE like", value, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeNotLike(String value) {
            addCriterion("PORTLETTYPE not like", value, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeIn(List<String> values) {
            addCriterion("PORTLETTYPE in", values, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeNotIn(List<String> values) {
            addCriterion("PORTLETTYPE not in", values, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeBetween(String value1, String value2) {
            addCriterion("PORTLETTYPE between", value1, value2, "portlettype");
            return (Criteria) this;
        }

        public Criteria andPortlettypeNotBetween(String value1, String value2) {
            addCriterion("PORTLETTYPE not between", value1, value2, "portlettype");
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