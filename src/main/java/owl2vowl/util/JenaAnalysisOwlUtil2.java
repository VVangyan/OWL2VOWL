package owl2vowl.util;


import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;  
import java.util.Vector;  
  
import com.hp.hpl.jena.rdf.model.*;  
import com.hp.hpl.jena.db.DBConnection;  
import com.hp.hpl.jena.db.IDBConnection;  
import com.hp.hpl.jena.ontology.*; 
public class JenaAnalysisOwlUtil2 {

	public static void main(String[] args) {

        // create the model and import owl file

        OntModel model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );

     try

     {

            model.read(new FileInputStream("C://Users//LIUjg//Desktop//工信部一所项目//知识获取//protege//test.owl"),"");

     }

     catch(IOException ioe)

     {

            System.err.println(ioe.toString());

     }

     //the class number

     int j=0;

    //list classes

     for(Iterator i=model.listClasses();i.hasNext();)

//注意如果有匿名类的话，也会被保存在迭代器中

     {

            j++;

      OntClass c = (OntClass) i.next();
      String strClass=c.toString();

//当匿名类运行到这一步的时候会出nullpointer的异常，可以用c.isAnon()判断进行处理。

      System.out.println(j+strClass.substring(1));

     

      //to list sub-classes for each class

      for(Iterator k=c.listSubClasses(true);k.hasNext();)

      {

             System.out.println("  "+"hasSubClass");

             OntClass subclass=(OntClass)k.next();

             String strSubClass=subclass.toString();

             System.out.println(strSubClass.substring(1));

      }

      

      //list property for each class
      if(!c.isAnon()){
    	  for(Iterator y=c.listDeclaredProperties(true);y.hasNext();)

          {

                

                 OntProperty property=(OntProperty)y.next();



                 String strPropertyName=property.toString();

                

                 String strRange=property.getRange().toString();

                 String strRangeName=property.toString();

                

                 //show just the "has" Properties

                 if(strPropertyName.substring(1).substring(0,3).equals("has"))

                 {

                       

                        System.out.print("  ");

                     System.out.print(strPropertyName.substring(1));

                     System.out.println(strRangeName.substring(1));

                 }

                

          }

         }
      }
      

 };

}