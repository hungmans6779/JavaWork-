import java.util.*;
public class StackTest1
{
 public static void main(String argv[])
 {
  Stack <String>s=new Stack<String>();
  s.push("SCJP");
  s.push("SCWCD");
  s.push("SCMAD");
  s.push("SCWCD");
   ListIterator it=s.listIterator();
  while(it.hasNext())
  {
   int index=it.nextIndex();
   String data=(String)it.next();
   System.out.println(index+"="+data);	
  }
  System.out.println("SCMAD's index:"+s.search("SCMAD"));	
 }
}