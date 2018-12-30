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
  System.out.println("現在的執行緒有 : "+Thread.activeCount()+" 條");
 }
 public void run()
 {
 	for(int i=1;i<=10;i++)
 	{
 	 System.out.println("現在執行緒名稱:"+Thread.currentThread().getName()+" : "+i);	
 	 System.out.println(Thread.currentThread().getName()+"的執行緒狀態:"+Thread.currentThread().isAlive());
 	}	
 	//System.out.println(Thread.currentThread().getName()+"的執行緒狀態:"+Thread.currentThread().isAlive());
 }

 
	
}