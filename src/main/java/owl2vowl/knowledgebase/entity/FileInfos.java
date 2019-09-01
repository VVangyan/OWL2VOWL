/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  FileInfos.java   
 * @Package owl2vowl.knowledgebase.entity   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月11日 下午3:28:42   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.entity;

/**
 * @author yan
 *
 */
public class FileInfos {
	private Integer filedid;
	private String documentName;
	private String documentSaveurl;
	public Integer getFiledid() {
		return filedid;
	}
	public void setFiledid(Integer filedid) {
		this.filedid = filedid;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentSaveurl() {
		return documentSaveurl;
	}
	public void setDocumentSaveurl(String documentSaveurl) {
		this.documentSaveurl = documentSaveurl;
	}
	public FileInfos() {
	}
	@Override
	public String toString() {
		return "FileInfos [filedid=" + filedid + ", documentName=" + documentName + ", documentSaveurl="
				+ documentSaveurl + "]";
	}
}
