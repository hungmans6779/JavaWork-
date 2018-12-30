import java.util.*;
public class StackTest2
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
  while(!s.empty())
  {
   System.out.print(s.pop()+",");	
  }	
  System.out.println();
  System.out.println("stack is empty:"+s.empty());
 }
}