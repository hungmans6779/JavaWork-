class A
{}
class B extends A
{}

class SuperClass
{
 public A getA()
 {
  return new A();
 }
}
public class SubClass extends SuperClass
{
 public B getA()
 {
  return new B();
 }
}