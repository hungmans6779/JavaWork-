class A {}
class B extends A {}
class SuperClass
{
 public A getA()
 {
 	System.out.println("A");
  return new A();
 }
}

class EXAME146_1 extends SuperClass
{
 public B getA()
 {
 	System.out.println("B");
  return new B();
 }
 public static void main(String argv[])
 {
  SuperClass s=new SuperClass();
  EXAME146_1 e=new EXAME146_1();
  s.getA();
  e.getA();
 }
}