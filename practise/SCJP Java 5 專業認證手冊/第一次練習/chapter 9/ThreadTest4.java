class Runnablet implements Runnable
{
 public void run()
 {
  for(int i=0;i<4;i++)
  {
   System.out.println(Thread.currentThread().getName()+" is "+i);
   try
   {
    Thread.sleep(1000);
   }
   catch(InterruptedException ie)
   {
    ie.printStackTrace();
   }
  }
 }
}

public class ThreadTest4
{
 public static void main(String argv[])
 {
  System.out.println("¥D°õ¦æºü :"+Thread.currentThread().getName());
  Runnablet r=new Runnablet();
  Thread t1=new Thread(r,"one");
  Thread t2=new Thread(r,"two");
  Thread t3=new Thread(r,"three");
  t1.start();
  t2.start();
  t3.start();
 }

}