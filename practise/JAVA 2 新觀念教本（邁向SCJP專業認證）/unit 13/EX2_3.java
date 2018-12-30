import java.util.*;
public class EX2_3
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
  for(int i:list)
  {
   System.out.print(i+"  ");
  }
  System.out.println("\n=================================");
 }
}