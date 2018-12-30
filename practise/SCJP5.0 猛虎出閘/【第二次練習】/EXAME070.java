import java.util.*;
public class EXAME070
{
 public static void main(String argv[])
 {
  PriorityQueue<String>pq=new PriorityQueue<String>();
  pq.add("carrot");
  pq.add("apple");
  pq.add("bannan");
  System.out.println(pq.poll()+":"+pq.peek());
 }
}