class A
{
 A()
 {
  System.out.print("A");
 }
}
class B extends A
{
 B()
 {
  System.out.print("B");
 }
}

public class EX1_12 extends B
{
 EX1_12()
 {
  System.out.print("C");
 }
 public static void main(String argv[])
 {
  new EX1_12();
 }
}