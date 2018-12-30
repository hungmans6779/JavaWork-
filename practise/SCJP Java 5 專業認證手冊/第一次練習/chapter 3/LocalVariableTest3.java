public class LocalVariableTest3
{
 int i=10;
 public static void main(String argv[])
 {
  LocalVariableTest3 a=new LocalVariableTest3();
  LocalVariableTest3 b=a;
  System.out.println("a="+a.i);
  System.out.println("b="+b.i);
  b.i=30;
  System.out.println("a="+a.i);
  System.out.println("b="+b.i);
  a.getTest(a);
  System.out.println("a="+a.i);
  System.out.println("b="+b.i);
 }
 void getTest(LocalVariableTest3 c)
 {
  c.i=20; 	
 }	
}