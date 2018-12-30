import java.util.*;
public class GenericsTest1
{
 public static void main(String argv[])
 {
  Vector v=new Vector();
  v.add("Java");
  v.add("Tiger");
  v.add("SCJP 5.0");
  for(Object o:v)
  {
   String data=(String)o;
   System.out.println(data);	
  }	
 }
}