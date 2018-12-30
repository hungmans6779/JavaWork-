public class EXAME14_1 implements Runnable
{
 public static void main(String argv[])
 {
 	new Thread(new EXAME14_1()).start();
 }
 public void run()
 {
  waitForSignal();	
 }			
 void waitForSignal()
 {
  Object obj=new Object();
  try
  {
   obj.wait();
   obj.notify();
  }
  catch(InterruptedException ie)
  {
   ie.printStackTrace();		 
  }
 }
}