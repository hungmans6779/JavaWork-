public class OverLoadAutboxTest4
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 static void foo(double x)
 {
  System.out.println("double x = "+x);
 }
 static void foo(Integer x)
 {
  System.out.println("Integer x = "+x);
 }
}