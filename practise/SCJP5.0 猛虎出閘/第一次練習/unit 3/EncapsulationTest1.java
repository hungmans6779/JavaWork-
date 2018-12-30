class Account
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

public class EncapsulationTest1
{
 public static void main(String argv[])
 {
  Account a=new Account();
  a.setMoney(10000);
  System.out.println(a.getMoney());
 }
}