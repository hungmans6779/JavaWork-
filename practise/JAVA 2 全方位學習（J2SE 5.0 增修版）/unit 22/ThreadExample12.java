class ThreadExample12 implements Runnable
{
 public static void main(String argv[])
 {
 	new ThreadExample12();
 }		
 public ThreadExample12()
 {
 	
 	Thread t1=new Thread(this);
 	t1.setName("Thread1");
 	Thread t2=new Thread(this);
 	t2.setName("Thread2");
 	Thread t3=new Thread(this);
 	t3.setName("Thread3");
 	t1.start();
 	t2.start();
 	t3.start();
 }	
 public void run()
 {
 	for(int i=1;i<999;i++)
 	{
 	 System.out.println(Thread.currentThread().getName()+" Hello "+i);
 	}	
 }	
 
 
	
}