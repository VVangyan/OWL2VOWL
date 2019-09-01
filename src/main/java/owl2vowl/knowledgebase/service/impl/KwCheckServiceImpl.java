package owl2vowl.knowledgebase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import owl2vowl.knowledgebase.dao.KwCheckMapper;
import owl2vowl.knowledgebase.entity.KwCheck;
import owl2vowl.knowledgebase.entity.KwCheckExample;
import owl2vowl.knowledgebase.service.KwCheckService;

import java.util.List;

@Service
public class KwCheckServiceImpl implements KwCheckService {
    @Autowired
    private KwCheckMapper kwCheckMapper;

    @Override
    public long countByExample(KwCheckExample example) {
        return kwCheckMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(KwCheckExample example) {
        return kwCheckMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer checkId) {
        return kwCheckMapper.deleteByPrimaryKey(checkId);
    }

    @Override
    public int insert(KwCheck record) {
        return kwCheckMapper.insert(record);
    }

    @Override
    public int insertSelective(KwCheck record) {
        return kwCheckMapper.insertSelective(record);
    }

    @Override
    public List<KwCheck> selectByExample(KwCheckExample example) {
        return kwCheckMapper.selectByExample(example);
    }

    @Override
    public KwCheck selectByPrimaryKey(Integer checkId) {
        return kwCheckMapper.selectByPrimaryKey(checkId);
    }

    @Override
    public int updateByExampleSelective(KwCheck record, KwCheckExample example) {
        return kwCheckMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(KwCheck record, KwCheckExample example) {
        return kwCheckMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(KwCheck record) {
        return kwCheckMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(KwCheck record) {
        return kwCheckMapper.updateByPrimaryKey(record);
    }
}
