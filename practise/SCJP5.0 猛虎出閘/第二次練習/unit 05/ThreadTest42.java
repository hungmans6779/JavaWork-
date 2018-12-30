public class ThreadTest42 implements Runnable
{
 public static void main(String argv[])
 {
  ThreadTest42 r1=new ThreadTest42();
  ThreadTest42 r2=new ThreadTest42();
  ThreadTest42 r3=new ThreadTest42();
  Thread t1=new Thread(r1,"T1");
  Thread t2=new Thread(r2,"T2");
  Thread t3=new Thread(r3,"T3");
  t1.setPriority(5);
  t1.start();
  System.out.println("T1���u���v�O:"+t1.getPriority());
  t2.setPriority(1);
  t2.start();
  System.out.println("T2���u���v�O:"+t2.getPriority());
  t3.setPriority(10);
  t3.start();
  System.out.println("T3���u���v�O:"+t3.getPriority());
  System.out.println("�{�b��������� : "+Thread.activeCount()+" ��");
 }
 public void run()
 {
 	for(int i=1;i<=9;i++)
 	{
 	 System.out.println("�{�b������W��:"+Thread.currentThread().getName()+" : "+i);	
 	}	
 }
}