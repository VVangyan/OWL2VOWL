package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;

public class kwDocumentRelease implements Serializable {
    private Integer releaseId;

    private Integer documentId;

    private String releaseFromUserid;

    private String releaseFromUsername;

    private String releaseToDetpid;

    private String releaseDetpname;

    private String releaseToUserid;

    private String releaseToUsername;

    private Date releaseDate;

    private static final long serialVersionUID = 1L;
    
	public kwDocumentRelease() {
	}

	public kwDocumentRelease(Integer documentId, String releaseFromUserid, String releaseFromUsername,
			String releaseToDetpid, String releaseDetpname, String releaseToUserid, String releaseToUsername,
			Date releaseDate) {
		super();
		this.documentId = documentId;
		this.releaseFromUserid = releaseFromUserid;
		this.releaseFromUsername = releaseFromUsername;
		this.releaseToDetpid = releaseToDetpid;
		this.releaseDetpname = releaseDetpname;
		this.releaseToUserid = releaseToUserid;
		this.releaseToUsername = releaseToUsername;
		this.releaseDate = releaseDate;
	}    

    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getReleaseFromUserid() {
        return releaseFromUserid;
    }

    public void setReleaseFromUserid(String releaseFromUserid) {
        this.releaseFromUserid = releaseFromUserid == null ? null : releaseFromUserid.trim();
    }

    public String getReleaseFromUsername() {
        return releaseFromUsername;
    }

    public void setReleaseFromUsername(String releaseFromUsername) {
        this.releaseFromUsername = releaseFromUsername == null ? null : releaseFromUsername.trim();
    }

    public String getReleaseToDetpid() {
        return releaseToDetpid;
    }

    public void setReleaseToDetpid(String releaseToDetpid) {
        this.releaseToDetpid = releaseToDetpid == null ? null : releaseToDetpid.trim();
    }

    public String getReleaseDetpname() {
        return releaseDetpname;
    }

    public void setReleaseDetpname(String releaseDetpname) {
        this.releaseDetpname = releaseDetpname == null ? null : releaseDetpname.trim();
    }

    public String getReleaseToUserid() {
        return releaseToUserid;
    }

    public void setReleaseToUserid(String releaseToUserid) {
        this.releaseToUserid = releaseToUserid == null ? null : releaseToUserid.trim();
    }

    public String getReleaseToUsername() {
        return releaseToUsername;
    }

    public void setReleaseToUsername(String releaseToUsername) {
        this.releaseToUsername = releaseToUsername == null ? null : releaseToUsername.trim();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", releaseId=").append(releaseId);
        sb.append(", documentId=").append(documentId);
        sb.append(", releaseFromUserid=").append(releaseFromUserid);
        sb.append(", releaseFromUsername=").append(releaseFromUsername);
        sb.append(", releaseToDetpid=").append(releaseToDetpid);
        sb.append(", releaseDetpname=").append(releaseDetpname);
        sb.append(", releaseToUserid=").append(releaseToUserid);
        sb.append(", releaseToUsername=").append(releaseToUsername);
        sb.append(", releaseDate=").append(releaseDate);
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
        kwDocumentRelease other = (kwDocumentRelease) that;
        return (this.getReleaseId() == null ? other.getReleaseId() == null : this.getReleaseId().equals(other.getReleaseId()))
            && (this.getDocumentId() == null ? other.getDocumentId() == null : this.getDocumentId().equals(other.getDocumentId()))
            && (this.getReleaseFromUserid() == null ? other.getReleaseFromUserid() == null : this.getReleaseFromUserid().equals(other.getReleaseFromUserid()))
            && (this.getReleaseFromUsername() == null ? other.getReleaseFromUsername() == null : this.getReleaseFromUsername().equals(other.getReleaseFromUsername()))
            && (this.getReleaseToDetpid() == null ? other.getReleaseToDetpid() == null : this.getReleaseToDetpid().equals(other.getReleaseToDetpid()))
            && (this.getReleaseDetpname() == null ? other.getReleaseDetpname() == null : this.getReleaseDetpname().equals(other.getReleaseDetpname()))
            && (this.getReleaseToUserid() == null ? other.getReleaseToUserid() == null : this.getReleaseToUserid().equals(other.getReleaseToUserid()))
            && (this.getReleaseToUsername() == null ? other.getReleaseToUsername() == null : this.getReleaseToUsername().equals(other.getReleaseToUsername()))
            && (this.getReleaseDate() == null ? other.getReleaseDate() == null : this.getReleaseDate().equals(other.getReleaseDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReleaseId() == null) ? 0 : getReleaseId().hashCode());
        result = prime * result + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        result = prime * result + ((getReleaseFromUserid() == null) ? 0 : getReleaseFromUserid().hashCode());
        result = prime * result + ((getReleaseFromUsername() == null) ? 0 : getReleaseFromUsername().hashCode());
        result = prime * result + ((getReleaseToDetpid() == null) ? 0 : getReleaseToDetpid().hashCode());
        result = prime * result + ((getReleaseDetpname() == null) ? 0 : getReleaseDetpname().hashCode());
        result = prime * result + ((getReleaseToUserid() == null) ? 0 : getReleaseToUserid().hashCode());
        result = prime * result + ((getReleaseToUsername() == null) ? 0 : getReleaseToUsername().hashCode());
        result = prime * result + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        return result;
    }
}