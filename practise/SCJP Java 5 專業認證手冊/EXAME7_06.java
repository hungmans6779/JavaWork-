import java.util.*;
public class EXAME7_06
{
 public static void main(String argv[])
 {
  before();
 }
 public static void before()
 {
  Set set=new TreeSet();
  set.add("2");
  set.add(3);
  set.add("1");
  Iterator it=set.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"  ");	
  }		
 }	
}