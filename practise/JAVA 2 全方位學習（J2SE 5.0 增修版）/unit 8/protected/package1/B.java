package package1;
public class B extends A
{
 public B()
 {
  A a=new A();
  a.p1=1;
  a.p2();
  A.p2();
  a.p3();
  p1=1;
  p2();
  p3();
 }
}