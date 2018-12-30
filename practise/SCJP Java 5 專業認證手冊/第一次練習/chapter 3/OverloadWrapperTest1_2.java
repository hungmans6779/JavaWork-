public class OverloadWrapperTest1_2
{
 public static void main(String argv[])
 {
  byte b=5;
  go(b,b);
 }
 static void go(byte b1,byte b2)
 {
  System.out.println("byte byte");
 }
 static void go (byte...v)
 {
  System.out.println("var-args");
 }
}