package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.EntityRelationMapper;
import owl2vowl.knowledgebase.entity.EntityRelation;
import owl2vowl.knowledgebase.entity.EntityRelationExample;
import owl2vowl.knowledgebase.service.EntityRelationService;

@Service
public class EntityRelationServiceImpl implements EntityRelationService {

	@Autowired
	EntityRelationMapper entityRelationMapper;

	@Override
	public long countByExample(EntityRelationExample example) {

		return entityRelationMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(EntityRelationExample example) {

		return entityRelationMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {

		return entityRelationMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(EntityRelation record) {

		return entityRelationMapper.insert(record);
	}

	@Override
	public int insertSelective(EntityRelation record) {

		return entityRelationMapper.insertSelective(record);
	}

	@Override
	public List<EntityRelation> selectByExample(EntityRelationExample example) {

		return entityRelationMapper.selectByExample(example);
	}

	@Override
	public EntityRelation selectByPrimaryKey(Integer id) {

		return entityRelationMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(EntityRelation record, EntityRelationExample example) {

		return entityRelationMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(EntityRelation record, EntityRelationExample example) {

		return entityRelationMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(EntityRelation record) {

		return entityRelationMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(EntityRelation record) {

		return entityRelationMapper.updateByPrimaryKey(record);
	}

}
