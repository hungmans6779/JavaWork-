class MyRunnable implements Runnable
{
 public void run()
 {
  for(int i=0;i<6;i++)
   System.out.println("Thread �w�g�ҰʤF "+(i+1)+" ��");
 }
}

public class ThreadTest1 
{
 public static void main(String argv[])
 {
  MyRunnable r=new MyRunnable();
  Thread t=new Thread(r);
  t.start();
 }
}