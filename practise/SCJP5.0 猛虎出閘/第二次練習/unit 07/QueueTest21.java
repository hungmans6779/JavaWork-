import java.util.*;
public class QueueTest21
{
 public static void main(String argv[])
 {
  Queue<String>q=new LinkedList<String>();
  q.offer("First");
  q.offer("Second");
  q.offer("Third");
  System.out.println("Queue's size:"+q.size());
  System.out.println("Queue的內容為:"+q.toString());
  Iterator it=q.iterator();
  while(it.hasNext())
  {
   String data=(String)it.next();	
   System.out.println(data);
  }
  System.out.println("Queue的內容為:"+q.toString());	
 }
}