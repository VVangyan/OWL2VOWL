package owl2vowl.knowledgebase.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import owl2vowl.knowledgebase.entity.KwOfficeToPdf;
import owl2vowl.knowledgebase.entity.KwOfficeToPdfExample;
public interface KwOfficeToPdfService {
    long countByExample(KwOfficeToPdfExample example);

    int deleteByExample(KwOfficeToPdfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KwOfficeToPdf record);

    int insertSelective(KwOfficeToPdf record);

    List<KwOfficeToPdf> selectByExample(KwOfficeToPdfExample example);

    KwOfficeToPdf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KwOfficeToPdf record, @Param("example") KwOfficeToPdfExample example);

    int updateByExample(@Param("record") KwOfficeToPdf record, @Param("example") KwOfficeToPdfExample example);

    int updateByPrimaryKeySelective(KwOfficeToPdf record);

    int updateByPrimaryKey(KwOfficeToPdf record);
}