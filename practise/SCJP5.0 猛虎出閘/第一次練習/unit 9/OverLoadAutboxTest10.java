//ฟ๙ป~ฝdจา.............
public class OverLoadAutboxTest10
{
 public static void main(String argv[])
 {
  Integer i=100;
  int j=200;
  foo(i);
  foo(j);
 }
 static void foo(short x)
 {
  System.out.println("short x = "+x);
 }
}