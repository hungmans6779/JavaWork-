import java.util.*;
public class VectorTest1
{
 public static void main(String argv[])
 {
  Vector <String>v=new Vector<String>();
  System.out.println("v 的容量:"+v.capacity());
  v.add("CCCCC");
  v.add("AAAAA");
  v.add("BBBBB");
  System.out.println("v的內容為:"+v);
  Iterator it=v.iterator();
  while(it.hasNext())
  {
   String data=(String)it.next();
   System.out.println(data);	
  }	
 }
}