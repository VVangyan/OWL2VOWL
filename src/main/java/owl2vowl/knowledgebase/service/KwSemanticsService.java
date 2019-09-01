package owl2vowl.knowledgebase.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import owl2vowl.knowledgebase.entity.KwSemantics;
import owl2vowl.knowledgebase.entity.KwSemanticsExample;

public interface KwSemanticsService {
	long countByExample(KwSemanticsExample example);

    int deleteByExample(KwSemanticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KwSemantics record);

    int insertSelective(KwSemantics record);

    List<KwSemantics> selectByExample(KwSemanticsExample example);

    KwSemantics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KwSemantics record, @Param("example") KwSemanticsExample example);

    int updateByExample(@Param("record") KwSemantics record, @Param("example") KwSemanticsExample example);

    int updateByPrimaryKeySelective(KwSemantics record);

    int updateByPrimaryKey(KwSemantics record);
}
