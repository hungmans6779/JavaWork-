import java.util.*;
public class ArrayListTest2
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
   System.out.println(it.nextIndex()+"="+it.next());
  } 
  System.out.println("================");
  System.out.println("1="+al.get(1)); 
 }  
}