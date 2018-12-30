public class EX4_2
{
 public static void main(String argv[]) throws InterruptedException
 {
  final JoinTest jt=new JoinTest();
  Thread tt=new Thread()
  {
   public void run()
   {
    jt.run();
   }
  };
  tt.start();
  System.out.println("jt已經啟動");
  tt.join();
  System.out.println("\njt已停止...........");
 }
}

class JoinTest implements Runnable
{
 public void run()
 {
  for(int i=0;i<30;i++)
  {
   try
   {
    Thread.sleep(100);
   }
   catch(InterruptedException ie)
   {
    ie.printStackTrace();
   }
   System.out.print("0");
  }
 }
}