package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class KwSemantics implements Serializable {
    private Integer id;

    private String semanticsCode;

    private String semanticsName;

    private String relationType;

    private String relationSemanticsCode;

    private String relationSemanticsName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSemanticsCode() {
        return semanticsCode;
    }

    public void setSemanticsCode(String semanticsCode) {
        this.semanticsCode = semanticsCode == null ? null : semanticsCode.trim();
    }

    public String getSemanticsName() {
        return semanticsName;
    }

    public void setSemanticsName(String semanticsName) {
        this.semanticsName = semanticsName == null ? null : semanticsName.trim();
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    public String getRelationSemanticsCode() {
        return relationSemanticsCode;
    }

    public void setRelationSemanticsCode(String relationSemanticsCode) {
        this.relationSemanticsCode = relationSemanticsCode == null ? null : relationSemanticsCode.trim();
    }

    public String getRelationSemanticsName() {
        return relationSemanticsName;
    }

    public void setRelationSemanticsName(String relationSemanticsName) {
        this.relationSemanticsName = relationSemanticsName == null ? null : relationSemanticsName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", semanticsCode=").append(semanticsCode);
        sb.append(", semanticsName=").append(semanticsName);
        sb.append(", relationType=").append(relationType);
        sb.append(", relationSemanticsCode=").append(relationSemanticsCode);
        sb.append(", relationSemanticsName=").append(relationSemanticsName);
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
        KwSemantics other = (KwSemantics) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSemanticsCode() == null ? other.getSemanticsCode() == null : this.getSemanticsCode().equals(other.getSemanticsCode()))
            && (this.getSemanticsName() == null ? other.getSemanticsName() == null : this.getSemanticsName().equals(other.getSemanticsName()))
            && (this.getRelationType() == null ? other.getRelationType() == null : this.getRelationType().equals(other.getRelationType()))
            && (this.getRelationSemanticsCode() == null ? other.getRelationSemanticsCode() == null : this.getRelationSemanticsCode().equals(other.getRelationSemanticsCode()))
            && (this.getRelationSemanticsName() == null ? other.getRelationSemanticsName() == null : this.getRelationSemanticsName().equals(other.getRelationSemanticsName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSemanticsCode() == null) ? 0 : getSemanticsCode().hashCode());
        result = prime * result + ((getSemanticsName() == null) ? 0 : getSemanticsName().hashCode());
        result = prime * result + ((getRelationType() == null) ? 0 : getRelationType().hashCode());
        result = prime * result + ((getRelationSemanticsCode() == null) ? 0 : getRelationSemanticsCode().hashCode());
        result = prime * result + ((getRelationSemanticsName() == null) ? 0 : getRelationSemanticsName().hashCode());
        return result;
    }
}