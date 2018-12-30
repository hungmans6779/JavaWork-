public class OutClassTest2
{
 public static void main(String argv[])
 {
  new InnerClass().foo1();
  OutClassTest2.InnerClass t=new OutClassTest2.InnerClass();
  t.foo1();
  System.out.println(t.i);
  System.out.println(t.i1);
  OutClassTest2.InnerClass.foo2();
 }		
 static class InnerClass
 {
  void foo1()
  {
   System.out.println("我是foo1");	
  }		
  static void foo2()
  {
   System.out.println("我是foo2");	
  }	
  int i=10;
  static int i1=20;	
 }		
}	