import java.util.*;
public class GenericsTest4
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
 	for(Object o:lis)
 	{
 	 System.out.println(o);	
 	}	
 }	
}