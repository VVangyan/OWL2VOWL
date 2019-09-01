/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  kwDocumentReleaseServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月13日 上午10:30:42   
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

import owl2vowl.knowledgebase.dao.kwDocumentReleaseMapper;
import owl2vowl.knowledgebase.entity.kwDocumentRelease;
import owl2vowl.knowledgebase.entity.kwDocumentReleaseExample;
import owl2vowl.knowledgebase.service.KwDocumentReleaseService;

/**
 * @author yan
 *
 */
@Service
public class KwDocumentReleaseServiceImpl implements KwDocumentReleaseService {
	@Autowired
	private kwDocumentReleaseMapper documentReleaseMapper;
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public long countByExample(kwDocumentReleaseExample example) {
		return documentReleaseMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(kwDocumentReleaseExample example) {
		return documentReleaseMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer releaseId) {
		return documentReleaseMapper.deleteByPrimaryKey(releaseId);
	}

	@Override
	public int insert(kwDocumentRelease record) {
		return documentReleaseMapper.insert(record);
	}

	@Override
	public int insertSelective(kwDocumentRelease record) {
		return documentReleaseMapper.insertSelective(record);
	}

	@Override
	public int batchInsert(List<kwDocumentRelease> record) {
		// 如果自动提交设置为true,将无法控制提交的条数，改为最后统一提交，可能导致内存溢出
		SqlSession session = null;
		int status = 0;
		try {
			session = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
			kwDocumentReleaseMapper mapper = session.getMapper(kwDocumentReleaseMapper.class);
			if (record != null) {
				for (int i = 0; i < record.size(); i++) {
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
	public int batchDelete(List<kwDocumentReleaseExample> record) {
		// 如果自动提交设置为true,将无法控制提交的条数，改为最后统一提交，可能导致内存溢出
		SqlSession session = null;
		int status = 0;
		try {
			session = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
			kwDocumentReleaseMapper mapper = session.getMapper(kwDocumentReleaseMapper.class);
			if (record != null) {
				for (int i = 0; i < record.size(); i++) {
					status = mapper.deleteByExample(record.get(i));
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
	public List<kwDocumentRelease> selectByExample(kwDocumentReleaseExample example) {
		return documentReleaseMapper.selectByExample(example);
	}

	@Override
	public List<String> queryDeptIdListByDocumentId(Integer documentId) {
		return documentReleaseMapper.queryDeptIdListByDocumentId(documentId);
	}

	@Override
	public List<String> queryUserIdListByDocumentId(Integer documentId) {
		return documentReleaseMapper.queryUserIdListByDocumentId(documentId);
	}
	
	@Override
	public kwDocumentRelease selectByPrimaryKey(Integer releaseId) {
		return documentReleaseMapper.selectByPrimaryKey(releaseId);
	}

	@Override
	public int updateByExampleSelective(kwDocumentRelease record, kwDocumentReleaseExample example) {
		return documentReleaseMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(kwDocumentRelease record, kwDocumentReleaseExample example) {
		return documentReleaseMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(kwDocumentRelease record) {
		return documentReleaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(kwDocumentRelease record) {
		return documentReleaseMapper.updateByPrimaryKey(record);
	}
}
