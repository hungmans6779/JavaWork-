import java.util.*;
public class ArraySortTest1
{
 public static void main(String argv[])
 {
  int num[]={45,32,12,35,21,46,97,12};
  for(int i:num)
  { System.out.print(i+"\t"); } 
  Arrays.sort(num);
  System.out.println();
  for(int i:num)
  { System.out.print(i+"\t"); }
 }	
}