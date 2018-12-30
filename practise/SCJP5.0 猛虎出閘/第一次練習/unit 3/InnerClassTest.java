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
 	 System.out.println("我是RegularInnerClass的物件方法");	
 	 System.out.println("RegularInnerClass之show()內 x = "+x);
 	 System.out.println("RegularInnerClass之this x = "+this.x);
 	 System.out.println("InnerClassTest之x = "+InnerClassTest.this.x); 
 	 System.out.println("InnerClassTest之sx = "+InnerClassTest.this.sx); 
 	 System.out.println("InnerClassTest之sx = "+InnerClassTest.sx);
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
   System.out.println("我是StaticInnerClass的物件方法");	
   System.out.println("StaticInnerClass之show() x = "+x);
   System.out.println("StaticInnerClass之 x = "+this.x);
   System.out.println("StaticInnerClass之 sx = "+sx);
   System.out.println("StaticInnerClass之 sx = "+this.sx);
   //System.out.println("InnerClass之x = "+InnerClassTest.this.x);
   System.out.println("InnerClass之sx = "+InnerClassTest.sx);
  }	
  static void show1()
  {
   int sx=999;	
   int x=777;
   System.out.println("我是StaticInnerClass的靜態方法");	
   System.out.println("StaticInnerClass之static show1() x = "+x);
   System.out.println("StaticInnerClass之static show1() sx = "+sx);
   //System.out.println("StaticInnerClass之this.x = "+this.x);
   //System.out.println("StaticInnerClass之this.sx = "+this.sx);
   System.out.println("InnerClass之sx = "+InnerClassTest.sx);
  
  }	
 }		
}	