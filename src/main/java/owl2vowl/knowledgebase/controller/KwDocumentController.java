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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import owl2vowl.common.exception.RRException;
import owl2vowl.common.validator.ValidatorUtils;
import owl2vowl.common.validator.group.AddGroup;
import owl2vowl.knowledgebase.datasources.DataSourceNames;
import owl2vowl.knowledgebase.datasources.annotation.DataSource;
import owl2vowl.knowledgebase.entity.Department;
import owl2vowl.knowledgebase.entity.KwCheck;
import owl2vowl.knowledgebase.entity.KwDocument;
import owl2vowl.knowledgebase.entity.KwDocumentExample;
import owl2vowl.knowledgebase.entity.KwDocumentLabelMiddle;
import owl2vowl.knowledgebase.entity.User;
import owl2vowl.knowledgebase.entity.UserDept;
import owl2vowl.knowledgebase.entity.kwDocumentRelease;
import owl2vowl.knowledgebase.entity.kwDocumentReleaseExample;
import owl2vowl.knowledgebase.entity.kwDocumentReleaseExample.Criteria;
import owl2vowl.knowledgebase.service.*;
import owl2vowl.knowledgebase.util.GetSession;
import owl2vowl.knowledgebase.util.R;

/**
 * 文档controller
 *
 * @author yan
 */
