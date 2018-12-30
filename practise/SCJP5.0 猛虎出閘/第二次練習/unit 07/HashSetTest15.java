import java.util.*;
public class HashSetTest15
{
 public static void main(String argv[])
 {
  HashSet hs=new HashSet();
  hs.add("SCJP");
  hs.add("SCWCD");
  hs.add("SCBCD");
  hs.add("SCMAD");
  
  hs.remove("SCJP");
  System.out.println("hava SCWCD in Set:"+hs.contains("SCWCD"));
  System.out.println("hava SCWCD in Set:"+hs.contains("SCJP"));
  System.out.println("Set is empty:"+hs.isEmpty());
  System.out.println("Set's size is:"+hs.size());
  System.out.println("================================");
  for(Object data:hs)
  {
   System.out.println(data);	
  }	
 }
}