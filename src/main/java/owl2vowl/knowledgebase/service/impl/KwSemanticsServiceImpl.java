package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.KwSemanticsMapper;
import owl2vowl.knowledgebase.entity.KwSemantics;
import owl2vowl.knowledgebase.entity.KwSemanticsExample;
import owl2vowl.knowledgebase.service.KwSemanticsService;
@Service
public class KwSemanticsServiceImpl implements KwSemanticsService{

	
	@Autowired
	private KwSemanticsMapper kwSemanticsMapper;
	@Override
	public long countByExample(KwSemanticsExample example) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(KwSemanticsExample example) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(KwSemantics record) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.insert(record);
	}

	@Override
	public int insertSelective(KwSemantics record) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.insertSelective(record);
	}

	@Override
	public List<KwSemantics> selectByExample(KwSemanticsExample example) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.selectByExample(example);
	}

	@Override
	public KwSemantics selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(KwSemantics record, KwSemanticsExample example) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(KwSemantics record, KwSemanticsExample example) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(KwSemantics record) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(KwSemantics record) {
		// TODO Auto-generated method stub
		return kwSemanticsMapper.updateByPrimaryKey(record);
	}

}
