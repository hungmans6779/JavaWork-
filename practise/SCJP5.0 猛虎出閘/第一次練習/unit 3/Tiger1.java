class Cat1
{
 void amethod()
 {
  System.out.println("�ڬO�����O");	
 }
}

public class Tiger1 extends Cat1
{
 public Tiger1()
 {
  this.amethod();	
  this.bmethod();
  super.amethod();
  go();
 }		
  void go()
  {
   super.amethod();	
  }
  	
  void amethod()
 {
  System.out.println("�ڬO�Ѫ����O");	
 }
 void bmethod()
 {
  System.out.println("�ڬO�ѳB���O��bmethod()");	
 }
 
 public static void main(String argv[])
 {
  Tiger1 t1=new Tiger1();
  
 }
}