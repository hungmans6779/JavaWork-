class Father
{
 int money=80000;
 void undertaking()
 {
  System.out.println("父親的事業");
 }
}
class Son extends Father
{
 private int money;
 public Son(int money)
 {
  setMoney(money);
 }
 private void setMoney(int money)
 {
  this.money=money;
 }
 void undertaking()
 {
  System.out.println("兒子的事業");
 }
 void go()
 {
  System.out.println("兒子的錢= "+money);
  undertaking();
  System.out.println("=======================");
  System.out.println("父親的錢= "+super.money);
  super.undertaking();
 }
}
public class ExtendsTest5 
{
 public static void main(String argv[])
 {
  new Son(50000).go();	
 }	
}