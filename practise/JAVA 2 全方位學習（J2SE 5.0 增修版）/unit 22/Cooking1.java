public class Cooking1
{
 public static void main(String argv[])
 {	
  Thread mother=new Thread(new MotherThread1());
  mother.start();
 } 
}
class MotherThread1 implements Runnable
{

 public void run()
 {
 	System.out.println("�����ǳƵN��");
  System.out.println("�����o�{�̰s�Χ��F");
  System.out.println("�����s��l�h�R�̰s");	
 	Thread son=new Thread(new SonThread1());
 	son.start();
 	try
 	{
 	 son.join();	
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
class SonThread1 implements Runnable
{
 public void run()
 {
  try
  {
   System.out.println("��l�X���h�R�̰s");
   System.out.println("��l�R�F��Ӧ^�ݭn5����");
   for(int i=1;i<=5;i++)
   {
   	Thread.sleep(1000);
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