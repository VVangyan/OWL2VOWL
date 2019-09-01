package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class EntityRelation implements Serializable {
    private Integer id;

    private String entity1Code;

    private String entity2Code;

    private String entity1Name;

    private String entity2Name;

    private String relation;

    private String syncFlag;

    private Integer secretflag;

    private String owlCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntity1Code() {
        return entity1Code;
    }

    public void setEntity1Code(String entity1Code) {
        this.entity1Code = entity1Code == null ? null : entity1Code.trim();
    }

    public String getEntity2Code() {
        return entity2Code;
    }

    public void setEntity2Code(String entity2Code) {
        this.entity2Code = entity2Code == null ? null : entity2Code.trim();
    }

    public String getEntity1Name() {
        return entity1Name;
    }

    public void setEntity1Name(String entity1Name) {
        this.entity1Name = entity1Name == null ? null : entity1Name.trim();
    }

    public String getEntity2Name() {
        return entity2Name;
    }

    public void setEntity2Name(String entity2Name) {
        this.entity2Name = entity2Name == null ? null : entity2Name.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getSyncFlag() {
        return syncFlag;
    }

    public void setSyncFlag(String syncFlag) {
        this.syncFlag = syncFlag == null ? null : syncFlag.trim();
    }

    public Integer getSecretflag() {
        return secretflag;
    }

    public void setSecretflag(Integer secretflag) {
        this.secretflag = secretflag;
    }

    public String getOwlCode() {
        return owlCode;
    }

    public void setOwlCode(String owlCode) {
        this.owlCode = owlCode == null ? null : owlCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", entity1Code=").append(entity1Code);
        sb.append(", entity2Code=").append(entity2Code);
        sb.append(", entity1Name=").append(entity1Name);
        sb.append(", entity2Name=").append(entity2Name);
        sb.append(", relation=").append(relation);
        sb.append(", syncFlag=").append(syncFlag);
        sb.append(", secretflag=").append(secretflag);
        sb.append(", owlCode=").append(owlCode);
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
        EntityRelation other = (EntityRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEntity1Code() == null ? other.getEntity1Code() == null : this.getEntity1Code().equals(other.getEntity1Code()))
            && (this.getEntity2Code() == null ? other.getEntity2Code() == null : this.getEntity2Code().equals(other.getEntity2Code()))
            && (this.getEntity1Name() == null ? other.getEntity1Name() == null : this.getEntity1Name().equals(other.getEntity1Name()))
            && (this.getEntity2Name() == null ? other.getEntity2Name() == null : this.getEntity2Name().equals(other.getEntity2Name()))
            && (this.getRelation() == null ? other.getRelation() == null : this.getRelation().equals(other.getRelation()))
            && (this.getSyncFlag() == null ? other.getSyncFlag() == null : this.getSyncFlag().equals(other.getSyncFlag()))
            && (this.getSecretflag() == null ? other.getSecretflag() == null : this.getSecretflag().equals(other.getSecretflag()))
            && (this.getOwlCode() == null ? other.getOwlCode() == null : this.getOwlCode().equals(other.getOwlCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEntity1Code() == null) ? 0 : getEntity1Code().hashCode());
        result = prime * result + ((getEntity2Code() == null) ? 0 : getEntity2Code().hashCode());
        result = prime * result + ((getEntity1Name() == null) ? 0 : getEntity1Name().hashCode());
        result = prime * result + ((getEntity2Name() == null) ? 0 : getEntity2Name().hashCode());
        result = prime * result + ((getRelation() == null) ? 0 : getRelation().hashCode());
        result = prime * result + ((getSyncFlag() == null) ? 0 : getSyncFlag().hashCode());
        result = prime * result + ((getSecretflag() == null) ? 0 : getSecretflag().hashCode());
        result = prime * result + ((getOwlCode() == null) ? 0 : getOwlCode().hashCode());
        return result;
    }
}