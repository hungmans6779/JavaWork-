public class MethodInnerTest2
{
 public static void main(String argv[])
 {
  new MethodInnerTest2().see();
 }
 public void see()
 {
  int x=77;
  final int fx=7;
  class MyInner
  {
   public void foo()
   {
    //System.out.println("local x="+x);
    System.out.println("final fs="+fx);
   }
  }
  new MyInner().foo();
 }
}