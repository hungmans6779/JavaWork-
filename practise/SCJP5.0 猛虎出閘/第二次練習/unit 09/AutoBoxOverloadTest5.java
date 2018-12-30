 public class AutoBoxOverloadTest5
 {
  public static void main(String argv[])
  {
   Integer i=100;
   int j=200;
   foo(i);
   foo(j);
  }
  public static void foo(double data)
  {
   System.out.println("double data="+data);	
  }	
  public static void foo(Double data)
  {
   System.out.println("Double data="+data);	
  }	
 }