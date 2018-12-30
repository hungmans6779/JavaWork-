public class AutoBoxTest4
{
 public static void main(String argv[])
 {
  Integer a4=Integer.valueOf(200);
  Integer b4=Integer.valueOf(200);
  Integer a5=200;
  Integer b5=200;
  System.out.println("a4==b4:"+(a4==b4));
  System.out.println("a4.equals(b4):"+(a4.equals(b4)));
  System.out.println("a5==b5:"+(a5==b5));
  System.out.println("a5.equals(b5):"+(a5.equals(b5)));
  
  System.out.println("a4==a5:"+(a4==a5));
  System.out.println("a4.equals(a5):"+(a4.equals(a5)));
 }
}