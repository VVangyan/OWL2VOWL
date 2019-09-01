package owl2vowl.knowledgebase.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import owl2vowl.Owl2Vowl;
import owl2vowl.knowledgebase.entity.EntityInfo;
import owl2vowl.knowledgebase.entity.EntityRelation;
import owl2vowl.knowledgebase.entity.KwFileLog;
import owl2vowl.knowledgebase.entity.KwSemantics;
import owl2vowl.knowledgebase.entity.KwSemanticsExample;
import owl2vowl.knowledgebase.entity.OwlFileInfo;
import owl2vowl.knowledgebase.service.EntityInfoService;
import owl2vowl.knowledgebase.service.EntityRelationService;
import owl2vowl.knowledgebase.service.KwFileLogService;
import owl2vowl.knowledgebase.service.KwSemanticsService;
import owl2vowl.knowledgebase.service.OwlFileInfoService;
import owl2vowl.knowledgebase.util.FilePathUtil;
import owl2vowl.knowledgebase.util.R;
import owl2vowl.util.CreateFileUtil;
import owl2vowl.util.JenaAnalysisOwl2Mysql;

@RestController
@RequestMapping("/owlManage")
@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
public class OwlManageController {

	@Autowired
	private OwlFileInfoService owlFileInfoService;
	@Autowired
	private EntityInfoService entityInfoService;
	@Autowired
	private EntityRelationService entityRelationService;
	@Autowired
	private KwSemanticsService kwSemanticsService;
	@Autowired
	private KwFileLogService kwFileLogService;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	Map<String, Owl2Vowl> conversionSessionMap=new HashMap<String, Owl2Vowl>();

	public static void main(String[] args) throws SQLException

	{
		String file = "C://Users//LIUjg//Desktop//工信部一所项目//知识获取//protege//test.owl";
		String fileName = file.substring(file.lastIndexOf("/")+1);
		String prefix=fileName.substring(fileName.lastIndexOf("."));
		int num=prefix.length();//得到后缀名长度
		String Name= fileName.substring(0, fileName.length()-num);
		System.out.println(Name);
	}

