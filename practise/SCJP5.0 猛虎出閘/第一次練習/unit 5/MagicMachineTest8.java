class WithDraw implements Runnable
{
 private Account account;
 private double withdrawMoney;
 public WithDraw(Account account,double withdrawMoney)
 {
  this.account=account;
  this.withdrawMoney=withdrawMoney;
 }
 public void run()
 {
  account.withDraw(account,withdrawMoney);
 }
}

class Account
{
 private double balance;
 public Account(double balance)
 {
  this.balance=balance;
 }
 public void withDraw(Account account,double withdrawMoney)
 {
  String tName=Thread.currentThread().getName();
  System.out.println(tName+" 開始提款......");
  synchronized(WithDraw.class)
  {
   double tmBalance=balance;
   for(double delay=0;delay<99999;delay++)
   {}
   tmBalance=tmBalance-withdrawMoney;
   if(tmBalance<0)
   {
    System.out.println("----------------------");
    System.out.println(" 帳戶餘額不足！！！");
    System.out.println("----------------------");
   }
   else
   {
    balance=tmBalance;
   }
  } 
  System.out.println("列印交易明細表: ");
  System.out.println("欲提款金額: "+withdrawMoney+ "元"+"帳戶餘額 :"+account.checkAccount());
  System.out.println(tName+" 完成交易.............");
  System.out.println("====================================");
 }
 public double checkAccount()
 {
  return balance;
 }
}

public class MagicMachineTest8
{
 public static void main(String argv[])
 {	
  Account ac=new Account(10000);
  System.out.println("帳戶的原始金額: "+ac.checkAccount()+" 元");
  WithDraw w1=new WithDraw(ac,5000);
  WithDraw w2=new WithDraw(ac,2000);
  WithDraw w3=new WithDraw(ac,4000);
  Thread t1=new Thread(w1,"T1");
  Thread t2=new Thread(w2,"T2");
  Thread t3=new Thread(w3,"T3");
  t1.start();
  t2.start();
  t3.start();
 }
}
