class MyOuter
{
 private int x=7;
 private static int sx=9;
 static class MyInner
 {
  private int x=77;
  private static int sx=99;
  public void fooA()
  {
   System.out.println(sx);
   System.out.println(MyOuter.sx);
   System.out.println(x);
   System.out.println(this.sx);
   System.out.println(this.x);
   //System.out.println(MyOuter.this.x);
  }
  public static void fooB()
  {
   System.out.println(sx);
   //System.out.println(x);	
   System.out.println(MyOuter.sx);
   //System.out.println(MyOuter.x);
  }	
  
 }
}

public class StaticInnerClassTest2
{
 public static void main(String argv[])
 {
 	MyOuter.MyInner s=new MyOuter.MyInner();
 	s.fooA();
 	System.out.println("===============");
 	s.fooB();
 }		
}	