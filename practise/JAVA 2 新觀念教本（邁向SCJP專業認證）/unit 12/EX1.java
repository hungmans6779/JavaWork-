public class EX1 extends Thread
{
 public static void main(String argv[])
 {
  EX1 ta=new EX1("執行緒A");
  EX1 tb=new EX1("執行緒B");
  ta.start();
  tb.start();
  System.out.println("主執行緒main要結束了");	
 }		
 EX1(String name)
 {
 	super(name);
 }	
 public void run()
 {
 	for(int i=1;i<99;i++)
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