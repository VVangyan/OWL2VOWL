package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class SenssorMonitor1 implements Serializable {
    private Long id;

    private String sensorno;

    private String nodeid;

    private String timestamp;

    private Double samplerate;

    private Double numsamples;

    private String monitoringvalue1;

    private String spectrum1;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSensorno() {
        return sensorno;
    }

    public void setSensorno(String sensorno) {
        this.sensorno = sensorno == null ? null : sensorno.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp == null ? null : timestamp.trim();
    }

    public Double getSamplerate() {
        return samplerate;
    }

    public void setSamplerate(Double samplerate) {
        this.samplerate = samplerate;
    }

    public Double getNumsamples() {
        return numsamples;
    }

    public void setNumsamples(Double numsamples) {
        this.numsamples = numsamples;
    }

    public String getMonitoringvalue1() {
        return monitoringvalue1;
    }

    public void setMonitoringvalue1(String monitoringvalue1) {
        this.monitoringvalue1 = monitoringvalue1 == null ? null : monitoringvalue1.trim();
    }

    public String getSpectrum1() {
        return spectrum1;
    }

    public void setSpectrum1(String spectrum1) {
        this.spectrum1 = spectrum1 == null ? null : spectrum1.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sensorno=").append(sensorno);
        sb.append(", nodeid=").append(nodeid);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", samplerate=").append(samplerate);
        sb.append(", numsamples=").append(numsamples);
        sb.append(", monitoringvalue1=").append(monitoringvalue1);
        sb.append(", spectrum1=").append(spectrum1);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SenssorMonitor1 other = (SenssorMonitor1) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSensorno() == null ? other.getSensorno() == null : this.getSensorno().equals(other.getSensorno()))
            && (this.getNodeid() == null ? other.getNodeid() == null : this.getNodeid().equals(other.getNodeid()))
            && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()))
            && (this.getSamplerate() == null ? other.getSamplerate() == null : this.getSamplerate().equals(other.getSamplerate()))
            && (this.getNumsamples() == null ? other.getNumsamples() == null : this.getNumsamples().equals(other.getNumsamples()))
            && (this.getMonitoringvalue1() == null ? other.getMonitoringvalue1() == null : this.getMonitoringvalue1().equals(other.getMonitoringvalue1()))
            && (this.getSpectrum1() == null ? other.getSpectrum1() == null : this.getSpectrum1().equals(other.getSpectrum1()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSensorno() == null) ? 0 : getSensorno().hashCode());
        result = prime * result + ((getNodeid() == null) ? 0 : getNodeid().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        result = prime * result + ((getSamplerate() == null) ? 0 : getSamplerate().hashCode());
        result = prime * result + ((getNumsamples() == null) ? 0 : getNumsamples().hashCode());
        result = prime * result + ((getMonitoringvalue1() == null) ? 0 : getMonitoringvalue1().hashCode());
        result = prime * result + ((getSpectrum1() == null) ? 0 : getSpectrum1().hashCode());
        return result;
    }
}