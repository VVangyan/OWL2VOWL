package owl2vowl.knowledgebase.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import owl2vowl.knowledgebase.entity.KwDocument;
import owl2vowl.knowledgebase.entity.KwDocumentExample;
import owl2vowl.knowledgebase.entity.KwFileLog;
import owl2vowl.knowledgebase.entity.User;
import owl2vowl.knowledgebase.service.KwDocumentService;
import owl2vowl.knowledgebase.service.KwFileLogService;
import owl2vowl.knowledgebase.util.FileUpload;
import owl2vowl.knowledgebase.util.GetSession;
import owl2vowl.knowledgebase.util.R;

@RestController
public class UploadController {
    @Autowired
    private KwFileLogService kwFileLogService;


    @Autowired
    private KwDocumentService kwDocumentService;

    /**
     * @param request
     * @return
     * @throws IOException
     * @throws IllegalStateException
     * @desc: 上传 zbwj
     */
    @PostMapping("/uploadFile")
    @Transactional
    public R uploadEecel(HttpServletRequest request) throws IllegalStateException, IOException {
        try {
			System.out.println("request" + request);
			String documentId = request.getParameter("documentId");
			System.out.println("documentId " + request.getParameter("documentId"));
			System.out.println("filedesc " + request.getParameter("filedesc"));

			R fileResult = FileUpload.uploadFile(request);
			JSONObject jsonObject = JSONObject.fromObject(fileResult.get("fileInfo"));
			System.out.println("jsonObject" + jsonObject);
			saveObjectData(documentId,jsonObject);
			System.out.println("fileInfo :" + fileResult.get("fileInfo"));
		} catch (Exception e) {
			e.printStackTrace();
		}
        return R.ok();
    }
    @Transactional
    void saveObjectData(String documentId, JSONObject jsonObject) {
        try {
			User user = GetSession.getUserSession(); //获取当前用户
			String fileName = jsonObject.get("fileName").toString();
			double filesSize = Double.parseDouble(jsonObject.get("filesSize").toString());
			String type = jsonObject.get("type").toString();
			String path = jsonObject.get("path").toString();
			String filedesc = jsonObject.get("filedesc").toString();

			KwFileLog kwFileLog = new KwFileLog();
			kwFileLog.setDoucmentId(Integer.parseInt(documentId));
			kwFileLog.setUploadUser(user.getUserName());
			kwFileLog.setUploadUserid(user.getId());
//        kwFileLog.setDocumentType("科学");
			kwFileLog.setUploadTime(new Date());
			kwFileLog.setFilename(fileName);
			kwFileLog.setSize(filesSize);
			kwFileLog.setType(type);
			kwFileLog.setSaveurl(path);
			
			kwFileLog.setDocumentType(filedesc);//文件附件描述
			kwFileLogService.insertSelective(kwFileLog);

			KwDocumentExample kwDocumentExample=new KwDocumentExample();
			kwDocumentExample.createCriteria().andDocumentIdEqualTo(Integer.parseInt(documentId));
			KwDocument kwDocument=new KwDocument(type, (int) filesSize, fileName, path);
			kwDocumentService.updateByExampleSelective(kwDocument,kwDocumentExample);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
    }


}