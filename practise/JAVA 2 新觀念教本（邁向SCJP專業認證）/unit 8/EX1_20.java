public class EX1_20
{
 public static void main(String argv[])
 {
  A a=new A();
  B b=new B();
  C c=new C();
  //b=(B)a;
  a=c;
  a=(A)b;
 }
}

class A{}
class B extends A{}
class C extends A{}
class D extends B{}