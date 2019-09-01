package owl2vowl.knowledgebase.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import owl2vowl.knowledgebase.entity.KwDocument;
import owl2vowl.knowledgebase.entity.KwFileLog;
import owl2vowl.knowledgebase.entity.KwFileLogExample;
public interface KwFileLogService {
    long countByExample(KwFileLogExample example);

    int deleteByExample(KwFileLogExample example);

    int deleteByPrimaryKey(Integer filedId);

    int insert(KwFileLog record);

    int insertSelective(KwFileLog record);

    List<KwFileLog> selectByExample(KwFileLogExample example);

    KwFileLog selectByPrimaryKey(Integer filedId);

    int updateByExampleSelective(@Param("record") KwFileLog record, @Param("example") KwFileLogExample example);

    int updateByExample(@Param("record") KwFileLog record, @Param("example") KwFileLogExample example);

    int updateByPrimaryKeySelective(KwFileLog record);

    int updateByPrimaryKey(KwFileLog record);
    
    List<KwFileLog> getKwBySemantics(@Param("params") List<String> params);
}