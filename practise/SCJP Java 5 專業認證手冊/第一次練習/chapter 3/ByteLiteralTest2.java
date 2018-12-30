public class ByteLiteralTest2
{
 public static void main(String argv[])
 {
  byte b1=2;
  byte b2=4;
  //byte total=b1+b2;
  int total1=b1+b2;
  System.out.println("total1 = "+total1);
  byte total2=(byte)(b1+b2);
  System.out.println("total2 = "+total2);
 }
}