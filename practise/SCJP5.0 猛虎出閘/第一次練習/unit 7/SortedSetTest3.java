import java.util.*;
public class SortedSetTest3
{
 public static void main(String argv[])
 {
  Set ts1=new TreeSet();
  ts1.add("SCJP");
  ts1.add("SCMAD");
  ts1.add("SCWCD");
  ts1.add("SCBCD");
  //Set集合內的元素是不能重複的..........
  ts1.add("SCJP");
  Iterator it=ts1.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");	
  }  	
 }
}