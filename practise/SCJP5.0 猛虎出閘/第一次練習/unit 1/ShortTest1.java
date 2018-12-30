import static java.lang.System.out;
class ShortTest1
{
 static short s4;
 public static void main(String argv[])
 {
  short s1=10;
  out.println(s1);
  short s2='A';
  out.println(s2);
  short s3=32767;
  out.println(s3);
  out.println(s4);
  short s5=(byte)289;
  out.println(s5);
  out.println(Short.MAX_VALUE);
 }
}