public class EXAME16
{
 public static void main(String argv[])
 {
  final Foo f=new Foo();
  Thread t=new Thread(new Runnable()
  {
   public void run()
   {
    f.doStuff();	
   } 
  });
  Thread g=new Thread()
  {
   public void run()
   {
    f.doStuff();	
   }		
  };		
  t.start();
  g.start();
 }
 
 class Foo
 {
 	int x=5;
 	public void doStuff()
 	{
 	 if(x<10)
 	 {
 	 	try
 	 	{
 	 	 wait();	
 	 	}	
 	 	catch(InterruptedException ie)
 	 	{}
 	 }
 	 else
 	 {
 	 	System.out.println("X IS "+x++);
 	 	if(x>=10)
 	 	{
 	 	 notify();	
 	 	}	
 	 }			
 	}	
 }	
}