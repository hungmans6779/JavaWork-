import java.util.*;
public class LinkedHashMapTest11
{
 public static void main(String argv[])
 {
  Map lhm=new LinkedHashMap();
  lhm.put("A","SCJP");
  lhm.put("B","SCWCD");
  lhm.put(null,null);
  lhm.put(new Integer(100),"C");
  lhm.put("D",new Integer(200));
  System.out.println("lhm's size:"+lhm.size());
  System.out.println("lhm 的內容為:"+lhm.toString());
  System.out.println(lhm.get("A"));
  System.out.println(lhm.get(100));
  System.out.println("lhm是否包含key鍵值為D:"+lhm.containsKey("D"));
  System.out.println("lhm是否包含value值為200:"+lhm.containsValue(200));
  lhm.clear();
  System.out.println("lhm 的內容為:"+lhm.toString());
 }
}