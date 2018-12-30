public class ThreadTest3 extends Thread
{
 public static void main(String argv[])
 {
 	ThreadTest3 t=new ThreadTest3();
 	t.start();
 }		
 public void run()
 {
  for(int i=0;i<10;i++)
  {
   System.out.println("°õ¦æºü¦WºÙ:"+Thread.currentThread().getName()); 
  }
 }
}