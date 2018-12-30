public class cTest63
{
 public static void main(String argv[])
 {
  Thread t1=new Thread()
  {
   public void run()
   {
   	for(int i=1;i<=100;i++)
   	{
   	 System.out.println(getName()+i+" 次.");
   	}	
   }		
  };
  t1.setName("自由人");
  t1.start();	
  Thread t2=new Thread()
  {
   public void run()
   {
   	for(int i=1;i<=10;i++)
   	{
   	 System.out.println(getName()+i+" 次.");
   	 try
   	 {
   	  sleep(2000);	
   	 }
   	 catch(InterruptedException ie){}		
   	}	
   }		
  };	
  t2.setName("駭客");
  t2.start();
 }
 
}