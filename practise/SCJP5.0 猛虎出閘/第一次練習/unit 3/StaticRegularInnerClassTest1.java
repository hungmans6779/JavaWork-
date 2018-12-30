class StaticRegularInnerClassTest1
{
 private int x=7;
 private static int sx=99;
 static class StaticInnerClass
 {
  int x=77;
  private static int sx=99;
  void fooA()
  {
   int x=777;
   int sx=999;
   System.out.println("Local x = "+x);
   System.out.println("Local sx = "+sx);
   System.out.println("StaticInnerClass'x = "+this.x);
   System.out.println("StaticInnerClass'sx = "+this.sx);
   //System.out.println("StaticRegularInnerClassTest1'x = "+StaticRegularInnerClassTest1.this.x);
   System.out.println("StaticRegularInnerClassTest1'sx = "+StaticRegularInnerClassTest1.sx);
  }
  static void fooB()
  {
   //System.out.println("StaticInnerClass'x = "+x);	
   System.out.println("StaticInnerClass'sx = "+sx);
   //System.out.println("StaticRegularInnerClassTest1'x = "+StaticRegularInnerClassTest1.this.x);	
   System.out.println("StaticRegularInnerClassTest1'sx = "+StaticRegularInnerClassTest1.sx);
  }	
 }
 class RegularInnerClass
 {
 	int x=77;
  int sx=99;
 	void fooC()
 	{
 	 int x=777;
 	 int sx=999;
 	 System.out.println("Local'x = "+x);
 	 System.out.println("Local'sx = "+sx);
 	 System.out.println("RegularInnerClass'x = "+this.x);
 	 System.out.println("RegularInnerClass'sx = "+this.sx);
 	 System.out.println("StaticRegularInnerClassTest1'x = "+StaticRegularInnerClassTest1.this.x);
 	 System.out.println("StaticRegularInnerClassTest1'sx = "+StaticRegularInnerClassTest1.this.sx);	
 	 System.out.println("StaticRegularInnerClassTest1'sx = "+StaticRegularInnerClassTest1.sx);		
 	}	
 }
 void fooD()
 {
 	final int kk=10;
 	int x=77;
 	int sx=99;
 	class MethodInnerClass
 	{
 	 int x=777;
 	 int sx=999;
 	 void ffooD()
 	 {
 	  int x=7777;
 	  int sx=9999;
 	 	System.out.println("Local'x = "+x);
 	 	System.out.println("Local'sx = "+sx);
 	 	System.out.println("MethodInnerClass'x = "+this.x);
 	 	System.out.println("MethodInnerClass'sx = "+this.sx);
 	 	System.out.println("StaticRegularInnerClassTest1'x = "+StaticRegularInnerClassTest1.this.x);
 	 	System.out.println("StaticRegularInnerClassTest1'sx = "+StaticRegularInnerClassTest1.this.sx);
  	System.out.println("StaticRegularInnerClassTest1'sx = "+StaticRegularInnerClassTest1.sx);
 	 }	 	 	
 	}
 	new MethodInnerClass().ffooD();	
 }		
 
 public static void main(String argv[])
 {
 	new StaticRegularInnerClassTest1.StaticInnerClass().fooA();
 	System.out.println("================================");
 	StaticRegularInnerClassTest1.StaticInnerClass.fooB();
 	System.out.println("================================");
 	new StaticRegularInnerClassTest1().new RegularInnerClass().fooC();
 	System.out.println("================================");
 	new StaticRegularInnerClassTest1().fooD();
 }
}