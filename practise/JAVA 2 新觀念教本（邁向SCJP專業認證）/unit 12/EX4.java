public class EX4
{
 public static void main(String argv[]) throws InterruptedException
 {
  JoinTest jt=new JoinTest();
  jt.start();
  System.out.println("jt�w�g�Ұ�");
  jt.join();
  System.out.println("\njt�w����...........");
 }
}

class JoinTest extends Thread
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