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
  System.out.println("��Map���������@��: "+map.size());
  System.out.println("========================");
  System.out.println("Map�����e��: "+map.toString());
  System.out.println("���A= "+map.get("A"));
  System.out.println("���B= "+map.get("B"));
  System.out.println("���20= "+map.get(new Integer(20)));
  System.out.println("���20= "+map.get(20));
  System.out.println("���null= "+map.get(null));
  System.out.println("0="+map.get(o));
 }
}