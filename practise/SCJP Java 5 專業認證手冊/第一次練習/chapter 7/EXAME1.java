import java.util.*;
public class EXAME1
{
 public static void main(String argv[])
 {
  //List <String> x=new LinkedList<String>();
  //LinkedList<String>x=new LinkedList<String>();
  Queue <String>x=new PriorityQueue<String>();
  x.add("one");
  x.add("two");
  x.add("three");
  System.out.println(x.poll());
 }
}