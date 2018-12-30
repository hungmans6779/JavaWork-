import java.util.*;
public class CollectionsTest2
{
 public static void main(String argv[])
 {
  Map m=Collections.synchronizedSortedMap(new TreeMap());
  m.put("C","ccccccccccccccc");
  m.put("A","aaaaaaaaaaaaaaa");
  m.put("E","eeeeeeeeeeeeeee");
  m.put("B","bbbbbbbbbbbbbbb");
  System.out.println(m.toString());
  
 }
}