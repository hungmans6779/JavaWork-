import java.util.*;
public class EXAME86
{
 public static void main(String argv[])
 {
  for(Object o:get())
  {
   System.out.print(o);
  }	
 }
 public static Collection get()
 {
  Collection sorted=new LinkedList();
  sorted.add("B");
  sorted.add("C");
  sorted.add("A");
  return sorted;
 }
}