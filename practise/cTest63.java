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
   	 System.out.println(getName()+i+" ��.");
   	}	
   }		
  };
  t1.setName("�ۥѤH");
  t1.start();	
  Thread t2=new Thread()
  {
   public void run()
   {
   	for(int i=1;i<=10;i++)
   	{
   	 System.out.println(getName()+i+" ��.");
   	 try
   	 {
   	  sleep(2000);	
   	 }
   	 catch(InterruptedException ie){}		
   	}	
   }		
  };	
  t2.setName("�b��");
  t2.start();
 }
 
}