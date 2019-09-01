package owl2vowl.knowledgebase.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import owl2vowl.knowledgebase.entity.OutsideSysMenu;
import owl2vowl.knowledgebase.entity.OutsideSysMenuExample;
public interface OutsideSysMenuService {
    long countByExample(OutsideSysMenuExample example);

    int deleteByExample(OutsideSysMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutsideSysMenu record);

    int insertSelective(OutsideSysMenu record);

    List<OutsideSysMenu> selectByExample(OutsideSysMenuExample example);

    OutsideSysMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutsideSysMenu record, @Param("example") OutsideSysMenuExample example);

    int updateByExample(@Param("record") OutsideSysMenu record, @Param("example") OutsideSysMenuExample example);

    int updateByPrimaryKeySelective(OutsideSysMenu record);

    int updateByPrimaryKey(OutsideSysMenu record);

    List<OutsideSysMenu> selectUserMenuMap(String id);  //根据用户查询菜单信息
}