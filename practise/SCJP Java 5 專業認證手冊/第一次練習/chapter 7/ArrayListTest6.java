import java.util.*;
class Adder
{
 int addAll(List list)
 {
  int total=0;
  Iterator it=list.iterator();
  while(it.hasNext())
  {
   int value=((Integer)it.next()).intValue();
   total+=value;
  }
  return total;
 }
}
public class ArrayListTest6
{
 public static void main(String argv[])
 {
 	ArrayList <Integer> a=new ArrayList<Integer>();
 	a.add(6);
 	a.add(4);
 	Adder adder=new Adder();
 	int total=adder.addAll(a);
 	System.out.println("total = "+total);
 }		
}	