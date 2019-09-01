package owl2vowl.knowledgebase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.SensorMonitorMapper;
import owl2vowl.knowledgebase.entity.SensorMonitor;
import owl2vowl.knowledgebase.service.SensorMonitorService;
@Service
public class SensorMonitorServiceImpl implements SensorMonitorService{

	
	@Autowired
	private SensorMonitorMapper sensorMonitorMapper;
	@Override
	public int insert(SensorMonitor record) {
		// TODO Auto-generated method stub
		return sensorMonitorMapper.insert(record);
	}

}
