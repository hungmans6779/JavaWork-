public class Encapsulation
{
 public static void main(String argv[])
 {
  MyAccount my=new MyAccount();
  my.setMoney(1000);
  System.out.println("�ڱo��F : "+my.getMoney());
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