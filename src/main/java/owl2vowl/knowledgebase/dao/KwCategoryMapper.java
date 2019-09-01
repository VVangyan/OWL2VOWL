package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.KwCategory;
import owl2vowl.knowledgebase.entity.KwCategoryExample;
@Mapper
public interface KwCategoryMapper {
    long countByExample(KwCategoryExample example);

    int deleteByExample(KwCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(KwCategory record);

    int insertSelective(KwCategory record);

    List<KwCategory> selectByExample(KwCategoryExample example);

    KwCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") KwCategory record, @Param("example") KwCategoryExample example);

    int updateByExample(@Param("record") KwCategory record, @Param("example") KwCategoryExample example);

    int updateByPrimaryKeySelective(KwCategory record);

    int updateByPrimaryKey(KwCategory record);
}