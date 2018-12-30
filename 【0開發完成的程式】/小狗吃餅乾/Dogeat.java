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
   System.out.println("�D�H��F "+i+" ���氮...");
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
   System.out.println("�p���Y�F "+i+" ���氮...");	
   if(i==999)
   { System.out.println("�p�������F..........."); }
  }	
 }
}


class Cookie
{
 boolean isPlate=false; //false��ܪŽL�l�Atrue��ܦ��氮

 public synchronized void put()
 {
 	while(isPlate) //�p�G�L�l�O���氮���ܡA�h���ݤp����氮�Y��
 	{
 	 try
 	 {	
 	  wait();	//�D�H���ݡA���p���Y���氮
 	 }
 	 catch(InterruptedException ie)
 	 { }
 	}
  isPlate=true; //�L�l�ثe���氮
  notify(); //�I�s�p���ӦY�氮
 }	

 
 public synchronized void eat()
 {
 	while(!isPlate) //�p�G�L�l�O�ŵ۪��ܡA�h�p�����ݥD�H��氮
 	{
 	 try
 	 {	
 	  wait();	//�p�����ݡA���D�H��氮
 	 }
 	 catch(InterruptedException ie)
 	 { }
 	}
  isPlate=false; //�L�l�ثe�S���氮
  notify(); //�I�s�D�H��氮
 }	
}