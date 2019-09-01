package owl2vowl.knowledgebase.util;
import java.io.File;
import java.util.Date;
import java.util.regex.Pattern;

import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeException;
import org.artofsolving.jodconverter.office.OfficeManager;
 
/**
 * 这是一个工具类，主要是为了使Office2003-2007全部格式的文档(.doc|.docx|.xls|.xlsx|.ppt|.pptx)
 * 转化为pdf文件<br>
 * Office2010的没测试<br>
 * 
 * @date 2018-07-14
 * @author yan
 * 
 */
public class Office2PDF {
 
	/**
	 * 使Office2003-2007全部格式的文档(.doc|.docx|.xls|.xlsx|.ppt|.pptx) 转化为pdf文件<br>
	 * 
	 * @param inputFilePath
	 *            源文件路径，如："e:/test.docx"
	 * @param outputFilePath
	 *            目标文件路径，如："e:/test_docx.pdf"
	 * @return
	 */
	public static String openOfficeToPDF(String inputFilePath, String outputFilePath) {
		return office2pdf(inputFilePath, outputFilePath);
	}
 
	/**
	 * 根据操作系统的名称，获取OpenOffice.org 3的安装目录<br>
	 * 如我的OpenOffice.org 3安装在：C:/Program Files (x86)/OpenOffice.org 3<br>
	 * 
	 * @return OpenOffice.org 3的安装目录
	 */
	public static String getOfficeHome() {
		String osName = System.getProperty("os.name");
		System.out.println("操作系统名称:"+osName);
		if (Pattern.matches("Linux.*", osName)) {
			//return "/opt/openoffice.org3";
			return "/opt/openoffice4";
		} else if (Pattern.matches("Windows.*", osName)) {
			return "C:\\Program Files (x86)\\OpenOffice 4";
			//return "F:\\Program Files (x86)\\OpenOffice 4";
		} else if (Pattern.matches("Mac.*", osName)) {
			return "/Application/OpenOffice.org.app/Contents";
		}
		return null;
	}
 
	/**
	 * 连接OpenOffice.org 并且启动OpenOffice.org
	 * 
	 * @return
	 */
	public static OfficeManager getOfficeManager() {
		DefaultOfficeManagerConfiguration config = new DefaultOfficeManagerConfiguration();
		// 获取OpenOffice.org 3的安装目录
		String officeHome = getOfficeHome();
		config.setOfficeHome(officeHome);
		// 启动OpenOffice的服务
		OfficeManager officeManager = config.buildOfficeManager();
		officeManager.start();
		return officeManager;
	}
 
	/**
	 * 转换文件
	 * 
	 * @param inputFile
	 * @param outputFilePath_end
	 * @param inputFilePath
	 * @param outputFilePath
	 * @param converter
	 */
	public static void converterFile(File inputFile, String outputFilePath_end, String inputFilePath, String outputFilePath, OfficeDocumentConverter converter) {
		File outputFile = new File(outputFilePath_end);
		// 假如目标路径不存在,则新建该路径
		if (!outputFile.getParentFile().exists()) {
			outputFile.getParentFile().mkdirs();
		}
		try {
			converter.convert(inputFile, outputFile);
		} catch (OfficeException e) {
			e.printStackTrace();
		}
		System.out.println("文件：" + inputFilePath + "\n转换为\n目标文件：" + outputFile + "\n成功！");
	}
 
	/**
	 * 使Office2003-2007全部格式的文档(.doc|.docx|.xls|.xlsx|.ppt|.pptx) 转化为pdf文件<br>
	 * 
	 * @param inputFilePath
	 *            源文件路径，如："e:/test.docx"
	 * @param outputFilePath
	 *            目标文件路径，如："e:/test_docx.pdf"
	 * @return
	 */
	public static String office2pdf(String inputFilePath, String outputFilePath) {
		boolean flag = false;
		OfficeManager officeManager = getOfficeManager();
		// 连接OpenOffice
		OfficeDocumentConverter converter = new OfficeDocumentConverter(officeManager);
		long begin_time = new Date().getTime();
		if (null != inputFilePath) {
			File inputFile = new File(inputFilePath);
			// 判断目标文件路径是否为空
			if (null == outputFilePath) {
				// 转换后的文件路径
				String outputFilePath_end = getOutputFilePath(inputFilePath);
				if (inputFile.exists()) {// 找不到源文件, 则返回
					converterFile(inputFile, outputFilePath_end, inputFilePath, outputFilePath, converter);
					flag = true;
				}
			} else {
				if (inputFile.exists()) {// 找不到源文件, 则返回
					converterFile(inputFile, outputFilePath, inputFilePath, outputFilePath, converter);
					flag = true;
				}
			}
			officeManager.stop();
		} else {
			System.out.println("con't find the resource");
		}
		long end_time = new Date().getTime();
		System.out.println("文件转换耗时：[" + (end_time - begin_time) + "]ms");
		return outputFilePath;
	}
 
	/**
	 * 获取输出文件
	 * 
	 * @param inputFilePath
	 * @return
	 */
	public static String getOutputFilePath(String inputFilePath) {
		String outputFilePath = inputFilePath.replaceAll("." + getPostfix(inputFilePath), ".pdf");
		return outputFilePath;
	}
 
	/**
	 * 获取inputFilePath的后缀名，如："e:/test.pptx"的后缀名为："pptx"<br>
	 * 
	 * @param inputFilePath
	 * @return
	 */
	public static String getPostfix(String inputFilePath) {
		return inputFilePath.substring(inputFilePath.lastIndexOf(".") + 1);
	}
 
	public static void main(String[] args) {
		String sourceFile = "C:\\Users\\yan\\Desktop\\徐欢\\DC大数据竞赛平台功能说明.ppt";
		String destFile = "C:\\Users\\yan\\Desktop\\test111\\DC大数据竞赛平台功能说明.pdf";
		File f=new File(destFile);
		String openOfficeToPDF=null;
		if(!f.exists()) {
			 openOfficeToPDF = openOfficeToPDF(sourceFile, destFile);
			 System.out.println("文件不存在"+openOfficeToPDF);
		}else {
			System.out.println("文件存在"+destFile);
		}
	}
}