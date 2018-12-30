import java.util.*;
public class GenericsTest9
{
 public static void main(String argv[])
 {
  Vector<Integer>v=new Vector<Integer>();
  v.add(new Integer(3));
  v.add(new Integer(4));
  v.add(2);
  
  Iterator<Integer>it=v.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+"\t");
  }
 }
}