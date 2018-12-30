//此範例是錯誤的.........
import java.util.*;
public class GenericsLimitTest6
{
 public static void main(String argv[])
 {
  Vector<Integer>v1=new Vector<Integer>();
  v1.add(new Integer(100));
  v1.add(200);
  v1.add(new Integer(300));
  System.out.println("總和為: "+sum(v1)); 
 }
 static <A extends Number>int sum(Vector<A>v)
 {
 	int sumt=0;
  for(Integer data:v)
  {
   sumt+=data.intValue();	
  }	
  return sumt;
 }
}