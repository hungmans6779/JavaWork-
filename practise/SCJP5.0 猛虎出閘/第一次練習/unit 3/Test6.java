class Cat
{
  void amethod()
 {
  System.out.println("�ڬO�����O");	
 }
}
class Tiger extends Cat
{
 void amethod()
 {
  System.out.println("�ڬO�Ѫ����O");	
 }
 void bmethod(){}
}

public class Test6
{	
 public static void main(String argv[])
 {
  Tiger t1=new Tiger(); 
  t1.amethod();
  Cat t2=new Tiger();
  t2.amethod();
  
 } 
}