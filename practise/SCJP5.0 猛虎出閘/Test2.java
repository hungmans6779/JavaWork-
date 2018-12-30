import java.util.*;
public class Test2
{	
 public static void main(String argv[])
 {
  List al=new ArrayList();
  al.add(1);
  al.add(2);
  al.add(3);
  Iterator it=al.iterator();
  while(it.hasNext())
  {
   System.out.println(it.next()+"\t");	
  }	
 }
}