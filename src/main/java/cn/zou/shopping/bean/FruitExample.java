package cn.zou.shopping.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FruitExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Long value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Long value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Long value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Long value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Long value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Long value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Long> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Long> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Long value1, Long value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Long value1, Long value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andFruitImageIsNull() {
            addCriterion("fruit_image is null");
            return (Criteria) this;
        }

        public Criteria andFruitImageIsNotNull() {
            addCriterion("fruit_image is not null");
            return (Criteria) this;
        }

        public Criteria andFruitImageEqualTo(String value) {
            addCriterion("fruit_image =", value, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageNotEqualTo(String value) {
            addCriterion("fruit_image <>", value, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageGreaterThan(String value) {
            addCriterion("fruit_image >", value, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageGreaterThanOrEqualTo(String value) {
            addCriterion("fruit_image >=", value, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageLessThan(String value) {
            addCriterion("fruit_image <", value, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageLessThanOrEqualTo(String value) {
            addCriterion("fruit_image <=", value, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageLike(String value) {
            addCriterion("fruit_image like", value, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageNotLike(String value) {
            addCriterion("fruit_image not like", value, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageIn(List<String> values) {
            addCriterion("fruit_image in", values, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageNotIn(List<String> values) {
            addCriterion("fruit_image not in", values, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageBetween(String value1, String value2) {
            addCriterion("fruit_image between", value1, value2, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitImageNotBetween(String value1, String value2) {
            addCriterion("fruit_image not between", value1, value2, "fruitImage");
            return (Criteria) this;
        }

        public Criteria andFruitNameIsNull() {
            addCriterion("fruit_name is null");
            return (Criteria) this;
        }

        public Criteria andFruitNameIsNotNull() {
            addCriterion("fruit_name is not null");
            return (Criteria) this;
        }

        public Criteria andFruitNameEqualTo(String value) {
            addCriterion("fruit_name =", value, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameNotEqualTo(String value) {
            addCriterion("fruit_name <>", value, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameGreaterThan(String value) {
            addCriterion("fruit_name >", value, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameGreaterThanOrEqualTo(String value) {
            addCriterion("fruit_name >=", value, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameLessThan(String value) {
            addCriterion("fruit_name <", value, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameLessThanOrEqualTo(String value) {
            addCriterion("fruit_name <=", value, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameLike(String value) {
            addCriterion("fruit_name like", value, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameNotLike(String value) {
            addCriterion("fruit_name not like", value, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameIn(List<String> values) {
            addCriterion("fruit_name in", values, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameNotIn(List<String> values) {
            addCriterion("fruit_name not in", values, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameBetween(String value1, String value2) {
            addCriterion("fruit_name between", value1, value2, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNameNotBetween(String value1, String value2) {
            addCriterion("fruit_name not between", value1, value2, "fruitName");
            return (Criteria) this;
        }

        public Criteria andFruitNumIsNull() {
            addCriterion("fruit_num is null");
            return (Criteria) this;
        }

        public Criteria andFruitNumIsNotNull() {
            addCriterion("fruit_num is not null");
            return (Criteria) this;
        }

        public Criteria andFruitNumEqualTo(Integer value) {
            addCriterion("fruit_num =", value, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumNotEqualTo(Integer value) {
            addCriterion("fruit_num <>", value, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumGreaterThan(Integer value) {
            addCriterion("fruit_num >", value, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fruit_num >=", value, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumLessThan(Integer value) {
            addCriterion("fruit_num <", value, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumLessThanOrEqualTo(Integer value) {
            addCriterion("fruit_num <=", value, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumIn(List<Integer> values) {
            addCriterion("fruit_num in", values, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumNotIn(List<Integer> values) {
            addCriterion("fruit_num not in", values, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumBetween(Integer value1, Integer value2) {
            addCriterion("fruit_num between", value1, value2, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andFruitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("fruit_num not between", value1, value2, "fruitNum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(Integer value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(Integer value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(Integer value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(Integer value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(Integer value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(Integer value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<Integer> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<Integer> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(Integer value1, Integer value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(Integer value1, Integer value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Date value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Date value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Date value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Date value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Date value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Date> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Date> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Date value1, Date value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Date value1, Date value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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