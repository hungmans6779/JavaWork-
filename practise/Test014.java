import java.util.*;
public class Test014
{
 public static void main(String argv[])
 {
  Properties p=System.getProperties();
  Enumeration enum1=p.propertyNames();
  String propertyName;
  String propertyValue;
  while(enum1.hasMoreElements())
  {
   propertyName=(String)enum1.nextElement();
   propertyValue=p.getProperty(propertyName);
   System.out.println("propertyName="+propertyName+"===>"+propertyValue);	
  }	
 }
}