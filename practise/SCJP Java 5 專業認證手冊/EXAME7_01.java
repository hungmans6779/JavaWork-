import java.util.*;
public class EXAME7_01
{
 public static void main(String argv[])
 {
  //List<String>x=new LinkedList<String>();//�sĶ����
  //ArrayList<String>x=new ArrayList<String>(); //�sĶ����
  //Queue<String>x=new PriorityQueue<String>(); //�sĶ���\
  LinkedList<String>x=new LinkedList<String>(); //�sĶ���\
  x.add("one");
  x.add("two");
  x.add("TWO");
  System.out.println(x.poll());
 }
}