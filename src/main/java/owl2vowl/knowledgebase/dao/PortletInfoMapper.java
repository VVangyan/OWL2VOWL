package owl2vowl.knowledgebase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import owl2vowl.knowledgebase.entity.PortletInfo;
import owl2vowl.knowledgebase.entity.PortletInfoExample;
@Mapper
public interface PortletInfoMapper {
    long countByExample(PortletInfoExample example);

    int deleteByExample(PortletInfoExample example);

    int deleteByPrimaryKey(Integer portletId);

    int insert(PortletInfo record);

    int insertSelective(PortletInfo record);

    List<PortletInfo> selectByExample(PortletInfoExample example);

    PortletInfo selectByPrimaryKey(Integer portletId);

    int updateByExampleSelective(@Param("record") PortletInfo record, @Param("example") PortletInfoExample example);

    int updateByExample(@Param("record") PortletInfo record, @Param("example") PortletInfoExample example);

    int updateByPrimaryKeySelective(PortletInfo record);

    int updateByPrimaryKey(PortletInfo record);
}