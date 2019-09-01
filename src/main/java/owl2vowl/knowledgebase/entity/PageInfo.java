package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class PageInfo implements Serializable {
    private Integer pageId;

    private String pageName;

    private Integer createUserid;

    private String createUsername;

    private String deptid;

    private String pageUrl;

    private String uniqueName;

    private String pageStyle;

    private String attr1;

    private String attr2;

    private String pageConfig;

    private static final long serialVersionUID = 1L;

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername == null ? null : createUsername.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName == null ? null : uniqueName.trim();
    }

    public String getPageStyle() {
        return pageStyle;
    }

    public void setPageStyle(String pageStyle) {
        this.pageStyle = pageStyle == null ? null : pageStyle.trim();
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1 == null ? null : attr1.trim();
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2 == null ? null : attr2.trim();
    }

    public String getPageConfig() {
        return pageConfig;
    }

    public void setPageConfig(String pageConfig) {
        this.pageConfig = pageConfig == null ? null : pageConfig.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pageId=").append(pageId);
        sb.append(", pageName=").append(pageName);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", createUsername=").append(createUsername);
        sb.append(", deptid=").append(deptid);
        sb.append(", pageUrl=").append(pageUrl);
        sb.append(", uniqueName=").append(uniqueName);
        sb.append(", pageStyle=").append(pageStyle);
        sb.append(", attr1=").append(attr1);
        sb.append(", attr2=").append(attr2);
        sb.append(", pageConfig=").append(pageConfig);
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
        PageInfo other = (PageInfo) that;
        return (this.getPageId() == null ? other.getPageId() == null : this.getPageId().equals(other.getPageId()))
            && (this.getPageName() == null ? other.getPageName() == null : this.getPageName().equals(other.getPageName()))
            && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()))
            && (this.getCreateUsername() == null ? other.getCreateUsername() == null : this.getCreateUsername().equals(other.getCreateUsername()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getPageUrl() == null ? other.getPageUrl() == null : this.getPageUrl().equals(other.getPageUrl()))
            && (this.getUniqueName() == null ? other.getUniqueName() == null : this.getUniqueName().equals(other.getUniqueName()))
            && (this.getPageStyle() == null ? other.getPageStyle() == null : this.getPageStyle().equals(other.getPageStyle()))
            && (this.getAttr1() == null ? other.getAttr1() == null : this.getAttr1().equals(other.getAttr1()))
            && (this.getAttr2() == null ? other.getAttr2() == null : this.getAttr2().equals(other.getAttr2()))
            && (this.getPageConfig() == null ? other.getPageConfig() == null : this.getPageConfig().equals(other.getPageConfig()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPageId() == null) ? 0 : getPageId().hashCode());
        result = prime * result + ((getPageName() == null) ? 0 : getPageName().hashCode());
        result = prime * result + ((getCreateUserid() == null) ? 0 : getCreateUserid().hashCode());
        result = prime * result + ((getCreateUsername() == null) ? 0 : getCreateUsername().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getPageUrl() == null) ? 0 : getPageUrl().hashCode());
        result = prime * result + ((getUniqueName() == null) ? 0 : getUniqueName().hashCode());
        result = prime * result + ((getPageStyle() == null) ? 0 : getPageStyle().hashCode());
        result = prime * result + ((getAttr1() == null) ? 0 : getAttr1().hashCode());
        result = prime * result + ((getAttr2() == null) ? 0 : getAttr2().hashCode());
        result = prime * result + ((getPageConfig() == null) ? 0 : getPageConfig().hashCode());
        return result;
    }
}