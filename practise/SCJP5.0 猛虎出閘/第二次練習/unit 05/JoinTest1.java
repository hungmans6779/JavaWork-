class Father implements Runnable
{
 public void run()
 {
 	System.out.println("�����U�Z�^�a");
 	System.out.println("�����ǳƬ~��");
 	System.out.println("�����o�{�S���˴��F");
 	System.out.println("�������q�ܽХ˴��u�H�e�˴�");
 	System.out.println("�������ݥ˴��u�H...");
 	Thread worker=new Thread(new Worker());
  worker.start();
 	try
 	{
   worker.join();
  }
  catch(InterruptedException ie)
  {
   System.out.println("�����M�w���Ѥ��~���F...");	
  }	 
  System.out.println("�����}�l�~��");
  System.out.println("�����~�����F");
 }	
}

class Worker implements Runnable
{
 public void run()
 {
 	System.out.println();
 	System.out.println("�˴��u�H�e�˴���...");
 	for(int count=1;count<=5;count++)
 	{
 	 try
 	 {
 	  Thread.currentThread().sleep(1000);
 	  System.out.print(count+" ����,");	
 	 }
 	 catch(InterruptedException ie)
 	 {
 	  System.out.println("�˴��u�H�~���X�N�~�F...");	
 	 }
 	}
 	System.out.println();
 	System.out.println("�˴��u�H�N�˴��e��a���F");
 	System.out.println("�˴��u�H�N�˴��w�˧����F"); 		
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