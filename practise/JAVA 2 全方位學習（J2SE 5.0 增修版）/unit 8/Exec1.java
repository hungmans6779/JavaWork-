public class Exec1
{
 public static void main(String argv[])
 {
  A a=new B();
  B b=(B)a;
  C c=new A();
  D d=(D)c;
 }
}

class A {}
class B  extends A {}
class C  extends B {}
class D  extends A {}