public class WaitNotifyTest1
{
 public static void main(String argv[])
 {
  One one=new One();
  one.start();
  synchronized(one)
  {
   System.out.print("one �i�Jwait pool +( "+Thread.currentThread().getName()+" )\n");
   try
   {
   	one.wait();
   }	
   catch(InterruptedException ie)
   { }
   System.out.println("one ���}wait pool +( "+Thread.currentThread().getName()+" )\n");
  }
 }
}

class One extends Thread
{
 public void run()
 {
  synchronized(this)
  {
   System.out.print("�I�snotify() +( "+Thread.currentThread().getName()+" )\n");
   notify();
   System.out.print("notify() �I�s�����I+( "+Thread.currentThread().getName()+" )\n");
  }
 }
}