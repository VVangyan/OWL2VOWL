package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.PortletComponentInfo;
import owl2vowl.knowledgebase.entity.PortletComponentInfoExample;
@Mapper
public interface PortletComponentInfoMapper {
    long countByExample(PortletComponentInfoExample example);

    int deleteByExample(PortletComponentInfoExample example);

    int deleteByPrimaryKey(Integer pcId);

    int insert(PortletComponentInfo record);

    int insertSelective(PortletComponentInfo record);

    List<PortletComponentInfo> selectByExample(PortletComponentInfoExample example);

    PortletComponentInfo selectByPrimaryKey(Integer pcId);

    int updateByExampleSelective(@Param("record") PortletComponentInfo record, @Param("example") PortletComponentInfoExample example);

    int updateByExample(@Param("record") PortletComponentInfo record, @Param("example") PortletComponentInfoExample example);

    int updateByPrimaryKeySelective(PortletComponentInfo record);

    int updateByPrimaryKey(PortletComponentInfo record);
}