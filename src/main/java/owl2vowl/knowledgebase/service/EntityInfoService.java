package owl2vowl.knowledgebase.service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.EntityInfo;
import owl2vowl.knowledgebase.entity.EntityInfoExample;

public interface EntityInfoService {
    long countByExample(EntityInfoExample example);

    int deleteByExample(EntityInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EntityInfo record);

    int insertSelective(EntityInfo record);

    List<EntityInfo> selectByExample(EntityInfoExample example);

    EntityInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EntityInfo record, @Param("example") EntityInfoExample example);

    int updateByExample(@Param("record") EntityInfo record, @Param("example") EntityInfoExample example);

    int updateByPrimaryKeySelective(EntityInfo record);

    int updateByPrimaryKey(EntityInfo record);
}