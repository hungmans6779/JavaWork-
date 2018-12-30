import java.util.*;
public class ArrayListTest4
{
 public static void main(String argv[])
 {
  List list=new ArrayList();
  for(int i=0;i<3;i++)
  { list.add(i); }
  for(Object o:list)
  { System.out.print((Integer)o+"\t"); }		
  Iterator<Integer>it=list.iterator();
  System.out.println();
  while(it.hasNext())
  { System.out.print(it.next()+"\t"); }
  	
  
 }
}