package owl2vowl.knowledgebase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.SenssorMonitor1Mapper;
import owl2vowl.knowledgebase.entity.SenssorMonitor1;
import owl2vowl.knowledgebase.service.SensorMonitorService1;
@Service
public class SensorMonitorServiceImpl1 implements SensorMonitorService1{

	
	@Autowired
	private SenssorMonitor1Mapper senssorMonitor1Mapper;
	@Override
	public int insert(SenssorMonitor1 record) {
		// TODO Auto-generated method stub
		return senssorMonitor1Mapper.insert(record);
	}

}
