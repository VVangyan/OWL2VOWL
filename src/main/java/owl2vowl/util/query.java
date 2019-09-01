package owl2vowl.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
public class query {
	
	public static void main(String args[]) throws FileNotFoundException{    
        OntModel ontModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
        ontModel.read(new FileInputStream("C://Users//LIUjg//Desktop//工信部一所项目//知识获取//protege//test.owl"), "");

        String OBO = "http://purl.obolibrary.org/obo/";
        String OBOINOWL = "http://www.geneontology.org/formats/oboInOwl#";
        String OWL = "http://www.w3.org/2002/07/owl#";
        String RDF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

        for (Iterator<?> i = ontModel.listClasses(); i.hasNext();) {
            OntClass c = (OntClass) i.next(); // 返回类型强制转换
            if (!c.isAnon()) { // 如果不是匿名类，则打印类的名字
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
                        String str = c.getModel().getGraph().getPrefixMapping().shortForm(c.getURI())+ "'s superClass is " ; // 获取URI
                        String strSP = sp.getURI();
                        if(strSP != null){
                            try{ // 另一种简化处理URI的方法

                                str = str + ":" + strSP.substring(strSP.indexOf('#')+1);

                                System.out.println("Class" +str);

                            }catch( Exception e ){}
                        }
                    }

                } // super class ends

                /*//一些propery
                AnnotationProperty p1 = ontModel.createAnnotationProperty(OBO+"IAO_0000115");
                Property p2 = ontModel.createProperty(OBOINOWL+"id");
                Property p3 = ontModel.createProperty(OBOINOWL+"hasOBONamespace");
                Property p4 = ontModel.createProperty(OBOINOWL+"hasExactSynonym");
                Property p5 = ontModel.createProperty(OBOINOWL+"hasNarrowSynonym");

                System.out.println("IAO_0000115:"+c.getPropertyValue(p1));
                System.out.println("id:"+c.getPropertyValue(p2));
                System.out.println("hasOBONamespace:"+c.getPropertyValue(p3));
                System.out.println("hasNarrowSynonym:"+c.getPropertyValue(p5));

                //遍历某个属性p3
                for (Iterator<?> j = c.listPropertyValues(p4); j.hasNext();) {
                    LiteralImpl p =  (LiteralImpl) j.next();
                    System.out.println("hasExactSynonym:"+p.getValue().toString());
                }*/
                
                
                
               /* for (Iterator<?> it = c.listEquivalentClasses(); it.hasNext();)

                {
                    OntClass sp = (OntClass) it.next();
                    //父类不是匿名类
                    if (!sp.isAnon()){
                        String str = c.getModel().getGraph().getPrefixMapping().shortForm(c.getURI())+ "'s Equivalent to " ; // 获取URI
                        String strSP = sp.getURI();
                        if(strSP != null){
                            try{ // 另一种简化处理URI的方法

                                str = str + ":" + strSP.substring(strSP.indexOf('#')+1);

                                System.out.println("Equivalent to" +str);

                            }catch( Exception e ){}
                        }
                    }

                } // Equivalent to ends
                
                
                for (Iterator<?> it = c.listSubClasses(); it.hasNext();)

                {
                    OntClass sp = (OntClass) it.next();
                    //父类不是匿名类
                    if (!sp.isAnon()){
                        String str = c.getModel().getGraph().getPrefixMapping().shortForm(c.getURI())+ "'s SubClasses of " ; // 获取URI
                        String strSP = sp.getURI();
                        if(strSP != null){
                            try{ // 另一种简化处理URI的方法

                                str = str + ":" + strSP.substring(strSP.indexOf('#')+1);

                                System.out.println("SubClasses of" +str);

                            }catch( Exception e ){}
                        }
                    }

                } // Equivalent to ends
*/
                System.out.println();
                ontModel.write(new FileOutputStream("C://Users//LIUjg//Desktop//工信部一所项目//知识获取//protege//test.owl"));
            }
        }
    }

}
