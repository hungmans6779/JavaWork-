public class ThreadsExample4 implements Runnable
{
 public static void main(String argv[])
 {
 	ThreadsExample4 te=new ThreadsExample4();
  Thread t1=new Thread(te);
  Thread t2=new Thread(te);
  Thread t3=new Thread(te);
  Thread t4=new Thread(te);
  Thread t5=new Thread(te);
  t1.start();
  t2.start();
  t3.start();
  t4.start();
  t5.start();
 }
 private int i=0;
 public void run()
 {
 	while(i<20)
 	{
 	 synchronized(this)
 	 {	
 	  i++;
 	  for(int j=0;j<999999;j++);
 	  System.out.println(Thread.currentThread().getName()+":"+i);	
 	 }	
 	}	
 }	
}