import java.util.*;
public class EXAME086
{
 public static Collection get()
 {
  Collection sorted=new ArrayList();
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