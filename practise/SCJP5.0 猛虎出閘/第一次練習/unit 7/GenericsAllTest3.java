import java.util.*;
public class GenericsAllTest3
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
 	for(Object o:v)
 	{
 	 System.out.print(o+"\t");	
 	}	
 }	
 
}