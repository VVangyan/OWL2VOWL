/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  KwOfficeToPdfServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月16日 上午10:21:59   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */  
package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.KwOfficeToPdfMapper;
import owl2vowl.knowledgebase.entity.KwOfficeToPdf;
import owl2vowl.knowledgebase.entity.KwOfficeToPdfExample;
import owl2vowl.knowledgebase.service.KwOfficeToPdfService;

/**
 * @author yan
 *
 */
@Service
public class KwOfficeToPdfServiceImpl implements KwOfficeToPdfService {
	
	@Autowired
	KwOfficeToPdfMapper kwOfficeToPdfMapper; 

	@Override
	public long countByExample(KwOfficeToPdfExample example) {
		return kwOfficeToPdfMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(KwOfficeToPdfExample example) {
		return kwOfficeToPdfMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return kwOfficeToPdfMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(KwOfficeToPdf record) {
		return kwOfficeToPdfMapper.insert(record);
	}

	@Override
	public int insertSelective(KwOfficeToPdf record) {
		return kwOfficeToPdfMapper.insertSelective(record);
	}

	@Override
	public List<KwOfficeToPdf> selectByExample(KwOfficeToPdfExample example) {
		return kwOfficeToPdfMapper.selectByExample(example);
	}

	@Override
	public KwOfficeToPdf selectByPrimaryKey(Integer id) {
		return kwOfficeToPdfMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(KwOfficeToPdf record, KwOfficeToPdfExample example) {
		return kwOfficeToPdfMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(KwOfficeToPdf record, KwOfficeToPdfExample example) {
		return kwOfficeToPdfMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(KwOfficeToPdf record) {
		return kwOfficeToPdfMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(KwOfficeToPdf record) {
		return kwOfficeToPdfMapper.updateByPrimaryKey(record);
	}

}
