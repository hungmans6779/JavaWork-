import java.util.*;
public class GenericsLimitTest2
{
 public static void main(String argv[])
 {
  Vector<Integer>v1=new Vector<Integer>();
  v1.add(new Integer(1));
  v1.add(2);
  v1.add(new Integer(3));
  Vector<Float>v2=new Vector<Float>();
  v2.add(1.1f);
  v2.add(2.2f);
  v2.add(new Float(3.3));
  v2.add(5.5f);
  printMyVector(v1);
  System.out.println();
  printMyVector(v2);
 }
 static void printMyVector(Vector<? extends Number>v)
 {
  for(Object data:v)
  {
   System.out.print(data+"\t");	
  }	
 }
}