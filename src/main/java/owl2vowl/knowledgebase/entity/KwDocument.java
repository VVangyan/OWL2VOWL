package owl2vowl.knowledgebase.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

import owl2vowl.common.validator.group.AddGroup;
import owl2vowl.common.validator.group.UpdateGroup;

public class KwDocument implements Serializable {
    private Integer documentId;

    @NotBlank(message="参数名不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String documentOrigin;

    @NotBlank(message="作者不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String documentAuthor;

    private Date documentUploadDate;

    @NotBlank(message="参数名不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String documentAbstract;

    @NotBlank(message="关键字不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String documentKeyword;

    private String documentTitle;
    
    private String documentType;

    private Integer documentSize;

    private String documentMarks;

    private String documentName;

    private String documentSaveurl;

    private Integer documentCategory;

    private Integer documentLable;

	private String userName;

	private String departmentName;
    
    private List<KwDocumentLabelMiddle>  lableList;
    
    //做转换用的
    private String  lableStrs;
    
    private Integer documentState;

    private List<FileInfos> files;
    
    private List<KwDocumentLabelMiddle> lableInfos;
    
    
    private static final long serialVersionUID = 1L;

    public KwDocument() {
    }
    
	public KwDocument(Integer documentId, String documentOrigin, String documentAuthor, Date documentUploadDate,
			String documentAbstract, String documentKeyword, String documentType, Integer documentSize,
			String documentMarks, String documentName, String documentSaveurl, Integer documentCategory,
			Integer documentLable, List<KwDocumentLabelMiddle> lableList, String lableStrs, Integer documentState,
			List<FileInfos> files, List<KwDocumentLabelMiddle> lableInfos) {
		super();
		this.documentId = documentId;
		this.documentOrigin = documentOrigin;
		this.documentAuthor = documentAuthor;
		this.documentUploadDate = documentUploadDate;
		this.documentAbstract = documentAbstract;
		this.documentKeyword = documentKeyword;
		this.documentType = documentType;
		this.documentSize = documentSize;
		this.documentMarks = documentMarks;
		this.documentName = documentName;
		this.documentSaveurl = documentSaveurl;
		this.documentCategory = documentCategory;
		this.documentLable = documentLable;
		this.lableList = lableList;
		this.lableStrs = lableStrs;
		this.documentState = documentState;
		this.files = files;
		this.lableInfos = lableInfos;
	}




	public KwDocument(String documentOrigin, String documentAuthor, Date documentUploadDate, String documentAbstract,
			String documentKeyword, String documentType, Integer documentSize, String documentMarks,
			String documentName, String documentSaveurl, Integer documentCategory, Integer documentLable,
			List<KwDocumentLabelMiddle> lableList, String lableStrs, Integer documentState, List<FileInfos> files) {
		super();
		this.documentOrigin = documentOrigin;
		this.documentAuthor = documentAuthor;
		this.documentUploadDate = documentUploadDate;
		this.documentAbstract = documentAbstract;
		this.documentKeyword = documentKeyword;
		this.documentType = documentType;
		this.documentSize = documentSize;
		this.documentMarks = documentMarks;
		this.documentName = documentName;
		this.documentSaveurl = documentSaveurl;
		this.documentCategory = documentCategory;
		this.documentLable = documentLable;
		this.lableList = lableList;
		this.lableStrs = lableStrs;
		this.documentState = documentState;
		this.files = files;
	}




	public KwDocument(String documentOrigin, String documentAuthor, Date documentUploadDate, String documentAbstract, String documentKeyword, String documentMarks) {
        this.documentOrigin = documentOrigin;
        this.documentAuthor = documentAuthor;
        this.documentUploadDate = documentUploadDate;
        this.documentAbstract = documentAbstract;
        this.documentKeyword = documentKeyword;
        this.documentMarks = documentMarks;
    }

    public KwDocument(Integer documentId, String documentOrigin, String documentAuthor, Date documentUploadDate, String documentAbstract, String documentKeyword, String documentType, Integer documentSize, String documentMarks, String documentName, String documentSaveurl, Integer documentCategory, Integer documentLable, Integer documentState) {
        this.documentId = documentId;
        this.documentOrigin = documentOrigin;
        this.documentAuthor = documentAuthor;
        this.documentUploadDate = documentUploadDate;
        this.documentAbstract = documentAbstract;
        this.documentKeyword = documentKeyword;
        this.documentType = documentType;
        this.documentSize = documentSize;
        this.documentMarks = documentMarks;
        this.documentName = documentName;
        this.documentSaveurl = documentSaveurl;
        this.documentCategory = documentCategory;
        this.documentLable = documentLable;
        this.documentState = documentState;
    }

    public KwDocument(String documentType, Integer documentSize, String documentName, String documentSaveurl) {
        this.documentType = documentType;
        this.documentSize = documentSize;
        this.documentName = documentName;
        this.documentSaveurl = documentSaveurl;
    }
    
    
    
    public String getDocumentTitle() {
		return documentTitle;
	}

	public void setDocumentTitle(String documentTitle) {
		this.documentTitle = documentTitle;
	}

	public List<KwDocumentLabelMiddle> getLableInfos() {
		return lableInfos;
	}

	public void setLableInfos(List<KwDocumentLabelMiddle> lableInfos) {
		this.lableInfos = lableInfos;
	}

	public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getDocumentOrigin() {
        return documentOrigin;
    }

    public void setDocumentOrigin(String documentOrigin) {
        this.documentOrigin = documentOrigin == null ? null : documentOrigin.trim();
    }

    public String getDocumentAuthor() {
        return documentAuthor;
    }

    public void setDocumentAuthor(String documentAuthor) {
        this.documentAuthor = documentAuthor == null ? null : documentAuthor.trim();
    }

    public Date getDocumentUploadDate() {
        return documentUploadDate;
    }

    public void setDocumentUploadDate(Date documentUploadDate) {
        this.documentUploadDate = documentUploadDate;
    }

    public String getDocumentAbstract() {
        return documentAbstract;
    }

    public void setDocumentAbstract(String documentAbstract) {
        this.documentAbstract = documentAbstract == null ? null : documentAbstract.trim();
    }

    public String getDocumentKeyword() {
        return documentKeyword;
    }

    public void setDocumentKeyword(String documentKeyword) {
        this.documentKeyword = documentKeyword == null ? null : documentKeyword.trim();
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
    }

    public Integer getDocumentSize() {
        return documentSize;
    }

    public void setDocumentSize(Integer documentSize) {
        this.documentSize = documentSize;
    }

    public String getDocumentMarks() {
        return documentMarks;
    }

    public void setDocumentMarks(String documentMarks) {
        this.documentMarks = documentMarks == null ? null : documentMarks.trim();
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName == null ? null : documentName.trim();
    }

    public String getDocumentSaveurl() {
        return documentSaveurl;
    }

    public void setDocumentSaveurl(String documentSaveurl) {
        this.documentSaveurl = documentSaveurl == null ? null : documentSaveurl.trim();
    }

    public Integer getDocumentCategory() {
        return documentCategory;
    }

    public void setDocumentCategory(Integer documentCategory) {
        this.documentCategory = documentCategory;
    }

    public Integer getDocumentLable() {
        return documentLable;
    }

    public void setDocumentLable(Integer documentLable) {
        this.documentLable = documentLable;
    }

    public Integer getDocumentState() {
        return documentState;
    }

    public void setDocumentState(Integer documentState) {
        this.documentState = documentState;
    }

	public List<FileInfos> getFiles() {
		return files;
	}

	public void setFiles(List<FileInfos> files) {
		this.files = files;
	}
	
	

	public List<KwDocumentLabelMiddle> getLableList() {
		return lableList;
	}

	public void setLableList(List<KwDocumentLabelMiddle> lableList) {
		this.lableList = lableList;
	}

	/**
	 * @param lableStrs the lableStrs to set
	 */
	public void setLableStrs(String lableStrs) {
		this.lableStrs = lableStrs;
	}
	
	/**
	 * @return the lableStrs
	 */
	public String getLableStrs() {
		return lableStrs;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "KwDocument [documentId=" + documentId + ", documentOrigin=" + documentOrigin + ", documentAuthor="
				+ documentAuthor + ", documentUploadDate=" + documentUploadDate + ", documentAbstract="
				+ documentAbstract + ", documentKeyword=" + documentKeyword + ", documentTitle=" + documentTitle
				+ ", documentType=" + documentType + ", documentSize=" + documentSize + ", documentMarks="
				+ documentMarks + ", documentName=" + documentName + ", documentSaveurl=" + documentSaveurl
				+ ", documentCategory=" + documentCategory + ", documentLable=" + documentLable + ", userName="
				+ userName + ", departmentName=" + departmentName + ", lableList=" + lableList + ", lableStrs="
				+ lableStrs + ", documentState=" + documentState + ", files=" + files + ", lableInfos=" + lableInfos
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documentAbstract == null) ? 0 : documentAbstract.hashCode());
		result = prime * result + ((documentAuthor == null) ? 0 : documentAuthor.hashCode());
		result = prime * result + ((documentCategory == null) ? 0 : documentCategory.hashCode());
		result = prime * result + ((documentId == null) ? 0 : documentId.hashCode());
		result = prime * result + ((documentKeyword == null) ? 0 : documentKeyword.hashCode());
		result = prime * result + ((documentLable == null) ? 0 : documentLable.hashCode());
		result = prime * result + ((documentMarks == null) ? 0 : documentMarks.hashCode());
		result = prime * result + ((documentName == null) ? 0 : documentName.hashCode());
		result = prime * result + ((documentOrigin == null) ? 0 : documentOrigin.hashCode());
		result = prime * result + ((documentSaveurl == null) ? 0 : documentSaveurl.hashCode());
		result = prime * result + ((documentSize == null) ? 0 : documentSize.hashCode());
		result = prime * result + ((documentState == null) ? 0 : documentState.hashCode());
		result = prime * result + ((documentType == null) ? 0 : documentType.hashCode());
		result = prime * result + ((documentUploadDate == null) ? 0 : documentUploadDate.hashCode());
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KwDocument other = (KwDocument) obj;
		if (documentAbstract == null) {
			if (other.documentAbstract != null)
				return false;
		} else if (!documentAbstract.equals(other.documentAbstract))
			return false;
		if (documentAuthor == null) {
			if (other.documentAuthor != null)
				return false;
		} else if (!documentAuthor.equals(other.documentAuthor))
			return false;
		if (documentCategory == null) {
			if (other.documentCategory != null)
				return false;
		} else if (!documentCategory.equals(other.documentCategory))
			return false;
		if (documentId == null) {
			if (other.documentId != null)
				return false;
		} else if (!documentId.equals(other.documentId))
			return false;
		if (documentKeyword == null) {
			if (other.documentKeyword != null)
				return false;
		} else if (!documentKeyword.equals(other.documentKeyword))
			return false;
		if (documentLable == null) {
			if (other.documentLable != null)
				return false;
		} else if (!documentLable.equals(other.documentLable))
			return false;
		if (documentMarks == null) {
			if (other.documentMarks != null)
				return false;
		} else if (!documentMarks.equals(other.documentMarks))
			return false;
		if (documentName == null) {
			if (other.documentName != null)
				return false;
		} else if (!documentName.equals(other.documentName))
			return false;
		if (documentOrigin == null) {
			if (other.documentOrigin != null)
				return false;
		} else if (!documentOrigin.equals(other.documentOrigin))
			return false;
		if (documentSaveurl == null) {
			if (other.documentSaveurl != null)
				return false;
		} else if (!documentSaveurl.equals(other.documentSaveurl))
			return false;
		if (documentSize == null) {
			if (other.documentSize != null)
				return false;
		} else if (!documentSize.equals(other.documentSize))
			return false;
		if (documentState == null) {
			if (other.documentState != null)
				return false;
		} else if (!documentState.equals(other.documentState))
			return false;
		if (documentType == null) {
			if (other.documentType != null)
				return false;
		} else if (!documentType.equals(other.documentType))
			return false;
		if (documentUploadDate == null) {
			if (other.documentUploadDate != null)
				return false;
		} else if (!documentUploadDate.equals(other.documentUploadDate))
			return false;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		return true;
	}
}