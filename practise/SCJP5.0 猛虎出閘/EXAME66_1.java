import java.util.*;
public class EXAME66_1
{
 public static int sum(List<Integer>inList)
 {
  int sum=0;
  for(int i:inList)
  {
   sum+=i;
  }
  return sum;
 }
 public static void main(String argv[])
 {
  List<Integer>list=new ArrayList<Integer>();
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  System.out.println(sum(list));
 }
}