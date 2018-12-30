public class AutoBoxOverloadTest3
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 public static void foo(int data)
 {
 	System.out.println("int data="+data);
 }	
 public static void foo(Integer data)
 {
  System.out.println("Integer data="+data);	
 }	
}