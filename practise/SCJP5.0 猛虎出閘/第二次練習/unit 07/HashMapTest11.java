import java.util.*;
public class HashMapTest11
{
 public static void main(String argv[])
 {
  Map hm=new HashMap();
  hm.put("A","SCJP");
  hm.put(new Integer(100),new Integer(100));
  hm.put(new Object(),"SCBCD");
  hm.put(null,null);
  System.out.println(hm.toString());
  System.out.println("key A:"+hm.get("A"));
  System.out.println("key B:"+hm.get("B"));
 }
}