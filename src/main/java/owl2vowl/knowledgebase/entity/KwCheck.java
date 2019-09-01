package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;

public class KwCheck implements Serializable {
    private Integer checkId;

    private Integer documentId;

    private Integer checkUserid;

    private String checkUsername;

    private Integer checkStatus;

    private Date date;

    private static final long serialVersionUID = 1L;

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Integer getCheckUserid() {
        return checkUserid;
    }

    public void setCheckUserid(Integer checkUserid) {
        this.checkUserid = checkUserid;
    }

    public String getCheckUsername() {
        return checkUsername;
    }

    public void setCheckUsername(String checkUsername) {
        this.checkUsername = checkUsername == null ? null : checkUsername.trim();
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
	public KwCheck() {
	}

    public KwCheck(Integer documentId, Integer checkUserid, String checkUsername, Integer checkStatus, Date date) {
		super();
		this.documentId = documentId;
		this.checkUserid = checkUserid;
		this.checkUsername = checkUsername;
		this.checkStatus = checkStatus;
		this.date = date;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkId=").append(checkId);
        sb.append(", documentId=").append(documentId);
        sb.append(", checkUserid=").append(checkUserid);
        sb.append(", checkUsername=").append(checkUsername);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", date=").append(date);
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
        KwCheck other = (KwCheck) that;
        return (this.getCheckId() == null ? other.getCheckId() == null : this.getCheckId().equals(other.getCheckId()))
            && (this.getDocumentId() == null ? other.getDocumentId() == null : this.getDocumentId().equals(other.getDocumentId()))
            && (this.getCheckUserid() == null ? other.getCheckUserid() == null : this.getCheckUserid().equals(other.getCheckUserid()))
            && (this.getCheckUsername() == null ? other.getCheckUsername() == null : this.getCheckUsername().equals(other.getCheckUsername()))
            && (this.getCheckStatus() == null ? other.getCheckStatus() == null : this.getCheckStatus().equals(other.getCheckStatus()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        result = prime * result + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        result = prime * result + ((getCheckUserid() == null) ? 0 : getCheckUserid().hashCode());
        result = prime * result + ((getCheckUsername() == null) ? 0 : getCheckUsername().hashCode());
        result = prime * result + ((getCheckStatus() == null) ? 0 : getCheckStatus().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        return result;
    }
}