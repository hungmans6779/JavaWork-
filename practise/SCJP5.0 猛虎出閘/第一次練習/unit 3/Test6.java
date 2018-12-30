class Cat
{
  void amethod()
 {
  System.out.println("我是貓類別");	
 }
}
class Tiger extends Cat
{
 void amethod()
 {
  System.out.println("我是老虎類別");	
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