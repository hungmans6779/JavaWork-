class OutClass
{
 private int x=3;
 private static int sx=8;
 class RegularInnerClass
 {
  int x=33;
  int sx=88;
  void regFoo()
  {
   int x=333;
   System.out.println(x);
   System.out.println(this.x);
   System.out.println(OutClass.this.x);
   System.out.println(OutClass.sx);
   System.out.println(OutClass.this.sx);
  } 
 }
 static class StaticInnerClass
 {
 	int x=33;
 	static int sx=88;
  void staFoo1()
  {
   int x=333;
   System.out.println(x);
   System.out.println(this.x);
   System.out.println(sx);
   System.out.println(this.sx);
   System.out.println(OutClass.sx);	
  }
  static void staFoo2()
  {
   int x=333;
   System.out.println(x);
   System.out.println(sx);
   System.out.println(OutClass.sx);
  }		
 }
}

public class RegularStaticInnerClassTest1
{
 public static void main(String argv[])
 {
 	System.out.println("此為RegularInnerClass之regFoo()所產生的");
 	new OutClass().new RegularInnerClass().regFoo();
 	System.out.println("此為StaticInnerClass之non-static staFoo1()所產生的");
 	new OutClass.StaticInnerClass().staFoo1();
 	System.out.println("此為StaticInnerClass之static staFoo2()所產生的");
 	OutClass.StaticInnerClass.staFoo2();
 }	
}	