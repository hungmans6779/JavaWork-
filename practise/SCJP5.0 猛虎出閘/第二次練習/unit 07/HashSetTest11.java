import java.util.*;
public class HashSetTest11
{
 public static void main(String argv[])
 {
  HashSet <String>hs=new HashSet<String>();
  hs.add("SCJP");
  hs.add("SCWCD");
  hs.add("SCBCD");
  hs.add("SCMAD");
  Iterator it=hs.iterator();
  while(it.hasNext())
   System.out.println(it.next());		
 }
}