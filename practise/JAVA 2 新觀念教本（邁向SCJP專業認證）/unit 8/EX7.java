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
  System.out.println("區域變數 a = "+a);
  System.out.println("Sub定義的a : "+this.a);
  System.out.println("Super定義的a : "+super.a);
  super.a();
  a();
 }
}