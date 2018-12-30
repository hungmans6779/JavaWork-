public class MethodInnerClassTest1
{
 private int x=10;
 public static void main(String argv[])
 {
  new MethodInnerClassTest1().method();
 }
 public void method()
 {
  class MethodInnerClass
  {
   public void getX()
   {
    System.out.println("x = "+x);
   }
  }
  new MethodInnerClass().getX();
 }
}