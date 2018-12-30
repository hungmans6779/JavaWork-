class A {}
class B extends A {}
class SuperClass
{
 public A getA()
 {
  return new A();
 }
}

class EXAME146 extends SuperClass
{
 public B getA()
 {
  return new B();
 }
}