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
  System.out.println("A�����= "+lhm.get("A"));
  //System.out.println("A�����= "+lhm.get(A)); //���~.....
  System.out.println("B�����= "+lhm.get("B"));
  System.out.println("10�����= "+lhm.get(10));
  System.out.println("10�����= "+lhm.get(new Integer(10)));
  System.out.println("10�����= "+lhm.get("10"));
  System.out.println("null�����= "+lhm.get(null));
  System.out.println("null�����= "+lhm.get("null"));
 }
}