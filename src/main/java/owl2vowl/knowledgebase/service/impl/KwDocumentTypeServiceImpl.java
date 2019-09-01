/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  KwDocumentTypeServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月20日 上午9:39:06   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.KwDocumentTypeMapper;
import owl2vowl.knowledgebase.entity.KwDocumentType;
import owl2vowl.knowledgebase.entity.KwDocumentTypeExample;
import owl2vowl.knowledgebase.service.KwDocumentTypeService;

/**
 * @author yan
 *
 */
@Service
public class KwDocumentTypeServiceImpl implements KwDocumentTypeService {
	@Autowired
	private KwDocumentTypeMapper kwDocumentTypeMapper;

	@Override
	public long countByExample(KwDocumentTypeExample example) {

		return kwDocumentTypeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(KwDocumentTypeExample example) {

		return kwDocumentTypeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {

		return kwDocumentTypeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(KwDocumentType record) {

		return kwDocumentTypeMapper.insert(record);
	}

	@Override
	public int insertSelective(KwDocumentType record) {

		return kwDocumentTypeMapper.insertSelective(record);
	}

	@Override
	public List<KwDocumentType> selectByExample(KwDocumentTypeExample example) {

		return kwDocumentTypeMapper.selectByExample(example);
	}

	@Override
	public KwDocumentType selectByPrimaryKey(Integer id) {

		return kwDocumentTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(KwDocumentType record, KwDocumentTypeExample example) {

		return kwDocumentTypeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(KwDocumentType record, KwDocumentTypeExample example) {

		return kwDocumentTypeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(KwDocumentType record) {

		return kwDocumentTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(KwDocumentType record) {

		return kwDocumentTypeMapper.updateByPrimaryKey(record);
	}

}
