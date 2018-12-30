class FatherThread implements Runnable
{
 public void run()
 {
  System.out.println("爸爸下班回家.");
  System.out.println("爸爸準備洗澡.");
  System.out.println("爸爸發現沒有瓦斯了.");
  System.out.println("爸爸打電話請瓦斯工人送瓦斯.");
  System.out.println("爸爸等待瓦斯工人........");
  Thread.yield();
  Thread work=new Thread(new WorkThread());
  work.start();
  System.out.println("爸爸開始洗澡！");
  System.out.println("爸爸洗完澡了！");
 } 
}
class WorkThread implements Runnable
{
 public void run()
 {	
  System.out.println("瓦斯工人送瓦斯中.......");
  try
  {
   for(int i=1;i<=6;i++)
   {
    Thread.sleep(1000);
    System.out.println(i+" 分鐘,"); 
   }
  }
  catch(InterruptedException ie)
  {
   System.out.println("瓦斯工人在送瓦斯途中出意外了..........");	
  }	  
  System.out.println("瓦斯工人將瓦斯送到家！");
  System.out.println("瓦斯工人安裝完畢！");
 } 
}

public class ThreadYieldTest1
{
 public static void main(String argv[])
 {
  Thread father=new Thread(new FatherThread());
  father.start();
 }
}
