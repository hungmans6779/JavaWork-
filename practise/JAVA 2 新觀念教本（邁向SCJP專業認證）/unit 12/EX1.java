public class EX1 extends Thread
{
 public static void main(String argv[])
 {
  EX1 ta=new EX1("�����A");
  EX1 tb=new EX1("�����B");
  ta.start();
  tb.start();
  System.out.println("�D�����main�n�����F");	
 }		
 EX1(String name)
 {
 	super(name);
 }	
 public void run()
 {
 	for(int i=1;i<99;i++)
 	{
   String s=getName()+"�Q���� "+i+" ���F";
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