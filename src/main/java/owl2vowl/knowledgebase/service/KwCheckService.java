package owl2vowl.knowledgebase.service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.KwCheck;
import owl2vowl.knowledgebase.entity.KwCheckExample;

import java.util.List;

public interface KwCheckService {
    long countByExample(KwCheckExample example);

    int deleteByExample(KwCheckExample example);

    int deleteByPrimaryKey(Integer checkId);

    int insert(KwCheck record);

    int insertSelective(KwCheck record);

    List<KwCheck> selectByExample(KwCheckExample example);

    KwCheck selectByPrimaryKey(Integer checkId);

    int updateByExampleSelective(@Param("record") KwCheck record, @Param("example") KwCheckExample example);

    int updateByExample(@Param("record") KwCheck record, @Param("example") KwCheckExample example);

    int updateByPrimaryKeySelective(KwCheck record);

    int updateByPrimaryKey(KwCheck record);
}