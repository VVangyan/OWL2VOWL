package owl2vowl.knowledgebase.entity;

import java.io.Serializable;

public class PortletComponentInfo implements Serializable {
    private Integer pcId;

    private String portletId;

    private String portletTitle;

    private String portletCateid;

    private String portletCatename;

    private String ellipsis;

    private String showrows;

    private String isShowtime;

    private String isShowscroll;

    private String isRecursionflag;

    private String isTab;

    private Integer pageid;

    private String filepath;

    private String filename;

    private String isPer;

    private static final long serialVersionUID = 1L;

    public Integer getPcId() {
        return pcId;
    }

    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    public String getPortletId() {
        return portletId;
    }

    public void setPortletId(String portletId) {
        this.portletId = portletId == null ? null : portletId.trim();
    }

    public String getPortletTitle() {
        return portletTitle;
    }

    public void setPortletTitle(String portletTitle) {
        this.portletTitle = portletTitle == null ? null : portletTitle.trim();
    }

    public String getPortletCateid() {
        return portletCateid;
    }

    public void setPortletCateid(String portletCateid) {
        this.portletCateid = portletCateid == null ? null : portletCateid.trim();
    }

    public String getPortletCatename() {
        return portletCatename;
    }

    public void setPortletCatename(String portletCatename) {
        this.portletCatename = portletCatename == null ? null : portletCatename.trim();
    }

    public String getEllipsis() {
        return ellipsis;
    }

    public void setEllipsis(String ellipsis) {
        this.ellipsis = ellipsis == null ? null : ellipsis.trim();
    }

    public String getShowrows() {
        return showrows;
    }

    public void setShowrows(String showrows) {
        this.showrows = showrows == null ? null : showrows.trim();
    }

    public String getIsShowtime() {
        return isShowtime;
    }

    public void setIsShowtime(String isShowtime) {
        this.isShowtime = isShowtime == null ? null : isShowtime.trim();
    }

    public String getIsShowscroll() {
        return isShowscroll;
    }

    public void setIsShowscroll(String isShowscroll) {
        this.isShowscroll = isShowscroll == null ? null : isShowscroll.trim();
    }

    public String getIsRecursionflag() {
        return isRecursionflag;
    }

    public void setIsRecursionflag(String isRecursionflag) {
        this.isRecursionflag = isRecursionflag == null ? null : isRecursionflag.trim();
    }

    public String getIsTab() {
        return isTab;
    }

    public void setIsTab(String isTab) {
        this.isTab = isTab == null ? null : isTab.trim();
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getIsPer() {
        return isPer;
    }

    public void setIsPer(String isPer) {
        this.isPer = isPer == null ? null : isPer.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pcId=").append(pcId);
        sb.append(", portletId=").append(portletId);
        sb.append(", portletTitle=").append(portletTitle);
        sb.append(", portletCateid=").append(portletCateid);
        sb.append(", portletCatename=").append(portletCatename);
        sb.append(", ellipsis=").append(ellipsis);
        sb.append(", showrows=").append(showrows);
        sb.append(", isShowtime=").append(isShowtime);
        sb.append(", isShowscroll=").append(isShowscroll);
        sb.append(", isRecursionflag=").append(isRecursionflag);
        sb.append(", isTab=").append(isTab);
        sb.append(", pageid=").append(pageid);
        sb.append(", filepath=").append(filepath);
        sb.append(", filename=").append(filename);
        sb.append(", isPer=").append(isPer);
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
        PortletComponentInfo other = (PortletComponentInfo) that;
        return (this.getPcId() == null ? other.getPcId() == null : this.getPcId().equals(other.getPcId()))
            && (this.getPortletId() == null ? other.getPortletId() == null : this.getPortletId().equals(other.getPortletId()))
            && (this.getPortletTitle() == null ? other.getPortletTitle() == null : this.getPortletTitle().equals(other.getPortletTitle()))
            && (this.getPortletCateid() == null ? other.getPortletCateid() == null : this.getPortletCateid().equals(other.getPortletCateid()))
            && (this.getPortletCatename() == null ? other.getPortletCatename() == null : this.getPortletCatename().equals(other.getPortletCatename()))
            && (this.getEllipsis() == null ? other.getEllipsis() == null : this.getEllipsis().equals(other.getEllipsis()))
            && (this.getShowrows() == null ? other.getShowrows() == null : this.getShowrows().equals(other.getShowrows()))
            && (this.getIsShowtime() == null ? other.getIsShowtime() == null : this.getIsShowtime().equals(other.getIsShowtime()))
            && (this.getIsShowscroll() == null ? other.getIsShowscroll() == null : this.getIsShowscroll().equals(other.getIsShowscroll()))
            && (this.getIsRecursionflag() == null ? other.getIsRecursionflag() == null : this.getIsRecursionflag().equals(other.getIsRecursionflag()))
            && (this.getIsTab() == null ? other.getIsTab() == null : this.getIsTab().equals(other.getIsTab()))
            && (this.getPageid() == null ? other.getPageid() == null : this.getPageid().equals(other.getPageid()))
            && (this.getFilepath() == null ? other.getFilepath() == null : this.getFilepath().equals(other.getFilepath()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getIsPer() == null ? other.getIsPer() == null : this.getIsPer().equals(other.getIsPer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPcId() == null) ? 0 : getPcId().hashCode());
        result = prime * result + ((getPortletId() == null) ? 0 : getPortletId().hashCode());
        result = prime * result + ((getPortletTitle() == null) ? 0 : getPortletTitle().hashCode());
        result = prime * result + ((getPortletCateid() == null) ? 0 : getPortletCateid().hashCode());
        result = prime * result + ((getPortletCatename() == null) ? 0 : getPortletCatename().hashCode());
        result = prime * result + ((getEllipsis() == null) ? 0 : getEllipsis().hashCode());
        result = prime * result + ((getShowrows() == null) ? 0 : getShowrows().hashCode());
        result = prime * result + ((getIsShowtime() == null) ? 0 : getIsShowtime().hashCode());
        result = prime * result + ((getIsShowscroll() == null) ? 0 : getIsShowscroll().hashCode());
        result = prime * result + ((getIsRecursionflag() == null) ? 0 : getIsRecursionflag().hashCode());
        result = prime * result + ((getIsTab() == null) ? 0 : getIsTab().hashCode());
        result = prime * result + ((getPageid() == null) ? 0 : getPageid().hashCode());
        result = prime * result + ((getFilepath() == null) ? 0 : getFilepath().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getIsPer() == null) ? 0 : getIsPer().hashCode());
        return result;
    }
}