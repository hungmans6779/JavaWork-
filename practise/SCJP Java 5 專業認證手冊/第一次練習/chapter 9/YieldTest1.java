class Father implements Runnable
{
 public void run()
 {
  System.out.println("爸爸現在要洗澡");
  System.out.println("爸爸洗到一半發現瓦斯沒有了");
  System.out.println("爸爸打電話叫瓦斯工人送瓦斯");
  System.out.println("爸爸要等到瓦斯工人來才能繼續洗澡");
  Thread.currentThread().yield();
  Work work=new Work();
  work.start();
  
  System.out.println("爸爸開始洗澡了");
  System.out.println("爸爸洗完澡了...........");  
 }
}

class Work extends Thread
{
 public void run()
 {
 	System.out.println("瓦斯工作在送瓦斯途中......");
 	try
 	{
 	 for(int i=1;i<=5;i++)
 	 {
 	 	Thread.sleep(1000);
 	 	System.out.print(i+" 分鐘"+"\t");
 	 }		
 	}	
 	catch(InterruptedException ie)
 	{}
 	System.out.println();
  System.out.println("瓦斯工人到了");
  System.out.println("換好瓦斯了");
 }
}

public class YieldTest1
{
 public static void main(String argv[])
 {
  Father f=new Father();
  Thread t=new Thread(f);
  t.start();
 }
}