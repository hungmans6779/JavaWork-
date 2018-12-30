import java.util.*;
public class HashSetTest1
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
  {
   String data=(String)it.next();
   System.out.println(data);	
  }	
 }
}