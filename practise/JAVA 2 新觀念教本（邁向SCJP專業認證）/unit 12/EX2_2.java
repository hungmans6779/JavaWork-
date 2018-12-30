public class EX2_2
{
 public static void main(String argv[])
 {
 	final RunnableTest rt=new RunnableTest();
 	Thread st=new Thread()
 	{
 	 public void run()
 	 {
 	  rt.run();
 	 }
 	};
 	st.start();
 	for(int i=0;i<30;i++)
 	{
 	 rt.show();
 	 try
 	 {
 	 	Thread.sleep((int)Math.random()*100);
 	 }		
 	 catch(InterruptedException ie)
 	 {
 	 	ie.printStackTrace();
 	 }	
 	}
 	System.exit(0);	
 }	
}

class RunnableTest implements Runnable
{
 private int n=0;
 public void run()
 {
  while(true)
  {
   n=(n+1)%10;	
  }		
 }
 public void show()
 {
  System.out.print(n+" ");	
 }			
}