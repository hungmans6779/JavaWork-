class OutClass
{
 private int x=7;
 private static int sx=9;
 class InnerClass	
 {
 	private int x=77;
 	public void foo()
 	{
 	 int x=99;
 	 System.out.println(x);
 	 System.out.println(this.x);
 	 System.out.println(OutClass.sx);
 	 System.out.println(OutClass.this.sx);	
   System.out.println(OutClass.this.x);
 	}
 }	
}	

public class RegularInnerClassTest2
{
 public static void main(String argv[])
 {
   new OutClass().new InnerClass().foo();	

 }	
}	