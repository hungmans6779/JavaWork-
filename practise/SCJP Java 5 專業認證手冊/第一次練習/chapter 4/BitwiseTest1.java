public class BitwiseTest1
{
 public static void main(String argv[])
 {
  int b1=56;
  int b2=255;
  int i1=b1&b2;
  int i2=b1|b2;
  int i3=b1^b2;
  Integer b3=34;
  Integer i4=~b3;
  System.out.println("i1="+i1);
  System.out.println("i2="+i2);
  System.out.println("i3="+i3);
  System.out.println("i4="+i4);
  System.out.println(Integer.toBinaryString(b3));
 }
}