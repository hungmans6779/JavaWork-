package package2;
import package1.A;
public class D extends A
{
 public D()
 {
  A a=new A();
  //a.p1=1;
  a.p2();
  A.p2();
 // a.p3();
  p1=1;
  p2();
  p3();
 }
}