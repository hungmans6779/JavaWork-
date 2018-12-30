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


//���O�����O
class Consumer	extends Thread
{
 BeachHead bh;
 public Consumer(BeachHead bh)
 {
  this.bh=bh;	
 }
 public void run()
 {
 	for(int i=1;i<=100;i++) //�]�w��100�Ӯ��O��
 	{
 	 int randomNumber=new Random().nextInt(5)+1;	
 	 System.out.println("\n=======================�w����{���K�����P����I=======================");
 	 System.out.println("�ثe����~���I���i�l�������l�@��: "+bh.getCurrentCarNumber()+" ��");
 	 System.out.println("�� "+i+" ����O�̩ҭn�ʶR���ƶq�O�G "+randomNumber+" ��");
 	 bh.buy(randomNumber,i);	
 	}	
 }			
	
}

//�Ͳ������O 
class Producer extends Thread	
{
 private int carNumber=1000; //�Ͳ��̥ثe�����l�w�s�ƶq	
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


//���I
class BeachHead 	
{
 private int canHaveCar=10; //���I�Үi�ܪ��A�i�H�P�⪺�ثe����
 private int currentCarNumber=10;
 private int safeCarNumber=3; //�]�w���l���w���ƶq�O 3

 public int getCurrentCarNumber()
 {
 	return currentCarNumber;
 }	
  //���O�̥ثe�ҭq�ʪ����l�ƶq 
 public  synchronized void buy(int buyCar,int i)
 {
  //while( (buyCar>currentCarNumber)||(currentCarNumber<=safeCarNumber) )  //�P�_�ثe���I���l�ƶq�O�_�p����O�̩��ʶR���ƶq��
  while(buyCar>currentCarNumber)  //�P�_�ثe���I���l�ƶq�O�_�p����O�̩��ʶR���ƶq��
  {
   try
   {
   	System.out.println("�ثe�P����I���l�ƶq�����A���V�Ͳ��̭n�D�ɨ����A�Ю��O�̵��Գq���⨮.....");
   	wait();  //���O���ʶR���l�w�W�L�����I�����l�w���ƶq�A�Ҧ����O�̵��ݡA�����I�V�Ͳ��̭n�D�ɳf
   }
   catch (InterruptedException ie){}
  }	
   currentCarNumber-=buyCar; //�p��X���O�̥����ʶR��A���I�ҳѾl�����l�ƶq
   System.out.println("���²� "+i+" ����̥������ʶR...�Ц�������D�A�򥻤��q�s���A����...");
   System.out.println("�ثe����~���I���i�l�������l�Ѿl�ƶq�O�G "+currentCarNumber+" ��");
   notifyAll();
 }
 //�P���I�V�Ͳ��̭n�D�ɨ��l���ƶq
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
 	currentCarNumber=10; //�Ͳ��̤@���ɨ�����I���ƶq
 	notifyAll();
 }		
	
}	