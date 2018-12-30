class MyOuterTest2
{
 public class MyInner
 {
  public void foo()
  {
   System.out.println("Hello Inner Class!");
  }
 }
}

public class RegularInnerTest2
{
 public static void main(String argv[])
 {
  new MyOuterTest2().new MyInner().foo();
 }
}