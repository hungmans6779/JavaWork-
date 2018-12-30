import java.util.*;
public class EXAME5_2
{
 public static void main(String argv[])
 {
  Set<Integer>set=new HashSet<Integer>();
  set.add(1);
  set.add(new Integer(2));
  test(set);
 }
 public static void test(Set s)
 {
 	s.add(new String("test"));
 	for(Object o:s)
 	{
 	 System.out.println(o);	
 	}	
 }	
}