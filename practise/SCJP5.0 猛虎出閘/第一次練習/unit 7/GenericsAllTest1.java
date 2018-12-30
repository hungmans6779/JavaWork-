import java.util.*;
public class GenericsAllTest1
{
 public static void main(String arv[])
 {
  Vector<String>v1=new Vector<String>();
  v1.add(new String("Tiger"));
  v1.add("JAVA");
  v1.add("SCJP");
  Vector<Integer>v2=new Vector<Integer>();
  v2.add(1);
  v2.add(new Integer(2));
  v2.add(3);
  printMyVector(v1);
  System.out.println();
  printMyVector(v2);
 }
 public static void printMyVector(Vector<?>v)
 {
 	Iterator<?>it=v.iterator();
 	while(it.hasNext())
 	{
 	 System.out.print(it.next()+"\t");	
 	}	
 } 
}