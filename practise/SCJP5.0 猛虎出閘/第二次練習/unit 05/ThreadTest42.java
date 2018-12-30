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
  System.out.println("T1的優先權是:"+t1.getPriority());
  t2.setPriority(1);
  t2.start();
  System.out.println("T2的優先權是:"+t2.getPriority());
  t3.setPriority(10);
  t3.start();
  System.out.println("T3的優先權是:"+t3.getPriority());
  System.out.println("現在的執行緒有 : "+Thread.activeCount()+" 條");
 }
 public void run()
 {
 	for(int i=1;i<=9;i++)
 	{
 	 System.out.println("現在執行緒名稱:"+Thread.currentThread().getName()+" : "+i);	
 	}	
 }
}