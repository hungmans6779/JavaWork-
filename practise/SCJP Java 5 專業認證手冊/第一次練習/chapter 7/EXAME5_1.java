import java.util.*;
public class EXAME5_1
{
 public static void main(String argv[])
 {
  Queue<String>q=new LinkedList<String>();
  q.add("Animal");
  q.add("Dog");
  test(q);
 }
 public static void test(Queue list)
 {
 	list.add(new Integer(42));
  for(Object o:list)
  {
   System.out.println(o);
  } 
 }
}