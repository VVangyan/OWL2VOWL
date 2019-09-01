/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  OutSysUserServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年9月17日 上午11:16:38   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.OutSysUserMapper;
import owl2vowl.knowledgebase.entity.OutSysUser;
import owl2vowl.knowledgebase.entity.OutSysUserExample;
import owl2vowl.knowledgebase.service.OutSysUserService;

/**
 * @author yan
 *
 */
@Service
public class OutSysUserServiceImpl implements OutSysUserService {
	@Autowired
	private OutSysUserMapper outSysUserMapper;

	@Override
	public long countByExample(OutSysUserExample example) {
		return outSysUserMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OutSysUserExample example) {
		return outSysUserMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return outSysUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(OutSysUser record) {
		return outSysUserMapper.insert(record);
	}

	@Override
	public int insertSelective(OutSysUser record) {
		return outSysUserMapper.insertSelective(record);
	}

	@Override
	public List<OutSysUser> selectByExample(OutSysUserExample example) {
		return outSysUserMapper.selectByExample(example);
	}

	@Override
	public OutSysUser selectByPrimaryKey(String id) {
		return outSysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(OutSysUser record, OutSysUserExample example) {
		return outSysUserMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(OutSysUser record, OutSysUserExample example) {
		return outSysUserMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(OutSysUser record) {
		return outSysUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OutSysUser record) {
		return outSysUserMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<HashMap<Object, Object>> selectUserMap() {
		return outSysUserMapper.selectUserMap();
	}

}
