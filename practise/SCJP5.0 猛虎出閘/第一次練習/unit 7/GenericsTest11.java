import java.util.*;
public class GenericsTest11
{
 public static void main(String argv[])
 {
  Vector v=new Vector<String>();
  v.add("JAVA");
  v.add(new Integer(2));
  for(Object data:v)
  {
   System.out.print(data+"\t");	
  }	
 }
}