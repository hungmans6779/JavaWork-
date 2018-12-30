import java.util.*;
public class PriorityQueueTest2
{
 public static void main(String argv[])
 {
 	Comparator<String> c=new Comparator<String>()
 	{
 	 public int compare(String a,String b)
 	 {
 	  return a.compareTo(b) * 1;	
 	 }		
 	};	
  PriorityQueue<String>pq=new PriorityQueue<String>(3,c);
  pq.offer("c");
  pq.offer("b");
  pq.offer("a");
  System.out.println("PriorityQueue的內容為:"+pq.toString());
  for(String data:pq)
   System.out.println(data);
  System.out.println("PriorityQueue的內容為:"+pq.toString()); 
 }
}