import java.util.*;
public class cTest60
{
 public static void main(String argv[])
 {
  Properties p=System.getProperties();
  Enumeration e=p.propertyNames();
  while(e.hasMoreElements())
  {
   String name=(String)e.nextElement();	
   String value=System.getProperty(name);
   System.out.println(name+"屬性內容為 : "+value);
  }	
 }
}