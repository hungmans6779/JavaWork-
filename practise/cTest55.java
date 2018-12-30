import java.util.*;
public class cTest55
{
 public static void main(String argv[])
 {
  Set<Integer> set1=new HashSet<Integer>();
  set1.add(new Integer(1));
  set1.add(new Integer(3));
  set1.add(new Integer(6));
  Set<String> set2=new HashSet<String>();
  set2.add(new String("Java"));
  set2.add(new String("SCJP"));
  printValue(set1);
  printValue(set2);
 }
 public static void printValue(Set<?>s)
 {
 	Iterator <?>it=s.iterator();
 	while(it.hasNext())
 	{
 	 System.out.println(it.next());	
 	}	
 }	 
}