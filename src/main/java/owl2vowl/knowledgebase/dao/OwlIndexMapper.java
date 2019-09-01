package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.OwlIndex;
import owl2vowl.knowledgebase.entity.OwlIndexExample;
@Mapper
public interface OwlIndexMapper {
    long countByExample(OwlIndexExample example);

    int deleteByExample(OwlIndexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OwlIndex record);

    int insertSelective(OwlIndex record);

    List<OwlIndex> selectByExample(OwlIndexExample example);

    OwlIndex selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OwlIndex record, @Param("example") OwlIndexExample example);

    int updateByExample(@Param("record") OwlIndex record, @Param("example") OwlIndexExample example);

    int updateByPrimaryKeySelective(OwlIndex record);

    int updateByPrimaryKey(OwlIndex record);
}