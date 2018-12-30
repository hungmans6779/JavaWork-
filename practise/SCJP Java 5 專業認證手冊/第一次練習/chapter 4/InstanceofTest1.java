class A {}
class B extends A
{
 void doTest()
 {System.out.println("aaaaa");}	
}

public class InstanceofTest1
{
 public static void main(String argv[])
 {
  A a=new B();
  test(a);
 }
 static void test(A aa)
 {
  ((B)aa).doTest();
 }
 
}