import java.util.*;
public class EXAME7_01
{
 public static void main(String argv[])
 {
  //List<String>x=new LinkedList<String>();//編譯失敗
  //ArrayList<String>x=new ArrayList<String>(); //編譯失敗
  //Queue<String>x=new PriorityQueue<String>(); //編譯成功
  LinkedList<String>x=new LinkedList<String>(); //編譯成功
  x.add("one");
  x.add("two");
  x.add("TWO");
  System.out.println(x.poll());
 }
}