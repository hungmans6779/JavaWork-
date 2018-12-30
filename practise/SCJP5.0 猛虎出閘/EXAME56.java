class A
{
 public void method1()
 {
  B b=new B();
  b.method2();
 } 
}

class B
{
 public void method2()
 {
  C c=new C();
  c.method3();
 } 
}

class C
{
 public void method3() 
 {
 	 throw new NullPointerException();
 }
}

public class EXAME56
{
 public static void main(String argv[])
 {
  A a=new A();
  try
  {
   a.method1();
  }
  catch(Exception e)
  {
   e.printStackTrace();	
  }	 
 }
}