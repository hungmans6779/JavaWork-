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
  System.out.println("lhm �����e��:"+lhm.toString());
  System.out.println(lhm.get("A"));
  System.out.println(lhm.get(100));
  System.out.println("lhm�O�_�]�tkey��Ȭ�D:"+lhm.containsKey("D"));
  System.out.println("lhm�O�_�]�tvalue�Ȭ�200:"+lhm.containsValue(200));
  lhm.clear();
  System.out.println("lhm �����e��:"+lhm.toString());
 }
}