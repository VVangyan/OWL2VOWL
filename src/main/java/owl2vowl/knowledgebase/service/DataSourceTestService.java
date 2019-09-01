package owl2vowl.knowledgebase.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owl2vowl.knowledgebase.datasources.DataSourceNames;
import owl2vowl.knowledgebase.datasources.annotation.DataSource;
import owl2vowl.knowledgebase.entity.OutSysUser;
import owl2vowl.knowledgebase.entity.User;

/**
 * 测试多数据源
 *
 * @author yan
 * @since 3.1.0 2018-09-17
 */
@Service
public class DataSourceTestService {
	
    @Autowired
    private UserService userService;
    
    @Autowired 
    private OutSysUserService outSysUserService;

    public User queryUser(Long userId){
        return userService.selectByPrimaryKey(Integer.parseInt(userId.toString()));
    }

    @DataSource(name = DataSourceNames.SECOND)
    public OutSysUser queryUser2(Long userId){
        return outSysUserService.selectByPrimaryKey(userId.toString());
    }
}