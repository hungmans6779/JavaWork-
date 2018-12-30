import java.util.*;
public class VectorTest12
{
 public static void main(String argv[])
 {
  Vector <String>v=new Vector<String>();
  System.out.println("v 的容量:"+v.capacity());
  v.add("CCCCC");
  v.add("AAAAA");
  v.add("BBBBB");
  System.out.println("v的內容為:"+v);
  for(String data:v)
   System.out.println(data);
 }
}