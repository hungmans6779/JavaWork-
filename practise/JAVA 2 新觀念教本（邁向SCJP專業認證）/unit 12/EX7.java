public class EX7
{
 public static void main(String argv[])
 {
  Bank �p���b��=new Bank(10000);
  Client �p��=new Client("�p��",�p���b��,2000);
  Client ����=new Client("����",�p���b��,5000);
  Thread t1=new Thread(�p��);
  Thread t2=new Thread(����);
  System.out.println("�p���ثe���s�ڬ� : "+�p���b��.check()+" ��");
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
 	System.out.println(s+" �}�l�s�J"+m);
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
  System.out.println("�s�J"+money+" ����A�s�ڬ� "+b.check()+" ��");
 }
}