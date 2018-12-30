import java.util.*;
public class EXAME70
{
 public static void main(String argv[])
 {
  PriorityQueue<String>pq=new PriorityQueue<String>();
  pq.add("carrot");
  pq.add("apple");
  pq.add("banana");
  
  Iterator it=pq.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+" ");	
  }	
  System.out.println();
  
  System.out.println(pq.poll()+" "+pq.peek());
 }
}