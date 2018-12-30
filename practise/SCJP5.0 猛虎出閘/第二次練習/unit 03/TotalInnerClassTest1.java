class MyOuter
{
 private int x=7;
 private static int sx=9;
 class MyInstanceInner
 {
  private int x=77;
  public void fooA()
  {
   int x=777;
   System.out.println(x);
   System.out.println(this.x);
   System.out.println(MyOuter.this.x);
   System.out.println(MyOuter.this.sx);
   System.out.println(MyOuter.sx);
  }
 }
 static class MyStaticInner
 {
 	private int x=77;
 	private static int sx=99;
  public void fooB()
  {
   int x=777;
   System.out.println(x);
   System.out.println(sx);
   System.out.println(this.x);
   System.out.println(this.sx);
   //System.out.println(MyOuter.MyStaticInner.x);
   System.out.println(MyOuter.MyStaticInner.sx);
   System.out.println(MyOuter.sx);
   //System.out.println(MyOuter.this.x);	
  }
  public static void fooC()
  {
   int x=777;
   System.out.println(x);
   //System.out.println(this.x);	
   //System.out.println(this.sx);
   System.out.println(sx);
   System.out.println(MyStaticInner.sx);
   //System.out.println(MyOuter.this.x);
   System.out.println(MyOuter.sx);
  }			
 }	
}

public class TotalInnerClassTest1
{
 public static void main(String argv[])
 {
  MyOuter.MyInstanceInner mi=new MyOuter().new MyInstanceInner();
  mi.fooA();
  System.out.println("===============================");
  MyOuter.MyStaticInner msi=new MyOuter.MyStaticInner();
  msi.fooB();
  System.out.println("===============================");
  msi.fooC();
 }
}