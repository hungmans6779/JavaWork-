class Cat1
{
 void amethod()
 {
  System.out.println("我是貓類別");	
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
  System.out.println("我是老虎類別");	
 }
 void bmethod()
 {
  System.out.println("我是老處類別的bmethod()");	
 }
 
 public static void main(String argv[])
 {
  Tiger1 t1=new Tiger1();
  
 }
}