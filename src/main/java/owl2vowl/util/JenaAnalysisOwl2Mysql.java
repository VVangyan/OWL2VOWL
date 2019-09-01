package owl2vowl.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import com.hp.hpl.jena.db.DBConnection;
import com.hp.hpl.jena.db.RDFRDBException;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.ModelMaker;

public class JenaAnalysisOwl2Mysql {
	
	 public static final String strURL = "jdbc:mysql://39.106.128.34:3306/repository"; //数据库URL

	 public static final String strUser = "repository";//数据库登录名

	 public static final String strPassword = "repository";//数据库登录密码

	 public static final String strDB = "MySQL";//数据库类型名称
	 
	 
	 public static int SaveOwl2Mysql(String filePath,String modelName) throws SQLException{
		 int result = 0;
		 try{
			 DBConnection connection = new DBConnection(strURL, strUser, strPassword, strDB);//创建数据库连接
			 try{
				 Class.forName("com.mysql.jdbc.Driver");//装载JDBC驱动
				 System.out.println("驱动程序已经安装。");
		     }catch (ClassNotFoundException e){
		    	 System.out.println("ClassNotFoundException, Driver is not available");
		     }
		     if(connection.getConnection()!=null)
		           System.out.println("数据库连接成功。");
			       //getConnection()方法用于检查连接是否成功，若没有连接成功，会自动抛出异常，同时程序会被挂起
			       // 从此处开始读入一个OWL文件并且存储到数据库中；       
			       ModelMaker maker = ModelFactory.createModelRDBMaker(connection); 
			       // 用createModelRDBMaker()方法创建一个数据库的ModelMaker模型对象，ModelMaker负责创建模型具体操作，也将模型与DB联系起来，参数connection是一个数据库的连接对象
			       Model defModel = null;
			       //"Animal"
		       if(connection.containsModel(modelName))//判断名为Animal的模型是否已经存在数据
		       {
		    	   defModel = maker.openModel(modelName,true);//数据存在则打开此模型
		           System.out.println("打开已存在的模型"); 
		       }else{       
		           defModel = maker.createModel(modelName);//数据不存在则创建此模型
		           System.out.println("创建一个新模型");
		       }
		       OntModelSpec spec = new OntModelSpec(OntModelSpec.OWL_MEM);
		       OntModel DBModel = ModelFactory.createOntologyModel(spec, defModel);
		       //将临时模型转换成本体模型（OWL格式），其中spec参数表示该模型是在内存中存在的。
		       FileInputStream read = null;//定义并初始化文件输入流变量read
		       try{
		    	   //"C://Users//LIUjg//Desktop//工信部一所项目//知识获取//protege//Animal.owl"
		           File file = new File(filePath);
		           read = new FileInputStream(file);//读入OWL本体文件
		       }catch (FileNotFoundException e){//抓取读入文件异常
		           e.printStackTrace();
		           System.out.println("未找到要存储的本体文件，请检查文件地址及名称");
		       }
		       System.out.println("已将本体文件转换为字节流文件。");    
		       InputStreamReader in = null;//定义并初始化输入流转换变量in
		       try{
		           in = new InputStreamReader((FileInputStream)read, "UTF-8");//将字节流文件转换为UTF-8编码
		           System.out.println("已将字节流文件转换为UTF-8编码。");   
		       }catch (UnsupportedEncodingException e){//抓取转换异常
		           e.printStackTrace();
		           System.out.println("不支持上述字符集。");
		       }
		       defModel.read(in,null);//将流文件读入数据库模型
		       defModel.commit();//将模型保存到数据库中
		       System.out.println("数据转换执行完毕，已将本体文件存入数据库。");
		       try{
		           in.close();
		           System.out.println("已将字节流文件关闭。");  
		       }catch (IOException e){//抓取输入输出异常
		           e.printStackTrace();
		           System.out.println("无法关闭字节流文件。");
		       }        
		       try{
		            connection.close();//关闭连接
		            System.out.println("已将连接关闭。");
		       }catch (SQLException e){
		            e.printStackTrace();
		          	System.out.println("连接无法关闭。");
		       }
		       result = 1;
		    }catch (RDFRDBException e){
		       System.out.println("出现异常");
		    }
		    System.out.println("已将本体文件持久化到数据库中，无异常");
		    return result;
	 }

}
