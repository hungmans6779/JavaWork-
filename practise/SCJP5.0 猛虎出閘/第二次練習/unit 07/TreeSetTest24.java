import java.util.*;
public class TreeSetTest24
{
 public static void main(String argv[])
 {
  Collection <String>ts=new TreeSet<String>();
  ts.add("SCJP");
  ts.add("SCWCD");
  ts.add("SCBCD");
  ts.add("SCMAD");
  Iterator it=ts.iterator();
  while(it.hasNext())
   System.out.println(it.next());	
 }
}