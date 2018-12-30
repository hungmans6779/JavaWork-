public class EX4_4 implements Runnable
{
 public static void main(String argv[]) throws InterruptedException
 {
  EX4_4 jt=new EX4_4();
  Thread tt=new Thread(jt);
  tt.start();
  System.out.println("jt已經啟動");
  tt.join();
  System.out.println("\njt已停止...........");
 }
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
