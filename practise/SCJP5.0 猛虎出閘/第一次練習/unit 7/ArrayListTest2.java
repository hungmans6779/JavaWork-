import java.util.*;
public class ArrayListTest2
{
 public static void main(String argv[])
 {
  ArrayList al=new ArrayList();
  al.add("SCJP");
  al.add("SCMAD");
  al.add("SCWCD");
  al.add("SCBCD");
  ListIterator lit=al.listIterator();
  while(lit.hasNext())
  {
   int index=lit.nextIndex();
   String data=(String)lit.next();
   System.out.println(index+" : "+data);	
  }	
  System.out.println("===========================");
  while(lit.hasPrevious())
  {
   System.out.println(lit.previousIndex()+" : "+lit.previous());	
  }	
  
  System.out.println("==========================");
  Iterator it=al.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+" \t ");	
  }	
 }
}