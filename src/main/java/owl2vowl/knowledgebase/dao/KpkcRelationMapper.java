package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.KpkcRelation;
import owl2vowl.knowledgebase.entity.KpkcRelationExample;
@Mapper
public interface KpkcRelationMapper {
    long countByExample(KpkcRelationExample example);

    int deleteByExample(KpkcRelationExample example);

    int insert(KpkcRelation record);

    int insertSelective(KpkcRelation record);

    List<KpkcRelation> selectByExample(KpkcRelationExample example);

    int updateByExampleSelective(@Param("record") KpkcRelation record, @Param("example") KpkcRelationExample example);

    int updateByExample(@Param("record") KpkcRelation record, @Param("example") KpkcRelationExample example);
}