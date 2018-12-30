import java.util.*;
public class EXAME070_1
{
 public static void main(String argv[])
 {
  PriorityQueue<String>pq=new PriorityQueue<String>();
  pq.add("carrot");
  pq.add("apple");
  pq.add("bannan");
  System.out.println(pq.peek()+":"+pq.peek());
 }
}