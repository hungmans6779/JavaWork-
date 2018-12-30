import java.util.*;
class ShowTime implements Runnable
{
 public void run()
 {
 	for(int i=0;i<=100;i++)
 	{
 	 try
 	 {	
 	  Thread.currentThread().sleep(1000);	
 	 }
 	 catch(InterruptedException ie) {} 
 	 System.out.println(Thread.currentThread().getName()+" : "+new Date());
 	  
 	} 
 }		
}	

public class cTest62
{
 public static void main(String argv[])
 {
 	Thread t1=new Thread(new ShowTime());
 	t1.setName("自由人");
 	t1.start();
 	Thread t2=new Thread(new ShowTime());
 	t2.setName("駭客");
 	t2.start();
 	Thread t3=new Thread()
 	{
 	 public void run()
 	 {
 	  for(int i=0;i<=100;i++)	
 	  {
 	   if(i==3)
 	   {
 	   	//System.out.println(Thread.currentThread().getPriority());
 	    //Thread.currentThread().setPriority(10);	
 	    try
 	    {
 	     Thread.currentThread().join();
 	    }
 	    catch(InterruptedException  ie){} 
 	   }
 	   try
 	   {
 	   	Thread.currentThread().sleep(1000);
 	   }		
 	   catch(InterruptedException ie){}
 	 	 System.out.println(Thread.currentThread().getName()+" : "+1);
 	 	} 
 	 }	
 	};
 	t3.setName("匿名的");
 	t3.start();
 }		
}