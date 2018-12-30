import java.util.*;
public class SetTest2
{
 public static void main(String argv[])
 {
  Set s1=new HashSet();
  s1.add(new Integer(1));
  s1.add(new Integer(2));
  s1.add(new String("JAVA"));
  s1.add("SCJP");
  
  Iterator it=s1.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");
  }
 
 }
}