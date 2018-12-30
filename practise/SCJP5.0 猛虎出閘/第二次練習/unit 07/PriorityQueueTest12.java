import java.util.*;
public class PriorityQueueTest12
{
 public static void main(String argv[])
 {
  PriorityQueue<String>pq=new PriorityQueue<String>();
  pq.offer("c");
  pq.offer("b");
  pq.offer("a");
  System.out.println("PriorityQueue的內容為:"+pq.toString());
  for(String data:pq)
   System.out.println(data);
  System.out.println("PriorityQueue的內容為:"+pq.toString()); 
 }
}