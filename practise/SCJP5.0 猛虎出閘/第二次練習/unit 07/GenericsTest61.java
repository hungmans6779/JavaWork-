import java.util.*;
public class GenericsTest61
{
 public static void main(String argv[])
 {
  Vector<Integer>v=new Vector<Integer>();
  v.add(100);
  System.out.println("v的內容為:"+v);
  List v5=v;
  System.out.println("v5的內容為:"+v5);
  System.out.println("================");
  v5.add("SCJP");
  System.out.println("v的內容為:"+v);
  System.out.println("v5的內容為:"+v5);
  Integer i=v.get(0);
  try
  {
   Integer k=v.get(1);
   System.out.println(k);
  }
  catch(Exception e)
  {
   e.printStackTrace();
   System.out.println(e.getMessage());
   System.out.println(e.getLocalizedMessage());
  }	 
  finally
  {
   System.out.println("Bye..............");	
  }	

 }
 protected void finalize() throws Throwable
 {
  System.out.println(Thread.currentThread().getName()+"被資源回收了...");	
 }	
}