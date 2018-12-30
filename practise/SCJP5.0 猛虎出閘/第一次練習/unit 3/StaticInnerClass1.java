class MyOuter
{
 static class MyStatic
 {
  public void fooA()
  {
   System.out.println("Hello static inner class A"); 
  }
  public static void fooB()
  {
   System.out.println("Hello static inner class B");
  } 
 }
}

public class StaticInnerClass1
{
 public static void main(String argv[])
 {
  MyOuter.MyStatic s=new MyOuter.MyStatic();
  s.fooA();
  s.fooB();
  MyOuter.MyStatic.fooB();
 }
}