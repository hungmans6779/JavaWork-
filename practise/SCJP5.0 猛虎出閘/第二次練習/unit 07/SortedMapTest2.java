import java.util.*;
public class SortedMapTest2
{
 public static void main(String argv[])
 {
  SortedMap sm=new TreeMap();
  sm.put("A","SCJP");
  sm.put("B","SCWCD");
  //sm.put(null,null);
  //sm.put(new Integer(100),"MCSE");
  sm.put("C",new Integer(200));
  sm.put("D",new Object());
  System.out.println(sm.toString());
 
  Enumeration em=sm.elements();
  
 }
}