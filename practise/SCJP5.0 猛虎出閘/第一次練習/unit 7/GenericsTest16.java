import java.util.*;
public class GenericsTest16
{
 public static void main(String argv[])
 {
  Vector<String>v1=getMyVector1();
  Vector<Integer>v2=getMyVector2();
  for(String data:v1)
  {
   System.out.print(data+"\t");	
  }	
  System.out.println();
  for(Integer value:v2)
  {
   System.out.print(value+"\t");	
  }	
 }
 static Vector<String>getMyVector1()
 {
  Vector<String>v=new Vector<String>();
  v.add("JAVA");
  v.add("SCJP");
  return v;
 }
 static Vector<Integer>getMyVector2()
 {
  Vector<Integer>k=new Vector<Integer>();
  k.add(1);
  k.add(new Integer(2));
  return k;
 }
}