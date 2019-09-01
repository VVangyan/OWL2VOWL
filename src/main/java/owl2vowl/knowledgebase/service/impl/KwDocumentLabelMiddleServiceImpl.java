/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  KwDocumentLabelMiddleServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月25日 上午10:41:20   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.KwDocumentLabelMiddleMapper;
import owl2vowl.knowledgebase.entity.KwDocumentLabelMiddle;
import owl2vowl.knowledgebase.entity.KwDocumentLabelMiddleExample;
import owl2vowl.knowledgebase.service.KwDocumentLabelMiddleService;

/**
 * @author yan
 *
 */
@Service
public class KwDocumentLabelMiddleServiceImpl implements KwDocumentLabelMiddleService {
	@Autowired
	private KwDocumentLabelMiddleMapper kwDocumentLabelMiddleMapper;
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public long countByExample(KwDocumentLabelMiddleExample example) {
		return kwDocumentLabelMiddleMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(KwDocumentLabelMiddleExample example) {
		return kwDocumentLabelMiddleMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return kwDocumentLabelMiddleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(KwDocumentLabelMiddle record) {
		return kwDocumentLabelMiddleMapper.insert(record);
	}

	@Override
	public int insertSelective(KwDocumentLabelMiddle record) {
		return kwDocumentLabelMiddleMapper.insertSelective(record);
	}

	@Override
	public int batchInsert(List<KwDocumentLabelMiddle> record, Integer documentId) {
		// 如果自动提交设置为true,将无法控制提交的条数，改为最后统一提交，可能导致内存溢出
				SqlSession session = null;
				int status = 0;
				try {
					session = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
					KwDocumentLabelMiddleMapper mapper = session.getMapper(KwDocumentLabelMiddleMapper.class);
					if (record != null) {
						for (int i = 0; i < record.size(); i++) {
							record.get(i).setDocumentId(documentId);// 设置documentId
							record.get(i).setId(null);// 设置id为null
							status = mapper.insertSelective(record.get(i));
						}
					}
					// 手动提交，提交后无法回滚
					session.commit();
					// 清理缓存，防止溢出
					session.clearCache();
				} catch (Exception e) {
					// 没有提交的数据可以回滚
					session.rollback();
					e.printStackTrace();
				} finally {
					if (session != null) {
						session.close();
					}
				}
				return status;
	}
	
	@Override
	public List<KwDocumentLabelMiddle> selectByExample(KwDocumentLabelMiddleExample example) {
		return kwDocumentLabelMiddleMapper.selectByExample(example);
	}

	@Override
	public KwDocumentLabelMiddle selectByPrimaryKey(Integer id) {
		return kwDocumentLabelMiddleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(KwDocumentLabelMiddle record, KwDocumentLabelMiddleExample example) {
		return kwDocumentLabelMiddleMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(KwDocumentLabelMiddle record, KwDocumentLabelMiddleExample example) {
		return kwDocumentLabelMiddleMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(KwDocumentLabelMiddle record) {
		return kwDocumentLabelMiddleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(KwDocumentLabelMiddle record) {
		return kwDocumentLabelMiddleMapper.updateByPrimaryKey(record);
	}
}
