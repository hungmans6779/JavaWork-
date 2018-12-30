public class ThreadsExample11
{
 public static void main(String argv[])
 {
  Thread t1=new Thread(new Hello3());
  t1.setName("Thread1");
  Thread t2=new Thread(new Hello3());
  t2.setName("Thread2");
  Thread t3=new Thread(new Hello3());
  t3.setName("Thread3");
  t1.start();
  t2.start();
  t3.start();
 }		
}	


class Hello3 implements Runnable
{
 int i=0;
 boolean isStop=false;
 public void run()
 {
 	while(!isStop)
 	{
 	 System.out.println(Thread.currentThread().getName()+" Hello "+i);	
 	 i++;
 	 if(i==1000)
 	 {
 	 	stop();
 	 }	
 	}	
 }	
 public void stop()
 {
 	isStop=true;
 }	
}	