public class ThreadsExample2 implements Runnable
{
 public static void main(String argv[])
 {
  Thread t1=new Thread(new ThreadsExample2());
  Thread t2=new Thread(new ThreadsExample2());
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