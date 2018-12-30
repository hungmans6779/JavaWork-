public class AssignmentTest1
{
 public static void main(String argv[])
 {
  m1();
  m2();
 }
 static void m1()
 {
 	int a=2;
  a=a*2-3;
  System.out.println("a="+a);
 }
 static void m2()
 {
  int a=1;
  a*=2-3;
  System.out.println("a="+a);	
 }	
}