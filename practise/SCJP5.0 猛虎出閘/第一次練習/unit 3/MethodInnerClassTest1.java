public class MethodInnerClassTest1
{
 public static void main(String argv[])
 {
  new MethodInnerClassTest1().see();
 }
 void see()
 {
  class InnerClass
  {
   void foo()
   {
    System.out.println("§Ú¬OMethodInnerClass");
   }
  }
  new InnerClass().foo();
 }
}