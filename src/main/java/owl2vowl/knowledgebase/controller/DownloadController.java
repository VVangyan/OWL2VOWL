package owl2vowl.knowledgebase.controller;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import owl2vowl.knowledgebase.service.DownloadService;


/**
 * 文件下载
 * 
 * @author yan
 */
@Controller
@RequestMapping("/filedownload")
public class DownloadController {

	@Autowired 
	DownloadService downloadService;
	
	@PostMapping("/download")
	public ResponseEntity<byte[]> download(@RequestParam("filePath") String filePath,@RequestParam("fileName") String fileName){
		ResponseEntity<byte[]> download=null;
		try {
			String decodeFilePath = URLDecoder.decode(filePath, "utf-8");
			download = downloadService.download(decodeFilePath, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return download;
	}
}