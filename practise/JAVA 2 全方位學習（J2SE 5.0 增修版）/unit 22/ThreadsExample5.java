class ThreadsExample5
{
 public static void main(String argv[])
 {
  Storage s=new Storage(5);
  Producer p1=new Producer("Producer1",s);
  Producer p2=new Producer("Producer2",s);
  Consumer c1=new Consumer("Consumer1",s); 
  p1.start();
  p2.start();
  c1.start();
 }
}

//生產者
class Producer extends Thread
{
 String name;	
 Storage s;
 public Producer(String name,Storage s)
 {
 	this.name=name;
 	this.s=s;
 }		
 public void run()
 {
 	while(true)
 	{
 	 s.add(name);
 	 try
 	 {
 	  Thread.sleep((int)Math.random()*3000);	
 	 }	
 	 catch(InterruptedException ie)
 	 {
 	  ie.printStackTrace();	
 	 }
 	}	
 }	
}


//顧客
class Consumer extends Thread
{
 String name;
 Storage s;	
 public Consumer(String name,Storage s)
 {
 	this.name=name;
 	this.s=s;
 }		
 public void run()
 {
 	while(true)
 	{
 	 s.del(name);		
   try
 	 {
 	  Thread.sleep((int)Math.random()*3000);
 	 }	
   catch(InterruptedException ie)
   {
 	  ie.printStackTrace();	
   }
  } 	 	
 }	
}

//倉庫
class Storage
{
 private int size;
 private int count;
 public Storage(int n)
 {
  size=n;	
 }	
 public synchronized void add(String n)
 {
 	while(count==size)
 	{
 	 try
 	 {
 	 	this.wait();
 	 }
 	 catch(InterruptedException ie)
 	 {
 	  ie.printStackTrace();	
 	 }	
 	}
 	this.notify();
 	count++;
 	System.out.println(n+" make data count ： "+count);
 }
 
 public synchronized void del(String n)
 {
 	while(count==0)
 	{
 	 try
 	 {
 	 	this.wait();
 	 }
 	 catch(InterruptedException ie)
 	 {
 	 	ie.printStackTrace();
 	 }		 	
 	}
 	this.notify();
 	count--;
 	System.out.println(n+" use data count ： "+count);
 		
 }		
	
	
}			