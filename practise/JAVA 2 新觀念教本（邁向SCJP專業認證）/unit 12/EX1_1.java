public class EX1_1 extends Thread
{
 public static void main(String argv[])
 {
  EX1_1 ta=new EX1_1();
  EX1_1 tb=new EX1_1();
  ta.setName("執行緒A");
  tb.setName("執行緒B");
  ta.start();
  tb.start();
  System.out.println("主執行緒main要結束了");	
 }	
 public void run()
 {
 	for(int i=1;i<999;i++)
 	{
   String s=getName()+"被執行 "+i+" 次了";
   System.out.println(s);
   try
   {
   	Thread.sleep((int)Math.random()*1000);
   }	
   catch(InterruptedException ie)
   {
   	ie.printStackTrace();
   }
  } 
 }
	
}