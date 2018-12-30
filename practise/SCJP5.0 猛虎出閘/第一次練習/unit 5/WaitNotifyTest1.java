class One extends Thread
{
 public void run()
 {
  synchronized(this)
  {
   String name=Thread.currentThread().getName();
   System.out.println("呼叫notify()  ("+name+ ")");
   notify();
   System.out.println("notify()呼叫完畢  ("+name+")");
  }
 }
}


public class WaitNotifyTest1
{
 public static void main(String argv[])
 {
  One one=new One();
  one.start();
  String name=Thread.currentThread().getName();
  System.out.println("one 進入wait pool中  ("+name+")");
  synchronized(one)
  {
   try
   {
    one.wait();
   }
   catch(InterruptedException ie)
   {
   
   }
   System.out.println("one離開wait pool  ("+name+")");
  
  } 
 }


}