public class ThreadTest4 implements Runnable
{
 public static void main(String argv[])
 {
  ThreadTest4 r1=new ThreadTest4();
  ThreadTest4 r2=new ThreadTest4();
  Thread t1=new Thread(r1,"T1");
  Thread t2=new Thread(r2,"T2");
  t1.start();
  t2.start();
  System.out.println("�{�b��������� : "+Thread.activeCount()+" ��");
 }
 public void run()
 {
 	for(int i=0;i<=99;i++)
 	{
 	 System.out.println("�{�b������W��:"+Thread.currentThread().getName()+" : "+i);	
 	}	
 }	
}