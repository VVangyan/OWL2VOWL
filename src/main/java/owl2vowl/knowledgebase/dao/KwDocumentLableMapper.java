package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.KwDocumentLable;
import owl2vowl.knowledgebase.entity.KwDocumentLableExample;
@Mapper
public interface KwDocumentLableMapper {
    long countByExample(KwDocumentLableExample example);

    int deleteByExample(KwDocumentLableExample example);

    int insertSelective(KwDocumentLable record);

    List<KwDocumentLable> selectByExample(KwDocumentLableExample example);

    int updateByExampleSelective(@Param("record") KwDocumentLable record, @Param("example") KwDocumentLableExample example);

    int updateByExample(@Param("record") KwDocumentLable record, @Param("example") KwDocumentLableExample example);

    List<KwDocumentLable> selectPathResult(String lableName);

    /******************************华丽丽的分割线**********************************/

    KwDocumentLable getLableId(int id);  //根据id获取详情

    int deleteLableId(int id);  //删除父标签

    int insert(KwDocumentLable record);  //添加标签

    int deleteLablePreId(int preId); //删除全部子标签

    List<KwDocumentLable> selectByPageLable(KwDocumentLable kwDocumentLable);  //标签分页查询






}