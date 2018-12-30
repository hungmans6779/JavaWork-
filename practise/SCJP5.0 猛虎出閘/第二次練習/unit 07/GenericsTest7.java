import java.util.*;
public class GenericsTest7
{
 public static void main(String argv[])
 {
  Vector<String>v1=new Vector<String>();
  v1.add("Java ");
  v1.add("Tiger ");
  v1.add("SCJP 5.0");
  System.out.println("v1 的內容為:"+v1);
  Vector<Integer>v2=new Vector<Integer>();
  v2.add(100);
  v2.add(200);
  v2.add(300);
  System.out.println("v2 的內容為:"+v2);
  System.out.println("==============");
  printVector(v1);
  printVector(v2);
 }
 public static void printVector(Vector<?>v)
 {
  Iterator it=v.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+" ,");	
  }	
  System.out.println();
 }	
}