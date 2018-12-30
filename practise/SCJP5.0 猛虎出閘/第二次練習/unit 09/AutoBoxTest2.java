public class AutoBoxTest2
{
 public static void main(String argv[])
 {
  Integer a1=new Integer(100);
  Integer b1=new Integer(100);	
  System.out.println("a1==b1:"+(a1==b1));
  System.out.println("a1.equals(b1):"+a1.equals(b1));
  System.out.println("===============================");
  Integer a2=Integer.valueOf(-128);
  Integer b2=Integer.valueOf(-128);
  Integer a3=127;
  Integer b3=127;
  System.out.println("a2==b2:"+(a2==b2));
  System.out.println("a2.equals(b2):"+(a2.equals(b2)));
  System.out.println("a3==b3:"+(a3==b3));
  System.out.println("a3.equals(b3):"+(a3.equals(b3)));
  
 }
}