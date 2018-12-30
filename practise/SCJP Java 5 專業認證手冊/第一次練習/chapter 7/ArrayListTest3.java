import java.util.*;
public class ArrayListTest3
{
 public static void main(String argv[])
 {
  String str[]={"one","two","three","four"};
  for(String s:str)
  { System.out.print(s+"\t"); }
  List list=Arrays.asList(str);
  System.out.println("\nlist size = "+list.size());
  Iterator it=list.iterator();
  System.out.println();
  while(it.hasNext())
  { System.out.print(it.next()+"\t");	}
  str[1]="five";
  list.set(3,"six");	
  System.out.println();
  for(String s:str)
  { System.out.print(s+"\t"); }
  System.out.println("\nlist size = "+list.size());
  System.out.println("list[1] = "+list.get(1));
 }
}