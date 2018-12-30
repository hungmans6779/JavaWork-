public class EX9
{
 public static void main(String argv[])
 {
  Dish 盤子=new Dish();
  Putter 媽媽=new Putter(盤子);
  Take 小強=new Take(盤子);
  Thread t1=new Thread(媽媽);
  Thread t2=new Thread(小強);
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
 	System.out.println("放置第 "+n+" 個餅乾 ");
 	notify();
 }
 public synchronized int take() throws InterruptedException 
 {
 	while(!available)
 	{
 	 wait();	
 	}	
 	available=false;
 	System.out.println("拿走第 "+cakeNum+" 個餅乾");
 	notify();
 	return cakeNum;
 	
 }			
}	