public class ReferenceTest2_1
{
 int i;
 public static void main(String argv[])
 {
  ReferenceTest2_1 r2=new ReferenceTest2_1();
  System.out.println("r2 = "+r2.i);
  ReferenceTest2_1 r3=r2;
  r3.i=10;
  System.out.println("r3 = "+r2.i);
  r2.getTest(r2);
  System.out.println("r3 = "+r2.i);
 }
 void getTest(ReferenceTest2_1 a)
 {
 	a.i=30;
 }	
}