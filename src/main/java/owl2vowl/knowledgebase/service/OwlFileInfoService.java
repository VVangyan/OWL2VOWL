package owl2vowl.knowledgebase.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import owl2vowl.knowledgebase.entity.OwlFileInfo;
import owl2vowl.knowledgebase.entity.OwlFileInfoExample;

public interface OwlFileInfoService {
	long countByExample(OwlFileInfoExample example);

    int deleteByExample(OwlFileInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OwlFileInfo record);

    int insertSelective(OwlFileInfo record);

    List<OwlFileInfo> selectByExample(OwlFileInfoExample example);

    OwlFileInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OwlFileInfo record, @Param("example") OwlFileInfoExample example);

    int updateByExample(@Param("record") OwlFileInfo record, @Param("example") OwlFileInfoExample example);

    int updateByPrimaryKeySelective(OwlFileInfo record);

    int updateByPrimaryKey(OwlFileInfo record);
}
