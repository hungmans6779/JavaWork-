import java.util.*;
public class ArraysToListTest1
{
 public static void main(String argv[])
 {
 	
  String str[]=new String[]{"One","Two","Three"};
  //String str[]=new String[5];
  List <String>list=Arrays.asList(str);
  Iterator it=list.iterator();
  while(it.hasNext())
  { System.out.println(it.next());	}	
  //str[1]="test";
  System.out.println("============");

  Collections.sort(list);
  //list.add(new String("Four")); 
  Iterator it1=list.iterator();
  while(it1.hasNext())
  { System.out.println(it1.next());	}	
    System.out.println("============");
  for(int i=0;i<str.length;i++)
  { System.out.println(str[i]); }
  	
 }
}