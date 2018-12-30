class OutClass
{
 private int x=7;
 private static int sx=9;
 static class InnerClass	
 {
 	private int x=77;
 	private static int sx=99;
 	public void foo()
 	{
 	 int x=777;
 	 int sx=999;
 	 System.out.println(x);
 	 System.out.println(this.x);
 	 System.out.println(sx);
 	 System.out.println(this.sx);
 	 System.out.println(OutClass.sx);	
 	}
 	public static void foo1()
 	{
 	 System.out.println(sx);
 	 System.out.println(OutClass.sx);	
 	}	
 }	
}	

public class StaticInnerClassTest3
{
 public static void main(String argv[])
 {
 	 System.out.println("foo¬°static members");
   new OutClass.InnerClass().foo();	
   System.out.println();
   System.out.println("foo1¬°instance members");
   new OutClass.InnerClass().foo1();
 }	
}	