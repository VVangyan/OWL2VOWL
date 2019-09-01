package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.SenssorMonitor1;
import owl2vowl.knowledgebase.entity.SenssorMonitor1Example;
@Mapper
public interface SenssorMonitor1Mapper {
    long countByExample(SenssorMonitor1Example example);

    int deleteByExample(SenssorMonitor1Example example);

    int deleteByPrimaryKey(Long id);

    int insert(SenssorMonitor1 record);

    int insertSelective(SenssorMonitor1 record);

    List<SenssorMonitor1> selectByExample(SenssorMonitor1Example example);

    SenssorMonitor1 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SenssorMonitor1 record, @Param("example") SenssorMonitor1Example example);

    int updateByExample(@Param("record") SenssorMonitor1 record, @Param("example") SenssorMonitor1Example example);

    int updateByPrimaryKeySelective(SenssorMonitor1 record);

    int updateByPrimaryKey(SenssorMonitor1 record);
}