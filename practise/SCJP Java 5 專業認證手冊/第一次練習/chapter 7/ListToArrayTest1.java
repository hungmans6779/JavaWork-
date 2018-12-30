import java.util.*;
public class ListToArrayTest1
{
 public static void main(String argv[])
 {
  List<Integer>list1=new ArrayList<Integer>();
  list1.add(1);
  list1.add(2);
  list1.add(3);
  for(Integer i:list1)
  { System.out.println(i); }
  System.out.println("====================");
  Object o[]=list1.toArray();
  for(int i=0;i<o.length;i++)
  { System.out.println(o[i]); }
  System.out.println("====================");  	
  o[1]=4;
  for(int i=0;i<o.length;i++)
  { System.out.println(o[i]); }
    System.out.println("===================="); 
  for(Integer i:list1)
  { System.out.println(i); }
 }
}