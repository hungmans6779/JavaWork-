public class EXAME9_14
{
 public static void main(String argv[])
 {
  Thread t=new MyThread()
  {
   public void run()
   {
    System.out.print(" foo");	
   }	
  };
  t.start();	
 }
}
class MyThread extends Thread
{
 MyThread()
 {
  System.out.print("MyThread"); 	
 }	
 public void run()
 {
  System.out.print(" bar");	
 }	
 public void run(String s)
 {
  System.out.print(" bar");	
 }	
}