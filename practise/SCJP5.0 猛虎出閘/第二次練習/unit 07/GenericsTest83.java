import java.util.*;
public class GenericsTest83
{
 public static void main(String argv[])
 {
  Vector<Integer>v1=new Vector<Integer>();
  v1.add(100);
  v1.add(200);
  v1.add(300);
  System.out.println("v1 的內容為:"+v1);
  Vector<Float>v2=new Vector<Float>();
  v2.add(1.1f);
  v2.add(2.2f);
  v2.add(3.3f);
  System.out.println("v2 的內容為:"+v2);
  
  Vector <String>v3=new Vector<String>();
  v3.add("Java ");
  v3.add("Tiger ");
  v3.add("SCJP 5.0");
  System.out.println("v3 的內容為:"+v3);
  System.out.println("==============");
  printVector(v1);
  printVector(v2);
  //printVector(v3); //造成編譯錯誤，因為<? extneds Number>
 }
 public static void printVector(Vector<? extends Number>v)
 {
  Iterator it=v.iterator();
  while(it.hasNext())
  {
   System.out.print(it.next()+" ,");	
  }	
  System.out.println();
 }	
}