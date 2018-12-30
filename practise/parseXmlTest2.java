import org.dom4j.*;
import java.io.*;
import java.util.*;
public class parseXmlTest2
{
 public static void main(String argv[]) throws IOException,DocumentException
 {
  BufferedReader br=new BufferedReader(new FileReader("temp1.txt"));
  StringBuffer sb=new StringBuffer();
  String str="";
  while((str=br.readLine())!=null)
  { sb.append(str+"\n"); }	
  
  
  Document doc=DocumentHelper.parseText(sb.toString());
  Element root=doc.getRootElement();
  int response=Integer.parseInt(root.element("RESPONSE_CODE").getText());
  int re1=Integer.parseInt(root.elementText("RESPONSE_CODE"));
  System.out.println("response="+re1);
  Element he=root.element("HEADER");
  System.out.println(he.elementText("BOARD_POINT"));
  System.out.println(he.elementText("OFF_POINT"));
  System.out.println(he.elementText("TRIP_POINT"));
  System.out.println(he.elementText("DEPARTURE_DATE"));
  System.out.println(he.elementText("PASSENGER_NUMBER"));
    
  for(Iterator it=root.elementIterator("FARE_AND_FLIGHTS");it.hasNext();)
  {
   Element e=(Element)it.next();
   Element fareFl=e.element("FARE");
   System.out.println(fareFl.elementText("FARE_NBR"));
   System.out.println(fareFl.elementText("CABIN"));
   System.out.println(fareFl.elementText("TRIP"));
   System.out.println(fareFl.elementText("RULE_NAME"));
   System.out.println(fareFl.elementText("RULE_DESC"));
   /*
   System.out.println(fareFl.element("PUBLIC_FARE_PRICE").attribute("ADULT").getText());
   System.out.println(fareFl.element("PUBLIC_FARE_PRICE").attribute("AGED").getText());
   System.out.println(fareFl.element("PUBLIC_FARE_PRICE").attribute("CHILD").getText());
   System.out.println(fareFl.element("NET_FARE_PRICE").attribute("ADULT").getText());
   System.out.println(fareFl.element("NET_FARE_PRICE").attribute("AGED").getText());
   System.out.println(fareFl.element("NET_FARE_PRICE").attribute("CHILD").getText());   	
   */
   for(Iterator it1=e.elementIterator("FLIGHTS");it1.hasNext();)
   //for(Iterator it1=e.elements("FLIGHTS").iterator();it1.hasNext();)
   {
   	Element depFl=(Element)it1.next();
   	System.out.println(depFl.element("DEP_FLIGHTS").attributeValue("HAVE_LINE"));
   	//System.out.println(depFl.element("DEP_FLIGHTS").attribute("HAVE_LINE").getText());
   	for(Iterator it2=depFl.element("DEP_FLIGHTS").elementIterator("FLIGHTINFO");it2.hasNext();)
   	{
      Element flightInfo=(Element)it2.next();
      System.out.println(flightInfo.elementText("ITEM_NUMBER"));		
      System.out.println(flightInfo.elementText("DEPARTURE_TIME"));		
      System.out.println(flightInfo.elementText("ARRIVAL_TIME"));		
      System.out.println(flightInfo.elementText("FLIGHT_NUMBER"));		
      System.out.println(flightInfo.elementText("EQUIPMENT_CODE"));		      
      
      for(Iterator fl=flightInfo.elementIterator("SEAT");fl.hasNext();)
      {
      	Element s=(Element)fl.next();
      	String seat=s.attributeValue("BOOKING_CLASS");
      	int seatCount=0;
      	if(seat.equals("Y"))
      	{
      	 seatCount=Integer.parseInt(s.attributeValue("AVAILABLE_SEAT_COUNT")); 
      	 System.out.println("seat="+seat+" seatCount="+seatCount);
      	}	
      	
      }
    
    
      
      System.out.println("****************************************************");    
      
   	}	
   	
   	
   }	
   
  }	
  
  
 }
}