package com.shinowit.entity;

import java.util.ArrayList;
import java.util.List;

public class ChartCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public ChartCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public ChartCriteria(int pageSize, int pageIndex) {
        this();
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getCustomCriteria() {
        return this.customCriteria;
    }

    public void setCustomCriteria(String customCriteria) {
        this.customCriteria = customCriteria;
    }

    public int getSkipRecordCount() {
        int count = (this.pageIndex - 1) * this.pageSize;
        if (count < 0) {
            count = 0;
        }
        return count;
    }

    public int getEndRecordCount() {
        return this.pageIndex * this.pageSize;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    protected abstract static class GeneratedCriteria {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("MemberID is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("MemberID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(String value) {
            addCriterion("MemberID =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(String value) {
            addCriterion("MemberID <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(String value) {
            addCriterion("MemberID >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("MemberID >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(String value) {
            addCriterion("MemberID <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(String value) {
            addCriterion("MemberID <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLike(String value) {
            addCriterion("MemberID like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotLike(String value) {
            addCriterion("MemberID not like", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<String> values) {
            addCriterion("MemberID in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<String> values) {
            addCriterion("MemberID not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(String value1, String value2) {
            addCriterion("MemberID between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(String value1, String value2) {
            addCriterion("MemberID not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIsNull() {
            addCriterion("MerchandiseID is null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIsNotNull() {
            addCriterion("MerchandiseID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidEqualTo(String value) {
            addCriterion("MerchandiseID =", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotEqualTo(String value) {
            addCriterion("MerchandiseID <>", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidGreaterThan(String value) {
            addCriterion("MerchandiseID >", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseID >=", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLessThan(String value) {
            addCriterion("MerchandiseID <", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseID <=", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLike(String value) {
            addCriterion("MerchandiseID like", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotLike(String value) {
            addCriterion("MerchandiseID not like", value, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidIn(List<String> values) {
            addCriterion("MerchandiseID in", values, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotIn(List<String> values) {
            addCriterion("MerchandiseID not in", values, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidBetween(String value1, String value2) {
            addCriterion("MerchandiseID between", value1, value2, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidNotBetween(String value1, String value2) {
            addCriterion("MerchandiseID not between", value1, value2, "merchandiseid");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(Id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andMemberidLikeInsensitive(String value) {
            addCriterion("upper(MemberID) like", value.toUpperCase(), "memberid");
            return (Criteria) this;
        }

        public Criteria andMerchandiseidLikeInsensitive(String value) {
            addCriterion("upper(MerchandiseID) like", value.toUpperCase(), "merchandiseid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table chart
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 19 21:11:02 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table chart
     *
     * @mbggenerated Mon Jan 19 21:11:02 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
    }
}