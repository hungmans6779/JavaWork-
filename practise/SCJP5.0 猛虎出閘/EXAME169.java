import java.util.*;
public class EXAME169 implements Comparable
{
 public String name;
 public int compareTo(Object o)
 {
  return 0;
 }
 public static void main(String argv[])
 {
  EXAME169 one=new EXAME169();
  EXAME169 two=new EXAME169();
  one.name="Coffee";
  two.name="Tea";
  TreeSet set=new TreeSet();
  set.add(one);
  set.add(two);	
  Iterator it=set.iterator();
  while(it.hasNext())
  {
   System.out.println(((EXAME169)it.next()).name+"\t");	
  }	
 }	
}