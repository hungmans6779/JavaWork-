public class PrintfTest2
{
 public static void main(String argv[])
 {
  System.out.printf("(01) PI = %f%n",Math.PI);
  System.out.printf("(02) PI = %e%n",Math.PI);
  System.out.printf("(03) PI = %f , E = %e%n",Math.PI,Math.E);
  System.out.printf("(04) E = %2$f, PI = %1$f%n",Math.PI,Math.E);
  System.out.printf("(05) PI = %f , E = %<f%n",Math.PI,Math.E);
  System.out.printf("(06) PI = %10.2f",Math.PI);
 }
}
