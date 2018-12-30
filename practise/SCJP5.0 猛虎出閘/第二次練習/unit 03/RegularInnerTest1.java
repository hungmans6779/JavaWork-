class MyOuterTest2
{
 public class MyInner
 {
  public void foo()
  {
   System.out.println("Hello MyInner class");
  }
 }
}

public class RegularInnerTest1
{
 public static void main(String argv[])
 {
  MyOuterTest2 out=new MyOuterTest2();
  MyOuterTest2.MyInner in=out.new MyInner();
  in.foo();
 }
}