import java.util.*;
public class ArrayListTest1
{
 public static void main(String argv[])
 {
  ArrayList al=new ArrayList();
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
 }
}