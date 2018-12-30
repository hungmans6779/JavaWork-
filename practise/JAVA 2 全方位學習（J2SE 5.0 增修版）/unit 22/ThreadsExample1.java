public class ThreadsExample1
{
 public static void main(String argv[])
 {
 	Hello1 h1=new Hello1("Thread 1");
 	h1.start();
 	
 	Thread t2=new Thread(new Hello2("Thread 2"));
 	t2.start();
 }		
	
}	

class Hello1 extends Thread
{
 private String name;
 public Hello1(String n)
 {
 	name=n;
 }		
 public void run()
 {
 	for(int i=0;i<10;i++)
 	{
 	 System.out.println(name+" Hello "+i);	
 	}	
 }
}	

class Hello2 implements Runnable
{
 private String name;
 public Hello2(String n)
 {
 	name=n;
 }		
 public void run()
 {
 	for(int i=0;i<10;i++)
 	{
 	 System.out.println(name+" Hello "+i);	
 	}	
 }	
}	