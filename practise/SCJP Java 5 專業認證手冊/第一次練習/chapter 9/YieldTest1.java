class Father implements Runnable
{
 public void run()
 {
  System.out.println("�����{�b�n�~��");
  System.out.println("�����~��@�b�o�{�˴��S���F");
  System.out.println("�������q�ܥs�˴��u�H�e�˴�");
  System.out.println("�����n����˴��u�H�Ӥ~���~��~��");
  Thread.currentThread().yield();
  Work work=new Work();
  work.start();
  
  System.out.println("�����}�l�~���F");
  System.out.println("�����~�����F...........");  
 }
}

class Work extends Thread
{
 public void run()
 {
 	System.out.println("�˴��u�@�b�e�˴��~��......");
 	try
 	{
 	 for(int i=1;i<=5;i++)
 	 {
 	 	Thread.sleep(1000);
 	 	System.out.print(i+" ����"+"\t");
 	 }		
 	}	
 	catch(InterruptedException ie)
 	{}
 	System.out.println();
  System.out.println("�˴��u�H��F");
  System.out.println("���n�˴��F");
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