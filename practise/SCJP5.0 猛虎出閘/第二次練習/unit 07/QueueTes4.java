import java.util.*;
public class QueueTes4
{
 public static void main(String argv[])
 {
  Queue<String>q1=new LinkedList<String>();
  q1.offer("SCJP");
  System.out.println(q1.poll());
  System.out.println("q1�����e��:"+q1.toString());
  System.out.println("======================");
  Queue<String>q2=new LinkedList<String>();
  q2.offer("SCWCD");
  System.out.println(q2.peek());
  System.out.println("q2�����e��:"+q2.toString()); 
 }
}