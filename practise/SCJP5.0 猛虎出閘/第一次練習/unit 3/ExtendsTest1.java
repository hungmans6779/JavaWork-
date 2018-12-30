class Father
{
 void undertaking()
 {
  System.out.println("父親的事業");
 }
 int money=1000;
}
class Son extends Father
{}

public class ExtendsTest1
{
 public static void main(String argv[])
 {
  Son s=new Son();
  s.undertaking();
  System.out.println(s.money);
 }
}