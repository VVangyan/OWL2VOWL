package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class PortletInfo implements Serializable {
    private Integer portletId;

    private String portletCode;

    private String portletName;

    private String editFlag;

    private String portlettype;

    private static final long serialVersionUID = 1L;

    public Integer getPortletId() {
        return portletId;
    }

    public void setPortletId(Integer portletId) {
        this.portletId = portletId;
    }

    public String getPortletCode() {
        return portletCode;
    }

    public void setPortletCode(String portletCode) {
        this.portletCode = portletCode == null ? null : portletCode.trim();
    }

    public String getPortletName() {
        return portletName;
    }

    public void setPortletName(String portletName) {
        this.portletName = portletName == null ? null : portletName.trim();
    }

    public String getEditFlag() {
        return editFlag;
    }

    public void setEditFlag(String editFlag) {
        this.editFlag = editFlag == null ? null : editFlag.trim();
    }

    public String getPortlettype() {
        return portlettype;
    }

    public void setPortlettype(String portlettype) {
        this.portlettype = portlettype == null ? null : portlettype.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", portletId=").append(portletId);
        sb.append(", portletCode=").append(portletCode);
        sb.append(", portletName=").append(portletName);
        sb.append(", editFlag=").append(editFlag);
        sb.append(", portlettype=").append(portlettype);
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
        PortletInfo other = (PortletInfo) that;
        return (this.getPortletId() == null ? other.getPortletId() == null : this.getPortletId().equals(other.getPortletId()))
            && (this.getPortletCode() == null ? other.getPortletCode() == null : this.getPortletCode().equals(other.getPortletCode()))
            && (this.getPortletName() == null ? other.getPortletName() == null : this.getPortletName().equals(other.getPortletName()))
            && (this.getEditFlag() == null ? other.getEditFlag() == null : this.getEditFlag().equals(other.getEditFlag()))
            && (this.getPortlettype() == null ? other.getPortlettype() == null : this.getPortlettype().equals(other.getPortlettype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPortletId() == null) ? 0 : getPortletId().hashCode());
        result = prime * result + ((getPortletCode() == null) ? 0 : getPortletCode().hashCode());
        result = prime * result + ((getPortletName() == null) ? 0 : getPortletName().hashCode());
        result = prime * result + ((getEditFlag() == null) ? 0 : getEditFlag().hashCode());
        result = prime * result + ((getPortlettype() == null) ? 0 : getPortlettype().hashCode());
        return result;
    }
}