public class ThreadTest32 extends Thread
{
 public static void main(String argv[])
 {
 	ThreadTest32 t1=new ThreadTest32();
 	ThreadTest32 t2=new ThreadTest32();
 	t1.setName("T1");
 	t2.setName("T2");
 	t1.start();
 	t2.start();
 	System.out.println("�{�b���������: "+Thread.activeCount()+" ��");

 }		
 public void run()
 {
  for(int i=1;i<=99;i++)
  {
   System.out.println("������W��:"+Thread.currentThread().getName()+" : "+i); 
  }
 }
}