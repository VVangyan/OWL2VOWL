package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class KpkcRelation implements Serializable {
    private Integer kpId;

    private Integer keywordId;

    private static final long serialVersionUID = 1L;

    public Integer getKpId() {
        return kpId;
    }

    public void setKpId(Integer kpId) {
        this.kpId = kpId;
    }

    public Integer getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Integer keywordId) {
        this.keywordId = keywordId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", kpId=").append(kpId);
        sb.append(", keywordId=").append(keywordId);
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
        KpkcRelation other = (KpkcRelation) that;
        return (this.getKpId() == null ? other.getKpId() == null : this.getKpId().equals(other.getKpId()))
            && (this.getKeywordId() == null ? other.getKeywordId() == null : this.getKeywordId().equals(other.getKeywordId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKpId() == null) ? 0 : getKpId().hashCode());
        result = prime * result + ((getKeywordId() == null) ? 0 : getKeywordId().hashCode());
        return result;
    }
}