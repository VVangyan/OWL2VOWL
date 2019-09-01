/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  OutsideSysMenuServiceImpl.java   
 * @Package owl2vowl.knowledgebase.service.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年10月16日 上午11:57:33   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.dao.OutsideSysMenuMapper;
import owl2vowl.knowledgebase.entity.OutsideSysMenu;
import owl2vowl.knowledgebase.entity.OutsideSysMenuExample;
import owl2vowl.knowledgebase.service.OutsideSysMenuService;

/**
 * @author yan
 *
 */
@Service
public class OutsideSysMenuServiceImpl implements OutsideSysMenuService {

	@Autowired
	private OutsideSysMenuMapper outsideSysMenuMapper;

	@Override
	public long countByExample(OutsideSysMenuExample example) {
		return outsideSysMenuMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OutsideSysMenuExample example) {
		return outsideSysMenuMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return outsideSysMenuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(OutsideSysMenu record) {
		return outsideSysMenuMapper.insert(record);
	}

	@Override
	public int insertSelective(OutsideSysMenu record) {
		return outsideSysMenuMapper.insertSelective(record);
	}

	@Override
	public List<OutsideSysMenu> selectByExample(OutsideSysMenuExample example) {

		return outsideSysMenuMapper.selectByExample(example);
	}

	@Override
	public OutsideSysMenu selectByPrimaryKey(String id) {
		return outsideSysMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(OutsideSysMenu record, OutsideSysMenuExample example) {
		return outsideSysMenuMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(OutsideSysMenu record, OutsideSysMenuExample example) {
		return outsideSysMenuMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(OutsideSysMenu record) {
		return outsideSysMenuMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OutsideSysMenu record) {
		return outsideSysMenuMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<OutsideSysMenu> selectUserMenuMap(String id) {
		return outsideSysMenuMapper.selectUserMenuMap(id);
	}

}
