package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;

public class KwFileLog implements Serializable {
    private Integer filedId;

    private Date uploadTime;

    private String type;

    private Double size;

    private String uploadUser;

    private String uploadUserid;

    private String filename;

    private String saveurl;

    private String documentType;

    private Integer doucmentId;

    private static final long serialVersionUID = 1L;
    
    public KwFileLog() {
    }

    public KwFileLog(String type, Double size, String filename, String saveurl) {
        this.type = type;
        this.size = size;
        this.filename = filename;
        this.saveurl = saveurl;
    }    

    public Integer getFiledId() {
        return filedId;
    }

    public void setFiledId(Integer filedId) {
        this.filedId = filedId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getUploadUser() {
        return uploadUser;
    }

    public void setUploadUser(String uploadUser) {
        this.uploadUser = uploadUser == null ? null : uploadUser.trim();
    }

    public String getUploadUserid() {
        return uploadUserid;
    }

    public void setUploadUserid(String uploadUserid) {
        this.uploadUserid = uploadUserid == null ? null : uploadUserid.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getSaveurl() {
        return saveurl;
    }

    public void setSaveurl(String saveurl) {
        this.saveurl = saveurl == null ? null : saveurl.trim();
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
    }

    public Integer getDoucmentId() {
        return doucmentId;
    }

    public void setDoucmentId(Integer doucmentId) {
        this.doucmentId = doucmentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", filedId=").append(filedId);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", type=").append(type);
        sb.append(", size=").append(size);
        sb.append(", uploadUser=").append(uploadUser);
        sb.append(", uploadUserid=").append(uploadUserid);
        sb.append(", filename=").append(filename);
        sb.append(", saveurl=").append(saveurl);
        sb.append(", documentType=").append(documentType);
        sb.append(", doucmentId=").append(doucmentId);
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
        KwFileLog other = (KwFileLog) that;
        return (this.getFiledId() == null ? other.getFiledId() == null : this.getFiledId().equals(other.getFiledId()))
            && (this.getUploadTime() == null ? other.getUploadTime() == null : this.getUploadTime().equals(other.getUploadTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getUploadUser() == null ? other.getUploadUser() == null : this.getUploadUser().equals(other.getUploadUser()))
            && (this.getUploadUserid() == null ? other.getUploadUserid() == null : this.getUploadUserid().equals(other.getUploadUserid()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getSaveurl() == null ? other.getSaveurl() == null : this.getSaveurl().equals(other.getSaveurl()))
            && (this.getDocumentType() == null ? other.getDocumentType() == null : this.getDocumentType().equals(other.getDocumentType()))
            && (this.getDoucmentId() == null ? other.getDoucmentId() == null : this.getDoucmentId().equals(other.getDoucmentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFiledId() == null) ? 0 : getFiledId().hashCode());
        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getUploadUser() == null) ? 0 : getUploadUser().hashCode());
        result = prime * result + ((getUploadUserid() == null) ? 0 : getUploadUserid().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getSaveurl() == null) ? 0 : getSaveurl().hashCode());
        result = prime * result + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        result = prime * result + ((getDoucmentId() == null) ? 0 : getDoucmentId().hashCode());
        return result;
    }
}