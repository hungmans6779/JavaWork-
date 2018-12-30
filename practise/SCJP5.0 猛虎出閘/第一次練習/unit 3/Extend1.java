class Father1
{
 public int money=1000;
 public void a()
 {
  System.out.println("父親的事業");
 }
}

class Son1 extends Father1
{ }

public class Extend1
{
  public static void main(String argv[])
 {
  Son1 son1=new Son1();
  System.out.println(son1.money);
  son1.a();
 }
}