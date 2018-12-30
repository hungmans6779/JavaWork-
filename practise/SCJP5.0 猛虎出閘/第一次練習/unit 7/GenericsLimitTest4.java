import java.util.*;
public class GenericsLimitTest4
{
 public static void main(String argv[])
 {
  Vector<Integer>v1=new Vector<Integer>();
  v1.add(new Integer(100));
  v1.add(200);
  v1.add(new Integer(300));
  System.out.println("Á`©M¬°: "+sum(v1)); 
 }
 static <A extends Number>int sum(Vector<A>v)
 {
  Iterator<A>it=v.iterator();
  int sumt=0;
  while(it.hasNext())
  {
   sumt+=it.next().intValue();	
  }	
  return sumt;
 }
}