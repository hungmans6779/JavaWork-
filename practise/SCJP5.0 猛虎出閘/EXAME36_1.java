import java.util.*;
public class EXAME36_1
{
 public static void main(String argv[])
 {
  Properties p=System.getProperties();
  Enumeration en=p.propertyNames();
  while(en.hasMoreElements())
  {
   String name=(String)en.nextElement();	
   System.out.println(name+" - "+System.getProperty(name));
  }	
  
 }
}