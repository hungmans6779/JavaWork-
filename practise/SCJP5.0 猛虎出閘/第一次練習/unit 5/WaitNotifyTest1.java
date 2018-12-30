class One extends Thread
{
 public void run()
 {
  synchronized(this)
  {
   String name=Thread.currentThread().getName();
   System.out.println("�I�snotify()  ("+name+ ")");
   notify();
   System.out.println("notify()�I�s����  ("+name+")");
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
  System.out.println("one �i�Jwait pool��  ("+name+")");
  synchronized(one)
  {
   try
   {
    one.wait();
   }
   catch(InterruptedException ie)
   {
   
   }
   System.out.println("one���}wait pool  ("+name+")");
  
  } 
 }


}