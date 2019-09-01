package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;

public class KwDownloadLog implements Serializable {
    private Integer id;

    private Date downTime;

    private String fileType;

    private Integer size;

    private String downloadUsername;

    private Integer downloadUserid;

    private Integer fileId;

    private String fileName;

    private String documentType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDownTime() {
        return downTime;
    }

    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getDownloadUsername() {
        return downloadUsername;
    }

    public void setDownloadUsername(String downloadUsername) {
        this.downloadUsername = downloadUsername == null ? null : downloadUsername.trim();
    }

    public Integer getDownloadUserid() {
        return downloadUserid;
    }

    public void setDownloadUserid(Integer downloadUserid) {
        this.downloadUserid = downloadUserid;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", downTime=").append(downTime);
        sb.append(", fileType=").append(fileType);
        sb.append(", size=").append(size);
        sb.append(", downloadUsername=").append(downloadUsername);
        sb.append(", downloadUserid=").append(downloadUserid);
        sb.append(", fileId=").append(fileId);
        sb.append(", fileName=").append(fileName);
        sb.append(", documentType=").append(documentType);
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
        KwDownloadLog other = (KwDownloadLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDownTime() == null ? other.getDownTime() == null : this.getDownTime().equals(other.getDownTime()))
            && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getDownloadUsername() == null ? other.getDownloadUsername() == null : this.getDownloadUsername().equals(other.getDownloadUsername()))
            && (this.getDownloadUserid() == null ? other.getDownloadUserid() == null : this.getDownloadUserid().equals(other.getDownloadUserid()))
            && (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getDocumentType() == null ? other.getDocumentType() == null : this.getDocumentType().equals(other.getDocumentType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDownTime() == null) ? 0 : getDownTime().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getDownloadUsername() == null) ? 0 : getDownloadUsername().hashCode());
        result = prime * result + ((getDownloadUserid() == null) ? 0 : getDownloadUserid().hashCode());
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        return result;
    }
}