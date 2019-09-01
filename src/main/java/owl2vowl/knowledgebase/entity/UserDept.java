/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  UserDept.java   
 * @Package owl2vowl.knowledgebase.entity   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月12日 下午5:32:19   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.entity;

import java.util.List;

/**
 * @author yan
 *
 */
public class UserDept {

	private List<User> userList;

	private List<Department> deptList;
	
	private Integer documentId;

	public UserDept() {
	}
	public UserDept(List<User> userList, List<Department> deptList, Integer documentId) {
		super();
		this.userList = userList;
		this.deptList = deptList;
		this.documentId = documentId;
	}

	public UserDept(List<User> userList, List<Department> deptList) {
		super();
		this.userList = userList;
		this.deptList = deptList;
	}
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Department> deptList) {
		this.deptList = deptList;
	}

	public Integer getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}
	
	
}
