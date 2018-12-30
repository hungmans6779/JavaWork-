import java.util.*;
public class EX6_3
{
 public static void main(String argv[])
 {
  int a[]={45,54,73,56,17,90,82,50,7};
  Set<Integer> ts=new TreeSet<Integer>();
  for(int i:a)
  {
   ts.add(i);	
  }	
  
  for(int k:ts)
  {
   System.out.print(k+"  ");
  }	
 }
}