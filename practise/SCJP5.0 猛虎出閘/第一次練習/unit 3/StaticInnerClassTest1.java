class OutTest1
{
 static class Inner
 {
  void fooA()
  {
   System.out.println("我是Instance的fooA()........");
  }
  static void fooB()
  {
   System.out.println("我是Static的fooB()........");
  }
 }
}

public class StaticInnerClassTest1
{
 public static void main(String argv[])
 {
  OutTest1.Inner in=new OutTest1.Inner();
  in.fooA();
  in.fooB();
  System.out.println("================================");
  OutTest1.Inner.fooB();
 }
}