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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import owl2vowl.knowledgebase.entity.*;
import owl2vowl.knowledgebase.service.*;
import owl2vowl.knowledgebase.util.GetSession;
import owl2vowl.knowledgebase.util.Pager;
import owl2vowl.knowledgebase.util.QueryString;
import owl2vowl.knowledgebase.util.R;


import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 文档controller
 *
 * @author yan
 */
@RestController
@RequestMapping("/label")
@SuppressWarnings({ "rawtypes", "unchecked" })
public class KwDocumentLableController {

	@Autowired
	private KwDocumentLableService kwDocumentLableService;


	@GetMapping("/knowLableReview")
	public R knowLableReview(@RequestParam Map<String, Object> params) {
		Integer pn = Integer.parseInt(params.get("page") + "");
		List<KwDocumentLable> documentsList = new ArrayList<KwDocumentLable>();
		PageHelper.startPage(pn, 10);
		String username = params.get("userName") + "";
		documentsList = kwDocumentLableService.selectPathResult(username);
		PageInfo page = new PageInfo(documentsList, 10);
		return R.ok().put("page", page);
	}
	
	@GetMapping("/getAllLable")
	public R getAllLable() {
		List<KwDocumentLable> lableList = new ArrayList<KwDocumentLable>();
		lableList = kwDocumentLableService.selectByExample(null);
		return R.ok().put("lableList", lableList);
	}

	@GetMapping(value = "/getLableId")
	public R getLableId(int id) {
		KwDocumentLable record = kwDocumentLableService.getLableId(id);
		return R.ok().put("record", record);
	}

	@Transactional
	@PostMapping(value = "/deleteLableId")
	public R deleteLableId(@RequestParam Map<String, Object> params) {
		Integer id = null;
		if(params.get("id") + ""!=null&&!"".equals(params.get("id") + "")){
			id = Integer.parseInt(params.get("id") + "");
		}else{
			id = null;
			return R.error();
		}
		kwDocumentLableService.deleteLableId(id);
		return R.ok();
	}


	@Transactional
	@PostMapping(value = "/knowLableUpdateAndInsert")
	public R knowLableUpdateAndInsert(@RequestParam Map<String, Object> params) {
		try {
			KwDocumentLable record = new KwDocumentLable();
			if(params.get("id") + ""!=null&&!"".equals(params.get("id") + "")){
				record.setLableId(Integer.parseInt(params.get("id") + ""));
			}else{
				record.setLableId(null);
			}
			record.setLableName(params.get("lableName") + "");
			record.setLableDesc(params.get("lableDesc") + "");
			record.setLableDate(strToDateLong(params.get("lableDate") + ""));
			record.setLableSort(Integer.parseInt(params.get("lableSort") + ""));
			User user = GetSession.getUserSession(); //获取当前用户
			record.setUserName(user.getUserName());
			record.setDeparmentName(user.getDepartmentName());
			if(record.getLableId()!=null){
				//修改
				KwDocumentLableExample example = new KwDocumentLableExample();
				kwDocumentLableService.updateByExample(record,example);
			}else{
				//新增
				kwDocumentLableService.insert(record);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return R.ok();
	}

	@RequestMapping(value = "/knowLableUpdateAndInsertNew", method = RequestMethod.POST)
	public R knowLableUpdateAndInsertNew(KwDocumentLable record) {
		//System.out.println("的撒大大大ddwddwdw洒店"+record.getLableId());
		try {
			if(record.getLableId()!=null){
				//修改
				KwDocumentLableExample example = new KwDocumentLableExample();
				kwDocumentLableService.updateByExample(record,example);
			}else{
				User user = GetSession.getUserSession(); //获取当前用户
				record.setUserName(user.getUserName());
				record.setDeparmentName(user.getDepartmentName());
				
				//新增
				record.setLableDate(new Date());
				kwDocumentLableService.insert(record);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return R.ok();
	}

	 /**
		 * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
		 *
		 * @param strDate
		 * @return
	  */
	 public static Date strToDateLong(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		return strtodate;
	 }


	/**
	 * 标签列表查询(分页)
	 */
	@RequestMapping(value = "/selectByPageLable", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> selectByPageLable(QueryString queryString) {
		Map<String,Object> requestMap = new HashMap<String,Object>();
		try {
			Pager<KwDocumentLable> pageList=new Pager<KwDocumentLable>();
			List<KwDocumentLable> fatherList = new ArrayList<KwDocumentLable>();  //父标签
			List<KwDocumentLable> sonList = new ArrayList<KwDocumentLable>(); //子标签
			KwDocumentLable kwDocumentLable = new KwDocumentLable();
			User user = GetSession.getUserSession();
			kwDocumentLable.setUserName(user.getUserName());
			kwDocumentLable.setDeparmentName(user.getDepartmentName());
			if(queryString!=null){
				List<KwDocumentLable> list = kwDocumentLableService.selectByPageLable(kwDocumentLable);
				for(KwDocumentLable lable:list){
					if(lable.getLablePreid()==null){
						fatherList.add(lable);
					}else{
						sonList.add(lable);
					}
				}
				if (fatherList != null&&!fatherList.isEmpty()) {
					pageList=new Pager<KwDocumentLable>(queryString.getCurrentPage(),queryString.getPageSize(), fatherList);
				}
			}
			requestMap.put("fatherList",pageList);
			requestMap.put("sonList",sonList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return requestMap;
	}

	//删除子标签
	@GetMapping(value = "/deleteLableId")
	@ResponseBody
	public int deleteLableId(int id) {
		return kwDocumentLableService.deleteLableId(id);
	}

	//删除全部标签
	@GetMapping(value = "/deleteLablePreId")
	@ResponseBody
	public int deleteLablePreId(int id) {
		kwDocumentLableService.deleteLableId(id); //删除父标签
		kwDocumentLableService.deleteLablePreId(id); //删除全部子标签
		return 1;
	}


}
