import java.util.*;
public class PriorityQueueTest11
{
 public static void main(String argv[])
 {
  PriorityQueue<String>pq=new PriorityQueue<String>();
  pq.offer("c");
  pq.offer("b");
  pq.offer("a");
  System.out.println("PriorityQueue的內容為:"+pq.toString());
  Iterator it=pq.iterator();
  while(it.hasNext())
  {
   String data=(String)it.next();
   System.out.println(data);	
  }	
  System.out.println("PriorityQueue的內容為:"+pq.toString()); 
 }
}