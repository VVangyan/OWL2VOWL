package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class EntityInfo implements Serializable {
    private Integer id;

    private String entityCode;

    private String entityName;

    private String entityType;

    private String entityPro;

    private String createdate;

    private String owlCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode == null ? null : entityCode.trim();
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName == null ? null : entityName.trim();
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType == null ? null : entityType.trim();
    }

    public String getEntityPro() {
        return entityPro;
    }

    public void setEntityPro(String entityPro) {
        this.entityPro = entityPro == null ? null : entityPro.trim();
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
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
        sb.append(", entityCode=").append(entityCode);
        sb.append(", entityName=").append(entityName);
        sb.append(", entityType=").append(entityType);
        sb.append(", entityPro=").append(entityPro);
        sb.append(", createdate=").append(createdate);
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
        EntityInfo other = (EntityInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEntityCode() == null ? other.getEntityCode() == null : this.getEntityCode().equals(other.getEntityCode()))
            && (this.getEntityName() == null ? other.getEntityName() == null : this.getEntityName().equals(other.getEntityName()))
            && (this.getEntityType() == null ? other.getEntityType() == null : this.getEntityType().equals(other.getEntityType()))
            && (this.getEntityPro() == null ? other.getEntityPro() == null : this.getEntityPro().equals(other.getEntityPro()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getOwlCode() == null ? other.getOwlCode() == null : this.getOwlCode().equals(other.getOwlCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEntityCode() == null) ? 0 : getEntityCode().hashCode());
        result = prime * result + ((getEntityName() == null) ? 0 : getEntityName().hashCode());
        result = prime * result + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        result = prime * result + ((getEntityPro() == null) ? 0 : getEntityPro().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getOwlCode() == null) ? 0 : getOwlCode().hashCode());
        return result;
    }
}