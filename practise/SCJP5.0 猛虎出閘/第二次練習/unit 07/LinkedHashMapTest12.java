import java.util.*;
public class LinkedHashMapTest12
{
 public static void main(String argv[])
 {
  LinkedHashMap lhm=new LinkedHashMap();
  lhm.put("A","SCJP");
  lhm.put("B","SCWCD");
  lhm.put(null,null);
  lhm.put(new Integer(100),"C");
  lhm.put("D",new Integer(200));
  System.out.println("lhm�����e��:"+lhm);
  Set set=lhm.keySet();
  System.out.println("key�Ȭ�:"+set);
  Collection collection=lhm.values();
  System.out.println("value�Ȭ�:"+collection);
 }
}