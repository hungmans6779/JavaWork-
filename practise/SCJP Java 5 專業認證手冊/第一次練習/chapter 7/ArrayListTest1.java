import java.util.*;
public class ArrayListTest1
{
 public static void main(String argv[])
 {
  List<String>list=new ArrayList<String>();
  //List list=new ArrayList();
  String s="hi";
  list.add("String");
  list.add(s);
  list.add(s+s);
  for(String l:list)
  { System.out.print(l+"\t");	 }	
  System.out.println("\n"+list.size());
  System.out.println(list.contains(42));
  System.out.println(list.contains("hihi"));
  list.remove("hi");
  System.out.println(list.size());
  Iterator it=list.iterator();
  while(it.hasNext())
  { System.out.print(it.next()+"\t");	}	
 }
}