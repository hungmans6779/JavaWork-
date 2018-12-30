class MyOuter
{
 private int x=7;
 private static int sx=9;
 class MyInner
 {
  int x=77;
  public void foo()
  {
   int x=777;
   System.out.println("Local x="+x);
   System.out.println("MyInner's x="+this.x);
   System.out.println("MyOuter's x="+MyOuter.this.x);
   System.out.println("MyOuter's sx="+MyOuter.this.sx);
   System.out.println("MyOuter's x="+MyOuter.sx);
  }
 }
}

public class RegularInnerTest3
{
 public static void main(String argv[])
 {
 	new MyOuter().new MyInner().foo();
 }		
}	