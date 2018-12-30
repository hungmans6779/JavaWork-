import java.util.*;
public class VectorTest11
{
 public static void main(String argv[])
 {
  Vector <String>v=new Vector<String>();
  System.out.println("v 的容量:"+v.capacity());
  v.add("CCCCC");
  v.add("AAAAA");
  v.add("BBBBB");
  System.out.println("v的內容為:"+v);
  Enumeration en=v.elements();
  while(en.hasMoreElements())
  {
   String data=(String)en.nextElement();
   System.out.println(data);	
  }	
 }
}