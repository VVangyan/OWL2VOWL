package owl2vowl.knowledgebase.service;

import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.KwDocumentPageview;
import owl2vowl.knowledgebase.entity.KwDocumentPageviewExample;

import java.util.List;

public interface KwDocumentPageviewService {
    long countByExample(KwDocumentPageviewExample example);

    int deleteByExample(KwDocumentPageviewExample example);

    int insert(KwDocumentPageview record);

    int insertSelective(KwDocumentPageview record);

    List<KwDocumentPageview> selectByExample(KwDocumentPageviewExample example);

    int updateByExampleSelective(@Param("record") KwDocumentPageview record, @Param("example") KwDocumentPageviewExample example);

    int updateByExample(@Param("record") KwDocumentPageview record, @Param("example") KwDocumentPageviewExample example);

    List<KwDocumentPageview> selectKwDocumentPageviewUserRecords(KwDocumentPageview  kwDocumentPageview);  //推荐记录展示查询
}