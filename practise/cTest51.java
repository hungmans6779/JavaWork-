import java.util.*;
public class cTest51
{
 public static void main(String argv[])
 {
  LinkedList ll1=new LinkedList();
  Queue ll2=new LinkedList();
  List ll3=new LinkedList();
  
  for(int i=0;i<99;i++)
   ll1.offer(new Random().nextInt(99)+1);
  System.out.println(ll1);
  Object o;
  while((o=ll1.poll())!=null)
  {
   System.out.print(o+",");	
  }	
  System.out.println("\n poll()��k���Xll1��������A�@ll1���󤺪��ȬO:"+ll1);
  
 }
}