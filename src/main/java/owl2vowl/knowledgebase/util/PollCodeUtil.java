package owl2vowl.knowledgebase.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class PollCodeUtil {
	
	public static void main(String[] args) {
		try {
			System.out.println("注册机地址:"+args[0].toString());
			String path = args[0].toString()+"\\poll.txt";
			String pollcode = readFile(path);
	        String serial = pollcode+"v1.0";
	        String pollCode = DigestUtils.md5Hex(serial);
	        System.out.println("正在为您生成注册码："+pollCode);

	        PrintWriter pw=new PrintWriter(args[0].toString()+"\\pollCode.txt");
			pw.write(pollCode);
			pw.flush();
			pw.close();

			
	        /*Process process = Runtime.getRuntime().exec(  
	        new String[] { "wmic", "cpu", "get", "ProcessorId" });  
	        process.getOutputStream().close();  
	        Scanner sc = new Scanner(process.getInputStream());  
	        String property = sc.next();  
	        String serial = sc.next()+"v1.0";  
	        System.out.println(property + ": " + serial);  
	        
	        String pollCode = DigestUtils.md5Hex(serial);
	        System.out.println(pollCode);
	        
	        PrintWriter pw=new PrintWriter("C://pollCode.txt");
			pw.write(pollCode); 
			pw.flush();
			pw.close();*/
	        
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public static boolean check(){
		boolean flag = false;
		try {
			Process process = Runtime.getRuntime().exec(  
			new String[] { "wmic", "cpu", "get", "ProcessorId" });  
			process.getOutputStream().close();  
			Scanner sc = new Scanner(process.getInputStream());  
			String property = sc.next();  
			String serial = sc.next()+"v1.0";  
			        
			String pollCode = DigestUtils.md5Hex(serial);  //系统生成的
			String code = readFile("C:\\pollCode.txt");  //第一次输入的，后面数据库对比
			if(pollCode!=null && pollCode.equals(code)){
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
		
	}
	
	public static String readFile(String filepath){
		String result = "";
		try {
			
			String encoding = codeString(filepath);
			//System.out.println(encoding);
		    File file = new File(filepath);
		    if (file.isFile() && file.exists()) { //判断文件是否存在
		        InputStreamReader read = new InputStreamReader(
		                new FileInputStream(file), encoding);//考虑到编码格式
		        BufferedReader bufferedReader = new BufferedReader(read);
		        String lineTxt = null;
		        while ((lineTxt = bufferedReader.readLine()) != null) {
		        	if(lineTxt!=null && !lineTxt.trim().equals("ProcessorId")){
		        		System.out.println("本机机器码为："+lineTxt);
		        		result = lineTxt.trim();
		        	}
		         }       
		        read.close();
		    } else {
		        System.out.println("找不到指定的文件");
		    }
//		    file.delete();
    		//System.out.println("删除文件："+filepath);
		} catch (Exception e) {
		    System.out.println("读取文件内容出错");
		    e.printStackTrace();
		}
		return result;
	}
	
	public static String codeString(String fileName) throws Exception {
		 BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
	        int p = (bin.read() << 8) + bin.read();
	        bin.close();
	        String code = null;
	 
	        switch (p) {
	        case 0xefbb:
	            code = "UTF-8";
	            break;
	        case 0xfffe:
	            code = "Unicode";
	            break;
	        case 0xfeff:
	            code = "UTF-16BE";
	            break;
	        default:
	            code = "GBK";
	        }
	 
	        return code;
	}

}
