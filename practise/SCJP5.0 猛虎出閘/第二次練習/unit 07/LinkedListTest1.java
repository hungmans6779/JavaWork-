import java.util.*;
public class LinkedListTest1
{
 public static void main(String argv[])
 {
  LinkedList<String>ll=new LinkedList<String>();
  ll.add("SCJP");
  ll.add("SCWCD");
  ll.add("SCBCD");
  ll.add("SCMAD");
  Iterator it=ll.iterator();
  while(it.hasNext())
  {
   String data=(String)it.next();
   System.out.println(data);	
  }	
 }
} 