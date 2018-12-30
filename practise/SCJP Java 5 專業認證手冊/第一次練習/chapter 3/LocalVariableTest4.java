public class LocalVariableTest4
{
 public static void main(String argv[])
 {
  int a=10;
  int b=a;
  System.out.println("a="+a);
  System.out.println("b="+b);
  b=20;
  System.out.println("a="+a);
  System.out.println("b="+b);
  getTest(a);
  System.out.println("a="+a);
  System.out.println("b="+b); 
 }
 static void getTest(int a)
 {
  a=30;
 }
}