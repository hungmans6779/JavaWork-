import java.util.*;
public class GenericsLimitTest3
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
  Vector<String> v3=new Vector<String>();
  v3.add("JAVA");
  v3.add(new String("SCJP"));
  System.out.println();
  //printMyVector(v3); //編譯時期就產生錯誤了........因為printMyVector的傳入值只限定傳入Number的型態....
  Vector v4=new Vector();
  v4.add(new Integer(1));
  v4.add(2);
  v4.add("JAVA");
  v4.add(new String("SCJP"));
  System.out.println();
  printMyVector(v4); //到執行時期才產生錯誤........
 }
 static void printMyVector(Vector<? extends Number>v)
 {
  for(Object data:v)
  {
   System.out.print(data+"\t");	
  }	
 }
}