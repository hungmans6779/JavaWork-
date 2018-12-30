import java.util.*;
public class LinkedListTest4
{
 public static void main(String argv[])
 {
  LinkedList q1=new LinkedList();
  q1.offer("First");
  q1.offer("Second");
  q1.offer("Three");
  
  System.out.println(q1.toString());
  while(q1.peek()!=null)
  {
   System.out.println(q1.poll());	
  }	
  System.out.println();
  System.out.println(q1.toString());
  
 }
}