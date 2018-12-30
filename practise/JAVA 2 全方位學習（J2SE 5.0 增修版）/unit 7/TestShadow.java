public class TestShadow 
{
 public static void main(String argv[])
 {
   A a=new A();
   B b=new B();
   
   System.out.println("a.i = "+ a.i);
   System.out.println("b.i = "+ b.i);
 }
}

class A
{
 int i=10;
 public A()
 {
  System.out.println(i);
 }
}
class B extends A
{
 int i=5;
 public B()
 {
  System.out.println(i);
 }
}

