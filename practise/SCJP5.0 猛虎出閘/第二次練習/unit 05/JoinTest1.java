class Father implements Runnable
{
 public void run()
 {
 	System.out.println("爸爸下班回家");
 	System.out.println("爸爸準備洗澡");
 	System.out.println("爸爸發現沒有瓦斯了");
 	System.out.println("爸爸打電話請瓦斯工人送瓦斯");
 	System.out.println("爸爸等待瓦斯工人...");
 	Thread worker=new Thread(new Worker());
  worker.start();
 	try
 	{
   worker.join();
  }
  catch(InterruptedException ie)
  {
   System.out.println("爸爸決定今天不洗澡了...");	
  }	 
  System.out.println("爸爸開始洗澡");
  System.out.println("爸爸洗完澡了");
 }	
}

class Worker implements Runnable
{
 public void run()
 {
 	System.out.println();
 	System.out.println("瓦斯工人送瓦斯中...");
 	for(int count=1;count<=5;count++)
 	{
 	 try
 	 {
 	  Thread.currentThread().sleep(1000);
 	  System.out.print(count+" 分鐘,");	
 	 }
 	 catch(InterruptedException ie)
 	 {
 	  System.out.println("瓦斯工人途中出意外了...");	
 	 }
 	}
 	System.out.println();
 	System.out.println("瓦斯工人將瓦斯送到家中了");
 	System.out.println("瓦斯工人將瓦斯安裝完畢了"); 		
 	//System.out.println();
 }	
}

public class JoinTest1
{
 public static void main(String argv[])
 {
  Thread father=new Thread(new Father());
  father.start();
 }
}