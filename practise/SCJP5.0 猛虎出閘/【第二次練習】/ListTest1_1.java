import java.util.*;
public class ListTest1_1
{
 public static void main(String argv[])
 {
  List<String> list=new ArrayList<String>();
  list.add("1");
  list.add("2");
  list.add("3");
  for(String l:list)
  {
   System.out.print(l+"\t");	
  }	
 }
}