import java.util.*;
public class GenericsLimitTest1
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
  Iterator<? extends Number>it=v.iterator();
  while(it.hasNext())
  {
   Number value=it.next();
   System.out.print(value+"\t");
  }
 }
}