public class AutoBoxOverloadTest2
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 public static void foo(Integer data)
 {
  System.out.println("data="+data);	
 }
}