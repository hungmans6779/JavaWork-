public class MethodInnerClassTest2
{
 private int x=10;
 public static void main(String argv[])
 {
  new MethodInnerClassTest2().method();
 }
 public void method()
 {
 	int x=100;
  class MethodInnerClass
  {
   int x=1000;		
   public void getX()
   {
   	int x=10000;
    System.out.println("x = "+x);
    System.out.println("this.x = "+this.x);
    System.out.println("MethodInnerClassTest2.this.x = "+MethodInnerClassTest2.this.x);
    System.out.println("methodInnerClass");
   }
  }
  new MethodInnerClass().getX();
 }
}