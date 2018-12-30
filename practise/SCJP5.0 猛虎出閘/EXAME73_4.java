import java.util.*;
public class EXAME73_4
{
 enum Example{ONE,TWO,THREE}	
 public static void main(String argv[])
 {
  SortedSet<Example>s=new TreeSet<Example>();
  s.add(Example.ONE);
  s.add(Example.TWO);
  s.add(Example.THREE);
  System.out.println(s);
 }
}