package owl2vowl.knowledgebase.util;

import java.io.File;

/**
 * 路径工具类
 * 
 * @author yan
 *
 */
public interface FilePathUtil {
	/* 文件保存路径 */
	//  /home/whlz/Documents/
	String FILE_PATH = "C:" + File.separator + "uploadDir" + File.separator;
	String LINUX_FILE_PATH = File.separator +"home"+File.separator +"whlz"+File.separator +"Documents"+File.separator +"uploadDir" + File.separator;
	
	/* office to pdf path */
	String OFFICE_TO_PDF_PATH = "C:" + File.separator + "officeToPdfDir" + File.separator;
	
	String LINUX_OFFICE_TO_PDF_PATH = File.separator +"home"+File.separator +"whlz"+File.separator +"Documents"+File.separator + "officeToPdfDir" + File.separator;
}
