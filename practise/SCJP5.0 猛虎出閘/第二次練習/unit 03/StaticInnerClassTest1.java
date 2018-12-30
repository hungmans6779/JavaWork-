class MyOuter
{
 static class MyInner
 {
  public void fooA()
  {
   System.out.println("Hello Method A");
  }
  public static void fooB()
  {
   System.out.println("Hello Method B");
  }
 }
}

public class StaticInnerClassTest1
{
 public static void main(String argv[])
 {
  MyOuter.MyInner in=new MyOuter.MyInner();
  in.fooA();
  in.fooB();
  MyOuter.MyInner.fooB();	
 }		
}	