package owl2vowl.knowledgebase.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import owl2vowl.knowledgebase.entity.User;
import owl2vowl.knowledgebase.entity.UserExample;
public interface UserService {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);
    
    List<HashMap<Object,Object>> selectUserMap();

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}