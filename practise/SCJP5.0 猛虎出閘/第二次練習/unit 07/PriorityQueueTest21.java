import java.util.*;
public class PriorityQueueTest21
{
 public static void main(String argv[])
 {
 	Comparator<String> c=new Comparator<String>()
 	{
 	 public int compare(String a,String b)
 	 {
 	 	return a.compareTo(b)*-1;
 	 }		
 	};	
 	PriorityQueue<String>pq=new PriorityQueue<String>(3,c);
  pq.offer("a");
  pq.offer("b");
  pq.offer("c");
  System.out.println("PriorityQueue的內容為:"+pq.toString());
  Object o;
  while((o=pq.poll())!=null)
  {
   String data=(String)o;
   System.out.println(data);	
  }	
  System.out.println("PriorityQueue的內容為:"+pq.toString());
 }
}
