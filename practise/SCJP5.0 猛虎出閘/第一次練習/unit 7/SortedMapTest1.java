import java.util.*;
public class SortedMapTest1
{
 public static void main(String argv[])
 {
  SortedMap sm=new TreeMap();	
  sm.put("A","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
  sm.put("A","aaaa");
  sm.put("B","bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
  //TreeMap¡‰≠»§£±o¨∞null
  //sm.put(null,"test");
  
  sm.put("C",null);
  System.out.println(sm.toString());
 }	
}