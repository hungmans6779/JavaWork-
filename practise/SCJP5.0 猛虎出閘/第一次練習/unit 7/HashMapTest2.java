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
  System.out.println("��Map���������@��: "+map.size());
  System.out.println("========================");
  System.out.print("Map�����e��: ");
  System.out.println("���A= "+map.get("A"));
  System.out.println("���B= "+map.get("B"));
 }
}