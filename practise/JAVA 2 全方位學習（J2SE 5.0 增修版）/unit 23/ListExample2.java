import java.util.*;
public class ListExample2
{
 public static void main(String argv[])
 {
  List <Integer>arrayList=new ArrayList<Integer>();
  List <Integer>linkedList=new LinkedList<Integer>();
  
  arrayList.add(1);
  arrayList.add(new Integer(3));
  arrayList.add(5);
  arrayList.add(new Integer(3));
  
  linkedList.add(1);
  linkedList.add(new Integer(3));
  linkedList.add(5);
  linkedList.add(new Integer(3));
  
  System.out.println("arrayList的內容為 ： "+arrayList);
  System.out.println("linkedList的內容為 ： "+linkedList);
 }
}
