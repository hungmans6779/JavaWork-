import java.util.*;
public class LinkedListTest2
{
 public static void main(String argv[])
 {
  Queue q1=new LinkedList();
  q1.offer("First");
  q1.offer("Second");
  q1.offer("Three");
  
  System.out.println(q1.toString());
  Object o;
  while((o=q1.poll())!=null)
  {
   String data=(String)o;	
   System.out.println(data);	
  }	
  System.out.println();
  System.out.println(q1.toString());
  
 }
}