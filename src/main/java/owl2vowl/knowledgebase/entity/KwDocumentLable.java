package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;

public class KwDocumentLable implements Serializable {

    private Integer lableId;

    private String lableName;

    private Integer lablePreid;

    private String lablePreName;

    private String lableDesc;

    private Date lableDate;

    private Integer lableSort;

    private String userName;

    private String deparmentName;

    private static final long serialVersionUID = 1L;

    public Integer getLableId() {
        return lableId;
    }

    public void setLableId(Integer lableId) {
        this.lableId = lableId;
    }

    public String getLableName() {
        return lableName;
    }

    public void setLableName(String lableName) {
        this.lableName = lableName == null ? null : lableName.trim();
    }

    public Integer getLablePreid() {
        return lablePreid;
    }

    public void setLablePreid(Integer lablePreid) {
        this.lablePreid = lablePreid;
    }

    public String getLableDesc() {
        return lableDesc;
    }

    public void setLableDesc(String lableDesc) {
        this.lableDesc = lableDesc == null ? null : lableDesc.trim();
    }

    public Date getLableDate() {
        return lableDate;
    }

    public void setLableDate(Date lableDate) {
        this.lableDate = lableDate;
    }

    public Integer getLableSort() {
        return lableSort;
    }

    public void setLableSort(Integer lableSort) {
        this.lableSort = lableSort;
    }

    public String getLablePreName() {
        return lablePreName;
    }

    public void setLablePreName(String lablePreName) {
        this.lablePreName = lablePreName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    @Override
    public String toString() {
        return "KwDocumentLable{" +
                "lableId=" + lableId +
                ", lableName='" + lableName + '\'' +
                ", lablePreid=" + lablePreid +
                ", lablePreName='" + lablePreName + '\'' +
                ", lableDesc='" + lableDesc + '\'' +
                ", lableDate=" + lableDate +
                ", lableSort=" + lableSort +
                '}';
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
        KwDocumentLable other = (KwDocumentLable) that;
        return (this.getLableId() == null ? other.getLableId() == null : this.getLableId().equals(other.getLableId()))
            && (this.getLableName() == null ? other.getLableName() == null : this.getLableName().equals(other.getLableName()))
            && (this.getLablePreid() == null ? other.getLablePreid() == null : this.getLablePreid().equals(other.getLablePreid()))
            && (this.getLableDesc() == null ? other.getLableDesc() == null : this.getLableDesc().equals(other.getLableDesc()))
            && (this.getLableDate() == null ? other.getLableDate() == null : this.getLableDate().equals(other.getLableDate()))
            && (this.getLableSort() == null ? other.getLableSort() == null : this.getLableSort().equals(other.getLableSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLableId() == null) ? 0 : getLableId().hashCode());
        result = prime * result + ((getLableName() == null) ? 0 : getLableName().hashCode());
        result = prime * result + ((getLablePreid() == null) ? 0 : getLablePreid().hashCode());
        result = prime * result + ((getLableDesc() == null) ? 0 : getLableDesc().hashCode());
        result = prime * result + ((getLableDate() == null) ? 0 : getLableDate().hashCode());
        result = prime * result + ((getLableSort() == null) ? 0 : getLableSort().hashCode());
        return result;
    }
}