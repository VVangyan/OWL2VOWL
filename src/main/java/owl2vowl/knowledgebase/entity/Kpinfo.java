package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;

public class Kpinfo implements Serializable {
    private Integer kpId;

    private String kpName;

    private Date releaseTime;

    private static final long serialVersionUID = 1L;

    public Integer getKpId() {
        return kpId;
    }

    public void setKpId(Integer kpId) {
        this.kpId = kpId;
    }

    public String getKpName() {
        return kpName;
    }

    public void setKpName(String kpName) {
        this.kpName = kpName == null ? null : kpName.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", kpId=").append(kpId);
        sb.append(", kpName=").append(kpName);
        sb.append(", releaseTime=").append(releaseTime);
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
        Kpinfo other = (Kpinfo) that;
        return (this.getKpId() == null ? other.getKpId() == null : this.getKpId().equals(other.getKpId()))
            && (this.getKpName() == null ? other.getKpName() == null : this.getKpName().equals(other.getKpName()))
            && (this.getReleaseTime() == null ? other.getReleaseTime() == null : this.getReleaseTime().equals(other.getReleaseTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKpId() == null) ? 0 : getKpId().hashCode());
        result = prime * result + ((getKpName() == null) ? 0 : getKpName().hashCode());
        result = prime * result + ((getReleaseTime() == null) ? 0 : getReleaseTime().hashCode());
        return result;
    }
}