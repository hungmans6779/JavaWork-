import java.util.*;
public class GenericsTest4
{
 public static void main(String argv[])
 {
  Vector <String> v=new Vector<String>();
  v.add("Java ");
  v.add("Tiger ");
  v.add("SCJP 5.0");
  System.out.println("v 的內容為:"+v);
  Iterator<String> it=v.iterator();
  while(it.hasNext())
  {
   String data=it.next();
   System.out.print(data); 	
  }
 }
}