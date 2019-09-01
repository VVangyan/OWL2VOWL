package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;

public class KwDocumentPageview implements Serializable {
    private Integer pageviewId;

    private Integer documentId;

    private String documentName;

    private Date pageviewTime;

    private String pageviewIp;

    private String documentSaveurl;

    private String departmentName;

    private static final long serialVersionUID = 1L;

    public Integer getPageviewId() {
        return pageviewId;
    }

    public void setPageviewId(Integer pageviewId) {
        this.pageviewId = pageviewId;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName == null ? null : documentName.trim();
    }

    public Date getPageviewTime() {
        return pageviewTime;
    }

    public void setPageviewTime(Date pageviewTime) {
        this.pageviewTime = pageviewTime;
    }

    public String getPageviewIp() {
        return pageviewIp;
    }

    public void setPageviewIp(String pageviewIp) {
        this.pageviewIp = pageviewIp == null ? null : pageviewIp.trim();
    }

    public String getDocumentSaveurl() {
        return documentSaveurl;
    }

    public void setDocumentSaveurl(String documentSaveurl) {
        this.documentSaveurl = documentSaveurl;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "KwDocumentPageview{" +
                "pageviewId=" + pageviewId +
                ", documentId=" + documentId +
                ", documentName='" + documentName + '\'' +
                ", pageviewTime=" + pageviewTime +
                ", pageviewIp='" + pageviewIp + '\'' +
                ", documentSaveurl='" + documentSaveurl + '\'' +
                ", departmentName='" + departmentName + '\'' +
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
        KwDocumentPageview other = (KwDocumentPageview) that;
        return (this.getPageviewId() == null ? other.getPageviewId() == null : this.getPageviewId().equals(other.getPageviewId()))
            && (this.getDocumentId() == null ? other.getDocumentId() == null : this.getDocumentId().equals(other.getDocumentId()))
            && (this.getDocumentName() == null ? other.getDocumentName() == null : this.getDocumentName().equals(other.getDocumentName()))
            && (this.getPageviewTime() == null ? other.getPageviewTime() == null : this.getPageviewTime().equals(other.getPageviewTime()))
            && (this.getPageviewIp() == null ? other.getPageviewIp() == null : this.getPageviewIp().equals(other.getPageviewIp()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPageviewId() == null) ? 0 : getPageviewId().hashCode());
        result = prime * result + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        result = prime * result + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        result = prime * result + ((getPageviewTime() == null) ? 0 : getPageviewTime().hashCode());
        result = prime * result + ((getPageviewIp() == null) ? 0 : getPageviewIp().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        return result;
    }
}