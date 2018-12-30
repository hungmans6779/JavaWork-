class Cookies
{
 private boolean empty=true; //意味盤子不是空的
 public synchronized void put(int cNo)
 {
 	while(!empty)
 	{
   try
   {
   	wait(); //若盤子不是空的，則主人進入等待
   }
   catch(InterruptedException ie)
   {}	
  }
  System.out.println("主人放了第 "+cNo+" 塊餅乾."); 
  empty=false;
  notify(); //呼叫小白狗吃乾
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
  System.out.println("小白狗吃了第 "+cNo+" 塊餅乾.");
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
