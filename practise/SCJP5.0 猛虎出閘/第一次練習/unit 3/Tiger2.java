class Cat2
{
 void amethod()
 {
  System.out.println("�ڬO�����O");	
 }
}

public class Tiger2 extends Cat2
{
  	
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
  Tiger2 t1=new Tiger2();
  t1.amethod();
  t1.bmethod();
  Cat2 t2=new Tiger2();
  t2.amethod();
 }
}