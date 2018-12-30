import java.util.*;
public class Test4
{
 public static void main(String argv[])
 {
  ArrayList al=new ArrayList();
  al.add("SCJP");
  al.add(new Integer(100));
  for(Object o:al)
   System.out.println(al);
 }
}