import java.util.*;
public class ListExample1
{
 public static void main(String argv[])
 {
  List arrayList=new ArrayList();
  List linkedList=new LinkedList();
  
  arrayList.add("abc");
  arrayList.add(new Integer(3));
  arrayList.add(new Boolean(true));
  arrayList.add(new Integer(3));
  
  linkedList.add("abc");
  linkedList.add(new Integer(3));
  linkedList.add(new Boolean(true));
  linkedList.add(new Integer(3));
  System.out.println("arrayList的內容為 ： "+arrayList);
  System.out.println("linkedList的內容為 ： "+linkedList);
 
 }
}
