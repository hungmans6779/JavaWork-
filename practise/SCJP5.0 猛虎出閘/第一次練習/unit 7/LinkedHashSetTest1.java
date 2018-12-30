import java.util.*;
public class LinkedHashSetTest1
{
 public static void main(String argv[])
 {
  HashSet h1=new HashSet();
  h1.add("SCJP");
  h1.add("SCMAD");
  h1.add("SCWCD");
  h1.add("SCBCD");
  //Set集合內的元素是不能重複的............
  h1.add("SCJP");
  LinkedHashSet lh1=new LinkedHashSet(h1);
  Iterator it=lh1.iterator();
  while(it.hasNext())
  {
   //System.out.println(it.next());
   String data=(String)it.next();
   System.out.print(data+"\t");
  }
 }
}