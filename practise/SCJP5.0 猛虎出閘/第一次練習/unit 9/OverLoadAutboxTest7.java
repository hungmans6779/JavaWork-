//ฟ๙ป~ฝdจา.............
public class OverLoadAutboxTest7
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 static void foo(Long x)
 {
  System.out.println("Long x = "+x);
 }
}