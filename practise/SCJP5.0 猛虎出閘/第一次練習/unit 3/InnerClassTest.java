public class InnerClassTest
{
 int x=7;	
 static int sx=9;
 public static void main(String argv[])
 {
 	 System.out.println("===================================");
   new InnerClassTest().new RegularInnerClass().show();	
   System.out.println("===================================");
   new StaticInnerClass().show();
   System.out.println("==================================="); 
   new StaticInnerClass().show1();
   System.out.println("==================================="); 
   StaticInnerClass.show1();
 }		
	
 class RegularInnerClass
 {
 	int x=77;
 	void show()
 	{
 	 int x=777;
 	 System.out.println("�ڬORegularInnerClass�������k");	
 	 System.out.println("RegularInnerClass��show()�� x = "+x);
 	 System.out.println("RegularInnerClass��this x = "+this.x);
 	 System.out.println("InnerClassTest��x = "+InnerClassTest.this.x); 
 	 System.out.println("InnerClassTest��sx = "+InnerClassTest.this.sx); 
 	 System.out.println("InnerClassTest��sx = "+InnerClassTest.sx);
 	 class R
 	 {
 	  void show11()
 	  {
 	   System.out.println("test");	
 	  }		
 	 }
 	 new R().show11();	
  }
 }		
 static class StaticInnerClass
 {
 	int x=77;
 	static int sx=99;
  void show()
  {
   int x=777;
   int sx=999;
   System.out.println("�ڬOStaticInnerClass�������k");	
   System.out.println("StaticInnerClass��show() x = "+x);
   System.out.println("StaticInnerClass�� x = "+this.x);
   System.out.println("StaticInnerClass�� sx = "+sx);
   System.out.println("StaticInnerClass�� sx = "+this.sx);
   //System.out.println("InnerClass��x = "+InnerClassTest.this.x);
   System.out.println("InnerClass��sx = "+InnerClassTest.sx);
  }	
  static void show1()
  {
   int sx=999;	
   int x=777;
   System.out.println("�ڬOStaticInnerClass���R�A��k");	
   System.out.println("StaticInnerClass��static show1() x = "+x);
   System.out.println("StaticInnerClass��static show1() sx = "+sx);
   //System.out.println("StaticInnerClass��this.x = "+this.x);
   //System.out.println("StaticInnerClass��this.sx = "+this.sx);
   System.out.println("InnerClass��sx = "+InnerClassTest.sx);
  
  }	
 }		
}	