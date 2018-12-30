interface Foo {}
class A implements Foo {}
class B extends A {}
public class InstanceofTest2
{
 public static void main(String argv[])
 {
  A a=new A();
  B b=new B();
  if(a instanceof Foo) {System.out.println("a instanceof Foo");}
  if(b instanceof A) {System.out.println("b instanceof A");}
  if(b instanceof Foo) {System.out.println("b instanceof Foo : "+(b instanceof Foo));}
 }
}