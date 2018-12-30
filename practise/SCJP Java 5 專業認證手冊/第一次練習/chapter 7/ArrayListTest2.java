import java.util.*;
public class ArrayListTest2
{
 public static void main(String argv[])
 {
  ArrayList<String>list=new ArrayList<String>();
  list.add("Denver");
  list.add("Boulder");
  list.add("Vail");
  list.add("Aspen");
  list.add("Telluride");
  System.out.println("unSorted : "+list);
  Collections.sort(list);
  System.out.println("Sorted : "+list);
 }
}