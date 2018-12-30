import java.util.*;
public class CarSale
{
 public static void main(String argv[])
 {	
  BeachHead bh=new BeachHead(); 	
  Consumer consumer=new Consumer(bh);
  Producer producer=new Producer(bh);
  consumer.start();
  producer.start();
 } 
}


//消費者類別
class Consumer	extends Thread
{
 BeachHead bh;
 public Consumer(BeachHead bh)
 {
  this.bh=bh;	
 }
 public void run()
 {
 	for(int i=1;i<=100;i++) //設定有100個消費者
 	{
 	 int randomNumber=new Random().nextInt(5)+1;	
 	 System.out.println("\n=======================歡迎光臨巨匠車輛銷售據點=======================");
 	 System.out.println("目前本營業據點中展子中的車子共有: "+bh.getCurrentCarNumber()+" 輛");
 	 System.out.println("第 "+i+" 位消費者所要購買的數量是： "+randomNumber+" 輛");
 	 bh.buy(randomNumber,i);	
 	}	
 }			
	
}

//生產者類別 
class Producer extends Thread	
{
 private int carNumber=1000; //生產者目前的車子庫存數量	
 BeachHead bh;
 public Producer(BeachHead bh)
 {
 	this.bh=bh;
 }		
 public int getCarNumber()
 {
 	return carNumber;
 }	
 public void delCar(int count)
 {
  carNumber-=count;	
 }	
 public void run()
 {
 	for(int i=0;i<100;i++)
 	{
 	 bh.devolveCar();
 	}	
 }	
	
}


//據點
class BeachHead 	
{
 private int canHaveCar=10; //據點所展示的，可以銷售的目前車數
 private int currentCarNumber=10;
 private int safeCarNumber=3; //設定車子的安全數量是 3

 public int getCurrentCarNumber()
 {
 	return currentCarNumber;
 }	
  //消費者目前所訂購的車子數量 
 public  synchronized void buy(int buyCar,int i)
 {
  //while( (buyCar>currentCarNumber)||(currentCarNumber<=safeCarNumber) )  //判斷目前據點車子數量是否小於消費者所購買的數量時
  while(buyCar>currentCarNumber)  //判斷目前據點車子數量是否小於消費者所購買的數量時
  {
   try
   {
   	System.out.println("目前銷售據點車子數量不足，正向生產者要求補車中，請消費者等候通知領車.....");
   	wait();  //消費者購買車子已超過本據點的車子安全數量，所有消費者等待，等據點向生產者要求補貨
   }
   catch (InterruptedException ie){}
  }	
   currentCarNumber-=buyCar; //計算出消費者本次購買後，據點所剩餘的車子數量
   System.out.println("謝謝第 "+i+" 位消者本次的購買...請有任何問題，跟本公司連絡，謝謝...");
   System.out.println("目前本營業據點中展子中的車子剩餘數量是： "+currentCarNumber+" 輛");
   notifyAll();
 }
 //銷售點向生產者要求補車子的數量
 public synchronized void devolveCar()
 {
 	while(currentCarNumber>safeCarNumber)
 	{
 	 try
 	 {
 	 	wait();
 	 }
 	 catch(InterruptedException ie){}		
 	}	
 	currentCarNumber=10; //生產者一次補足到據點的數量
 	notifyAll();
 }		
	
}	