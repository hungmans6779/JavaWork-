import java.util.*;
public class TreeSetTest2
{
 public static void main(String argv[])
 {
  TreeSet ts=new TreeSet();
  ts.add("SCJP");
  ts.add("SCWCD");
  ts.add("SCBCD");
  ts.add("SCMAD");
  Iterator it=ts.iterator();
  while(it.hasNext())
  {
   String data=(String)it.next();
   System.out.println(data);	
  }	
 }
}