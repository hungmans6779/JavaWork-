import java.util.*;
public class SortedSetTest4
{
 public static void main(String argv[])
 {
  TreeSet ts1=new TreeSet();
  ts1.add("SCJP");
  ts1.add("SCMAD");
  ts1.add("SCWCD");
  ts1.add("SCBCD");
  ts1.add("1");
  ts1.add("2");
  ts1.add(new String("java"));
  ts1.add("MCSE");
  ts1.add("3");
  ts1.add("MCSD");
  ts1.add("NCCE");
  //TreeSet集合類別是無法同時加入不同型態的資料...........
  //ts1.add(new Integer(1));
  
  Iterator it=ts1.iterator();
  System.out.println("此集合內的所有元素是");
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");	
  }  	
  System.out.println("\n\n");
  System.out.println("===================================");
  System.out.println("取出第一個元素");
  System.out.println("第一個元素是: "+ts1.first());
  System.out.println("===================================");
  System.out.println("取出小於NCCE的元素");
  System.out.println(ts1.headSet("NCCE"));
  System.out.println("===================================");
  System.out.println("取出大於等於NCCE的元素");
  System.out.println(ts1.tailSet("NCCE"));
  System.out.println("===================================");
  System.out.println("取出介於3和SCJP的元素");
  System.out.println(ts1.subSet("3","SCJP"));
  System.out.println("===================================");
  System.out.println("取出最後一個元素");
  System.out.println("最後一個元素是: "+ts1.last());
 }
}