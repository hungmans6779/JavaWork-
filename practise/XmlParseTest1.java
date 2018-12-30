import java.io.*;
import org.dom4j.*;
import java.util.*;
public class XmlParseTest1
{
 public static void main(String argv[]) throws IOException,DocumentException
 {
   BufferedReader br=new BufferedReader(new FileReader("temp1.txt"));
   String str="";
   StringBuffer sb=new StringBuffer();
   while((str=br.readLine())!=null)
   { sb.append(str+"\n");	}	
   //System.out.println(sb.toString());
   //parseXml(sb.toString());
   //parseXml1(sb.toString());
   
   
    Document doc=DocumentHelper.parseText(sb.toString());
    Element e=doc.getRootElement();
    for(int i=0,size=e.nodeCount();i<size;System.out.println(e.node(i)),i++);
    treeWalk(e);
 }
 
  private static void treeWalk(Element element) 
 {
   for (int i = 0, size = element.nodeCount(); i < size; i++){
           Node node = element.node(i);
           if (node instanceof Element) {
              treeWalk((Element) node);
           } 
       }
   } 
  
 
 
 
 
 
 private static void parseXml1(String str) throws DocumentException
 {
  Document doc=DocumentHelper.parseText(str);
  Element root=doc.getRootElement();
  //int code=Integer.parseInt(root.element("RESPONSE_CODE").getText());
  //int code=Integer.parseInt(root.elementText("RESPONSE_CODE"));
  //System.out.println(code);
  /*
  for(Iterator it=root.elementIterator();it.hasNext();)
  {
   Element e=(Element)it.next();
   System.out.println(e);	
  }	
  */
  
  /*
  for(Iterator it=root.elementIterator("RESPONSE_CODE");it.hasNext();)
  {
   Element e=(Element)it.next();
   System.out.println(e);	
  }	
  for(Iterator it=root.elementIterator("HEADER");it.hasNext();)
  {
   Element e=(Element)it.next();
   System.out.println(e);
   System.out.println(e.elementText("BOARD_POINT"));	
   System.out.println(e.element("OFF_POINT").getText());
   System.out.println(e.elementText("TRIP_POINT"));
   System.out.println(e.element("DEPARTURE_DATE").getText());
   System.out.println(e.elementText("PASSENGER_NUMBER"));
  }	
  */
   
   /*
   for(Iterator i = root.attributeIterator(); i.hasNext(); ) {
       Attribute attribute = (Attribute) i.next();
       System.out.println(attribute);
       // do something
    }
    */
    

    
  /*
  for(Iterator it=root.elementIterator("FARE_AND_FLIGHTS");it.hasNext();)
  {
   Element e=(Element)it.next();
   System.out.println(e);	
  }	
  */
 }
 
 


   
 
 private static void parseXml(String str) throws DocumentException
 {
 	Document doc=DocumentHelper.parseText(str);
 	Element root=doc.getRootElement();
 	int responseCode=Integer.parseInt(root.element("RESPONSE_CODE").getText());
 	for(Iterator iter=root.elementIterator("FARE_AND_FLIGHTS");iter.hasNext();)
 	{
 	 	Element fareFlightEle=(Element)iter.next();
 	 	Element fareEle=fareFlightEle.element("FARE");
 	 	System.out.println(fareEle.elementText("FARE_NBR"));
 	 	System.out.println(fareEle.elementText("CABIN"));
 	 	System.out.println(fareEle.elementText("TRIP"));
 	 	System.out.println(fareEle.elementText("RULE_NAME"));
 	 	System.out.println(fareEle.elementText("RULE_DESC"));
    for(Iterator flightIter=fareFlightEle.elements("FLIGHTS").iterator();flightIter.hasNext();)
    {
     Element flightEle = (Element) flightIter.next();
     String able=flightEle.element("DEP_FLIGHTS").attributeValue("HAVE_LINE");
     if("Y".equalsIgnoreCase(able))
     {
     	for(Iterator flightInfoIter=flightEle.element("DEP_FLIGHTS").elements("FLIGHTINFO").iterator();flightInfoIter.hasNext();)
     	{
     		
     	}	
     }	
    }	
 	 	
 	}	
 	//System.out.println(responseCode);
 }	
}