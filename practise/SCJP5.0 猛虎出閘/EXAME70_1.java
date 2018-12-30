import java.util.*;
public class EXAME70_1
{
 public static void main(String argv[])
 {
  PriorityQueue<String>pq=new PriorityQueue<String>();
  pq.add("1");
  pq.add("2");
  pq.add("3");
  pq.add("4");
  pq.add("5");
  System.out.println(pq.poll()+" "+pq.peek());
 }
}