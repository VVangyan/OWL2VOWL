package owl2vowl.knowledgebase.service;
import org.springframework.http.ResponseEntity;

public interface DownloadService {
	ResponseEntity<byte[]> download(String path,String filename) throws Exception;
}