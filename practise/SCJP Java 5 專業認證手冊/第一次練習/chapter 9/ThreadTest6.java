public class ThreadTest6 extends Thread
{
 ThreadTest6()
 {
 	super();
 }		
 ThreadTest6(Thread t)
 {
 	super(t);
 }	
 public static void main(String argv[])
 {
  ThreadTest6 t1=new ThreadTest6();
  ThreadTest6 t2=new ThreadTest6(t1);
  t1.start();
 }
 public void run()
 {
 	for(int i=0;i<3;i++)
 	{
 	 System.out.print(i+"\t");	
 	}	
 }	
}