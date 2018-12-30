public class OverLoadAutboxTest1
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 static void foo(int x)
 {
  System.out.println("int x = "+x);
 }
}