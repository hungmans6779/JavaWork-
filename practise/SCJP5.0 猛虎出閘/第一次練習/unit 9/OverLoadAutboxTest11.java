public class OverLoadAutboxTest11
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 static void foo(float x)
 {
  System.out.println("float x = "+x);
 }
}