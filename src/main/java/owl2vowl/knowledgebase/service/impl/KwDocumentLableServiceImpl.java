package owl2vowl.knowledgebase.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import owl2vowl.knowledgebase.dao.KwDocumentLableMapper;
import owl2vowl.knowledgebase.dao.KwDocumentPageviewMapper;
import owl2vowl.knowledgebase.entity.KwDocumentLable;
import owl2vowl.knowledgebase.entity.KwDocumentLableExample;
import owl2vowl.knowledgebase.entity.KwDocumentPageview;
import owl2vowl.knowledgebase.entity.KwDocumentPageviewExample;
import owl2vowl.knowledgebase.service.KwDocumentLableService;
import owl2vowl.knowledgebase.service.KwDocumentPageviewService;

import java.util.List;

@Service
public class KwDocumentLableServiceImpl implements KwDocumentLableService {

    @Autowired
    KwDocumentLableMapper KwDocumentLableMapper;


    @Override
    public List<KwDocumentLable> selectPathResult(String lableName) {
        return KwDocumentLableMapper.selectPathResult(lableName);
    }

	@Override
	public List<KwDocumentLable> selectByExample(KwDocumentLableExample example) {
		return KwDocumentLableMapper.selectByExample(example);
	}
    
    @Override
    public KwDocumentLable getLableId(int id) {
        return KwDocumentLableMapper.getLableId(id);
    }

    @Override
    public int updateByExample(@Param("record") KwDocumentLable record, @Param("example") KwDocumentLableExample example) {
        return KwDocumentLableMapper.updateByExample(record,example);
    }

    @Override
    public int insert(KwDocumentLable record) {
        return KwDocumentLableMapper.insert(record);
    }

    @Override
    public int deleteLableId(int id) {
        return KwDocumentLableMapper.deleteLableId(id);
    }

    @Override
    public List<KwDocumentLable> selectByPageLable(KwDocumentLable kwDocumentLable) {
        return KwDocumentLableMapper.selectByPageLable(kwDocumentLable);
    }

    @Override
    public int deleteLablePreId(int preId) {
        return KwDocumentLableMapper.deleteLablePreId(preId);
    }
}
