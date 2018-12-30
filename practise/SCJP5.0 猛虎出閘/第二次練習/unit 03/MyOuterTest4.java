public class MyOuterTest4
{
 public static class MyInner
 {
  public void foo()
  {
   System.out.println("Hello Inner Class ");
  }
 }
 public void showInner()
 {
  new MyInner().foo();
 }
 public static void main(String argv[])
 {
  new MyInner().foo();
  new MyOuterTest3().showInner();
 }
}