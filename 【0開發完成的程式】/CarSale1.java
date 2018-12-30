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
   consumer[i].setName("�� "+(i+1)+" ����O��");
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
 private int hasCarNumber=1000; //�]�w�Ͳ��̦�1000�����l�i�Ѿ��I�ɳf 
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
    	System.out.println("����Ҫ�O���ɶ��O:"+(endTime-startTime)/1000+" ��.");
    	break;
    }
   }	
 	}	
 }	
}	


class BeachHead 
{
 boolean hasCar=true;	
 private int canHaveCar=10; //���I�Үi�ܪ��A�i�H�P�⪺�ثe����
 private int currentCarNumber=10;
 private int safeCarNumber=3; //�]�w���l���w���ƶq�O 3
 public int getCurrentCarNumber()
 {
 	return currentCarNumber;
 }	
  
 //�Ͳ����ʶR���l
 public synchronized void buy(int buyCount)
 {
 	System.out.println("\n==========================�w����{���K�����P����I==========================");
 	System.out.println("�ثe����~���I���i�l�������l�@��: "+getCurrentCarNumber()+" �����l");
 	System.out.println(Thread.currentThread().getName()+"���O�̩ҭn�ʶR���ƶq�O�G "+buyCount+" �����l");
  notifyAll();
  while(buyCount>currentCarNumber)
  {
   try
   {
   	System.out.println("������������������������������������������������������������������������������");
   	System.out.println(Thread.currentThread().getName()+" �U�ȱz�n�I�ѩ�z�����n�ʶR���ƶq�O :"+buyCount+" ��");
   	System.out.println("�����I���� "+currentCarNumber+" �������z�A�Ѿl�� "+(buyCount-currentCarNumber)+" ��������樮");
   	currentCarNumber=0;
   	System.out.println("���P��ڲ{�s���������A�w�g�V�Ͳ��ӭn�D�ɨ���....");
   	System.out.println("����N�P�z�s���q���z�ӻ⨮�A����.....");
 	  System.out.println("������������������������������������������������������������������������������");
 	  notifyAll();
   	wait();
   }		
   catch(InterruptedException ie) {}
  }	
   currentCarNumber-=buyCount;	
   System.out.println("����"+Thread.currentThread().getName()+" �V�����q�ʶR�F "+buyCount+" �����l");
   System.out.println("�p��������D�A�и򥻤��q�s���A����...");
   System.out.println("�ثe�����I�Ѿl���l�ƶq�O:"+currentCarNumber+" �����l");
   System.out.println("=============================================================================");
   notifyAll();
 }
 

  //�P���I�V�Ͳ��̭n�D�ɨ��l���ƶq
  public synchronized void devolveCar(int hasCarNumber)
  {
   //�p�G�P����I�������p��w���w�s�q(3��)�A�Y�ۥͲ��̭n�D�ɨ�
   //�p�G�S�����ܡA�Ͳ��̶i�Jwait���A.....
 	 while(currentCarNumber>=safeCarNumber) 
   {
 	 try
 	 {
 	 	wait();
 	 }
 	 catch(InterruptedException ie){}		
 	}	
 	currentCarNumber=10; //�Ͳ��̤@���ɨ�����I���ƶq
 	System.out.println("\n������������������������������������������������������������������������������");
 	System.out.println("�Ͳ��̱���P����I���ɳf��A�w�浹�P����I10�����F.....");	
 	System.out.println("�ثe�Ͳ��̪��Ѿl�����ƬO : "+(hasCarNumber-=10)+" ��");
 	System.out.println("������������������������������������������������������������������������������\n");
 	notifyAll();
 }			

}