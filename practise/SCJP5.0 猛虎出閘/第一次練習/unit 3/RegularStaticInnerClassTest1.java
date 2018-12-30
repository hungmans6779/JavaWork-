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
 	System.out.println("����RegularInnerClass��regFoo()�Ҳ��ͪ�");
 	new OutClass().new RegularInnerClass().regFoo();
 	System.out.println("����StaticInnerClass��non-static staFoo1()�Ҳ��ͪ�");
 	new OutClass.StaticInnerClass().staFoo1();
 	System.out.println("����StaticInnerClass��static staFoo2()�Ҳ��ͪ�");
 	OutClass.StaticInnerClass.staFoo2();
 }	
}	