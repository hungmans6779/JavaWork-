public class EX23
{
 static class Sub1 extends Super
 { }
 
 class Sub2 extends Super
 {}
 
 public static void main(String argv[])
 {
  new EX23.Sub1();
  new EX23().new Sub2();
  class Sub3 extends Super
  {}
  new Sub3();
 }
}

class Super
{
 Super()
 {
  System.out.println("Super ���غc�l�Q�I�s�F.....");
 }
}