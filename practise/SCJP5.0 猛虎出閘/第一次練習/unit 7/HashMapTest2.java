import java.util.*;
public class HashMapTest2
{
 public static void main(String argv[])
 {
  Map map=new HashMap();
  map.put("A","SCJP");
  map.put(new Integer(20),new Integer(10));
  map.put(new Object(),"AAAAAAAAAAAAA");
  map.put(null,null);
  System.out.println("此Map內的元素共有: "+map.size());
  System.out.println("========================");
  System.out.print("Map的內容為: ");
  System.out.println("鍵值A= "+map.get("A"));
  System.out.println("鍵值B= "+map.get("B"));
 }
}