package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PortletComponentInfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public PortletComponentInfoExample() {
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

        public Criteria andPcIdIsNull() {
            addCriterion("PC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcIdIsNotNull() {
            addCriterion("PC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcIdEqualTo(Integer value) {
            addCriterion("PC_ID =", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotEqualTo(Integer value) {
            addCriterion("PC_ID <>", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThan(Integer value) {
            addCriterion("PC_ID >", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PC_ID >=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThan(Integer value) {
            addCriterion("PC_ID <", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdLessThanOrEqualTo(Integer value) {
            addCriterion("PC_ID <=", value, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdIn(List<Integer> values) {
            addCriterion("PC_ID in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotIn(List<Integer> values) {
            addCriterion("PC_ID not in", values, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdBetween(Integer value1, Integer value2) {
            addCriterion("PC_ID between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PC_ID not between", value1, value2, "pcId");
            return (Criteria) this;
        }

        public Criteria andPortletIdIsNull() {
            addCriterion("PORTLET_ID is null");
            return (Criteria) this;
        }

        public Criteria andPortletIdIsNotNull() {
            addCriterion("PORTLET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPortletIdEqualTo(String value) {
            addCriterion("PORTLET_ID =", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotEqualTo(String value) {
            addCriterion("PORTLET_ID <>", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdGreaterThan(String value) {
            addCriterion("PORTLET_ID >", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdGreaterThanOrEqualTo(String value) {
            addCriterion("PORTLET_ID >=", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdLessThan(String value) {
            addCriterion("PORTLET_ID <", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdLessThanOrEqualTo(String value) {
            addCriterion("PORTLET_ID <=", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdLike(String value) {
            addCriterion("PORTLET_ID like", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotLike(String value) {
            addCriterion("PORTLET_ID not like", value, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdIn(List<String> values) {
            addCriterion("PORTLET_ID in", values, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotIn(List<String> values) {
            addCriterion("PORTLET_ID not in", values, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdBetween(String value1, String value2) {
            addCriterion("PORTLET_ID between", value1, value2, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletIdNotBetween(String value1, String value2) {
            addCriterion("PORTLET_ID not between", value1, value2, "portletId");
            return (Criteria) this;
        }

        public Criteria andPortletTitleIsNull() {
            addCriterion("PORTLET_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPortletTitleIsNotNull() {
            addCriterion("PORTLET_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPortletTitleEqualTo(String value) {
            addCriterion("PORTLET_TITLE =", value, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleNotEqualTo(String value) {
            addCriterion("PORTLET_TITLE <>", value, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleGreaterThan(String value) {
            addCriterion("PORTLET_TITLE >", value, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PORTLET_TITLE >=", value, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleLessThan(String value) {
            addCriterion("PORTLET_TITLE <", value, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleLessThanOrEqualTo(String value) {
            addCriterion("PORTLET_TITLE <=", value, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleLike(String value) {
            addCriterion("PORTLET_TITLE like", value, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleNotLike(String value) {
            addCriterion("PORTLET_TITLE not like", value, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleIn(List<String> values) {
            addCriterion("PORTLET_TITLE in", values, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleNotIn(List<String> values) {
            addCriterion("PORTLET_TITLE not in", values, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleBetween(String value1, String value2) {
            addCriterion("PORTLET_TITLE between", value1, value2, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletTitleNotBetween(String value1, String value2) {
            addCriterion("PORTLET_TITLE not between", value1, value2, "portletTitle");
            return (Criteria) this;
        }

        public Criteria andPortletCateidIsNull() {
            addCriterion("PORTLET_CATEID is null");
            return (Criteria) this;
        }

        public Criteria andPortletCateidIsNotNull() {
            addCriterion("PORTLET_CATEID is not null");
            return (Criteria) this;
        }

        public Criteria andPortletCateidEqualTo(String value) {
            addCriterion("PORTLET_CATEID =", value, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidNotEqualTo(String value) {
            addCriterion("PORTLET_CATEID <>", value, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidGreaterThan(String value) {
            addCriterion("PORTLET_CATEID >", value, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidGreaterThanOrEqualTo(String value) {
            addCriterion("PORTLET_CATEID >=", value, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidLessThan(String value) {
            addCriterion("PORTLET_CATEID <", value, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidLessThanOrEqualTo(String value) {
            addCriterion("PORTLET_CATEID <=", value, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidLike(String value) {
            addCriterion("PORTLET_CATEID like", value, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidNotLike(String value) {
            addCriterion("PORTLET_CATEID not like", value, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidIn(List<String> values) {
            addCriterion("PORTLET_CATEID in", values, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidNotIn(List<String> values) {
            addCriterion("PORTLET_CATEID not in", values, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidBetween(String value1, String value2) {
            addCriterion("PORTLET_CATEID between", value1, value2, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCateidNotBetween(String value1, String value2) {
            addCriterion("PORTLET_CATEID not between", value1, value2, "portletCateid");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameIsNull() {
            addCriterion("PORTLET_CATENAME is null");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameIsNotNull() {
            addCriterion("PORTLET_CATENAME is not null");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameEqualTo(String value) {
            addCriterion("PORTLET_CATENAME =", value, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameNotEqualTo(String value) {
            addCriterion("PORTLET_CATENAME <>", value, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameGreaterThan(String value) {
            addCriterion("PORTLET_CATENAME >", value, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameGreaterThanOrEqualTo(String value) {
            addCriterion("PORTLET_CATENAME >=", value, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameLessThan(String value) {
            addCriterion("PORTLET_CATENAME <", value, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameLessThanOrEqualTo(String value) {
            addCriterion("PORTLET_CATENAME <=", value, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameLike(String value) {
            addCriterion("PORTLET_CATENAME like", value, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameNotLike(String value) {
            addCriterion("PORTLET_CATENAME not like", value, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameIn(List<String> values) {
            addCriterion("PORTLET_CATENAME in", values, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameNotIn(List<String> values) {
            addCriterion("PORTLET_CATENAME not in", values, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameBetween(String value1, String value2) {
            addCriterion("PORTLET_CATENAME between", value1, value2, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andPortletCatenameNotBetween(String value1, String value2) {
            addCriterion("PORTLET_CATENAME not between", value1, value2, "portletCatename");
            return (Criteria) this;
        }

        public Criteria andEllipsisIsNull() {
            addCriterion("ELLIPSIS is null");
            return (Criteria) this;
        }

        public Criteria andEllipsisIsNotNull() {
            addCriterion("ELLIPSIS is not null");
            return (Criteria) this;
        }

        public Criteria andEllipsisEqualTo(String value) {
            addCriterion("ELLIPSIS =", value, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisNotEqualTo(String value) {
            addCriterion("ELLIPSIS <>", value, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisGreaterThan(String value) {
            addCriterion("ELLIPSIS >", value, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisGreaterThanOrEqualTo(String value) {
            addCriterion("ELLIPSIS >=", value, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisLessThan(String value) {
            addCriterion("ELLIPSIS <", value, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisLessThanOrEqualTo(String value) {
            addCriterion("ELLIPSIS <=", value, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisLike(String value) {
            addCriterion("ELLIPSIS like", value, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisNotLike(String value) {
            addCriterion("ELLIPSIS not like", value, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisIn(List<String> values) {
            addCriterion("ELLIPSIS in", values, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisNotIn(List<String> values) {
            addCriterion("ELLIPSIS not in", values, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisBetween(String value1, String value2) {
            addCriterion("ELLIPSIS between", value1, value2, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andEllipsisNotBetween(String value1, String value2) {
            addCriterion("ELLIPSIS not between", value1, value2, "ellipsis");
            return (Criteria) this;
        }

        public Criteria andShowrowsIsNull() {
            addCriterion("SHOWROWS is null");
            return (Criteria) this;
        }

        public Criteria andShowrowsIsNotNull() {
            addCriterion("SHOWROWS is not null");
            return (Criteria) this;
        }

        public Criteria andShowrowsEqualTo(String value) {
            addCriterion("SHOWROWS =", value, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsNotEqualTo(String value) {
            addCriterion("SHOWROWS <>", value, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsGreaterThan(String value) {
            addCriterion("SHOWROWS >", value, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWROWS >=", value, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsLessThan(String value) {
            addCriterion("SHOWROWS <", value, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsLessThanOrEqualTo(String value) {
            addCriterion("SHOWROWS <=", value, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsLike(String value) {
            addCriterion("SHOWROWS like", value, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsNotLike(String value) {
            addCriterion("SHOWROWS not like", value, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsIn(List<String> values) {
            addCriterion("SHOWROWS in", values, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsNotIn(List<String> values) {
            addCriterion("SHOWROWS not in", values, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsBetween(String value1, String value2) {
            addCriterion("SHOWROWS between", value1, value2, "showrows");
            return (Criteria) this;
        }

        public Criteria andShowrowsNotBetween(String value1, String value2) {
            addCriterion("SHOWROWS not between", value1, value2, "showrows");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeIsNull() {
            addCriterion("IS_SHOWTIME is null");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeIsNotNull() {
            addCriterion("IS_SHOWTIME is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeEqualTo(String value) {
            addCriterion("IS_SHOWTIME =", value, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeNotEqualTo(String value) {
            addCriterion("IS_SHOWTIME <>", value, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeGreaterThan(String value) {
            addCriterion("IS_SHOWTIME >", value, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOWTIME >=", value, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeLessThan(String value) {
            addCriterion("IS_SHOWTIME <", value, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOWTIME <=", value, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeLike(String value) {
            addCriterion("IS_SHOWTIME like", value, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeNotLike(String value) {
            addCriterion("IS_SHOWTIME not like", value, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeIn(List<String> values) {
            addCriterion("IS_SHOWTIME in", values, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeNotIn(List<String> values) {
            addCriterion("IS_SHOWTIME not in", values, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeBetween(String value1, String value2) {
            addCriterion("IS_SHOWTIME between", value1, value2, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowtimeNotBetween(String value1, String value2) {
            addCriterion("IS_SHOWTIME not between", value1, value2, "isShowtime");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollIsNull() {
            addCriterion("IS_SHOWSCROLL is null");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollIsNotNull() {
            addCriterion("IS_SHOWSCROLL is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollEqualTo(String value) {
            addCriterion("IS_SHOWSCROLL =", value, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollNotEqualTo(String value) {
            addCriterion("IS_SHOWSCROLL <>", value, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollGreaterThan(String value) {
            addCriterion("IS_SHOWSCROLL >", value, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOWSCROLL >=", value, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollLessThan(String value) {
            addCriterion("IS_SHOWSCROLL <", value, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOWSCROLL <=", value, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollLike(String value) {
            addCriterion("IS_SHOWSCROLL like", value, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollNotLike(String value) {
            addCriterion("IS_SHOWSCROLL not like", value, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollIn(List<String> values) {
            addCriterion("IS_SHOWSCROLL in", values, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollNotIn(List<String> values) {
            addCriterion("IS_SHOWSCROLL not in", values, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollBetween(String value1, String value2) {
            addCriterion("IS_SHOWSCROLL between", value1, value2, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsShowscrollNotBetween(String value1, String value2) {
            addCriterion("IS_SHOWSCROLL not between", value1, value2, "isShowscroll");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagIsNull() {
            addCriterion("IS_RECURSIONFLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagIsNotNull() {
            addCriterion("IS_RECURSIONFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagEqualTo(String value) {
            addCriterion("IS_RECURSIONFLAG =", value, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagNotEqualTo(String value) {
            addCriterion("IS_RECURSIONFLAG <>", value, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagGreaterThan(String value) {
            addCriterion("IS_RECURSIONFLAG >", value, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagGreaterThanOrEqualTo(String value) {
            addCriterion("IS_RECURSIONFLAG >=", value, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagLessThan(String value) {
            addCriterion("IS_RECURSIONFLAG <", value, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagLessThanOrEqualTo(String value) {
            addCriterion("IS_RECURSIONFLAG <=", value, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagLike(String value) {
            addCriterion("IS_RECURSIONFLAG like", value, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagNotLike(String value) {
            addCriterion("IS_RECURSIONFLAG not like", value, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagIn(List<String> values) {
            addCriterion("IS_RECURSIONFLAG in", values, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagNotIn(List<String> values) {
            addCriterion("IS_RECURSIONFLAG not in", values, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagBetween(String value1, String value2) {
            addCriterion("IS_RECURSIONFLAG between", value1, value2, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsRecursionflagNotBetween(String value1, String value2) {
            addCriterion("IS_RECURSIONFLAG not between", value1, value2, "isRecursionflag");
            return (Criteria) this;
        }

        public Criteria andIsTabIsNull() {
            addCriterion("IS_TAB is null");
            return (Criteria) this;
        }

        public Criteria andIsTabIsNotNull() {
            addCriterion("IS_TAB is not null");
            return (Criteria) this;
        }

        public Criteria andIsTabEqualTo(String value) {
            addCriterion("IS_TAB =", value, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabNotEqualTo(String value) {
            addCriterion("IS_TAB <>", value, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabGreaterThan(String value) {
            addCriterion("IS_TAB >", value, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TAB >=", value, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabLessThan(String value) {
            addCriterion("IS_TAB <", value, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabLessThanOrEqualTo(String value) {
            addCriterion("IS_TAB <=", value, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabLike(String value) {
            addCriterion("IS_TAB like", value, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabNotLike(String value) {
            addCriterion("IS_TAB not like", value, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabIn(List<String> values) {
            addCriterion("IS_TAB in", values, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabNotIn(List<String> values) {
            addCriterion("IS_TAB not in", values, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabBetween(String value1, String value2) {
            addCriterion("IS_TAB between", value1, value2, "isTab");
            return (Criteria) this;
        }

        public Criteria andIsTabNotBetween(String value1, String value2) {
            addCriterion("IS_TAB not between", value1, value2, "isTab");
            return (Criteria) this;
        }

        public Criteria andPageidIsNull() {
            addCriterion("PAGEID is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("PAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(Integer value) {
            addCriterion("PAGEID =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(Integer value) {
            addCriterion("PAGEID <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(Integer value) {
            addCriterion("PAGEID >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAGEID >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(Integer value) {
            addCriterion("PAGEID <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(Integer value) {
            addCriterion("PAGEID <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<Integer> values) {
            addCriterion("PAGEID in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<Integer> values) {
            addCriterion("PAGEID not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(Integer value1, Integer value2) {
            addCriterion("PAGEID between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(Integer value1, Integer value2) {
            addCriterion("PAGEID not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("FILEPATH is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("FILEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("FILEPATH =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("FILEPATH <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("FILEPATH >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("FILEPATH >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("FILEPATH <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("FILEPATH <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("FILEPATH like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("FILEPATH not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("FILEPATH in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("FILEPATH not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("FILEPATH between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("FILEPATH not between", value1, value2, "filepath");
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

        public Criteria andIsPerIsNull() {
            addCriterion("IS_PER is null");
            return (Criteria) this;
        }

        public Criteria andIsPerIsNotNull() {
            addCriterion("IS_PER is not null");
            return (Criteria) this;
        }

        public Criteria andIsPerEqualTo(String value) {
            addCriterion("IS_PER =", value, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerNotEqualTo(String value) {
            addCriterion("IS_PER <>", value, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerGreaterThan(String value) {
            addCriterion("IS_PER >", value, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PER >=", value, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerLessThan(String value) {
            addCriterion("IS_PER <", value, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerLessThanOrEqualTo(String value) {
            addCriterion("IS_PER <=", value, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerLike(String value) {
            addCriterion("IS_PER like", value, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerNotLike(String value) {
            addCriterion("IS_PER not like", value, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerIn(List<String> values) {
            addCriterion("IS_PER in", values, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerNotIn(List<String> values) {
            addCriterion("IS_PER not in", values, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerBetween(String value1, String value2) {
            addCriterion("IS_PER between", value1, value2, "isPer");
            return (Criteria) this;
        }

        public Criteria andIsPerNotBetween(String value1, String value2) {
            addCriterion("IS_PER not between", value1, value2, "isPer");
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