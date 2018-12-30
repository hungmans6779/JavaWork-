public class LongLiteralTest1
{
 public static void main(String argv[])
 {
  System.out.println(Integer.MAX_VALUE);
  long l1=10l;
  long l2=Integer.MAX_VALUE+1;
  long l3=2147483649L;
  System.out.println("l2 = "+l2);
  System.out.println("l3 = "+l3);
  long l4= 2147483649L;
  float f4=l4;
  System.out.println("f4 = "+f4);
  long l5=4546366364L;
  float f5=l5;
  System.out.println("f5 = "+f5);
 }
}