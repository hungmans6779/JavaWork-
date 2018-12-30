public class OverLoadAutboxTest9
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 static void foo(long x)
 {
  System.out.println("long x = "+x);
 }
}