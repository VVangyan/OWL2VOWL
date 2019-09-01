/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  KwDocumentTypeController.java   
 * @Package owl2vowl.knowledgebase.controller   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月20日 上午9:44:53   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import owl2vowl.knowledgebase.entity.KwDocumentType;
import owl2vowl.knowledgebase.service.KwDocumentTypeService;
import owl2vowl.knowledgebase.util.R;

/**
 * @author yan
 *
 */
@RestController
@RequestMapping("/documentType")
public class KwDocumentTypeController {
	@Autowired
	private KwDocumentTypeService kwDocumentTypeService;

	@GetMapping("/getDocumnetTypes")
	public R getDocumnetTypes() {
		List<KwDocumentType> types = new ArrayList<KwDocumentType>();
		try {
			types = kwDocumentTypeService.selectByExample(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return R.ok().put("types", types);
	}

}
