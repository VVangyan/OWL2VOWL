package owl2vowl.knowledgebase.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import owl2vowl.knowledgebase.entity.KwDocumentType;
import owl2vowl.knowledgebase.entity.KwDocumentTypeExample;

public interface KwDocumentTypeService {
	long countByExample(KwDocumentTypeExample example);

	int deleteByExample(KwDocumentTypeExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(KwDocumentType record);

	int insertSelective(KwDocumentType record);

	List<KwDocumentType> selectByExample(KwDocumentTypeExample example);

	KwDocumentType selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") KwDocumentType record,
			@Param("example") KwDocumentTypeExample example);

	int updateByExample(@Param("record") KwDocumentType record, @Param("example") KwDocumentTypeExample example);

	int updateByPrimaryKeySelective(KwDocumentType record);

	int updateByPrimaryKey(KwDocumentType record);
}