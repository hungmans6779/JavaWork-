class OutTest1
{
 static class Inner
 {
  void fooA()
  {
   System.out.println("�ڬOInstance��fooA()........");
  }
  static void fooB()
  {
   System.out.println("�ڬOStatic��fooB()........");
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