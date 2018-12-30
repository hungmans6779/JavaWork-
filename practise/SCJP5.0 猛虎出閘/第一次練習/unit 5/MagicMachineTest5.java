class AccountMoney implements Runnable
{
 private static double totalMoney;
 private double lastMoney;
 private String name;
 private double money;
 public AccountMoney(double totalMoney)
 {
  this.totalMoney=totalMoney;
 }
 public AccountMoney(String name,double money)
 {
  this.name=name;
  this.money=money; 
 }
 
 public void run()
 {
  System.out.println(name+" 開始提款了......");
  synchronized(this)
  {
   if(totalMoney>=money)
   {
    lastMoney=totalMoney-money;
    totalMoney=lastMoney;
   }  
   else
   {
    System.out.println("====================");
    System.out.println("餘額不足..........");
    System.out.println("====================");
    lastMoney=totalMoney;
   }
  }
  System.out.println("列印交易明細:");
  System.out.println("欲提領金額 : "+money+" 元，帳戶餘額 :"+lastMoney);
  System.out.println(name+" 交易完成..............");
 }
}

public class MagicMachineTest5
{
 public static void main(String argv[])
 {
  AccountMoney ac=new AccountMoney(10000);
  Thread t1=new Thread(new AccountMoney("T1",5000));
  Thread t2=new Thread(new AccountMoney("T2",2000));
  Thread t3=new Thread(new AccountMoney("T3",4000));
  t1.start();
  t2.start();
  t3.start();
 }
}