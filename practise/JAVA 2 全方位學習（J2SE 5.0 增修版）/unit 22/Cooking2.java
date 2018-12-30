import java.util.concurrent.*;
public class Cooking2
{
 public static void main(String argv[])
 {	
  Thread mother=new Thread(new MotherThread2());
  mother.start();
 } 
}
class MotherThread2 implements Runnable
{

 public void run()
 {
 	System.out.println("媽媽準備煮飯");
  System.out.println("媽媽發現米酒用完了");
  System.out.println("媽媽叫兒子去買米酒");	
 	Thread son=new Thread(new SonThread2());
 	son.start();
 	try
 	{	
 	 //son.join();	
 	 TimeUnit.SECONDS.timedJoin(son,6);
 	}	
 	catch(InterruptedException ie)
 	{
 	 System.out.println("發生例外");
 	 System.out.println("媽媽中斷煮飯");
 	 System.exit(1);		
 	}	
 	System.out.println("媽媽開始煮飯");
 	System.out.println("飯煮好了"); 
 }
}
class SonThread2 implements Runnable
{
 public void run()
 {
  try
  {
   System.out.println("兒子出門去買米酒");
   System.out.println("兒子買東西來回需要5分鐘");
   for(int i=1;i<=5;i++)
   {
   	//Thread.sleep(1000);
    	TimeUnit.SECONDS.sleep(1);
   	//TimeUnit.MILLISECONDS.sleep(3);
   	//TimeUnit.MICROSECONDS.sleep(3);
   	//TimeUnit.NANOSECONDS.sleep(3);
   	System.out.print(i+" 分鐘  ");
   }	
   System.out.println("\n兒子買米酒回來了");
  }
  catch(InterruptedException ie)
  {
   System.out.println("兒子發生意外");
  }		
 }
}