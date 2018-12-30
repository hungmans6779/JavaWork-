import java.util.*;
public class LinkedListTest5
{
 public static void main(String argv[])
 {
  Queue q1=new LinkedList();
  q1.offer("First");
  System.out.println(q1.toString());
  q1.poll();
  System.out.println(q1.toString());
  
  System.out.println("===========================");
  Queue q2=new LinkedList();
  q2.offer("First");
  System.out.println(q2.toString());
  q2.peek();
  System.out.println(q2.toString());
 }
}