package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.OwlFileInfoMapper;
import owl2vowl.knowledgebase.entity.OwlFileInfo;
import owl2vowl.knowledgebase.entity.OwlFileInfoExample;
import owl2vowl.knowledgebase.service.OwlFileInfoService;

@Service
public class OwlFileInfoServiceImpl implements OwlFileInfoService {

	@Autowired
	OwlFileInfoMapper owlFileInfoMapper;

	@Override
	public long countByExample(OwlFileInfoExample example) {

		return owlFileInfoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OwlFileInfoExample example) {

		return owlFileInfoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {

		return owlFileInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(OwlFileInfo record) {

		return owlFileInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(OwlFileInfo record) {

		return owlFileInfoMapper.insertSelective(record);
	}

	@Override
	public List<OwlFileInfo> selectByExample(OwlFileInfoExample example) {

		return owlFileInfoMapper.selectByExample(example);
	}

	@Override
	public OwlFileInfo selectByPrimaryKey(Integer id) {

		return owlFileInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(OwlFileInfo record, OwlFileInfoExample example) {

		return owlFileInfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(OwlFileInfo record, OwlFileInfoExample example) {

		return owlFileInfoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(OwlFileInfo record) {

		return owlFileInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OwlFileInfo record) {

		return owlFileInfoMapper.updateByPrimaryKey(record);
	}

}
