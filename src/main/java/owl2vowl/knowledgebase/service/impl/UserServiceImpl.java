/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  UserServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月12日 下午5:12:43   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.UserMapper;
import owl2vowl.knowledgebase.entity.User;
import owl2vowl.knowledgebase.entity.UserExample;
import owl2vowl.knowledgebase.service.UserService;

/**
 * @author yan
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public long countByExample(UserExample example) {
		return userMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserExample example) {
		return userMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(User record) {
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}

	@Override
	public List<HashMap<Object, Object>> selectUserMap() {
		return userMapper.selectUserMap();
	}
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(User record, UserExample example) {
		return userMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(User record, UserExample example) {
		return userMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}
}
