import java.util.*;
public class LinkedHashMapTest1
{
 public static void main(String argv[])
 {
  LinkedHashMap lhm=new LinkedHashMap();
  lhm.put("A","AAAAAAAAAAAAAAAAAAAAAAAAA");
  lhm.put("A","BBBBBBBBBBBBBBBBBBBBBBBBB");
  lhm.put("B","BBBBBBBBBBBBBBBBBBBBBBBBB");
  lhm.put(new Integer(10),new Integer(20));
  lhm.put(null,10);
  lhm.put(20,"test");
  System.out.println(lhm.toString());
  System.out.println("A的鍵值= "+lhm.get("A"));
  //System.out.println("A的鍵值= "+lhm.get(A)); //錯誤.....
  System.out.println("B的鍵值= "+lhm.get("B"));
  System.out.println("10的鍵值= "+lhm.get(10));
  System.out.println("10的鍵值= "+lhm.get(new Integer(10)));
  System.out.println("10的鍵值= "+lhm.get("10"));
  System.out.println("null的鍵值= "+lhm.get(null));
  System.out.println("null的鍵值= "+lhm.get("null"));
 }
}