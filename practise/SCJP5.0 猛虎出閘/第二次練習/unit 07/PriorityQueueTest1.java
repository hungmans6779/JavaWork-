import java.util.*;
public class PriorityQueueTest1
{
 public static void main(String argv[])
 {
  PriorityQueue<String>pq=new PriorityQueue<String>();
  pq.offer("c");
  pq.offer("b");
  pq.offer("a");
  System.out.println("PriorityQueue的內容為:"+pq.toString());
  String o;
  while((o=pq.poll())!=null)
  {
   String data=(String)o;
   System.out.println(data);	
  }	
  System.out.println("PriorityQueue的內容為:"+pq.toString());
 }
}