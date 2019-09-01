package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.KwDownloadLog;
import owl2vowl.knowledgebase.entity.KwDownloadLogExample;
@Mapper
public interface KwDownloadLogMapper {
    long countByExample(KwDownloadLogExample example);

    int deleteByExample(KwDownloadLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KwDownloadLog record);

    int insertSelective(KwDownloadLog record);

    List<KwDownloadLog> selectByExample(KwDownloadLogExample example);

    KwDownloadLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KwDownloadLog record, @Param("example") KwDownloadLogExample example);

    int updateByExample(@Param("record") KwDownloadLog record, @Param("example") KwDownloadLogExample example);

    int updateByPrimaryKeySelective(KwDownloadLog record);

    int updateByPrimaryKey(KwDownloadLog record);
}