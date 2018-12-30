import java.util.*;
public class LinkedHashSetTest2
{
 public static void main(String argv[])
 {
  LinkedHashSet lh1=new LinkedHashSet();
  lh1.add(new Integer(1));
  lh1.add("SCJP");
  lh1.add("SCMAD");
  lh1.add("SCWCD");
  lh1.add("SCBCD");
  lh1.add(new Integer(2));
  //Set集合內的元素是不能重複的............
  lh1.add("SCJP");
  Iterator it=lh1.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");
  }
 }
}   