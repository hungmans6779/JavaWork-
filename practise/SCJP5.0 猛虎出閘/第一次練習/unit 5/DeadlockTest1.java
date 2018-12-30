public class DeadlockTest1
{
 public static void main(String argv[])
 {
  final Object res1="resource1";
  final Object res2="resource2";
  Thread t1=new Thread()
  {
   public void run()
   {
    synchronized(res1)
    {
     System.out.println("T1:locked resource 1");
     try
     {
      Thread.sleep(150);
     }
     catch(InterruptedException ie)
     {}
    }
    synchronized(res2)
    {
     System.out.println("T1:locked resource 2");
    }
   }
  };
  
  
  Thread t2=new Thread()
  {
   public void run()
   {
    synchronized(res2)
    {
     System.out.println("T2:locked resource 2");
     try
     {
      Thread.sleep(50);
     }
     catch(InterruptedException ie)
     {}
    }
    synchronized(res1)
    {
     System.out.println("T2:locked resource 1");
    }
   }
  };
  
  t1.start();
  t2.start();
  
 }
}