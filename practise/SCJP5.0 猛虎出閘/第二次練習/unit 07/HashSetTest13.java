import java.util.*;
public class HashSetTest13
{
 public static void main(String argv[])
 {
  HashSet hs=new HashSet();
  hs.add("SCJP");
  hs.add("SCWCD");
  hs.add("SCBCD");
  hs.add("SCMAD");
  for(Object data:hs)
  {
   System.out.println(data);	
  }	
 }
}