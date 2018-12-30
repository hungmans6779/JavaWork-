import java.util.*;
public class HashMapTest1
{
 public static void main(String argv[])
 {
 	Object o;
  HashMap map=new HashMap();
  map.put("A","SCJP");
  map.put("A","AAAAAAAAAAAAAAAAAAAAAA");
  map.put(new Integer(20),new Integer(10));
  map.put(o=new Object(),"AAAAAAAAAAAAA");
  map.put(null,"test");
  System.out.println("此Map內的元素共有: "+map.size());
  System.out.println("========================");
  System.out.println("Map的內容為: "+map.toString());
  System.out.println("鍵值A= "+map.get("A"));
  System.out.println("鍵值B= "+map.get("B"));
  System.out.println("鍵值20= "+map.get(new Integer(20)));
  System.out.println("鍵值20= "+map.get(20));
  System.out.println("鍵值null= "+map.get(null));
  System.out.println("0="+map.get(o));
 }
}