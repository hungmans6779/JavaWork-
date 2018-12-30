public class OverLoadAutboxTest3
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
 static void foo(Integer x)
 {
  System.out.println("Integer x = "+x);
 }
}