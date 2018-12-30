public class LongLiteralTest2
{
 public static void main(String argv[])
 {
  long l1=2l;
  long l2=3;
  //int total1=l1+l2;
  long total1=l1+l2;
  System.out.println("total1 = "+total1);
  int total2=(int)(l1+l2);
  System.out.println("total2 = "+total2);
 }
}