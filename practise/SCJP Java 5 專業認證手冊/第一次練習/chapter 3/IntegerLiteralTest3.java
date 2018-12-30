public class IntegerLiteralTest3
{
 public static void main(String argv[])
 {
  int a=10;
  int b=a;
  System.out.println("a == b : "+(a==b));
  //System.out.println("a.equals(b) : "+(a.equals(b)));
  Integer a1=10;
  Integer b1=a1;
  System.out.println("a1 == b1 : "+(a1==b1));
  System.out.println("a1.equals(b1) : "+(a1.equals(b1)));
  Integer a2=new Integer(10);
  Integer b2=new Integer(10);
  System.out.println("a2 == b2 : "+(a2==b2));
  System.out.println("a2.equals(b2) : "+(a2.equals(b2)));
  
 }
}