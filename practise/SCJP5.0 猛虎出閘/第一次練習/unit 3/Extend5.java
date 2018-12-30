class Father5
{
 public int money=80000;
 public void a()
 {
 	System.out.println("父親的事業");
 }	
}

class Son5 extends Father5
{ 
 private int money;
 public Son5(int money)
 {
 	setMoney(money);
 }	
 public void setMoney(int money)
 {
  this.money=money;	
 }	
 public void a()
 {
 	System.out.println("兒子的事業");
 }	
 public void go()
 {
 	a();
 	System.out.println("產值為 : "+money);
 	System.out.println("===========================");
 	super.a();
 	System.out.println("產值為 : "+super.money); 	
 }	
}

public class Extend5
{
 public static void main(String argv[])
 {
   new Son5(5000).go();
 }
}