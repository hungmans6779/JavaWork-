public class EX3_3 implements Runnable
{
 String state="�_�l���A ";	
 public static void main(String argv[])
 {
  final EX3_2 at=new EX3_2();
  Thread tr=new Thread()
  {
   public void run()
   {
    at.run();
   }
  }
  ;
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
  try
  {
   state="���ݪ��A ";
   Thread.sleep(100);	
  }
  catch(Exception ie)
  {
   ie.printStackTrace();	
  }
  state="���`���A ";		
 }

}