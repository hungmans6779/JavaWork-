public class EX3_2 implements Runnable
{
 String state="�_�l���A ";	
 public static void main(String argv[])
 {
  EX3_2 at=new EX3_2();
  Thread tr=new Thread(at);
  System.out.println(at.state+tr.isAlive());
  tr.start();
  while(tr.isAlive())
  {
   try
   {
   	Thread.sleep(100);
   }		
   catch(Exception e)
   {
   	e.printStackTrace();
   }	
   System.out.println(at.state+tr.isAlive());
  }	
 }

 public void run()
 {
  state="�i���檬�A ";
  
  for(long n=0,m=0;n<20000000;n++)
  {
   m+=n;	
  }
  try
  {
   state="���ݪ��A ";
   Thread.sleep(150);	
  }
  catch(Exception ie)
  {
   ie.printStackTrace();	
  }
  state="���`���A ";		
 }

}