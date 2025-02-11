package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import owl2vowl.knowledgebase.entity.KwDocumentLabelMiddle;
import owl2vowl.knowledgebase.entity.KwDocumentLabelMiddleExample;
@Mapper
public interface KwDocumentLabelMiddleMapper {
    long countByExample(KwDocumentLabelMiddleExample example);

    int deleteByExample(KwDocumentLabelMiddleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KwDocumentLabelMiddle record);

    int insertSelective(KwDocumentLabelMiddle record);

    List<KwDocumentLabelMiddle> selectByExample(KwDocumentLabelMiddleExample example);

    KwDocumentLabelMiddle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KwDocumentLabelMiddle record, @Param("example") KwDocumentLabelMiddleExample example);

    int updateByExample(@Param("record") KwDocumentLabelMiddle record, @Param("example") KwDocumentLabelMiddleExample example);

    int updateByPrimaryKeySelective(KwDocumentLabelMiddle record);

    int updateByPrimaryKey(KwDocumentLabelMiddle record);
}