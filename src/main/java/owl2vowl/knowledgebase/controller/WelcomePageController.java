/**
 * All rights Reserved, Designed By www.blueintelligencewh.com
 *
 * @Title: DocumentController.java
 * @Package owl2vowl.knowledgebase.controller
 * @Description:
 * @author: 武汉蓝智
 * @date: 2018年7月6日 下午2:04:05
 * @version V1.0
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved.
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import owl2vowl.knowledgebase.datasources.DataSourceNames;
import owl2vowl.knowledgebase.datasources.annotation.DataSource;
import owl2vowl.knowledgebase.entity.*;
import owl2vowl.knowledgebase.service.*;
import owl2vowl.knowledgebase.util.GetSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 欢迎页统计controller
 *
 * @author yan
 */
@RestController
@RequestMapping("/welcomepage")
@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public class WelcomePageController {

	@Autowired
	private KwDocumentService kwDocumentService;

	@Autowired
	private OutSysUserService outSysUserService;

	@Autowired
	private OutSysDeptService outSysDeptService;

	@Autowired
	private OutsideSysMenuService outsideSysMenuService;


	/**
	 * 欢迎页面头部数据获取
	 */
	@RequestMapping(value = "/selectHeadDate", method = RequestMethod.POST)
	public Read selectHeadDate(){
		Read read=new Read();
		try {
			KwDocument kwDocument = new KwDocument();
			User user = GetSession.getUserSession();
			kwDocument.setUserName(user.getUserName());
			kwDocument.setDepartmentName(user.getDepartmentName());
			read= kwDocumentService.selectHeadDate(kwDocument);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return read;
	}

	/**
	 * 欢迎页面饼图1数据获取
	 */
	@RequestMapping(value = "/selectRecommend1", method = RequestMethod.POST)
	public Read selectRecommend1(){
		Read read = new Read();
		try {
			User user = GetSession.getUserSession();
			KwDocument kwDocument = new KwDocument();
			kwDocument.setUserName(user.getUserName());
			kwDocument.setDepartmentName(user.getDepartmentName());
			read=kwDocumentService.selectRecommend1(kwDocument);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return read;
	}

	/**
	 * 欢迎页面饼图2数据获取
	 */
	@RequestMapping(value = "/selectRecommend2", method = RequestMethod.POST)
	public Read selectRecommend2(){
		Read read = new Read();
		User user = GetSession.getUserSession();
		KwDocument kwDocument = new KwDocument();
		kwDocument.setUserName(user.getUserName());
		kwDocument.setDepartmentName(user.getDepartmentName());
		read=kwDocumentService.selectRecommend2(kwDocument);
		return read;
	}

	/**
	 * 欢迎页面根据参数获取用户信息
	 * http://localhost:8086/knowledge/?userid=2bba096d36cf4b7ea031cca01b8439d7&deparmentid=2
	 * http://localhost:8086/knowledge/?userid=442de69ac8524fe68340c647431af655&deparmentid=2
	 * userid  用户id   1=系统管理员
	 * deparmentid   部门id  13=公司领导
	 */
	@DataSource(name = DataSourceNames.SECOND)  //查询第二个用户数据库
	@RequestMapping(value = "/defaultUser", method = RequestMethod.POST)
	public List<OutsideSysMenu> defaultUser(HttpServletRequest request,Read read){
	List<OutsideSysMenu> list = new ArrayList<>();
		try {
			HttpSession session = request.getSession();
			User user = GetSession.getUserSession();
			if(user==null){
				OutSysUser outSysUser = new OutSysUser();
				OutSysDept outSysDept = new OutSysDept();
				outSysUser = outSysUserService.selectByPrimaryKey(read.getRead01());
				outSysDept = outSysDeptService.selectByPrimaryKey(read.getRead02());
				user = new User();
				if(outSysUser!=null) {
					user.setId(outSysUser.getId());  //用户id
					user.setUserName(outSysUser.getName());  //用户名称
				}
				if(outSysDept!=null) {
					user.setDepartmentId(outSysDept.getId());  //部门id
					user.setDepartmentName(outSysDept.getName());  //部门名称
					session.setAttribute("user",user);  //用户存进session	
				}
				
			}
			list = outsideSysMenuService.selectUserMenuMap(read.getRead01());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	//判断String类是否可以转换成Integer
	public boolean isNumeric(String str){
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if( !isNum.matches() ){
			return false;
		}
		return true;
	}


}
