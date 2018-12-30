public class EXAME13_2 implements Runnable
{
 int x=0;
 public static void main(String argv[])
 {
  new EXAME13_2().go();
 }
 public void run()
 {
 	try
 	{
 	 Thread.sleep(1000);	
 	}	
 	catch(InterruptedException ie)
 	{
 	 ie.printStackTrace();	
 	}	
  for(int i=0;i<4;i++)
  {
   int count=x;
   System.out.print(count+",");
   x=count+2;	
  }	
 }
 
 public static void go()
 {
  Runnable r1=new EXAME13_2();
  new Thread(r1).start();
  new Thread(r1).start();
 }
}