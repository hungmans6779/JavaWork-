import java.util.*;
public class GenericsAllTest4
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
  Vector v3=new Vector();
  v3.add("Java");
  v3.add(new String("SCJP"));
  v3.add(1);
  v3.add(new Integer(2));
  printMyVector(v1);
  System.out.println();
  printMyVector(v2);
  System.out.println();
  printMyVector(v3);
  
 }
 public static void printMyVector(Vector<?>v)
 {
 	for(Object o:v)
 	{
 	 System.out.print(o+"\t");	
 	}	
 }	
 
}