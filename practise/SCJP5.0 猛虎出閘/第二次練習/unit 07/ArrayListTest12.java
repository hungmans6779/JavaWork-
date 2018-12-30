import java.util.*;
public class ArrayListTest12
{
 public static void main(String argv[])
 {
  List<String> al=new ArrayList<String>();
  al.add("SCJP");
  al.add("SCWCD");
  al.add("SCBCD");
  al.add("SCMAD");
  ListIterator it=al.listIterator();
  while(it.hasNext())
  {
   int index=it.nextIndex();
   String data=(String)it.next();
   System.out.println(index+"="+data); 	
  }	
  System.out.println("========================");
  while(it.hasPrevious())
  {
   int index=it.previousIndex();
   String data=(String)it.previous();
   System.out.println(index+"="+data);	
  }	
 }
}