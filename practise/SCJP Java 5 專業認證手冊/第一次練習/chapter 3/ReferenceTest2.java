public class ReferenceTest2
{
 int i;
 public static void main(String argv[])
 {
  ReferenceTest2 r2=new ReferenceTest2();
  System.out.println("r2 = "+r2.i);
  ReferenceTest2 r3=r2;
  r3.i=10;
  System.out.println("r2 = "+r2.i);
 }
}