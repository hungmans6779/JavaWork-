public class EX4_3 extends Thread
{
 public static void main(String argv[]) throws InterruptedException
 {
  EX4_3 tt=new EX4_3();
  tt.start();
  System.out.println("jt�w�g�Ұ�");
  tt.join();
  System.out.println("\njt�w����...........");
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
