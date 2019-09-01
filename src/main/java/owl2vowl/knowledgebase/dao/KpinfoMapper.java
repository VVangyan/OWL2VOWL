package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.Kpinfo;
import owl2vowl.knowledgebase.entity.KpinfoExample;
@Mapper
public interface KpinfoMapper {
    long countByExample(KpinfoExample example);

    int deleteByExample(KpinfoExample example);

    int deleteByPrimaryKey(Integer kpId);

    int insert(Kpinfo record);

    int insertSelective(Kpinfo record);

    List<Kpinfo> selectByExample(KpinfoExample example);

    Kpinfo selectByPrimaryKey(Integer kpId);

    int updateByExampleSelective(@Param("record") Kpinfo record, @Param("example") KpinfoExample example);

    int updateByExample(@Param("record") Kpinfo record, @Param("example") KpinfoExample example);

    int updateByPrimaryKeySelective(Kpinfo record);

    int updateByPrimaryKey(Kpinfo record);
}