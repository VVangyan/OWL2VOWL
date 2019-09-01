package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.EntityInfoMapper;
import owl2vowl.knowledgebase.entity.EntityInfo;
import owl2vowl.knowledgebase.entity.EntityInfoExample;
import owl2vowl.knowledgebase.service.EntityInfoService;

@Service
public class EntityInfoServiceImpl implements EntityInfoService {

	@Autowired
	EntityInfoMapper entityInfoMapper;

	@Override
	public long countByExample(EntityInfoExample example) {
		
		return entityInfoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(EntityInfoExample example) {
		
		return entityInfoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return entityInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(EntityInfo record) {
		
		return entityInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(EntityInfo record) {
		
		return entityInfoMapper.insertSelective(record);
	}

	@Override
	public List<EntityInfo> selectByExample(EntityInfoExample example) {
		
		return entityInfoMapper.selectByExample(example);
	}

	@Override
	public EntityInfo selectByPrimaryKey(Integer id) {
		
		return entityInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(EntityInfo record, EntityInfoExample example) {
		
		return entityInfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(EntityInfo record, EntityInfoExample example) {
		
		return entityInfoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(EntityInfo record) {
		
		return entityInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(EntityInfo record) {
		
		return entityInfoMapper.updateByPrimaryKey(record);
	}

}
