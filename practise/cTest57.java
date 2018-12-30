import java.util.*;
public class cTest57
{
 public static void main(String argv[])
 {
  Set<Integer> set1=new HashSet<Integer>();
  set1.add(new Integer(1));
  set1.add(new Integer(3));
  set1.add(new Integer(6));
  Set<Float> set2=new HashSet<Float>();
  set2.add(new Float("2.2"));
  set2.add(new Float("2.4"));
  printValue(set1);
  printValue(set2);
 }
 public static<A extends Number>void printValue(Set<A>s)
 {
 	Iterator <A>it=s.iterator();
 	while(it.hasNext())
 	{
 	 System.out.println(it.next());	
 	}	
 }	 
}