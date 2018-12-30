import java.util.*;
public class GenericsTest9
{
 public static void main(String argv[])
 {
  Vector<Integer>v=new Vector<Integer>();
  v.add(100);
  v.add(200);
  v.add(300);
  System.out.println("sum="+getSum(v));
 }
 public static <A extends Number>int  getSum(Vector<A>v)
 {
 	int sum=0;
 	Iterator<A>it=v.iterator();
 	while(it.hasNext())
 	{
 	 sum+=(it.next()).intValue();	
 	}	
 	return sum;
 }	
}