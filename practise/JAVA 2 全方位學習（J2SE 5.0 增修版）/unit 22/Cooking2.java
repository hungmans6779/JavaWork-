import java.util.concurrent.*;
public class Cooking2
{
 public static void main(String argv[])
 {	
  Thread mother=new Thread(new MotherThread2());
  mother.start();
 } 
}
class MotherThread2 implements Runnable
{

 public void run()
 {
 	System.out.println("�����ǳƵN��");
  System.out.println("�����o�{�̰s�Χ��F");
  System.out.println("�����s��l�h�R�̰s");	
 	Thread son=new Thread(new SonThread2());
 	son.start();
 	try
 	{	
 	 //son.join();	
 	 TimeUnit.SECONDS.timedJoin(son,6);
 	}	
 	catch(InterruptedException ie)
 	{
 	 System.out.println("�o�ͨҥ~");
 	 System.out.println("�������_�N��");
 	 System.exit(1);		
 	}	
 	System.out.println("�����}�l�N��");
 	System.out.println("���N�n�F"); 
 }
}
class SonThread2 implements Runnable
{
 public void run()
 {
  try
  {
   System.out.println("��l�X���h�R�̰s");
   System.out.println("��l�R�F��Ӧ^�ݭn5����");
   for(int i=1;i<=5;i++)
   {
   	//Thread.sleep(1000);
    	TimeUnit.SECONDS.sleep(1);
   	//TimeUnit.MILLISECONDS.sleep(3);
   	//TimeUnit.MICROSECONDS.sleep(3);
   	//TimeUnit.NANOSECONDS.sleep(3);
   	System.out.print(i+" ����  ");
   }	
   System.out.println("\n��l�R�̰s�^�ӤF");
  }
  catch(InterruptedException ie)
  {
   System.out.println("��l�o�ͷN�~");
  }		
 }
}