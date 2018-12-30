public class EXAME177
{
 public static void main(String argv[]) throws InterruptedException
 {
  Runnable r=new Runnable()
  {
   public void run()
   {
    try
    {
     Thread.sleep(1000);
    }
    catch(InterruptedException ie)
    {
     System.out.println("interupted");
    }
    System.out.println("ran");
    
   }
  };
  Thread t=new Thread(r);
  t.start();
  System.out.println("started");
  t.sleep(2000);
  System.out.println("interrupting");
  System.out.println(t.interrupted());
  System.out.println("ended");
 }
}