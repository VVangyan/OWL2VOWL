package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;

public class KwCategory implements Serializable {
    private Integer categoryId;

    private String categoryName;

    private String categoryDesc;

    private Integer categoryLft;

    private Integer categoryRgt;

    private Date categoryDate;

    private static final long serialVersionUID = 1L;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc == null ? null : categoryDesc.trim();
    }

    public Integer getCategoryLft() {
        return categoryLft;
    }

    public void setCategoryLft(Integer categoryLft) {
        this.categoryLft = categoryLft;
    }

    public Integer getCategoryRgt() {
        return categoryRgt;
    }

    public void setCategoryRgt(Integer categoryRgt) {
        this.categoryRgt = categoryRgt;
    }

    public Date getCategoryDate() {
        return categoryDate;
    }

    public void setCategoryDate(Date categoryDate) {
        this.categoryDate = categoryDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryDesc=").append(categoryDesc);
        sb.append(", categoryLft=").append(categoryLft);
        sb.append(", categoryRgt=").append(categoryRgt);
        sb.append(", categoryDate=").append(categoryDate);
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
        KwCategory other = (KwCategory) that;
        return (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategoryDesc() == null ? other.getCategoryDesc() == null : this.getCategoryDesc().equals(other.getCategoryDesc()))
            && (this.getCategoryLft() == null ? other.getCategoryLft() == null : this.getCategoryLft().equals(other.getCategoryLft()))
            && (this.getCategoryRgt() == null ? other.getCategoryRgt() == null : this.getCategoryRgt().equals(other.getCategoryRgt()))
            && (this.getCategoryDate() == null ? other.getCategoryDate() == null : this.getCategoryDate().equals(other.getCategoryDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryDesc() == null) ? 0 : getCategoryDesc().hashCode());
        result = prime * result + ((getCategoryLft() == null) ? 0 : getCategoryLft().hashCode());
        result = prime * result + ((getCategoryRgt() == null) ? 0 : getCategoryRgt().hashCode());
        result = prime * result + ((getCategoryDate() == null) ? 0 : getCategoryDate().hashCode());
        return result;
    }
}