public class PrintfTest3
{
 public static void main(String argv[])
 {
  System.out.printf("x ==> %.2f%n",12345.56789);
  System.out.printf("x ==> %.10f%n",12345.56789);
  System.out.printf("x ==> %.2g%n",12345.56789);
  System.out.printf("x ==> %.2s%n",12345.56789);
 }
}