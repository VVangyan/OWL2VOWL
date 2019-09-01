package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.SensorMonitor;
import owl2vowl.knowledgebase.entity.SensorMonitorExample;
@Mapper
public interface SensorMonitorMapper {
    long countByExample(SensorMonitorExample example);

    int deleteByExample(SensorMonitorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SensorMonitor record);

    int insertSelective(SensorMonitor record);

    List<SensorMonitor> selectByExample(SensorMonitorExample example);

    SensorMonitor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SensorMonitor record, @Param("example") SensorMonitorExample example);

    int updateByExample(@Param("record") SensorMonitor record, @Param("example") SensorMonitorExample example);

    int updateByPrimaryKeySelective(SensorMonitor record);

    int updateByPrimaryKey(SensorMonitor record);
}