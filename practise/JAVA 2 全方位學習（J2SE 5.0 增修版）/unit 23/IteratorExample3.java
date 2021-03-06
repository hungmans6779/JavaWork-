import java.util.*;
public class IteratorExample3
{
 public static void main(String argv[])
 {
  List linkedList=new LinkedList();
  linkedList.add(new Integer(5));
  linkedList.add("abc");
  linkedList.add(new Integer(10));
  linkedList.add(new Double(12.24));
  linkedList.add(new Boolean(true));
  System.out.println("linkedList的內容為 ： "+linkedList);
  System.out.println("元素10的位置是在 : "+linkedList.indexOf(10));
  System.out.println("linkedList內容中的第3個元素是 ： "+linkedList.get(3));
  System.out.println("元素5有沒有包含在linkedList內容中 : "+linkedList.contains(5));
  System.out.println("linkedList內容共有 : "+linkedList.size()+" 個元素值");

  ListIterator it=linkedList.listIterator();
  while(it.hasNext())
  {
   System.out.println("第 "+(it.nextIndex()+1)+" 個元素是 : "+it.next());
  }	
  
  while(it.hasPrevious())
  {
   System.out.println("第 "+(it.previousIndex()+1)+" 個元素是 : "+it.previous());
  }	
  
 }
}