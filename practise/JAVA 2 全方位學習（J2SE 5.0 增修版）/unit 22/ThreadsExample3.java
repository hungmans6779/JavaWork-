public class ThreadsExample3 implements Runnable
{
 public static void main(String argv[])
 {
 	ThreadsExample3 te=new ThreadsExample3();
  Thread t1=new Thread(te);
  Thread t2=new Thread(te);
  t1.start();
  t2.start();
 }
 int i=0;
 public void run()
 {
 	while(i<10)
 	{
 	 i++;
 	 for(int j=0;j<99999999;j++);
 	 System.out.println(Thread.currentThread().getName()+":"+i);	
 		
 	}	
 	
 }	
}