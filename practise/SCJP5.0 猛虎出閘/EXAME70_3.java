import java.util.*;
public class EXAME70_3
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
  
  String s;
  while(s=pq.poll()!=null)
  {
   System.out.print(s);
  }
 }
}