class ThreadsExample51
{
 public static void main(String argv[])
 {
  Storage51 s=new Storage51(5);
  Producer51 p1=new Producer51("Producer1",s);
  p1.setName("Producer1");
  Producer51 p2=new Producer51("Producer2",s);
  p2.setName("Producer2");
  Consumer51 c1=new Consumer51("Consumer1",s); 
  c1.setName("Consumer1");
  p1.start();
  p2.start();
  c1.start();
 }
}

//生產者
class Producer51 extends Thread
{
 String name;	
 Storage51 s;
 public Producer51(String name,Storage51 s)
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
class Consumer51 extends Thread
{
 String name;
 Storage51 s;	
 public Consumer51(String name,Storage51 s)
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
class Storage51
{
 private int size;
 private int count;
 public Storage51(int n)
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
 	//System.out.println(n+" make data count ： "+count);
 	System.out.println(Thread.currentThread().getName()+" make data count ： "+count);
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
 	//System.out.println(n+" use data count ： "+count);
 	System.out.println(Thread.currentThread().getName()+" use data count ： "+count);
 }			
}			