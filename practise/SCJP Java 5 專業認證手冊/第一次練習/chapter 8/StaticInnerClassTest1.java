class OutClass1
{
 static class InnerClass1
 {
  public void go1()
  {
   System.out.println("go1");
  }
  public static void go3()
  {
   System.out.println("go3");	
  }	
 }
}

public class StaticInnerClassTest1
{
 public static void main(String arvbv[])
 {
  //OutClass1.InnerClass1 n1=new OutClass1.InnerClass1();
  //n1.go1();
  new OutClass1.InnerClass1().go1();
  new InnerClass().go2();
  OutClass1.InnerClass1.go3();
  InnerClass.go5();
 }
 static class InnerClass
 {
  public void go2()
  {
   System.out.println("go2");
  }
  static public void go5()
  {
   System.out.println("go5");	
  }	
 }
}