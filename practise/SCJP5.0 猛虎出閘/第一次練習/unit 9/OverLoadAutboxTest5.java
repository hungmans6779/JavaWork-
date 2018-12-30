public class OverLoadAutboxTest5
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
 static void foo(Double x)
 {
  System.out.println("Double x = "+x);
 }
}