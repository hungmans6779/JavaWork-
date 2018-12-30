import java.util.*;
public class QueueTest1
{
 public static void main(String argv[])
 {
  Queue<String>q=new LinkedList<String>();
  q.offer("First");
  q.offer("Second");
  q.offer("Third");
  System.out.println("Queue's size:"+q.size());
  Object o;
  while((o=q.poll())!=null)
  {
   String data=(String)o;
   System.out.println(o);	
  }	
 }
}