public class EX1_1 extends Thread
{
 public static void main(String argv[])
 {
  EX1_1 ta=new EX1_1();
  EX1_1 tb=new EX1_1();
  ta.setName("�����A");
  tb.setName("�����B");
  ta.start();
  tb.start();
  System.out.println("�D�����main�n�����F");	
 }	
 public void run()
 {
 	for(int i=1;i<999;i++)
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