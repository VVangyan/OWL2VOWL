/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  OutSysDeptServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年9月17日 下午3:13:42   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.OutSysDeptMapper;
import owl2vowl.knowledgebase.entity.OutSysDept;
import owl2vowl.knowledgebase.entity.OutSysDeptExample;
import owl2vowl.knowledgebase.service.OutSysDeptService;

/**
 * @author yan
 *
 */
@Service
public class OutSysDeptServiceImpl implements OutSysDeptService {

	@Autowired
	private OutSysDeptMapper outSysDeptMapper;

	@Override
	public long countByExample(OutSysDeptExample example) {

		return outSysDeptMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OutSysDeptExample example) {

		return outSysDeptMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String id) {

		return outSysDeptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(OutSysDept record) {

		return outSysDeptMapper.insert(record);
	}

	@Override
	public int insertSelective(OutSysDept record) {

		return outSysDeptMapper.insertSelective(record);
	}

	@Override
	public List<OutSysDept> selectByExample(OutSysDeptExample example) {

		return outSysDeptMapper.selectByExample(example);
	}

	@Override
	public OutSysDept selectByPrimaryKey(String id) {

		return outSysDeptMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(OutSysDept record, OutSysDeptExample example) {

		return outSysDeptMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(OutSysDept record, OutSysDeptExample example) {

		return outSysDeptMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(OutSysDept record) {

		return outSysDeptMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OutSysDept record) {

		return outSysDeptMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<HashMap<Object, Object>> selectMapResutl() {
		return outSysDeptMapper.selectMapResutl();
	}

}
