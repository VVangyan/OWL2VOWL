package owl2vowl.knowledgebase.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.KwDocument;
import owl2vowl.knowledgebase.entity.KwDocumentExample;
import owl2vowl.knowledgebase.entity.Read;

@Mapper
public interface KwDocumentMapper {
    long countByExample(KwDocumentExample example);

    int deleteByExample(KwDocumentExample example);

    int deleteByPrimaryKey(Integer documentId);

    int insert(KwDocument record);

    int insertSelective(KwDocument record);

    List<KwDocument> selectByExample(KwDocumentExample example);
    
    List<KwDocument> selectPathResult(KwDocument kwDocument);
    
    List<KwDocument> selectKwByUserOrDept(@Param("params") Map params);

    KwDocument selectByPrimaryKey(Integer documentId);

    int updateByExampleSelective(@Param("record") KwDocument record, @Param("example") KwDocumentExample example);

    int updateByExample(@Param("record") KwDocument record, @Param("example") KwDocumentExample example);

    int updateByPrimaryKeySelective(KwDocument record);

    int updateByPrimaryKey(KwDocument record);
    
    List<KwDocument> getKwBySemantics(@Param("params") List<String> params);

    //欢迎页面头部数据获取
    Read selectHeadDate(KwDocument kwDocument);

    //欢迎页面饼图1数据获取
    Read selectRecommend1(KwDocument kwDocument);

    //欢迎页面饼图2数据获取
    Read selectRecommend2(KwDocument kwDocument);

}