import java.util.*;
public class PriorityQueueTest1
{
 public static void main(String argv[])
 {
 	PriorityQueue<String>q=new PriorityQueue<String>();
 	q.offer("c");
 	q.offer("b");
 	q.offer("a");
 	System.out.println(q.toString());
 	while(q.peek()!=null)
 	{
 	 System.out.print(q.poll()+"\t");	
 	}	
 	System.out.println();
 	System.out.println(q.toString());
 }	
}