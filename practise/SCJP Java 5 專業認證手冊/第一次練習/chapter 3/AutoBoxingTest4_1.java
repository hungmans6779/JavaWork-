public class AutoBoxingTest4_1
{
 public static void main(String argv[])
 {
  byte b1=5;
  go(b1);
 }
 static void go(Object o)
 {
  Byte b=(Byte)o;
  System.out.println(b);
 }
}