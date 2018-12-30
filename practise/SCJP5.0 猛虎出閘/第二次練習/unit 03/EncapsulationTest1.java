public class EncapsulationTest1
{
 public static void main(String argv[])
 {
  MyAccount m=new MyAccount();
  m.setMoney(10000);
  System.out.println("Money= "+m.getMoney());
 }
}

class MyAccount
{
 private int money;
 public void setMoney(int money)
 {
  this.money=money;
 }
 public int getMoney()
 {
  return money;
 }
}