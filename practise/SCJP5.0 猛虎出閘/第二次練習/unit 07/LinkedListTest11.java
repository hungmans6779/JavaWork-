import java.util.*;
public class LinkedListTest11
{
 public static void main(String argv[])
 {
  LinkedList<String>ll=new LinkedList<String>();
  ll.add("SCJP");
  ll.add("SCWCD");
  ll.add("SCBCD");
  ll.add("SCMAD");
  ListIterator it=ll.listIterator();
  while(it.hasNext())
  {
   int index=it.nextIndex();
   String data=(String)it.next();
   System.out.println(index+"="+data);	
  }	
  System.out.println("===============");
  while(it.hasPrevious())
  {
   int index=it.previousIndex();
   String data=(String)it.previous();
   System.out.println(index+"="+data);	
  }	
 }
} 