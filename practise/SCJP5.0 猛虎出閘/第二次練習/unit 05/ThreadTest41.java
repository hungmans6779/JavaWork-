public class ThreadTest41 implements Runnable
{
 public static void main(String argv[])
 {
  ThreadTest41 r1=new ThreadTest41();
  ThreadTest41 r2=new ThreadTest41();
  Thread t1=new Thread(r1,"T1");
  Thread t2=new Thread(r2,"T2");
  t1.start();
  t2.start();
  System.out.println("�{�b��������� : "+Thread.activeCount()+" ��");
 }
 public void run()
 {
 	for(int i=1;i<=10;i++)
 	{
 	 System.out.println("�{�b������W��:"+Thread.currentThread().getName()+" : "+i);	
 	 System.out.println(Thread.currentThread().getName()+"����������A:"+Thread.currentThread().isAlive());
 	}	
 	//System.out.println(Thread.currentThread().getName()+"����������A:"+Thread.currentThread().isAlive());
 }

 
	
}