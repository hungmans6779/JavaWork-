public class MehtodInnerClassTest2
{
 public static void main(String argv[])
 {
  new MehtodInnerClassTest2().see();
 }
 void see()
 {
 	final int x=7;
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