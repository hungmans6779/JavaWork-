public class AutoBoxTest3
{
 public static void main(String argv[])
 {
  Integer a2=Integer.valueOf(100);
  Integer a3=100;
  System.out.println("a2==a3:"+(a2==a3));
  System.out.println("a2.equals(a3):"+(a2.equals(a3)));
 }
}