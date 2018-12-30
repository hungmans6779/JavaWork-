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

public class AccountTest2_1 implements Runnable
{
 static Account acc;	
 public static void main(String argv[])
 {
 	acc=new Account(10000);
 	System.out.println("�ثe�p�����b�ᦳ : "+acc.checkMoney()+" ��");
 	AccountTest2_1 c1=new AccountTest2_1();
 	AccountTest2_1 c2=new AccountTest2_1();
 	Thread t1=new Thread(c1,"�p��");
 	Thread t2=new Thread(c2,"�p��������");
 	t1.start();
 	t2.start();
 	try
 	{
 	 t1.join();
 	 t2.join();
 	}
 	catch(InterruptedException iee)
 	{} 
 	System.out.println("�b��u��ҳѾl�� : "+acc.checkMoney()); 
 }		
	
 public void run()
 {
 	for(int i=0;i<3;i++)
 	{
 	 //int money=(int)(Math.random()*3000);
 	 int money=4000;
   getMoney(acc,money);	
  } 
 	
 }
 public static synchronized void getMoney(Account acc,int money)
 {
 	if(money<=acc.checkMoney())
 	{
 		System.out.println("=========================================================================");
 		System.out.println(Thread.currentThread().getName()+" �����n���ڪ����B�� :"+money+"���A���b�T�{����b�ᤤ.....");
 		System.out.println("�t�Υ��b�ˬd�b�ᤤ�����B............");
 		try
 		{ Thread.sleep(2000);	}
 		catch(InterruptedException ieee) {}	
 		System.out.println("�b��{�b�i�Ϊ��B�� : "+acc.checkMoney()+" ��");
 		try
 		{
 		 Thread.sleep(5000);	
 		}	
 		catch(InterruptedException ie){}
 		acc.setMoney(acc.checkMoney()-money);
 		System.out.println(Thread.currentThread().getName()+" ����F "+money+" ��");
 		System.out.println("�ثe�b��ҳѾl�B�� :"+acc.checkMoney()+" ��");
 		System.out.println(Thread.currentThread().getName()+" ���\�������������...");
 		
 	}
 	else
 	{
 	 System.out.println("========================================================");	
 	 System.out.println("�ѩ�b����B�� : "+acc.checkMoney()+ Thread.currentThread().getName()+" �L�k���� "+money+" ��");
 	 System.out.println(Thread.currentThread().getName()+" �����������");
 	}			
 }	

}