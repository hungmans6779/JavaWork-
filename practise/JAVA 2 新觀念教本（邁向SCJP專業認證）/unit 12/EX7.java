public class EX7
{
 public static void main(String argv[])
 {
  Bank 小明帳戶=new Bank(10000);
  Client 小明=new Client("小明",小明帳戶,2000);
  Client 媽媽=new Client("媽媽",小明帳戶,5000);
  Thread t1=new Thread(小明);
  Thread t2=new Thread(媽媽);
  System.out.println("小明目前的存款為 : "+小明帳戶.check()+" 元");
  t1.start();
  t2.start();
 }
}

class Bank
{
 long money;
 Bank(long m)
 {
 	this.money=m;
 }	
 public synchronized void save(String s,long m)
 {
 	System.out.println(s+" 開始存入"+m);
 	long temp=money;
 	for(long x=0;x<1000000000;x++);
 	money=m+temp;
 }	
 public long check()
 {
  return money;	
 }
}

class Client implements Runnable
{
 String name;
 Bank b;
 long money;	
 Client(String name,Bank b,long money)
 {
 	this.name=name;
 	this.b=b;
 	this.money=money;
 }		
	
 public void run()
 {
  b.save(name,money);  
  System.out.println("存入"+money+" 元後，存款為 "+b.check()+" 元");
 }
}