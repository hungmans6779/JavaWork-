public class EX7
{
 public static void main(String argv[])
 {
  new Sub().m(25);
 }
}

class Super
{
 int a=1;
 void a()
 {
  System.out.println(a);
 }
}

class Sub extends Super
{
 int a=10;
 void m(int a)
 {
  System.out.println("�ϰ��ܼ� a = "+a);
  System.out.println("Sub�w�q��a : "+this.a);
  System.out.println("Super�w�q��a : "+super.a);
  super.a();
  a();
 }
}