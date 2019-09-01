package owl2vowl.knowledgebase.service;

import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.KwDocumentLable;
import owl2vowl.knowledgebase.entity.KwDocumentLableExample;

import java.util.List;

public interface KwDocumentLableService {

    List<KwDocumentLable> selectPathResult(String lableName);
    
    List<KwDocumentLable> selectByExample(KwDocumentLableExample example);

    KwDocumentLable getLableId(int id);

    int updateByExample(@Param("record") KwDocumentLable record, @Param("example") KwDocumentLableExample example);

    int insert(KwDocumentLable record);

    int deleteLableId(int id);

    List<KwDocumentLable> selectByPageLable(KwDocumentLable kwDocumentLable);

    int deleteLablePreId(int preId); //删除全部子标签

}