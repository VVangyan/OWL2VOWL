package owl2vowl.knowledgebase.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.OutSysDept;
import owl2vowl.knowledgebase.entity.OutSysDeptExample;
@Mapper
public interface OutSysDeptMapper {
    long countByExample(OutSysDeptExample example);

    int deleteByExample(OutSysDeptExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutSysDept record);

    int insertSelective(OutSysDept record);

    List<OutSysDept> selectByExample(OutSysDeptExample example);

    OutSysDept selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutSysDept record, @Param("example") OutSysDeptExample example);

    int updateByExample(@Param("record") OutSysDept record, @Param("example") OutSysDeptExample example);

    int updateByPrimaryKeySelective(OutSysDept record);

    int updateByPrimaryKey(OutSysDept record);

    List<HashMap<Object,Object>> selectMapResutl();
}