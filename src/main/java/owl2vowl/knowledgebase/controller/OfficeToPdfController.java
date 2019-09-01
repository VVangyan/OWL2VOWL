/**  
 * All rights Reserved, Designed By www.blueintelligencewh.com
 * @Title:  OfficeToPdfController.java   
 * @Package owl2vowl.knowledgebase.controller   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: 武汉蓝智 
 * @date:   2018年7月16日 上午9:48:42   
 * @version V1.0 
 * @Copyright: 2018 www.blueintelligencewh.com Inc. All rights reserved. 
 * 注意：本内容仅限武汉蓝智科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
package owl2vowl.knowledgebase.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import owl2vowl.knowledgebase.entity.KwOfficeToPdf;
import owl2vowl.knowledgebase.entity.KwOfficeToPdfExample;
import owl2vowl.knowledgebase.service.KwOfficeToPdfService;
import owl2vowl.knowledgebase.util.DateFactoryUtil;
import owl2vowl.knowledgebase.util.FilePathUtil;
import owl2vowl.knowledgebase.util.Office2PDF;
import owl2vowl.knowledgebase.util.R;

/**
 * office to pdf controll
 * 
 * @author yan
 *
 */
@RestController
@RequestMapping("/lookdocument")
public class OfficeToPdfController {
	@Autowired
	private KwOfficeToPdfService kwOfficeToPdfService;
	
	@PostMapping(value="/officeToPdf")
	public R officeToPdf(@RequestParam Map indata ) {
		Integer documentId=Integer.parseInt(indata.get("documentId").toString());
		String inputFile=indata.get("inputFile").toString();
		String decodeInputFile=null;
		String openOfficeToPDF = null;
		try {
			decodeInputFile = URLDecoder.decode(inputFile, "utf-8");
			System.out.println(decodeInputFile);
			String originalName = decodeInputFile.substring(decodeInputFile.lastIndexOf("\\") + 1);
			String destFile = null;
			File f = null;
			String pdfName=originalName.substring(0,originalName.lastIndexOf("."))+".pdf";
			System.out.println("pdfName "+pdfName);
			KwOfficeToPdfExample example = new KwOfficeToPdfExample();
			KwOfficeToPdf record =null;
			example.createCriteria().andDocumentIdEqualTo(documentId).andOriginalNameEqualTo(originalName);
			List<KwOfficeToPdf> selectByExample = kwOfficeToPdfService.selectByExample(example);
			
			String osName = System.getProperty("os.name");
			
			if (selectByExample != null && !selectByExample.isEmpty()) {
				System.out.println(selectByExample.get(0).getTransformPath());
				f = new File(selectByExample.get(0).getTransformPath());
				if (!f.exists()) {
					if(Pattern.matches("Linux.*", osName)) {
						destFile = FilePathUtil.LINUX_OFFICE_TO_PDF_PATH + DateFactoryUtil.getStrYMD()+ File.separator + pdfName;
					}else {
						destFile = FilePathUtil.OFFICE_TO_PDF_PATH + DateFactoryUtil.getStrYMD()+ File.separator + pdfName;
					}
					
					openOfficeToPDF = Office2PDF.openOfficeToPDF(decodeInputFile, destFile);
					record= new KwOfficeToPdf();
					record.setDocumentId(documentId);
					record.setOriginalName(originalName);
					record.setTransformPath(destFile);
					kwOfficeToPdfService.insertSelective(record);
				} else {
					return  R.ok().put("url", selectByExample.get(0).getTransformPath());
				}
			} else {
				if(Pattern.matches("Linux.*", osName)) {
					destFile = FilePathUtil.LINUX_OFFICE_TO_PDF_PATH + DateFactoryUtil.getStrYMD()+ File.separator + pdfName;
				}else {
					destFile = FilePathUtil.OFFICE_TO_PDF_PATH + DateFactoryUtil.getStrYMD()+ File.separator + pdfName;
				}
				openOfficeToPDF = Office2PDF.openOfficeToPDF(decodeInputFile, destFile);
				record= new KwOfficeToPdf();
				record.setDocumentId(documentId);
				record.setOriginalName(originalName);
				record.setTransformPath(destFile);
				kwOfficeToPdfService.insertSelective(record);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return R.ok().put("url", openOfficeToPDF);
	}
}
