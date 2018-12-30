import java.util.*;
public class TreeSetTest1
{
 public static void main(String argv[])
 {
  HashSet hs=new HashSet();
  hs.add("SCJP");
  hs.add("SCWCD");
  hs.add("SCBCD");
  hs.add("SCMAD");
  TreeSet ts=new TreeSet(hs);
  Iterator it=ts.iterator();
  while(it.hasNext())
  {
   String data=(String)it.next();
   System.out.println(data);	
  }	
 }
}