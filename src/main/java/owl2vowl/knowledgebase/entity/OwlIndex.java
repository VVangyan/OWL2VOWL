package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class OwlIndex implements Serializable {
    private Integer id;

    private String createIndexDate;

    private String status;

    private String isallFalg;

    private String beginTime;

    private String endTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateIndexDate() {
        return createIndexDate;
    }

    public void setCreateIndexDate(String createIndexDate) {
        this.createIndexDate = createIndexDate == null ? null : createIndexDate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsallFalg() {
        return isallFalg;
    }

    public void setIsallFalg(String isallFalg) {
        this.isallFalg = isallFalg == null ? null : isallFalg.trim();
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createIndexDate=").append(createIndexDate);
        sb.append(", status=").append(status);
        sb.append(", isallFalg=").append(isallFalg);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
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
        OwlIndex other = (OwlIndex) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateIndexDate() == null ? other.getCreateIndexDate() == null : this.getCreateIndexDate().equals(other.getCreateIndexDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsallFalg() == null ? other.getIsallFalg() == null : this.getIsallFalg().equals(other.getIsallFalg()))
            && (this.getBeginTime() == null ? other.getBeginTime() == null : this.getBeginTime().equals(other.getBeginTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateIndexDate() == null) ? 0 : getCreateIndexDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsallFalg() == null) ? 0 : getIsallFalg().hashCode());
        result = prime * result + ((getBeginTime() == null) ? 0 : getBeginTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return result;
    }
}