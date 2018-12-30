import java.util.*;
public class CarSale1
{
 public static void main(String argv[])
 {
  BeachHead bh=new BeachHead();
  Producer producer=new Producer(bh);
  Consumer [] consumer=new Consumer[100];
  for(int i=0;i<consumer.length;i++)
  {
   consumer[i]=new Consumer(bh);
   consumer[i].setName("第 "+(i+1)+" 位消費者");
   consumer[i].start();	
  }	
  producer.setPriority(10);
  producer.start();
 }
}


class Consumer extends Thread
{
 BeachHead bh;	
 public Consumer(BeachHead bh)
 {
 	this.bh=bh;
 }	
 public void run()
 { 	 
 	bh.buy(new Random().nextInt(10)+1);
 }	
}

class Producer extends Thread
{
 BeachHead bh;
 long startTime=0;
 long endTime=0;
 private int hasCarNumber=1000; //設定生產者有1000輛車子可供據點補貨 
 public Producer(BeachHead bh)
 {
 	startTime=new Date().getTime();
  this.bh=bh;	
 }	
 public void run()
 {
 	while(true)
 	{
 	 bh.devolveCar(hasCarNumber);	
   hasCarNumber-=10;
   synchronized(this)
   {
    if(Thread.currentThread().activeCount()<=3)
    {
    	endTime=new Date().getTime();
    	System.out.println("執行所花費的時間是:"+(endTime-startTime)/1000+" 秒.");
    	break;
    }
   }	
 	}	
 }	
}	


class BeachHead 
{
 boolean hasCar=true;	
 private int canHaveCar=10; //據點所展示的，可以銷售的目前車數
 private int currentCarNumber=10;
 private int safeCarNumber=3; //設定車子的安全數量是 3
 public int getCurrentCarNumber()
 {
 	return currentCarNumber;
 }	
  
 //生產者購買車子
 public synchronized void buy(int buyCount)
 {
 	System.out.println("\n==========================歡迎光臨巨匠車輛銷售據點==========================");
 	System.out.println("目前本營業據點中展子中的車子共有: "+getCurrentCarNumber()+" 輛車子");
 	System.out.println(Thread.currentThread().getName()+"消費者所要購買的數量是： "+buyCount+" 輛車子");
  notifyAll();
  while(buyCount>currentCarNumber)
  {
   try
   {
   	System.out.println("◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎");
   	System.out.println(Thread.currentThread().getName()+" 顧客您好！由於您本次要購買的數量是 :"+buyCount+" 輛");
   	System.out.println("本據點先交 "+currentCarNumber+" 輛車給您，剩餘的 "+(buyCount-currentCarNumber)+" 輛車近期交車");
   	currentCarNumber=0;
   	System.out.println("本銷售據現存車輛不足，已經向生產商要求補車中....");
   	System.out.println("近期將與您連絡通知您來領車，謝謝.....");
 	  System.out.println("◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎");
 	  notifyAll();
   	wait();
   }		
   catch(InterruptedException ie) {}
  }	
   currentCarNumber-=buyCount;	
   System.out.println("謝謝"+Thread.currentThread().getName()+" 向本公司購買了 "+buyCount+" 輛車子");
   System.out.println("如有任何問題，請跟本公司連絡，謝謝...");
   System.out.println("目前本據點剩餘車子數量是:"+currentCarNumber+" 輛車子");
   System.out.println("=============================================================================");
   notifyAll();
 }
 

  //銷售點向生產者要求補車子的數量
  public synchronized void devolveCar(int hasCarNumber)
  {
   //如果銷售據點的車輛小於安全庫存量(3輛)，即自生產者要求補車
   //如果沒有的話，生產者進入wait狀態.....
 	 while(currentCarNumber>=safeCarNumber) 
   {
 	 try
 	 {
 	 	wait();
 	 }
 	 catch(InterruptedException ie){}		
 	}	
 	currentCarNumber=10; //生產者一次補足到據點的數量
 	System.out.println("\n★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
 	System.out.println("生產者接到銷售據點的補貨單，已交給銷售據點10部車了.....");	
 	System.out.println("目前生產者的剩餘車輛數是 : "+(hasCarNumber-=10)+" 輛");
 	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
 	notifyAll();
 }			

}