@RestController
@RequestMapping("/document")
@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public class KwDocumentController {

	@Autowired
	private KwDocumentService kwDocumentService;

	@Autowired
	private KwFileLogService kwFileLogService;

	@Autowired
	private KwCheckService kwCheckService;

	@Autowired
	private UserService userService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private KwDocumentReleaseService kwDocumentReleaseService;
	
	@Autowired
	private KwDocumentLabelMiddleService kwDocumentLabelMiddleService;

	@Autowired
	private OutSysUserService outSysUserService;

	@Autowired
	private OutSysDeptService outSysDeptService;



	@Transactional
	@PostMapping("/uploadknowledge")
	public R uploadknowledge(KwDocument kwDocument) {
		Integer documentId = null;
		try {
			ValidatorUtils.validateEntity(kwDocument, AddGroup.class);
			System.out.println(kwDocument);
			User user = GetSession.getUserSession();
			kwDocument.setUserName(user.getUserName());
			kwDocument.setDepartmentName(user.getDepartmentName());
			String[] split = kwDocument.getLableStrs().split(",");
			kwDocumentService.insertSelective(kwDocument);
			documentId = kwDocument.getDocumentId();
			List<KwDocumentLabelMiddle> lableList=new ArrayList<KwDocumentLabelMiddle>();
			KwDocumentLabelMiddle km=null;
			for(int i=0;i<split.length;i++) {
				String[] split2 = split[i].toString().split("_");
				km=new KwDocumentLabelMiddle(Integer.parseInt(split2[0]), split2[1], documentId);
				lableList.add(km);
			}
			kwDocumentLabelMiddleService.batchInsert(lableList, documentId);
		} catch (NumberFormatException | RRException e) {
			e.printStackTrace();
		}
		return R.ok().put("documentId", documentId);
	}

	@GetMapping("/getDocumentList")
	public R getDocumentList(@RequestParam Map<String, Object> params) {
		PageInfo page=null;
		try {
			User user = GetSession.getUserSession(); //获取当前用户
			Integer pn = Integer.parseInt(params.get("page") + "");
			PageHelper.startPage(pn, 10);
			KwDocumentExample example=new KwDocumentExample();
			example.setOrderByClause("DOCUMENT_ID  DESC");
			example.setUserName(user.getUserName());
			example.setDepartmentName(user.getDepartmentName());
			List<KwDocument> documentsList = kwDocumentService.selectByExample(example);
			page= new PageInfo(documentsList, 10);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return R.ok().put("page", page);
	}

	@GetMapping("/knowledgeReview/{fromData}")
	public R knowledgeReview(@RequestParam Map<String, Object> params,
			@PathVariable(value = "fromData", required = false) String fromData) {
		PageInfo page=null;
		Integer status = 0;
		try {
			Integer pn = Integer.parseInt(params.get("page") + "");

			List<KwDocument> documentsList = new ArrayList<KwDocument>();
			System.out.println("fromData " + fromData);
			PageHelper.startPage(pn, 10);
			if ("wdsh".equalsIgnoreCase(fromData)) {
				status = 0;
			}
			if ("wdfb".equalsIgnoreCase(fromData)) {
				status = 1;
				String username = params.get("userName") + "";
				System.out.println(username);
			}
			User user = GetSession.getUserSession(); //获取当前用户
			KwDocument kwDocument = new KwDocument();
			kwDocument.setUserName(user.getUserName());
			kwDocument.setDepartmentName(user.getDepartmentName());
			kwDocument.setDocumentState(status);
			documentsList = kwDocumentService.selectPathResult(kwDocument);
			page = new PageInfo(documentsList, 10);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return R.ok().put("page", page);
	}

	@GetMapping("/getDocumentById/{documentid}")
	public R getDocumentById(@PathVariable(value = "documentid") Integer documentid) {
		KwDocument kwDocument = kwDocumentService.selectByPrimaryKey(documentid);
		return R.ok().put("kwDocument", kwDocument);
	}

	@Transactional
	@PostMapping("/passOrfailService")
	public R passOrfailService(@RequestParam Map<String, Object> params) {
		//System.out.println("params  :" + params);
		try {
			int status = Integer.parseInt(params.get("status") + "");
			int documentid = Integer.parseInt(params.get("documentid") + "");
			KwDocument record = new KwDocument();
			record.setDocumentState(status);
			KwDocumentExample example = new KwDocumentExample();
			example.createCriteria().andDocumentIdEqualTo(documentid);
			kwDocumentService.updateByExampleSelective(record, example);
			User user = GetSession.getUserSession(); //获取当前用户
			KwCheck kwCheck = new KwCheck(documentid, 1, user.getUserName(), status, new Date());
			kwCheckService.insertSelective(kwCheck);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return R.ok();
	}

	@GetMapping(value = "/getUserAndDept")
	public R getUserAndDept() {
		UserDept userDept=null;
		try {
			List<User> userList = userService.selectByExample(null);
			List<Department> deptList = departmentService.selectByExample(null);
			userDept = new UserDept(userList, deptList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return R.ok().put("userDept", userDept);
	}
	
	/**
	 * @Title: getDeptUserMap   
	 * @Description: 用户 部门 Map
	 * @param: @return      
	 * @return: R      
	 * @throws
	 */
	@GetMapping(value = "/getDeptUserMap")
	@DataSource(name = DataSourceNames.SECOND)  //查询第二个用户数据库
	public R getDeptUserMap() {
//		List<HashMap<Object, Object>> deptMap = departmentService.selectMapResutl();
//		List<HashMap<Object, Object>> userMap = userService.selectUserMap();
		List<HashMap<Object, Object>> deptMap = outSysDeptService.selectMapResutl();
		List<HashMap<Object, Object>> userMap = outSysUserService.selectUserMap();
		return R.ok().put("deptMap", deptMap).put("userMap", userMap);
	}
	/**
	 * @Title: getDeptOrUserIdListByDocumentId   
	 * @Description: 根据文档编号获取用户id 和部门id
	 * @param: @param params
	 * @param: @return      
	 * @return: R      
	 * @throws
	 */
	@Transactional
	@GetMapping(value = "/getDeptOrUserIdListByDocumentId")
	public R getDeptOrUserIdListByDocumentId(@RequestParam Map<String, Object> params) {
		Integer documentId  = Integer.parseInt(params.get("documentId") + "");
		List<String> deptIdList = kwDocumentReleaseService.queryDeptIdListByDocumentId(documentId);
		List<String> userIdList = kwDocumentReleaseService.queryUserIdListByDocumentId(documentId);
		return R.ok().put("deptIdList", deptIdList).put("userIdList", userIdList);
	}
	/**
	 * @Title: documentRelease   
	 * @Description:发布说明：
	 * 				① 同一条记录里面接收者 和部门需要互斥，及userid、username和deptid、deptname 不能同时取值  不然无法区分文档浏览的权限
	 *              
	 * @param: @param params
	 * @param: @return      
	 * @return: R      
	 * @throws
	 */
	@Transactional
	@PostMapping(value = "/documentRelease")
	public R documentRelease(@RequestBody  Map<String, Object> params) {
		Integer documentId;
		List<kwDocumentRelease> krList=new ArrayList<>();
		try {
			documentId = Integer.parseInt(params.get("documentId") + "");
			kwDocumentReleaseExample example = new kwDocumentReleaseExample();
			kwDocumentRelease kwDocumentRelease=null;
			User user =GetSession.getUserSession();  //获取当前登录用户，记录操作人id和name
			//发布给用户
			if (params.get("userArray") != null) {
				List<Map> object = (List<Map>) params.get("userArray");
				List<String> deptList=new ArrayList<>();
				for (Map map : object) {
					//System.out.println(map.get("username"));
					//System.out.println(map.get("userid"));
					String userName = (String) map.get("username");
					String userIdstr = (String) map.get("userid");
					String userId = userIdstr;
					deptList.add(userId);
					kwDocumentRelease=new kwDocumentRelease(documentId, user.getId(), user.getUserName(), null, null, userId, userName, new Date());
					krList.add(kwDocumentRelease);
				}
				long userCount=0;
				for(int i=0;i<deptList.size();i++) {
					example.createCriteria().andDocumentIdEqualTo(documentId).andReleaseToUseridEqualTo(deptList.get(i));
					userCount = kwDocumentReleaseService.countByExample(example);
				}
				if (userCount > 0) {
					return R.error("当前所选用户包含已经发布了的,请不要重复发布!");
				}else {
					kwDocumentReleaseService.batchInsert(krList);
				}
			}
			
			
			//发布给部门
			if (params.get("deptArray") != null) {
				List<Map> object = (List<Map>) params.get("deptArray");
				List<String> deptList=new ArrayList<>();
				for (Map map : object) {
					//System.out.println(map.get("deptname"));
					//System.out.println(map.get("deptid"));
					
					System.out.println("object"+object);
					
					String deptname = (String) map.get("deptname");
					String deptidstr = (String) map.get("deptid");
					String deptid = deptidstr;
					deptList.add(deptid);
//				System.out.println("---------------"+documentId+".."+deptid+".."+deptname);
					kwDocumentRelease=new kwDocumentRelease(documentId,user.getId(), user.getUserName(), deptid, deptname, null, null, new Date());
					krList.add(kwDocumentRelease);
				}
				long deptCount=0;
				for(int j=0;j<deptList.size();j++) {
					example.createCriteria().andDocumentIdEqualTo(documentId).andReleaseToDetpidEqualTo(deptList.get(j));
					deptCount= kwDocumentReleaseService.countByExample(example);
				}
				if (deptCount > 0) {
					return R.error("所选部门包含已经发布了的,请不要重复发布!");
				}else {
					kwDocumentReleaseService.batchInsert(krList);
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return R.ok();
	}

	/**
	 * 文档收回
	 * @param params  userInfo  or   deptInfo
	 * @return
	 */
	@Transactional
	@PostMapping(value = "/documentTakeBack")
	public R documentTakeBack(@RequestBody  Map<String, Object> params) {
		System.out.println(params);
		Integer documentId;
		List<kwDocumentReleaseExample> krList=new ArrayList<>();
		try {
			documentId = Integer.parseInt(params.get("documentId") + "");
			kwDocumentReleaseExample kwre=null;

			/*收回用户*/
			if (params.get("userArray") != null) {
				List<Map> object = (List<Map>) params.get("userArray");
				for (Map map : object) {
					String userName = (String) map.get("username");
					String userId = map.get("userid")+"";
					kwre=new kwDocumentReleaseExample();
					kwre.createCriteria().andReleaseToUseridEqualTo(userId)
							             .andReleaseToUsernameEqualTo(userName)
							             .andDocumentIdEqualTo(documentId);
					krList.add(kwre);
				}
				kwDocumentReleaseService.batchDelete(krList);
			}
			/*收回部门*/
			if (params.get("deptArray") != null) {
				List<Map> object = (List<Map>) params.get("deptArray");
				List<Integer> deptList=new ArrayList<>();
				for (Map map : object) {
					String deptname = (String) map.get("deptname");
					String deptid = map.get("deptid")+"";
					kwre=new kwDocumentReleaseExample();
					kwre.createCriteria().andReleaseToDetpidEqualTo(deptid)
							             .andReleaseDetpnameEqualTo(deptname)
							             .andDocumentIdEqualTo(documentId);
					krList.add(kwre);
				}
				kwDocumentReleaseService.batchDelete(krList);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return R.ok();
	}
	/**
	 * @Title: selectKwByUserOrDept   
	 * @Description: 当前用户可以阅读，以及他属于部门可以阅读的文档。  
	 * @param: @param params
	 * @param: @return      
	 * @return: R      
	 * @throws
	 */
	@GetMapping("/selectKwByUserOrDept")
	public R selectKwByUserOrDept(@RequestParam Map<String, Object> params) {
		PageInfo page=null;
		Integer pn = Integer.parseInt(params.get("page") + "");
		List<KwDocument> documentsList = new ArrayList<KwDocument>();
		try {
			
			//origin,author,abstract,marks,keyword
			if(params.get("origin")!=null) {params.put("origin",params.get("origin"));}
			if(params.get("author")!=null) {params.put("author",params.get("author"));}
			if(params.get("abstract")!=null) {params.put("abstract",params.get("abstract"));}
			if(params.get("marks")!=null) {params.put("marks",params.get("marks"));}
			if(params.get("keyword")!=null) {params.put("keyword",params.get("keyword"));}
			
			PageHelper.startPage(pn, 10);
			User user = GetSession.getUserSession(); //获取当前用户
			if(user!=null) {
				//用戶id
				String userId=user.getId()+"";
				params.put("userId", userId);
				//部门id
				String detpId=user.getDepartmentId();
				params.put("detpId", detpId);
				documentsList = kwDocumentService.selectKwByUserOrDept(params);
			}
			page = new PageInfo(documentsList, 10);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return R.ok().put("page", page);
	}
	@GetMapping("/getLoginUserInfo")
	public R getLoginUserInfo() {
		try {
			User user = GetSession.getUserSession(); //获取当前用户
			System.out.println(user);
			if(user!=null) {
				return R.ok().put("user", user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
