package package2;
import package1.A;
public class E
{
 public E()
 {
  A a=new A();
  a.p1=1;
  a.p2();
  A.p2();
  a.p3();
 }
}