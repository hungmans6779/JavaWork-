import java.util.*;
public class EX2_1
{
 public static void main(String argv[])
 {
  Queue list=new LinkedList();
  for(int i=10;i>0;i--)
  {
   list.add(i);
  }
  for(int i=0;i<6;i++)
  {
   System.out.println("移除第一個元素:"+((LinkedList)list).removeFirst());
   Iterator it=list.iterator();
   while(it.hasNext())
   {
    System.out.print(it.next()+"  ");
   }
  System.out.println("\n=================================");
  }
 }
}