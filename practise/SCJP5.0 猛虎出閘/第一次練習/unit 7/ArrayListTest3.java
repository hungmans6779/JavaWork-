import java.util.*;
public class ArrayListTest3
{
 public static void main(String argv[])
 {
 	
  ArrayList al=new ArrayList();
  al.add("SCJP");
  al.add("SCMAD");
  al.add("SCWCD");
  al.add("SCBCD");
  
  Set s1=new HashSet();
  s1.add("MCSE");
  s1.add("MCSD");

  SortedSet ss1=new TreeSet();
  ss1.add(1);
  ss1.add(2);
  
  al.addAll(s1);
  al.addAll(4,ss1);
  al.addAll(ss1);
  al.addAll(s1);
  
  Iterator it=al.iterator();
  System.out.println("此List目前的元素共有 : "+al.size());
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");	
  }
  System.out.println();
  System.out.println("SCWCD的index值是 : "+al.indexOf("SCWCD"));
  System.out.println("MCSD的index值是 : "+al.indexOf("MCSD"));
  System.out.println("最後一個MCSD的index的值是 : "+al.lastIndexOf("MCSD"));
  System.out.println("取出index為4的元素: "+al.get(4));
  System.out.println(al.subList(1,5));
  System.out.println("=========================================================================");
  System.out.println("移除index為4的元素值");
  al.remove(4);
  System.out.println("最後List的內容為 :");
  Iterator it1=al.iterator();
  System.out.println("此List最後剩下的元素共有 : "+al.size());
  while(it1.hasNext())
  {
   System.out.print(it1.next()+"\t");	
  }	
  System.out.println();
  System.out.println("取出index為4的元素: "+al.get(4));
 }
}