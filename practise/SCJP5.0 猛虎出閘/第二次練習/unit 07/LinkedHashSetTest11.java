import java.util.*;
public class LinkedHashSetTest11
{
 public static void main(String argv[])
 {
  LinkedHashSet lhs=new LinkedHashSet();
  lhs.add("SCJP");
  lhs.add("SCWCD");
  lhs.add("SCBCD");
  lhs.add("SCMAD");
  for(Object data:lhs)
   System.out.println(data);
 }
}