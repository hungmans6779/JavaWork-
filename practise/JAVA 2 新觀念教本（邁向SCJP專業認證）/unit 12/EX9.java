public class EX9
{
 public static void main(String argv[])
 {
  Dish �L�l=new Dish();
  Putter ����=new Putter(�L�l);
  Take �p�j=new Take(�L�l);
  Thread t1=new Thread(����);
  Thread t2=new Thread(�p�j);
  t1.start();
  t2.start();
 }
}
class Putter implements Runnable
{
 Dish dish;
 Putter(Dish dish)
 {
 	this.dish=dish;
 }		
	public void run()
	{
	 try
	 {
	 	for(int i=1;i<=10;i++)
	 	{
	 	 Thread.sleep((int)Math.random()*1000);
	 	 dish.put(i);	
	 	}	
	 }	
	 catch(InterruptedException ie)
 	 {
 	 	ie.printStackTrace();
 	 }		
	}	
}	

class Take implements Runnable
{
 Dish dish;
 Take(Dish dish)
 {
  this.dish=dish;	
 }		
 public void run()
 {
 	try
 	{
 	 for(int i=1;i<=10;i++)
 	 {
 	  Thread.sleep((int)Math.random());
 	  dish.take();	
 	 }
 	} 
 	catch(InterruptedException ie)
 	{
 	 ie.printStackTrace();
 	}	 		
 }	
}

class Dish 
{
 private boolean available=false;
 private int cakeNum;
 public synchronized void put(int n) throws InterruptedException	
 {
 	while(available)
 	{
 	 wait();	
 	}	
 	cakeNum=n;
 	available=true;
 	System.out.println("��m�� "+n+" �ӻ氮 ");
 	notify();
 }
 public synchronized int take() throws InterruptedException 
 {
 	while(!available)
 	{
 	 wait();	
 	}	
 	available=false;
 	System.out.println("������ "+cakeNum+" �ӻ氮");
 	notify();
 	return cakeNum;
 	
 }			
}	