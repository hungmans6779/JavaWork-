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
 	synchronized(account)
 	{
   account.withDraw(account,withdrawMoney);
  } 
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
  	 System.out.println(tName+" 開始提款...");
 	 double tmpMoney=balance;
 	 for(double i=0;i<99999999;i++);
 	 tmpMoney=balance-withdrawMoney;
  	if(tmpMoney<0)
  	{
  	 System.out.println("==================");
  	 System.out.println("帳戶餘不足!");
  	 System.out.println("==================");
  	}
  	else
 	  {
  	 balance=tmpMoney;	
  	}	

 	System.out.println("列印交易清單:\n"+"欲提領金額: "+withdrawMoney+" 元,"+
 	                    "帳戶餘額: "+account.checkMoney()+" 元.");
 	System.out.println(tName+"完成提款.....");
 	System.out.println("==================\n");
 	
 }	
 public double checkMoney()
 {
 	return balance;
 }	
}

public class MagicMachineTest22
{
 public static void main(String argv[])
 {
  Account ac=new Account(10000);
  System.out.println("帳戶原始金額為:"+ac.checkMoney()+" 元.");
  WithDraw s1=new WithDraw(ac,2000);
  WithDraw s2=new WithDraw(ac,4000);
  WithDraw s3=new WithDraw(ac,5000);
  Thread t1=new Thread(s1,"T1");
  Thread t2=new Thread(s2,"T2");
  Thread t3=new Thread(s3,"T3");
  t1.setPriority(10);
  t2.setPriority(5);
  t3.setPriority(1);
  t1.start();
  t2.start();
  t3.start();
 }
}