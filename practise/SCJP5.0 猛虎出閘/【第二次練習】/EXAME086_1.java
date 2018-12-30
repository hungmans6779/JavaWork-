import java.util.*;
public class EXAME086_1
{
 public static Collection get()
 {
  Collection<String>sorted=new ArrayList<String>();
  sorted.add("B");
  sorted.add("C");
  sorted.add("A");
  return sorted;
 }
 public static void main(String argv[])
 {
  for(Object obj:get())
  {
   System.out.print(obj+" ");	
  }	
 }
}