import java.util.*;
public class SortedSetExample1
{
 public static void main(String argv[])
 {
  SortedSet sort=new TreeSet();
  sort.add(new Integer(5));
  sort.add(new Integer(1));
  sort.add(new Integer(3));
  sort.add(new Integer(5));
  System.out.println("TreeSet的內容為 ： "+sort);
 }
}