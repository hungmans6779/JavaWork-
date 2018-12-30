import java.util.*;
public class EX2
{
 public static void main(String argv[])
 {
  LinkedList<Integer> list=new LinkedList<Integer>();
  for(int i=10;i>0;i--)
  {
   list.add(i);
  }
  for(int i=0;i<6;i++)
  {
   System.out.println("移除第一個元素:"+list.removeFirst());
   showElements(list);
  }
 }
 public static void showElements(LinkedList<Integer> list)
 {
  Iterator it=list.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"  ");
  }
  System.out.println("\n=================================");
  //System.out.println();
 }
}