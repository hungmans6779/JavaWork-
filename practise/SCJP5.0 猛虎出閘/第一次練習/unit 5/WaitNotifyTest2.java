class Cookies
{
 private int cookiesNo;
 public void put(int cNo)
 {
  System.out.println("主人放了第 "+cNo+" 塊餅乾");
  cookiesNo=cNo;
 }
 public void eat(int cNo)
 {
  System.out.println("小狗吃了第 "+cNo+" 塊餅乾");
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
  for(int i=1;i<=10;i++)
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
 	for(int i=1;i<=10;i++)
 	{
 	 cookies.put(i);	
 	}	
 }	
}	

public class WaitNotifyTest2
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