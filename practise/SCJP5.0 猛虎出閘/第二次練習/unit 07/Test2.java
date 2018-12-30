import java.util.*;
public class Test2
{
 public static void main(String argv[])
 {
  HashSet hs=new HashSet();
  hs.add("SCJP");
  hs.add(new Integer(100));
  System.out.println(hs.toString());
  System.out.println("=====================");
  for(Object o:hs)
   System.out.println(hs);
 }
}