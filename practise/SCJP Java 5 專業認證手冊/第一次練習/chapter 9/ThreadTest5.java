class MyRunnable implements Runnable
{
 public void run()
 {
  for(int i=0;i<100;i++)
  {
   try
   { Thread.sleep(1000); }
   catch(InterruptedException ie)
   { }
   if(i%10 == 0)
   {
    System.out.println("����F�� "+(i/10)+" ��");
   }
  }
 }
}

public class ThreadTest5
{
 public static void main(String argv[])
 {
  MyRunnable r=new MyRunnable();
  Thread t=new Thread(r);
  t.start();
 }

}