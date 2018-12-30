import java.util.*;
public class SystemProperties
{
 public static void main(String argv[])
 {
  Properties p=System.getProperties();
  Enumeration enum1=p.propertyNames();
  String propertyName="";
  String property="";
  while(enum1.hasMoreElements())
  {
   propertyName=(String)enum1.nextElement();
   property=p.getProperty(propertyName);
   System.out.println("Property '"+ propertyName+"'='"+property+"'");
   //System.out.println("test = "+System.getProperty("sun.io.unicode.encoding"));
  }
  System.out.println("這是誰的電腦 ： "+System.getProperty("user.name"));  
 }
}