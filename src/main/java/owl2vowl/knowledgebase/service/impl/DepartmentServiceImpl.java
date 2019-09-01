/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  DepartmentServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月12日 下午5:12:17   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.DepartmentMapper;
import owl2vowl.knowledgebase.entity.Department;
import owl2vowl.knowledgebase.entity.DepartmentExample;
import owl2vowl.knowledgebase.service.DepartmentService;

/**
 * @author yan
 *
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public long countByExample(DepartmentExample example) {
		return departmentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(DepartmentExample example) {
		return departmentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return departmentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Department record) {
		return departmentMapper.insert(record);
	}

	@Override
	public int insertSelective(Department record) {
		return departmentMapper.insertSelective(record);
	}

	@Override
	public List<Department> selectByExample(DepartmentExample example) {
		return departmentMapper.selectByExample(example);
	}

	@Override
	public Department selectByPrimaryKey(Integer id) {
		return departmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Department record, DepartmentExample example) {
		return departmentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Department record, DepartmentExample example) {
		return departmentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Department record) {
		return departmentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		return departmentMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<HashMap<Object, Object>> selectMapResutl() {
		return departmentMapper.selectMapResutl();
	}

}
