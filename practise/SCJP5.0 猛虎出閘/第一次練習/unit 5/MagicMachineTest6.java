public class MagicMachineTest6 extends Thread
{
 private static double totalMoney=10000;
 private double lastMoney;
 private double money;
 public MagicMachineTest6(double money)
 {
  this.money=money;
 }
 public static void main(String argv[])
 {
  MagicMachineTest6 t1=new MagicMachineTest6(5000);
  MagicMachineTest6 t2=new MagicMachineTest6(2000);
  MagicMachineTest6 t3=new MagicMachineTest6(4000); 
  t1.setName("T1");
  t2.setName("T2");
  t3.setName("T3");
  t1.start();
  t2.start();
  t3.start();
 }
 
  public void run()
 {
  System.out.println(Thread.currentThread().getName()+" 開始提款了......");
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
  System.out.println(Thread.currentThread().getName()+" 交易完成..............");
 }
}