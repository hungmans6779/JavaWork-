import java.util.*;
public class GenericsTest4_1
{
 public static void main(String argv[])
 {
  //List<?>list=new ArrayList<Integer>();
  //List<? extends Number>list=new ArrayList<Integer>();
  List<? super Integer>list=new ArrayList<Number>();
  list.add(new Integer(1));
  list.add(new Integer(2));
  list.add(new Integer(3));
  test(list);
 }
 public static void test(List lis)
 {
  Iterator it=lis.iterator();
  while(it.hasNext())
  {
  	System.out.println(it.next());
  }	
 }	
}