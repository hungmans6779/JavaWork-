class A
{
 public void method1()
 {
  B b=new B();
  b.method2();
  System.out.println("class A method()is execute");
 }
}
class B
{
 public void method2()
 {
  C c=new C();
  c.method3();
  System.out.println("class B method()is execute");
 }
}

class C
{
 public void method3()
 {
  //System.out.println("我是類別C呦");
  int i=10,ans;
  ans=10/0;
 }
}

public class Ex56
{
 public static void main(String argv[])
 {
  try
  {
   A a=new A();
   a.method1();
   System.out.println("class A method()is execute");
   
  }
  catch(Exception e)
  {
   System.out.println("an error occurred");
  } 
 }
}
