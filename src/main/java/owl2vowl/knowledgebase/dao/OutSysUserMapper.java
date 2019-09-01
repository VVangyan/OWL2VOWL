package owl2vowl.knowledgebase.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.OutSysUser;
import owl2vowl.knowledgebase.entity.OutSysUserExample;
@Mapper
public interface OutSysUserMapper {
    long countByExample(OutSysUserExample example);

    int deleteByExample(OutSysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(OutSysUser record);

    int insertSelective(OutSysUser record);

    List<OutSysUser> selectByExample(OutSysUserExample example);

    OutSysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OutSysUser record, @Param("example") OutSysUserExample example);

    int updateByExample(@Param("record") OutSysUser record, @Param("example") OutSysUserExample example);

    int updateByPrimaryKeySelective(OutSysUser record);

    int updateByPrimaryKey(OutSysUser record);

    List<HashMap<Object,Object>> selectUserMap();
}