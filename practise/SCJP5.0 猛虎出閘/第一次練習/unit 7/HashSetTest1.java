import java.util.*;
public class HashSetTest1
{
 public static void main(String argv[])
 {
  HashSet h1=new HashSet();
  h1.add("SCJP");
  h1.add("SCMAD");
  h1.add("SCWCD");
  h1.add("SCBCD");
  Iterator ih1=h1.iterator();
  while(ih1.hasNext())
  {
  //System.out.print(ih1.next());
  String data=(String)ih1.next();
  System.out.print(data+"\t");
  }	
 }	
}