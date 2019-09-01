package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class KwDocumentLabelMiddle implements Serializable {
    private Integer id;

    private Integer lableId;

    private String lableName;

    private Integer documentId;

    private static final long serialVersionUID = 1L;

    
    
    public KwDocumentLabelMiddle() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public KwDocumentLabelMiddle(Integer lableId, String lableName, Integer documentId) {
		super();
		this.lableId = lableId;
		this.lableName = lableName;
		this.documentId = documentId;
	}



	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lableId=").append(lableId);
        sb.append(", lableName=").append(lableName);
        sb.append(", documentId=").append(documentId);
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
        KwDocumentLabelMiddle other = (KwDocumentLabelMiddle) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLableId() == null ? other.getLableId() == null : this.getLableId().equals(other.getLableId()))
            && (this.getLableName() == null ? other.getLableName() == null : this.getLableName().equals(other.getLableName()))
            && (this.getDocumentId() == null ? other.getDocumentId() == null : this.getDocumentId().equals(other.getDocumentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLableId() == null) ? 0 : getLableId().hashCode());
        result = prime * result + ((getLableName() == null) ? 0 : getLableName().hashCode());
        result = prime * result + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        return result;
    }
}