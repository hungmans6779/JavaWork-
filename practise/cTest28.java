import java.util.*;
public class cTest28
{
 public static void main(String argv[])
 {
  TreeSet <Integer> ts=new TreeSet<Integer>();
  Random rm=new Random();
  while(ts.size()<=6)
  {
   int random=rm.nextInt(48);
   ts.add(random);	
  }	
  for(int value:ts)
   System.out.print(value+",");
 }
}