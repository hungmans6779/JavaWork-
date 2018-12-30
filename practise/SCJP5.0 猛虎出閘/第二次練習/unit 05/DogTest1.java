class Cookies
{
 private boolean empty=true; //�N���L�l���O�Ū�
 public synchronized void put(int cNo)
 {
 	while(!empty)
 	{
   try
   {
   	wait(); //�Y�L�l���O�Ū��A�h�D�H�i�J����
   }
   catch(InterruptedException ie)
   {}	
  }
  System.out.println("�D�H��F�� "+cNo+" ���氮."); 
  empty=false;
  notify(); //�I�s�p�ժ��Y��
 }
 public synchronized void eat(int cNo)
 {
 	while(empty)
 	{
 	 try
 	 {
 	 	wait();
 	 }
 	 catch(InterruptedException ie)
 	 { }	
 	}	
  System.out.println("�p�ժ��Y�F�� "+cNo+" ���氮.");
  empty=true;
  notify();
  
 }
}

class Eat implements Runnable
{
 Cookies cookies;	
 Eat(Cookies cookies)
 {
 	this.cookies=cookies;
 }	
 public void run()
 {
  for(int i=1;i<=10;i++)
  {
   cookies.eat(i);	
  }	
 }
}

class Put implements Runnable
{
 Cookies cookies;
 Put(Cookies cookies)
 {
  this.cookies=cookies;	
 }	
 public void run()
 {
  for(int i=1;i<=10;i++)
  {
   cookies.put(i);	
  }	
 }
}

public class DogTest1
{
 public static void main(String argv[])
 {
  Cookies cookies=new Cookies();
  Put put=new Put(cookies);
  Eat eat=new Eat(cookies);
  Thread dog=new Thread(eat);
  Thread master=new Thread(put);
  dog.start();
  master.start();
 }
}
