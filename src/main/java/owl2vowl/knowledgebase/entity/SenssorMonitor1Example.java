package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SenssorMonitor1Example implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SenssorMonitor1Example() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSensornoIsNull() {
            addCriterion("SensorNo is null");
            return (Criteria) this;
        }

        public Criteria andSensornoIsNotNull() {
            addCriterion("SensorNo is not null");
            return (Criteria) this;
        }

        public Criteria andSensornoEqualTo(String value) {
            addCriterion("SensorNo =", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoNotEqualTo(String value) {
            addCriterion("SensorNo <>", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoGreaterThan(String value) {
            addCriterion("SensorNo >", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoGreaterThanOrEqualTo(String value) {
            addCriterion("SensorNo >=", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoLessThan(String value) {
            addCriterion("SensorNo <", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoLessThanOrEqualTo(String value) {
            addCriterion("SensorNo <=", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoLike(String value) {
            addCriterion("SensorNo like", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoNotLike(String value) {
            addCriterion("SensorNo not like", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoIn(List<String> values) {
            addCriterion("SensorNo in", values, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoNotIn(List<String> values) {
            addCriterion("SensorNo not in", values, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoBetween(String value1, String value2) {
            addCriterion("SensorNo between", value1, value2, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoNotBetween(String value1, String value2) {
            addCriterion("SensorNo not between", value1, value2, "sensorno");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNull() {
            addCriterion("NodeID is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("NodeID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(String value) {
            addCriterion("NodeID =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(String value) {
            addCriterion("NodeID <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(String value) {
            addCriterion("NodeID >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(String value) {
            addCriterion("NodeID >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(String value) {
            addCriterion("NodeID <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(String value) {
            addCriterion("NodeID <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLike(String value) {
            addCriterion("NodeID like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotLike(String value) {
            addCriterion("NodeID not like", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<String> values) {
            addCriterion("NodeID in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<String> values) {
            addCriterion("NodeID not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(String value1, String value2) {
            addCriterion("NodeID between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(String value1, String value2) {
            addCriterion("NodeID not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("TimeStamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("TimeStamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(String value) {
            addCriterion("TimeStamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(String value) {
            addCriterion("TimeStamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(String value) {
            addCriterion("TimeStamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(String value) {
            addCriterion("TimeStamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(String value) {
            addCriterion("TimeStamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(String value) {
            addCriterion("TimeStamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLike(String value) {
            addCriterion("TimeStamp like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotLike(String value) {
            addCriterion("TimeStamp not like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<String> values) {
            addCriterion("TimeStamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<String> values) {
            addCriterion("TimeStamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(String value1, String value2) {
            addCriterion("TimeStamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(String value1, String value2) {
            addCriterion("TimeStamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andSamplerateIsNull() {
            addCriterion("SampleRate is null");
            return (Criteria) this;
        }

        public Criteria andSamplerateIsNotNull() {
            addCriterion("SampleRate is not null");
            return (Criteria) this;
        }

        public Criteria andSamplerateEqualTo(Double value) {
            addCriterion("SampleRate =", value, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateNotEqualTo(Double value) {
            addCriterion("SampleRate <>", value, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateGreaterThan(Double value) {
            addCriterion("SampleRate >", value, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateGreaterThanOrEqualTo(Double value) {
            addCriterion("SampleRate >=", value, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateLessThan(Double value) {
            addCriterion("SampleRate <", value, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateLessThanOrEqualTo(Double value) {
            addCriterion("SampleRate <=", value, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateIn(List<Double> values) {
            addCriterion("SampleRate in", values, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateNotIn(List<Double> values) {
            addCriterion("SampleRate not in", values, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateBetween(Double value1, Double value2) {
            addCriterion("SampleRate between", value1, value2, "samplerate");
            return (Criteria) this;
        }

        public Criteria andSamplerateNotBetween(Double value1, Double value2) {
            addCriterion("SampleRate not between", value1, value2, "samplerate");
            return (Criteria) this;
        }

        public Criteria andNumsamplesIsNull() {
            addCriterion("NumSamples is null");
            return (Criteria) this;
        }

        public Criteria andNumsamplesIsNotNull() {
            addCriterion("NumSamples is not null");
            return (Criteria) this;
        }

        public Criteria andNumsamplesEqualTo(Double value) {
            addCriterion("NumSamples =", value, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesNotEqualTo(Double value) {
            addCriterion("NumSamples <>", value, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesGreaterThan(Double value) {
            addCriterion("NumSamples >", value, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesGreaterThanOrEqualTo(Double value) {
            addCriterion("NumSamples >=", value, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesLessThan(Double value) {
            addCriterion("NumSamples <", value, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesLessThanOrEqualTo(Double value) {
            addCriterion("NumSamples <=", value, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesIn(List<Double> values) {
            addCriterion("NumSamples in", values, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesNotIn(List<Double> values) {
            addCriterion("NumSamples not in", values, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesBetween(Double value1, Double value2) {
            addCriterion("NumSamples between", value1, value2, "numsamples");
            return (Criteria) this;
        }

        public Criteria andNumsamplesNotBetween(Double value1, Double value2) {
            addCriterion("NumSamples not between", value1, value2, "numsamples");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1IsNull() {
            addCriterion("MonitoringValue1 is null");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1IsNotNull() {
            addCriterion("MonitoringValue1 is not null");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1EqualTo(String value) {
            addCriterion("MonitoringValue1 =", value, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1NotEqualTo(String value) {
            addCriterion("MonitoringValue1 <>", value, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1GreaterThan(String value) {
            addCriterion("MonitoringValue1 >", value, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1GreaterThanOrEqualTo(String value) {
            addCriterion("MonitoringValue1 >=", value, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1LessThan(String value) {
            addCriterion("MonitoringValue1 <", value, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1LessThanOrEqualTo(String value) {
            addCriterion("MonitoringValue1 <=", value, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1Like(String value) {
            addCriterion("MonitoringValue1 like", value, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1NotLike(String value) {
            addCriterion("MonitoringValue1 not like", value, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1In(List<String> values) {
            addCriterion("MonitoringValue1 in", values, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1NotIn(List<String> values) {
            addCriterion("MonitoringValue1 not in", values, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1Between(String value1, String value2) {
            addCriterion("MonitoringValue1 between", value1, value2, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andMonitoringvalue1NotBetween(String value1, String value2) {
            addCriterion("MonitoringValue1 not between", value1, value2, "monitoringvalue1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1IsNull() {
            addCriterion("Spectrum1 is null");
            return (Criteria) this;
        }

        public Criteria andSpectrum1IsNotNull() {
            addCriterion("Spectrum1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpectrum1EqualTo(String value) {
            addCriterion("Spectrum1 =", value, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1NotEqualTo(String value) {
            addCriterion("Spectrum1 <>", value, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1GreaterThan(String value) {
            addCriterion("Spectrum1 >", value, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1GreaterThanOrEqualTo(String value) {
            addCriterion("Spectrum1 >=", value, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1LessThan(String value) {
            addCriterion("Spectrum1 <", value, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1LessThanOrEqualTo(String value) {
            addCriterion("Spectrum1 <=", value, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1Like(String value) {
            addCriterion("Spectrum1 like", value, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1NotLike(String value) {
            addCriterion("Spectrum1 not like", value, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1In(List<String> values) {
            addCriterion("Spectrum1 in", values, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1NotIn(List<String> values) {
            addCriterion("Spectrum1 not in", values, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1Between(String value1, String value2) {
            addCriterion("Spectrum1 between", value1, value2, "spectrum1");
            return (Criteria) this;
        }

        public Criteria andSpectrum1NotBetween(String value1, String value2) {
            addCriterion("Spectrum1 not between", value1, value2, "spectrum1");
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