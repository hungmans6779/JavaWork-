public class DogEat
{
 public static void main(String argv[])
 {
 	Cookie cookie=new Cookie();
  Master m=new Master(cookie);
  Dog d=new Dog(cookie);
  m.start();
  d.start();
 }
}

class Master extends Thread
{
 Cookie cookie;
 Master(Cookie cookie)
 {
  this.cookie=cookie;	
 }	
 public void run()
 {
 	for(int i=1;i<=99;i++)
 	{
   cookie.put();
   System.out.println("主人放了 "+i+" 塊餅乾...");
  } 
 }
}

class Dog extends Thread
{
 Cookie cookie;	
 Dog(Cookie cookie)
 {
  this.cookie=cookie;	
 }	
 public void run()
 {
  for(int i=1;i<=99;i++)
  {
   cookie.eat();
   System.out.println("小狗吃了 "+i+" 塊餅乾...");	
   if(i==999)
   { System.out.println("小狗撐飽了..........."); }
  }	
 }
}


class Cookie
{
 boolean isPlate=false; //false表示空盤子，true表示有餅乾

 public synchronized void put()
 {
 	while(isPlate) //如果盤子是有餅乾的話，則等待小狗把餅乾吃完
 	{
 	 try
 	 {	
 	  wait();	//主人等待，等小狗吃完餅乾
 	 }
 	 catch(InterruptedException ie)
 	 { }
 	}
  isPlate=true; //盤子目前有餅乾
  notify(); //呼叫小狗來吃餅乾
 }	

 
 public synchronized void eat()
 {
 	while(!isPlate) //如果盤子是空著的話，則小狗等待主人放餅乾
 	{
 	 try
 	 {	
 	  wait();	//小狗等待，等主人放餅乾
 	 }
 	 catch(InterruptedException ie)
 	 { }
 	}
  isPlate=false; //盤子目前沒有餅乾
  notify(); //呼叫主人放餅乾
 }	
}