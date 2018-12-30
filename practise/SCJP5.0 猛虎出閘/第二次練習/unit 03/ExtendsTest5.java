class Father
{
 public int money=8000000;
 public void undertaking()
 {
  System.out.println("父親的事業");
 }
}

class Son extends Father
{
 public int money;
 Son(int money)
 {
  setMoney(money);
 }
 public void setMoney(int money)
 {
  this.money=money;
 }
 public void undertaking()
 {
  System.out.println("兒子的事業");
 }
 public void go()
 {
  undertaking();
  System.out.println("市值: "+money);
  System.out.println("======================");
  super.undertaking();
  System.out.println("市值: "+super.money);
 }
}

public class ExtendsTest5
{
 public static void main(String argv[])
 {
 	new Son(500000).go();
 }		
}