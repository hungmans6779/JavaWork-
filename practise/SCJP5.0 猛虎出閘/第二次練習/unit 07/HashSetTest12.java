import java.util.*;
public class HashSetTest12
{
 public static void main(String argv[])
 {
  HashSet <String>hs=new HashSet<String>();
  hs.add("SCJP");
  hs.add("SCWCD");
  hs.add("SCBCD");
  hs.add("SCMAD");
  for(String data:hs)
  {
   System.out.println(data);	
  }	
 }
}