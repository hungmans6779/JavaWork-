class FatherThread implements Runnable
{
 public void run()
 {
  System.out.println("�����U�Z�^�a.");
  System.out.println("�����ǳƬ~��.");
  System.out.println("�����o�{�S���˴��F.");
  System.out.println("�������q�ܽХ˴��u�H�e�˴�.");
  System.out.println("�������ݥ˴��u�H........");
  Thread.yield();
  Thread work=new Thread(new WorkThread());
  work.start();
  System.out.println("�����}�l�~���I");
  System.out.println("�����~�����F�I");
 } 
}
class WorkThread implements Runnable
{
 public void run()
 {	
  System.out.println("�˴��u�H�e�˴���.......");
  try
  {
   for(int i=1;i<=6;i++)
   {
    Thread.sleep(1000);
    System.out.println(i+" ����,"); 
   }
  }
  catch(InterruptedException ie)
  {
   System.out.println("�˴��u�H�b�e�˴��~���X�N�~�F..........");	
  }	  
  System.out.println("�˴��u�H�N�˴��e��a�I");
  System.out.println("�˴��u�H�w�˧����I");
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
