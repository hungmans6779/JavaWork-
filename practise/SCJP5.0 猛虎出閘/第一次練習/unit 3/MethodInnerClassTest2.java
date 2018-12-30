public class MehtodInnerClassTest2
{
 public static void main(String argv[])
 {
  new MethodInnerClassTest2().see();
 }
 void see()
 {
 	int x=7;
  class InnerClass
  {
   void foo()
   {
    System.out.println("Local x = "+x);
   }
  }
  new InnerClass().foo();
 }
}