import java.util.*;
public class LinkedHashSetTest1
{
 public static void main(String argv[])
 {
  LinkedHashSet lhs=new LinkedHashSet();
  lhs.add("SCJP");
  lhs.add("SCWCD");
  lhs.add("SCBCD");
  lhs.add("SCMAD");
  Iterator it=lhs.iterator();
  while(it.hasNext())
  {
   String data=(String)it.next();	
   System.out.println(data);
  }	
 }
}