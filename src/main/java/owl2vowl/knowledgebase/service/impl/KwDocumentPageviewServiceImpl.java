package owl2vowl.knowledgebase.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import owl2vowl.knowledgebase.dao.KwDocumentPageviewMapper;
import owl2vowl.knowledgebase.entity.KwDocumentPageview;
import owl2vowl.knowledgebase.entity.KwDocumentPageviewExample;
import owl2vowl.knowledgebase.service.KwDocumentPageviewService;

import java.util.List;

@Service
public class KwDocumentPageviewServiceImpl implements KwDocumentPageviewService{

    @Autowired
    KwDocumentPageviewMapper KwDocumentPageviewMapper;

    @Override
    public long countByExample(KwDocumentPageviewExample example) {
        return KwDocumentPageviewMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(KwDocumentPageviewExample example) {
        return KwDocumentPageviewMapper.deleteByExample(example);
    }

    @Override
    public int insert(owl2vowl.knowledgebase.entity.KwDocumentPageview record) {
        return KwDocumentPageviewMapper.insert(record);
    }

    @Override
    public int insertSelective(owl2vowl.knowledgebase.entity.KwDocumentPageview record) {
        return KwDocumentPageviewMapper.insertSelective(record);
    }

    @Override
    public List<owl2vowl.knowledgebase.entity.KwDocumentPageview> selectByExample(KwDocumentPageviewExample example) {
        return KwDocumentPageviewMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(@Param("record") owl2vowl.knowledgebase.entity.KwDocumentPageview record, @Param("example") KwDocumentPageviewExample example) {
        return KwDocumentPageviewMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(@Param("record") owl2vowl.knowledgebase.entity.KwDocumentPageview record, @Param("example") KwDocumentPageviewExample example) {
        return KwDocumentPageviewMapper.updateByExample(record,example);
    }

    @Override
    public List<KwDocumentPageview> selectKwDocumentPageviewUserRecords(KwDocumentPageview  kwDocumentPageview) {
        return KwDocumentPageviewMapper.selectKwDocumentPageviewUserRecords(kwDocumentPageview);
    }
}
