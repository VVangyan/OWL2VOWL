package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.PageInfo;
import owl2vowl.knowledgebase.entity.PageInfoExample;
@Mapper
public interface PageInfoMapper {
    long countByExample(PageInfoExample example);

    int deleteByExample(PageInfoExample example);

    int deleteByPrimaryKey(Integer pageId);

    int insert(PageInfo record);

    int insertSelective(PageInfo record);

    List<PageInfo> selectByExampleWithBLOBs(PageInfoExample example);

    List<PageInfo> selectByExample(PageInfoExample example);

    PageInfo selectByPrimaryKey(Integer pageId);

    int updateByExampleSelective(@Param("record") PageInfo record, @Param("example") PageInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") PageInfo record, @Param("example") PageInfoExample example);

    int updateByExample(@Param("record") PageInfo record, @Param("example") PageInfoExample example);

    int updateByPrimaryKeySelective(PageInfo record);

    int updateByPrimaryKeyWithBLOBs(PageInfo record);

    int updateByPrimaryKey(PageInfo record);
}