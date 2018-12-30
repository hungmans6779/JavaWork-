import java.util.*;
public class GenericsTest11
{
 public static void main(String argv[])
 {
  Vector<String>v=new Vector<String>();
  v.add("Java");
  v.add("Tiger");
  v.add("SCJP 5.0");
  //v.add(new Integer(100));
  for(String data:v)
  {
   System.out.print(data+" , ");	
  }	
 }
}