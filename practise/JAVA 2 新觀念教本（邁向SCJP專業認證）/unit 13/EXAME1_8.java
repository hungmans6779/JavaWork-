import java.util.*;
public class EXAME1_8
{
 public static void main(String argv[])
 {
  int a[]={7,7,73,56,17,90,7};
  TreeSet<Integer>set=new TreeSet<Integer>();
  for(Integer i:a)
  {
   set.add(i);
  }
  System.out.println(set);
 }
}