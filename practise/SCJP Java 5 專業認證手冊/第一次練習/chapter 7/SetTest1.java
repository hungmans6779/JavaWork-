import java.util.*;
public class SetTest1
{
 public static void main(String argv[])
 {
  Set s=new HashSet();
  boolean []b=new boolean[5];
  b[0]=s.add("a");
  b[1]=s.add(new Object());
  b[2]=s.add("b");
  b[3]=s.add("a");
  b[4]=s.add(new Integer(3));
  for(int i=0;i<b.length;i++)
  { System.out.print(b[i]+"\t"); }
  System.out.println();
  for(Object o:s)
  { System.out.print(o+"\t"); }
  	
 }
}