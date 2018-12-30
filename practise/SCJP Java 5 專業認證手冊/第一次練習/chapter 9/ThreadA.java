public class ThreadA
{
 public static void main(String argv[])
 {
  ThreadB b=new ThreadB();
  b.start();
  synchronized(b)
  {
   try
   {
 	 	System.out.println("����ThreadB �����u�@.....");
 		b.wait();
 	 }
 	 catch(InterruptedException ie)
 	 { }
  }	
  System.out.println("total = "+b.total);
 }
}

class ThreadB extends Thread
{
 int total;
 public void run()
 {
 	synchronized(this)
 	{
 	 for(int i=0;i<=100;i++)
 	 {
 	  total+=i;	
 	 }
 	 notify();		
 	}
 	
 }	
}
