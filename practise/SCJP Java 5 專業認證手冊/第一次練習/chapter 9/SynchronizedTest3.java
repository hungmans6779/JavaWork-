import java.util.*;
class MyList
{
 private List names=Collections.synchronizedList(new LinkedList());	
 public void add(String name)
 {
 	names.add(name);
 }	
 
 public String removeFirst()
 {
  if(names.size()>0)
  {
  	return (String)names.remove(0);
  }	
  else
  {
   return null;	
  }
 } 	
}

public class SynchronizedTest3
{
 public static void main(String argv[])
 {
  final MyList my=new MyList();
 	my.add("Jacky");
 	class MyThread extends Thread
 	{
 	 public void run()
 	 {
 	  try
 	 	{ Thread.sleep(500); 	}	
 	 	catch(InterruptedException ie)
 	 	{}
 	 	System.out.println(my.removeFirst());
 	 }		
 	}
 	Thread t1=new MyThread();
 	Thread t2=new MyThread();
 	t1.start();
 	t2.start();	
 }	
}	