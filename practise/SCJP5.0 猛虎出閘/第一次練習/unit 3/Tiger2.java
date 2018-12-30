class Cat2
{
 void amethod()
 {
  System.out.println("我是貓類別");	
 }
}

public class Tiger2 extends Cat2
{
  	
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
  Tiger2 t1=new Tiger2();
  t1.amethod();
  t1.bmethod();
  Cat2 t2=new Tiger2();
  t2.amethod();
 }
}