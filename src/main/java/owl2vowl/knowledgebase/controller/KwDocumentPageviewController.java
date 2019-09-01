package owl2vowl.knowledgebase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import owl2vowl.knowledgebase.entity.KwDocumentPageview;
import owl2vowl.knowledgebase.entity.User;
import owl2vowl.knowledgebase.service.KwDocumentPageviewService;
import owl2vowl.knowledgebase.util.GetSession;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pageview")
public class KwDocumentPageviewController {

	@Autowired
	private KwDocumentPageviewService kwDocumentPageviewService;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");


	/**
	 * 用户推荐开启、关闭状态
	 */
	@RequestMapping(value = "/updateUserRecommend", method = RequestMethod.POST)
	@ResponseBody
	public int updateUserRecommend(String recommendOff){
		//根据用户修改推荐开启和关闭
		return 1;
	}


	/**
	 * 获取用户推荐开启、关闭状态
	 */
	@RequestMapping("/index")
	public String recommendIsDisplay(Model model){
		int recommendOff = 1;  //获取推荐开关  0.关闭  1.开启
		model.addAttribute("recommendOff",recommendOff);
		return "knowledge/knowledgeRead";
	}

	/**
	 * 推荐记录展示查询
	 */
	@RequestMapping(value = "/selectKwDocumentPageviewUserRecords", method = RequestMethod.POST)
	@ResponseBody
	public List<KwDocumentPageview> selectKwDocumentPageviewUserRecords(KwDocumentPageview  kwDocumentPageview){
		List<KwDocumentPageview> list=new ArrayList<>();
		try {
			//查询条件，根据当前登陆用户部分匹配上一次浏览的用户记录查询
			User user = GetSession.getUserSession(); //获取当前用户
			kwDocumentPageview.setPageviewIp(user.getUserName());
			kwDocumentPageview.setDepartmentName(user.getDepartmentName());
			list = kwDocumentPageviewService.selectKwDocumentPageviewUserRecords(kwDocumentPageview);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


}
