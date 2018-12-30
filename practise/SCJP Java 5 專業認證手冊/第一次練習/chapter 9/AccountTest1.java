class Account
{
 private int totalMoney;
 Account(int totalMoney)
 {
  this.totalMoney=totalMoney;
 }
 public int checkMoney()
 {
  return totalMoney;
 }
 public void  setMoney(int money)
 {
 	totalMoney=money;
 }	
}

public class AccountTest1 implements Runnable
{
 static Account acc;	
 public static void main(String argv[])
 {
 	acc=new Account(10000);
 	System.out.println("目前小明的帳戶有 : "+acc.checkMoney()+" 元");
 	AccountTest1 c1=new AccountTest1();
 	AccountTest1 c2=new AccountTest1();
 	Thread t1=new Thread(c1,"小明");
 	Thread t2=new Thread(c2,"小明的媽媽");
 	t1.start();
 	t2.start();
 }		
 public void run()
 {
 	for(int i=0;i<10;i++)
 	{
 	 int money=(int)(Math.random()*3000);
   getMoney(acc,money);	
  } 
 	
 }
 public static void getMoney(Account acc,int money)
 {
 	if(money<=acc.checkMoney())
 	{
 		System.out.println("=========================================================================");
 		System.out.println(Thread.currentThread().getName()+" 本次要提款的金額為 :"+money+"元，正在確認提領帳戶中.....");
 		System.out.println("系統正在檢查帳戶中的金額............");
 		try
 		{ Thread.sleep(2000);	}
 		catch(InterruptedException ieee) {}	
 		System.out.println("帳戶現在可用金額為 : "+acc.checkMoney()+" 元");
 		acc.setMoney(acc.checkMoney()-money);
 		System.out.println(Thread.currentThread().getName()+" 提領了 "+money+" 元");
 		System.out.println("目前帳戶所剩餘額為 :"+acc.checkMoney()+" 元");
 		System.out.println(Thread.currentThread().getName()+" 成功完成本次的交易...");
 		
 	}
 	else
 	{
 	 System.out.println("========================================================");	
 	 System.out.println("由於帳戶金額剩 : "+acc.checkMoney()+ Thread.currentThread().getName()+" 無法提領 "+money+" 元");
 	 System.out.println(Thread.currentThread().getName()+" 本次交易失敗");
 	}			
 }	

}