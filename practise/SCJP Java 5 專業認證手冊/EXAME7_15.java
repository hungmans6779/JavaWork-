import java.util.*;
public class EXAME7_15
{
 public static void main(String argv[])
 {
  TreeSet map=new TreeSet();
  map.add("one");
  map.add("two");
  map.add("three");
  map.add("four");
  map.add("one");
  Iterator it=map.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"  ");
  }
 }
}