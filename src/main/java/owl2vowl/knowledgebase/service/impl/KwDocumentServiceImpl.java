/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  KwDocumentServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月6日 下午2:27:19   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.KwDocumentMapper;
import owl2vowl.knowledgebase.entity.KwDocument;
import owl2vowl.knowledgebase.entity.KwDocumentExample;
import owl2vowl.knowledgebase.entity.Read;
import owl2vowl.knowledgebase.service.KwDocumentService;

/**
 * 文档实现类
 * 
 * @author yan
 *
 */
@Service
public class KwDocumentServiceImpl implements KwDocumentService {

	@Autowired
	KwDocumentMapper kwDocumentMapper;

	@Override
	public long countByExample(KwDocumentExample example) {
		return kwDocumentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(KwDocumentExample example) {
		return kwDocumentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer documentId) {
		return kwDocumentMapper.deleteByPrimaryKey(documentId);
	}

	@Override
	public int insert(KwDocument record) {
		return kwDocumentMapper.insert(record);
	}

	@Override
	public int insertSelective(KwDocument record) {
		return kwDocumentMapper.insertSelective(record);
	}

	@Override
	public List<KwDocument> selectByExample(KwDocumentExample example) {
		return kwDocumentMapper.selectByExample(example);
	}
	
	@Override
	public List<KwDocument> selectPathResult(KwDocument kwDocument) {
		return kwDocumentMapper.selectPathResult(kwDocument);
	}
	
	@Override
	public List<KwDocument> selectKwByUserOrDept(Map params) {
		return kwDocumentMapper.selectKwByUserOrDept(params);
	}
	
	@Override
	public KwDocument selectByPrimaryKey(Integer documentId) {
		return kwDocumentMapper.selectByPrimaryKey(documentId);
	}

	@Override
	public int updateByExampleSelective(KwDocument record, KwDocumentExample example) {
		return kwDocumentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(KwDocument record, KwDocumentExample example) {
		return kwDocumentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(KwDocument record) {
		return kwDocumentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(KwDocument record) {
		return kwDocumentMapper.updateByPrimaryKey(record);
	}

	@Override
	public Read selectHeadDate(KwDocument kwDocument) {
		return kwDocumentMapper.selectHeadDate(kwDocument);
	}

	@Override
	public Read selectRecommend1(KwDocument kwDocument) {
		return kwDocumentMapper.selectRecommend1(kwDocument);
	}

	@Override
	public Read selectRecommend2(KwDocument kwDocument) {
		return kwDocumentMapper.selectRecommend2(kwDocument);
	}
}
