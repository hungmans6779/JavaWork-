import java.util.*;
public class ListTest1
{
 public static void main(String argv[])
 {
  List list=new ArrayList();
  list.add("1");
  list.add("2");
  list.add("3");
  for(Object l:list)
  {
   System.out.println(l+"\t");	
  }	
 }
}