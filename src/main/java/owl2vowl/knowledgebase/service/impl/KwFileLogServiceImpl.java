/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  KwFileLogServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月6日 下午2:34:46   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.KwFileLogMapper;
import owl2vowl.knowledgebase.entity.KwFileLog;
import owl2vowl.knowledgebase.entity.KwFileLogExample;
import owl2vowl.knowledgebase.service.KwFileLogService;

/**
 * @author yan
 *
 */
@Service
public class KwFileLogServiceImpl implements KwFileLogService {
	@Autowired
	KwFileLogMapper kwFileLogMapper;

	@Override
	public long countByExample(KwFileLogExample example) {
		return kwFileLogMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(KwFileLogExample example) {
		return kwFileLogMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer filedId) {
		return kwFileLogMapper.deleteByPrimaryKey(filedId);
	}

	@Override
	public int insert(KwFileLog record) {
		return kwFileLogMapper.insert(record);
	}

	@Override
	public int insertSelective(KwFileLog record) {
		return kwFileLogMapper.insertSelective(record);
	}

	@Override
	public List<KwFileLog> selectByExample(KwFileLogExample example) {
		return kwFileLogMapper.selectByExample(example);
	}

	@Override
	public KwFileLog selectByPrimaryKey(Integer filedId) {
		return kwFileLogMapper.selectByPrimaryKey(filedId);
	}

	@Override
	public int updateByExampleSelective(KwFileLog record, KwFileLogExample example) {
		return kwFileLogMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(KwFileLog record, KwFileLogExample example) {
		return kwFileLogMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(KwFileLog record) {
		return kwFileLogMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(KwFileLog record) {
		return kwFileLogMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<KwFileLog> getKwBySemantics(List<String> params) {
		return kwFileLogMapper.getKwBySemantics(params);
	}

}
