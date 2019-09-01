package owl2vowl.util;


import java.io.File;
import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Iterator;  
import java.util.Vector;  
  
import com.hp.hpl.jena.rdf.model.*;  
import com.hp.hpl.jena.db.DBConnection;  
import com.hp.hpl.jena.db.IDBConnection;  
import com.hp.hpl.jena.ontology.*; 
public class JenaAnalysisOwlUtil {

	 public static final String strDriver = "com.mysql.jdbc.Driver"; // path of
	    public static final String strURL = "jdbc:mysql://39.106.128.34:3306/repository?useUnicode=true&characterEncoding=utf8"; // URL
	    public static final String strUser = "repository"; // database user id
	    public static final String strPassWord = "repository"; // database password
	    public static final String strDB = "MySQL"; // database type
	    public static final String PATH = "C:\\Users\\LIUjg\\Desktop\\Animal.rdf"; // file path
	    public static final String OWL = "C://Users//LIUjg//Desktop//工信部一所项目//知识获取//protege//Animal.owl"; // file path
	    public static final String MODLE_NAME="AnimalTest";
	    /**
	     * @param args
	     * @throws ClassNotFoundException 
	     */
	    public static void main(String[] args) {
	    	try {
	    		// 加载数据库驱动类，需要处理异常
	            Class.forName(strDriver);
	            // 创建一个数据库连接
	            IDBConnection conn = getConnection(strURL, strUser, strPassWord,strDB);
	            if(conn!=null){
	                System.out.println("-------mysql数据库连接成功~");
	            }
	            //持久化到数据库
	             //createModel(conn,MODLE_NAME,PATH);           
//	            OntModel model = getModelFromRDB(conn, MODLE_NAME);
//	            System.out.println("00000000000000000000000000000");
//	            getTriples(model);
	            /*System.out.println("--------------------------------------------列表1    类------------------------------");  
	            getAllClasses(model);
	            System.out.println("--------------------------------------------列表2    属性-----------------------------"); 
	            getAllProperties(model);
	            System.out.println("--------------------------------------------列表3   属性特征--------------------------"); 
	            getAllProcharac(model);
	            System.out.println("--------------------------------------------列表5    实例------------------------------"); 
	            getAllIndividuals(model);*/
	            //createModel(conn, MODLE_NAME, OWL);

	            OntModel model = getModelFromDB(conn,MODLE_NAME);
				//printModel(model);
	            getTriples(model);
				conn.close();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	    }

	    //获取数据连接
	      public static DBConnection getConnection(String dbUrl, String dbUser,  
	                String dbPwd, String dbName) {  
	            return new DBConnection(dbUrl, dbUser, dbPwd, dbName);   
	        } 

	      
	      
	      public static OntModel createModel(IDBConnection conn, String name,
	  			String filePath) {
	  		ModelMaker maker = ModelFactory.createModelRDBMaker(conn);
	  		Model model = maker.createModel(name);
	   
	  		try {
	  			File file = new File(filePath);
	  			FileInputStream fis = new FileInputStream(file);
	  			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
	  			model.read(isr, null);
	   
	  			isr.close();
	  			fis.close();
	   
	  			model.commit();
	  		}  catch (Exception e) {
	  			e.printStackTrace();
	  		}
	   
	  		OntModelSpec spec = new OntModelSpec(OntModelSpec.OWL_MEM);
	  		return ModelFactory.createOntologyModel(spec, model);
	      }
	  		
	    //从数据读取OntModel
	      public static OntModel getModelFromRDB(IDBConnection con,String name){
	          ModelMaker maker = ModelFactory.createModelRDBMaker(con);
	          Model model = maker.getModel(name);//读取我们之前创建的MyOntology模型
	          OntModelSpec spec = new OntModelSpec(OntModelSpec.OWL_MEM);//这里是指定的RDF格式 
	          OntModel ontModel = ModelFactory.createOntologyModel(spec,model);
	          return ontModel;
	      }
	      
	      /**
	  	 * get OntModel from db
	  	 * 
	  	 * @param con
	  	 * @param name
	  	 * @return
	  	 */
	  	public static OntModel getModelFromDB(IDBConnection con, String name) {
	  		ModelMaker maker = ModelFactory.createModelRDBMaker(con);
	  		Model model = maker.getModel(name);
	  		OntModel newmodel = ModelFactory.createOntologyModel(
	  				getModelSpec(maker), model);
	  		return newmodel;
	  	}
	   
	  	/**
	  	 * get model spec
	  	 * 
	  	 * @param maker
	  	 * @return
	  	 */
	  	public static OntModelSpec getModelSpec(ModelMaker maker) {
	  		OntModelSpec spec = new OntModelSpec(OntModelSpec.OWL_MEM);
	  		spec.setImportModelMaker(maker);
	  		return spec;
	  	}
	   
	  	/**
	  	 * print model
	  	 * 
	  	 * @param model
	  	 */
	  	public static void printModel(OntModel model) {
	  		for (Iterator<OntClass> i = model.listClasses(); i.hasNext();) {
	  			OntClass oc = i.next();
	  			System.out.println(oc.getLocalName());
	  		}
	  	}
	      

	      //
	      public static void getTriples(OntModel model){
	          StmtIterator stmIter=model.listStatements();
	          while(stmIter.hasNext()){
	              Statement stmt = stmIter.nextStatement();
	              RDFNode object= stmt.getObject();
	              if(object instanceof Resource){//主要为了判定RDFNode是Resource还是Literal
	                  System.out.println(stmt.getSubject().getLocalName()+"--"
	                          +stmt.getPredicate().getLocalName()+"--"
	                          +object.asResource().getLocalName());
	              }else{
	            	  System.out.println(stmt.getSubject().getLocalName()+"**"
	                          +stmt.getPredicate().getLocalName()+"**"
	                          +object.toString());

	              }

	          }


	      }
	      
	      /*函数功能说明 
	         *  
	         * 获取owl文件中所有的class,内容包括： 
	         * 类URI,类名,类描述类型,类描述值 
	         *  
	         */  
	        public static void getAllClasses(OntModel ontModel) {  
	            String str;  
	            // 列出所有的class  
	              
	            for (Iterator allclass = ontModel.listClasses(); allclass.hasNext();) {  
	                  
	                OntClass ontclass = (OntClass) allclass.next();  
	                if(!ontclass.isAnon()){  
	                String classstr = ontclass.toString();  
	                System.out.print("类URI：" + classstr + "   ");  
	                str = classstr.substring(classstr.indexOf("#") + 1);  
	                System.out.print("类名：" + str + "   ");  
	                if (!ontclass.listSuperClasses().hasNext()) {  
	                                  
	                    System.out.println("类描述类型：无");  
	                } else {  
	                    for (Iterator supclasses = ontclass.listSuperClasses(); supclasses  
	                            .hasNext();) {  
	                        OntClass supclass = (OntClass) supclasses.next();  
	                        String supclasstr = supclass.toString();  
	                        str = supclasstr.substring(supclasstr.indexOf("#") + 1);  
	                        System.out.print("类描述类型：subClassOf   ");  
	                        System.out.println("类描述值：" + str);  
	                          
	                          
	                    }  
	                }  
	                }  
	            }  
	        }
	        
	        /* 函数功能说明 
	         *  
	         * 获取owl文件中所有的属性,内容包括： 
	         * 属性URI,属性名,属性,定义域,值域 
	         *  
	         * */  
	        public static void getAllProperties(OntModel ontModel) {  
	            String str;  
	              
	            // 列出所有的对象属性  
	            for (Iterator allobjpry = ontModel.listObjectProperties(); allobjpry  
	                    .hasNext();) {  
	  
	                OntProperty objpry = (OntProperty) allobjpry.next();  
	                  
	                // 属性URI  
	                String objprystr = objpry.toString();  
	                System.out.print("属性URI：" + objprystr + "  ");  
	                // 属性名  
	                str = objprystr.substring(objprystr.indexOf("#") + 1);  
	                System.out.print("属性值：" + str + " 属性：OP ");  
	                // 属性定义域  
	                String domain = objpry.getDomain().toString();  
	                String domainstr = domain.substring(domain.indexOf("#") + 1);  
	                System.out.print("定义域 ：" + domainstr);  
	                // 属性值域  
	                String range = objpry.getRange().toString();  
	                String rangestr = range.substring(range.indexOf("#") + 1);  
	                System.out.println("  值域：" + rangestr);  
	  
	            }  
	            // 列出所有的数据属性  
	            for (Iterator alldatapry = ontModel.listDatatypeProperties(); alldatapry  
	                    .hasNext();) {  
	  
	                OntProperty datapry = (OntProperty) alldatapry.next();  
	                // 属性URI  
	                String dataprystr = datapry.toString();  
	                System.out.print("属性URI：" + dataprystr + "  ");  
	                // 属性名  
	                str = dataprystr.substring(dataprystr.indexOf("#") + 1);  
	                System.out.print("属性值：" + str + " 属性：DP ");  
	                // 属性定义域  
	                String domain = datapry.getDomain().toString();  
	                String domainstr = domain.substring(domain.indexOf("#") + 1);  
	                System.out.print("定义域 ：" + domainstr);  
	                // 属性值域  
	                String range = datapry.getRange().toString();  
	                String rangestr = range.substring(range.indexOf("#") + 1);  
	                System.out.println("  值域：" + rangestr);  
	                System.out.println(dataprystr );  
	                System.out.println(str);  
	                System.out.println(domainstr);  
	                System.out.println(rangestr);  
	            }  
	        }  
	  
	        /* 函数功能说明 
	         *  
	         * 列出所有的属性特征,内容包括： 
	         * 属性URI、属性名、特征类型、特征值 
	         *  
	         * */  
	        public static void getAllProcharac(OntModel ontModel) {  
	            String str;  
	            // 列出所有的对象属性  
	            for (Iterator allobjpry = ontModel.listObjectProperties(); allobjpry.hasNext();) {  
	  
	                String info = null;  
	                OntProperty objpry = (OntProperty) allobjpry.next();  
	                OntProperty objinverof = objpry.getInverseOf();  
	                  
	                if(objinverof!=null){  
	                info = "属性URI ："+objpry+"\n属  性  名  :"+objpry.toString().substring(objpry.toString().indexOf("#")+1)  
	                        +"\n特征类型 :inverseOf  "+"\n特  征  值  ："+ objinverof.toString().substring(objinverof.toString().indexOf("#")+1);  
	                System.out.println(info);  
	                }  
	            }  
	            }  
	          
	          
	        /* 函数功能说明 
	         *  
	         * 列出所有的实例,内容包括： 
	         * 实例URI、实例名、类URI、属性URI、属性值 
	         *  
	         * */  
	        public static void getAllIndividuals(OntModel ontModel) {  
	            String str;  
	  
	            // 迭代出本体文件中所有的实例  
	            for (Iterator allIndivs = ontModel.listIndividuals(); allIndivs.hasNext();) {  
	                Individual indiv = (Individual) allIndivs.next();  
	                //对象属性命名空间  
	                String namespace = indiv.toString().substring(0,indiv.toString().indexOf("#") + 1);  
	                // 实例所属的类  
	                OntClass classOfIndiv = indiv.getOntClass();  
	                  
	                //实例所属类的所有属性  
	                for (Iterator classPryOfIndivs = classOfIndiv.listProperties(); classPryOfIndivs.hasNext();)   
	                {  
	                    OntProperty classPryOfIndiv = (OntProperty) classPryOfIndivs.next();  
	                    System.out.println(classPryOfIndivs.next());  
	                    String classPryOfIndivstr = classPryOfIndiv.toString();  
	                    String info = null;  
	                    info = "实例URI:"  
	                            + indiv  
	                            + " 实例名："  
	                            + indiv.toString().substring(indiv.toString().indexOf("#") + 1) + "  实例所属类："  
	                            + classOfIndiv  
	                            +" 属性URI："  
	                            +classPryOfIndivstr;  
	                      
	                    // 获取这个实例的属性值  
	                    if (indiv.getPropertyValue(classPryOfIndiv) != null) {  
	                        String pryValueOfIndiv = indiv.getPropertyValue(classPryOfIndiv).toString();  
	                        /*判断对象属性或数据属性 
	                         * 如果实例属性值中包括"^^"和"#"，则为数据属性，否则为对象属性 
	                         */  
	                        if (pryValueOfIndiv.contains("^^")&&pryValueOfIndiv.contains("#")) {  
	                            info = info   
	                                    + "  属性值："  
	                                    + pryValueOfIndiv.substring(0, pryValueOfIndiv.indexOf("^^"));  
	                        }else{  
	                            info = info  
	                                    + "  属性值："  
	                                    + pryValueOfIndiv.substring(pryValueOfIndiv.indexOf("#") + 1);  
	                        }  
	                    } else {  
	                        info = info + "   无属性值";  
	                    }  
	                    //输出实例信息  
	                    System.out.println(info);  
	                }  
	          
	            }  
	  
	        }  
}