	/**
	 * 上传附件
	 * @return
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST,produces="text/html;charset=utf-8")
	@ResponseBody 
	public String uploadFile(HttpServletResponse response,HttpServletRequest request){
		String result="error";
		try {
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			Map<String,MultipartFile> files = multiRequest.getFileMap();
			if(files!=null && !files.isEmpty()){
				for (String fileId : files.keySet()) {
					MultipartFile file = files.get(fileId);
					Long size = file.getSize();
					//savePic(file.getInputStream(), file.getOriginalFilename(),request,size);
					saveOvoFileAndJsonData(file, file.getOriginalFilename());
				}
			}
			result = "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/saveSemantics", method = RequestMethod.POST)
	public R saveSemantics(@RequestParam Map<String, Object> params) {
		try {
			KwSemantics  kwsem = new KwSemantics();
			String semanticsCode = UUID.randomUUID().toString();
			String semanticsName = (String) params.get("semanticsName");
			String relationType = (String) params.get("relationType");
			String relationSemanticsCode = UUID.randomUUID().toString();
			String relationSemanticsName = (String) params.get("relationSemanticsName");
			kwsem.setSemanticsCode(semanticsCode);
			kwsem.setSemanticsName(semanticsName);
			kwsem.setRelationType(relationType);
			kwsem.setRelationSemanticsCode(relationSemanticsCode);
			kwsem.setRelationSemanticsName(relationSemanticsName);
			kwSemanticsService.insert(kwsem);
			return R.ok();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@GetMapping("/getSemanticsList")
	public R getSemanticsList(@RequestParam Map<String, Object> params) {
		try {
			Integer pn = Integer.parseInt(params.get("page") + "");
			PageHelper.startPage(pn, 10);
			List<KwSemantics> KwSemanticss = kwSemanticsService.selectByExample(null);
			PageInfo page = new PageInfo(KwSemanticss, 10);
			return R.ok().put("page", page);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * 用户后台>产品中心>我的产品(后台分页)查询
	 */
	@RequestMapping(value = "/delSemantics", method = RequestMethod.POST)
	@ResponseBody
	public R delSemantics(HttpServletRequest request,@RequestParam Map<String, Object> mydata){
		try {
			Integer id = Integer.parseInt(mydata.get("id") + "");
			kwSemanticsService.deleteByPrimaryKey(id);
			return R.ok();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;

	}



	/**
	 * 用户后台>产品中心>我的产品(后台分页)查询
	 */
	@RequestMapping(value = "/getSemantics", method = RequestMethod.POST)
	@ResponseBody
	public R getSemantics(HttpServletRequest request,@RequestParam Map<String, Object> mydata){
		try {
			List<KwSemantics> listSe = null;
			List<String> strSE = new ArrayList<String>();
			String searchName = (String) mydata.get("searchName");
			String searchType = (String) mydata.get("searchType");
			strSE.add(searchName);
			if(searchName!=null && !"".equals(searchName) && searchType!=null && !"".equals(searchType)){
				KwSemanticsExample example = new KwSemanticsExample();
				example.createCriteria().andSemanticsNameEqualTo(searchName).andRelationTypeEqualTo(searchType);
				listSe = kwSemanticsService.selectByExample(example);
			}
			if(listSe!=null && listSe.size()>0){

				for (int i = 0; i < listSe.size(); i++) {
					strSE.add(listSe.get(i).getRelationSemanticsName());
				}
			}
			Integer pn = Integer.parseInt(mydata.get("page") + "");
			PageHelper.startPage(pn, 8);
			List<KwFileLog> kwList = kwFileLogService.getKwBySemantics(strSE);

			PageInfo page = new PageInfo(kwList, 8);
			return R.ok().put("page", page);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * 
	 * @Title: saveOvoFileAndJsonData   
	 * @Description: 保存Ovo文件 和解析OVO文件的json文件。    
	 * @param: @param ovofile
	 * @param: @param fileName      
	 * @return: void   
	 * @author yan 2019.09.02   
	 * @throws
	 */
	private void saveOvoFileAndJsonData(MultipartFile ovofile,String fileName) {
		OutputStream os = null;     
		Long size = 0L;
		InputStream is1 = null;
		InputStream is2 = null;
		String sessionId=System.currentTimeMillis()+"";
		ByteArrayOutputStream baos=null;
		
		
		String path = FilePathUtil.FILE_PATH +"owlJson"+File.separator;
		String prefix=fileName.substring(fileName.lastIndexOf("."));
		int num=prefix.length();//得到后缀名长度
		String realName= fileName.substring(0, fileName.length()-num);
		String fullPath = FilePathUtil.FILE_PATH  + File.separator +"owlJson"+File.separator+ realName + ".json";

		try {
			size=ovofile.getSize();
			String jsonAsString;
			
			//生成json 字符串
			baos = cloneInputStream(ovofile.getInputStream());
			if(baos==null) {
				return;
			}
			// 打开两个新的输入流  
			is1 = new ByteArrayInputStream(baos.toByteArray());  
			is2 = new ByteArrayInputStream(baos.toByteArray());

			Owl2Vowl owl2Vowl = new Owl2Vowl(is1);
			conversionSessionMap.put(sessionId, owl2Vowl);
			jsonAsString = owl2Vowl.getJsonAsString();
//			System.out.println("jsonAsString:"+jsonAsString);
			
			// 保证创建一个新文件
			File file = new File(fullPath);
			if (!file.getParentFile().exists()) { // 如果父目录不存在，创建父目录
				file.getParentFile().mkdirs();
			}
			if (file.exists()) { // 如果已存在,删除旧文件
				file.delete();
			}
			file.createNewFile();
			// 保存json 字符串
			Writer write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
			write.write(jsonAsString);
			write.flush();
			write.close();

			// 2、保存到临时文件       // 1K的数据缓冲     
			byte[] bs = new byte[1024];       // 读取到的数据长度       
			int len;       // 输出的文件流保存到本地文件        
			File tempFile = new File(path);       
			if (!tempFile.exists()) {         
				tempFile.mkdirs();       
			}       
			os = new FileOutputStream(tempFile.getPath() + File.separator + fileName);       
			// 开始读取      	
			while ((len = is2.read(bs)) != -1) {         
				os.write(bs, 0, len);       
			}
			
			OwlFileInfo owlInfo = new OwlFileInfo();
			owlInfo.setCreateTime(new Date());
			owlInfo.setFileName(realName);
			owlInfo.setFilePath(realName);
			owlInfo.setFileSize(Integer.parseInt(String.valueOf(size)));
			//保存实体信息到数据库
			owlFileInfoService.insert(owlInfo);

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			evaluateLifeCycleOfConversionObject(sessionId,5000);
			
			if(is1!=null) {
				try {
					is1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(is2!=null) {
				try {
					is2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}      
			}
			
			if(baos!=null) {
				try {
					baos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}


	/**
	 * 
	 * @Title: cloneInputStream   
	 * @Description: 由于流读过一次就不能再读了，而InputStream对象本身不能复制,讲流复制  
	 * @param: @param input
	 * @param: @return      
	 * @return: ByteArrayOutputStream   
	 * @author yan 2019.09.02   
	 * @throws
	 */
	private static ByteArrayOutputStream cloneInputStream(InputStream input) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int len;
			while ((len = input.read(buffer)) > -1) {
				baos.write(buffer, 0, len);
			}
			baos.flush();
			return baos;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	synchronized public void evaluateLifeCycleOfConversionObject(String sessionId, long numOfMiliSeconds) { 
		Owl2Vowl conversionInstace= conversionSessionMap.get(sessionId);
		if (conversionInstace!=null) {
			final Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					timed_provideMemoryReleaseHintForGC(sessionId, " -> Live cycle evaluation request", timer);
				}
			},numOfMiliSeconds,numOfMiliSeconds);
		}
	}	
	public void timed_provideMemoryReleaseHintForGC(String sessionId, String msg, Timer t ) {
		t.cancel();
		t.purge();
		t=null;
		provideMemoryReleaseHintForGC(sessionId, msg);
	}

	public void provideMemoryReleaseHintForGC(String sessionId, String msg) {
		Owl2Vowl conversionInstace= conversionSessionMap.get(sessionId);
		if (conversionInstace!=null) {
			Runtime runtime = Runtime.getRuntime();
			NumberFormat format = NumberFormat.getInstance();
			long allocatedMemory = runtime.totalMemory();
			long freeMemory = runtime.freeMemory();

			conversionSessionMap.remove(sessionId);
			conversionInstace=null;
			System.gc();
			System.runFinalization();
			System.out.println("Cleaning up Memory for session Id "+ sessionId+ " << closed Session ");
			System.out.println("Conversion Finished "+msg+" ");

			// create some statistics
			format = NumberFormat.getInstance();
			long after_allocatedMemory = runtime.totalMemory();
			long after_freeMemory = runtime.freeMemory();
			System.out.println("-> USED MEMORY " + format.format((allocatedMemory - freeMemory) / 1024)      + "  ->    "+format.format( (after_allocatedMemory- after_freeMemory) / 1024)+"  ");
		}
	}

	/**
	 * 保存文件
	 * @param inputStream
	 * @param fileName
	 */
	private void savePic(InputStream inputStream, String fileName,HttpServletRequest request,Long size) {       
		OutputStream os = null;     
		try {       
			String path = FilePathUtil.FILE_PATH +"owlJson"+File.separator;
			Owl2Vowl arg8 = new Owl2Vowl(inputStream);
			String arg7 = arg8.getJsonAsString();
			String prefix=fileName.substring(fileName.lastIndexOf("."));
			int num=prefix.length();//得到后缀名长度
			String Name= fileName.substring(0, fileName.length()-num);
			CreateFileUtil.createJsonFile(arg7, "", Name);
			//String path = "C:\\temp\\";       
			// 2、保存到临时文件       // 1K的数据缓冲     
			byte[] bs = new byte[1024];       // 读取到的数据长度       
			int len;       // 输出的文件流保存到本地文件        
			File tempFile = new File(path);       
			if (!tempFile.exists()) {         
				tempFile.mkdirs();       
			}       
			os = new FileOutputStream(tempFile.getPath() + File.separator + fileName);       
			// 开始读取      	
			while ((len = inputStream.read(bs)) != -1) {         
				os.write(bs, 0, len);       
			}
			Date now = new Date();
			OwlFileInfo owlInfo = new OwlFileInfo();
			owlInfo.setCreateTime(now);
			owlInfo.setFileName(Name);
			owlInfo.setFilePath(Name);
			owlInfo.setFileSize(Integer.parseInt(String.valueOf(size)));
			//保存实体信息到数据库
			owlFileInfoService.insert(owlInfo);

		}catch (Exception e) {       
			e.printStackTrace();     
		} finally {
			// 完毕，关闭所有链接      
			try {         
				os.close();         
				inputStream.close();       
			} catch (IOException e) {         
				e.printStackTrace();       
			}     

		}
	}


	@GetMapping("/getOwlList")
	public R getDocumentList(@RequestParam Map<String, Object> params) {
		Integer pn = Integer.parseInt(params.get("page") + "");
		PageHelper.startPage(pn, 10);
		List<OwlFileInfo> documentsList = owlFileInfoService.selectByExample(null);
		PageInfo page = new PageInfo(documentsList, 10);
		return R.ok().put("page", page);
	}

	private static MultipartFile getMulFileByPath(String picPath) {  
		FileItem fileItem = createFileItem(picPath);  
		MultipartFile mfile = new CommonsMultipartFile(fileItem);  
		return mfile;  
	}  

	private static FileItem createFileItem(String filePath)  
	{  
		FileItemFactory factory = new DiskFileItemFactory(16, null);  
		String textFieldName = "textField";  
		int num = filePath.lastIndexOf(".");  
		String extFile = filePath.substring(num);  
		FileItem item = factory.createItem(textFieldName, "text/plain", true,  
				"test" + extFile);  
		File newfile = new File(filePath);  
		int bytesRead = 0;  
		byte[] buffer = new byte[8192];  
		try  
		{  
			FileInputStream fis = new FileInputStream(newfile);  
			OutputStream os = item.getOutputStream();  
			while ((bytesRead = fis.read(buffer, 0, 8192))  
					!= -1)  
			{  
				os.write(buffer, 0, bytesRead);  
			}  
			os.close();  
			fis.close();  
		}  
		catch (IOException e)  
		{  
			e.printStackTrace();  
		}  
		return item;  
	}  

	@RequestMapping(value = {"/showOwl"}, method = {RequestMethod.POST})
	public String uploadOntology(@RequestParam Map<String, Object> params)
			throws IOException, OWLOntologyCreationException {
		//MultipartFile[] files = null;
		String aa = (String) params.get("status");
		ArrayList inputStreams = new ArrayList();

		MultipartFile file = getMulFileByPath("C://Users//LIUjg//Desktop//工信部一所项目//知识获取//protege//test.owl");
		inputStreams.add(file.getInputStream());

		try {
			Owl2Vowl arg8 = new Owl2Vowl((InputStream) inputStreams.get(0));
			String arg7 = arg8.getJsonAsString();
			return arg7;
		} catch (Exception arg6) {
			throw arg6;
		}


	}

	/**
	 * 
	 * @param filePath owl文件地址
	 * @param modelName   模型名称
	 * @return
	 */
	@RequestMapping("/saveOwl2Mysql")
	public String saveOwl2Mysql(String filePath,String modelName) {
		Date now = new Date();
		String date = sdf.format(now);
		String owlCode = UUID.randomUUID().toString();//owl文件编号
		try {
			if(filePath!=null && modelName!=null && !"".equals(filePath)){
				OwlFileInfo owlInfo = new OwlFileInfo();
				owlInfo.setCreateTime(now);
				owlInfo.setFileName(modelName);
				owlInfo.setFilePath(filePath);
				//保存实体信息到数据库
				owlFileInfoService.insert(owlInfo);
			}

			//保存owl文件到mysql数据库
			JenaAnalysisOwl2Mysql.SaveOwl2Mysql(filePath, modelName);
			//保存owl关系到数据库
			saveOwlInfo(filePath, modelName,date,owlCode);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "home/index";
	}


	/**
	 * 
	 * @param filePath
	 * @param modelName
	 * @param date
	 * @return
	 */
	public int saveOwlInfo(String filePath,String modelName,String date,String owlCode){
		int result = 0;
		try {
			OntModel ontModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
			ontModel.read(new FileInputStream(filePath), "");

			for (Iterator<?> i = ontModel.listClasses(); i.hasNext();) {
				OntClass c = (OntClass) i.next(); // 返回类型强制转换
				if (!c.isAnon()) { // 如果不是匿名类，则打印类的名字
					EntityInfo info = new EntityInfo();
					info.setCreatedate(date);
					info.setEntityName(c.getLocalName());
					info.setOwlCode(owlCode);
					//info.setEntityPro(entityPro);
					//info.setEntityType(entityType);
					entityInfoService.insert(info);
					System.out.print("Class:");
					System.out.println("localname:"+c.getLocalName());
					//读取标签名
					System.out.println("标签名："+c.getLabel(""));

					//迭代显示当前类的直接父类
					for (Iterator<?> it = c.listSuperClasses(); it.hasNext();)

					{
						OntClass sp = (OntClass) it.next();
						//父类不是匿名类
						if (!sp.isAnon()){
							String entity1 = "";
							entity1 = c.getModel().getGraph().getPrefixMapping().shortForm(c.getURI());
							String str = entity1+ "'s superClass is " ; // 获取URI
							String strSP = sp.getURI();
							EntityRelation relation = new EntityRelation();
							relation.setEntity1Name(entity1);
							relation.setRelation("superClass");
							if(strSP != null){
								try{ // 另一种简化处理URI的方法
									relation.setEntity2Name(strSP.substring(strSP.indexOf('#')+1));
									str = str + ":" + strSP.substring(strSP.indexOf('#')+1);
									System.out.println("Class" +str);

								}catch( Exception e ){
									e.printStackTrace();
								}
							}
							entityRelationService.insert(relation);
						}

					} // super class ends

					System.out.println();
					ontModel.write(new FileOutputStream(filePath));
				}
			}
			result = 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

}
