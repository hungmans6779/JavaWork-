class Father
{
 void undertaking()
 {
  System.out.println("���˪��Ʒ~");
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