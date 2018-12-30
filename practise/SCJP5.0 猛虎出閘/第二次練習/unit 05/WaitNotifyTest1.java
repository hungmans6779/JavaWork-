public class WaitNotifyTest1
{
 public static void main(String argv[])
 {
  One one=new One();
  one.start();
  synchronized(one)
  {
   System.out.print("one 進入wait pool +( "+Thread.currentThread().getName()+" )\n");
   try
   {
   	one.wait();
   }	
   catch(InterruptedException ie)
   { }
   System.out.println("one 離開wait pool +( "+Thread.currentThread().getName()+" )\n");
  }
 }
}

class One extends Thread
{
 public void run()
 {
  synchronized(this)
  {
   System.out.print("呼叫notify() +( "+Thread.currentThread().getName()+" )\n");
   notify();
   System.out.print("notify() 呼叫完畢！+( "+Thread.currentThread().getName()+" )\n");
  }
 }
}