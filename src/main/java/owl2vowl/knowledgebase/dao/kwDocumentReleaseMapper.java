package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.kwDocumentRelease;
import owl2vowl.knowledgebase.entity.kwDocumentReleaseExample;
@Mapper
public interface kwDocumentReleaseMapper {
    long countByExample(kwDocumentReleaseExample example);

    int deleteByExample(kwDocumentReleaseExample example);

    int deleteByPrimaryKey(Integer releaseId);

    int insert(kwDocumentRelease record);

    int insertSelective(kwDocumentRelease record);
    
    int batchInsert(List<kwDocumentRelease> record);

    List<kwDocumentRelease> selectByExample(kwDocumentReleaseExample example);
 
    List<String> queryDeptIdListByDocumentId(@Param("documentId")Integer documentId);
    
    List<String> queryUserIdListByDocumentId(@Param("documentId")Integer documentId);

    
    kwDocumentRelease selectByPrimaryKey(Integer releaseId);

    int updateByExampleSelective(@Param("record") kwDocumentRelease record, @Param("example") kwDocumentReleaseExample example);

    int updateByExample(@Param("record") kwDocumentRelease record, @Param("example") kwDocumentReleaseExample example);

    int updateByPrimaryKeySelective(kwDocumentRelease record);

    int updateByPrimaryKey(kwDocumentRelease record);
}