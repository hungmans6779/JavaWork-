import java.util.*;
public class EXAME59_1
{
 public static Iterator reverse(List list)
 {
  Collections.reverse(list);
  return list.iterator();
 }
 public static void main(String argv[])
 {
  List list=new ArrayList();
  list.add(1);
  list.add(2);
  list.add(3);
  reverse(list);
  for(Object o:list)
  {
   System.out.print(o+"\t");	
  }	
 }

}