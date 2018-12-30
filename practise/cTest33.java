import java.util.*;
public class cTest33
{
 public static void main(String argv[])
 {
  LinkedList ll=new LinkedList();
  ll.add(new String("JAVA"));
  ll.add(new String("SCJP"));
  ll.add(0,new String("SCWCD"));
  ll.remove(1);
  System.out.println(ll.get(1));
  
 }
}