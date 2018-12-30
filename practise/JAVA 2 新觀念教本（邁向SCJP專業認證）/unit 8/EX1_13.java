abstract class A
{
 int m=9;
 final abstract void m();
}

class B extends A
{
 void m()
 {
  System.out.println("m");
 }
}

public class EX1_13 
{
 public static void main(String argv[])
 {
  A a=new B();
  a.m();
 }
}
