public class Cooking1
{
 public static void main(String argv[])
 {	
  Thread mother=new Thread(new MotherThread1());
  mother.start();
 } 
}
class MotherThread1 implements Runnable
{

 public void run()
 {
 	System.out.println("媽媽準備煮飯");
  System.out.println("媽媽發現米酒用完了");
  System.out.println("媽媽叫兒子去買米酒");	
 	Thread son=new Thread(new SonThread1());
 	son.start();
 	try
 	{
 	 son.join();	
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
class SonThread1 implements Runnable
{
 public void run()
 {
  try
  {
   System.out.println("兒子出門去買米酒");
   System.out.println("兒子買東西來回需要5分鐘");
   for(int i=1;i<=5;i++)
   {
   	Thread.sleep(1000);
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