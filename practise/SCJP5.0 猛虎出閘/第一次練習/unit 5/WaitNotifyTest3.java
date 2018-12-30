class Cookies
{
 private int cookiesNo;
 private static boolean empty=false; //false 表示盤子有食物，反之則反.............
 public synchronized void put(int cNo)
 {
 	while(!empty)
 	{
 	 try
 	 {
 	  wait();	
 	 }	
 	 catch(InterruptedException ie)
 	 {}
 	}	
  System.out.println("主人放了第 "+cNo+" 塊餅乾");
  cookiesNo=cNo;
  empty=false;
  notify();
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
  System.out.println("小狗吃了第 "+cNo+" 塊餅乾");
  empty=true;
  notify();
 }
}
class Eat implements Runnable
{
 Cookies cookies;
 public Eat(Cookies cookies)
 {
 	this.cookies=cookies;
 }		
 public void run()
 {
  for(int i=1;i<=1000;i++)
  {
  	cookies.eat(i);
  }
 } 	
}	

class Put implements Runnable
{
 Cookies cookies;
 public Put(Cookies cookies)
 {
 	this.cookies=cookies;
 }		
 public void run()
 {
 	for(int i=1;i<=1000;i++)
 	{
 	 cookies.put(i);	
 	}	
 }	
}	

public class WaitNotifyTest3
{
 public static void main(String argv[])
 {
 	Cookies cookies=new Cookies();
 	Put put=new Put(cookies);
 	Eat eat=new Eat(cookies);
 	Thread master=new Thread(put);
 	Thread dog=new Thread(eat);
 	dog.start();
 	master.start();
 	
 }	
}	