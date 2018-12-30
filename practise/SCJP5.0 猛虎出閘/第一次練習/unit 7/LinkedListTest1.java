import java.util.*;
public class LinkedListTest1
{
 public static void main(String argv[])
 {
  Queue q1=new LinkedList();
  q1.add("First");
  q1.add("Second");
  q1.add("Three");
  
  Iterator it=q1.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");	
  }	
 }
}