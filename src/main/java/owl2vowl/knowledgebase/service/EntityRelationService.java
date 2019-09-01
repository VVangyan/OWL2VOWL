package owl2vowl.knowledgebase.service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.EntityRelation;
import owl2vowl.knowledgebase.entity.EntityRelationExample;

public interface EntityRelationService {
    long countByExample(EntityRelationExample example);

    int deleteByExample(EntityRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EntityRelation record);

    int insertSelective(EntityRelation record);

    List<EntityRelation> selectByExample(EntityRelationExample example);

    EntityRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EntityRelation record, @Param("example") EntityRelationExample example);

    int updateByExample(@Param("record") EntityRelation record, @Param("example") EntityRelationExample example);

    int updateByPrimaryKeySelective(EntityRelation record);

    int updateByPrimaryKey(EntityRelation record);
}