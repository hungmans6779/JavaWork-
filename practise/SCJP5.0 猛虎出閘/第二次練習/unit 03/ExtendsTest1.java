class Father
{
 public int money=999999999;
 public void undertaking()
 {
  System.out.println("父親的事業");
 }
}

class Son extends Father{ }

public class ExtendsTest1
{
 public static void main(String argv[])
 {
  Son son=new Son();
  son.undertaking();
  System.out.println("金額: "+son.money);
 }
}