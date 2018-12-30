public class ThreadsExample15
{
 public static void main(String argv[])
 {
 	Hello3 h3=new Hello3("Thread 1");
 	h3.start();
 	
 	Thread t2=new Thread(new Hello4("Thread 2"));
 	t2.start();
 }		
	
}	

class Hello3 extends Thread
{
 private String name;
 public Hello3(String n)
 {
 	name=n;
 }		
 public void run()
 {
 	for(int i=0;i<1000;i++)
 	{
 	 System.out.println(name+" Hello "+i);	
 	 Thread.yield();
 	}	
 }
}	

class Hello4 implements Runnable
{
 private String name;
 public Hello4(String n)
 {
 	name=n;
 }		
 public void run()
 {
 	for(int i=0;i<1000;i++)
 	{
 	 System.out.println(name+" Hello "+i);	
 	}	
 }	
}	