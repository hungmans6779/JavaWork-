class MyRunnable extends Thread
{
 MyRunnable(String s)
 {
  super(s);
 }
 public void run()
 {
 	for(int k=0;k<3;k++)
 	{ 	
 	 try
 	 {Thread.sleep(2000);}
 	 catch(InterruptedException ie)
 	 {}		
   synchronized(this)
   {
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<100;i++)
    {
     sb.append(Thread.currentThread().getName());
    }
    System.out.println(Thread.currentThread().getName()+" : "+sb);
    System.out.println("===================================================================================\n");
   }
  }
 }
}
public class SynchronizedTest2
{
 public static void main(String argv[])
 {
   MyRunnable t1=new MyRunnable("A");
   MyRunnable t2=new MyRunnable("B");
   MyRunnable t3=new MyRunnable("C");
   t1.start();
   t2.start();
   t3.start();
 }
}