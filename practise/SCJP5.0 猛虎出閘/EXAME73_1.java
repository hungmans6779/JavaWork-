import java.util.*;
public class EXAME73_1
{
 enum Example{ONE,TWO,THREE};		
 public static void main(String argv[])
 {
  SortedSet<Example>s=new TreeSet<Example>();
  s.add(Example.ONE);
  s.add(Example.TWO);
  System.out.println(s);
 }
}