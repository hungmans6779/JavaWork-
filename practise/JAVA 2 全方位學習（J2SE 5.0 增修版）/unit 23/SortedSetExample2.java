import java.util.*;
public class SortedSetExample2
{
 public static void main(String argv[])
 {
  SortedSet<Integer>sort=new TreeSet<Integer>();
  sort.add(5);
  sort.add(1);
  sort.add(4);
  sort.add(5);
  System.out.println("TreeSet的內容為 ： "+sort);
 }
}