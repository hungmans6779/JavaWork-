class Animal
{
 static int i=10;
 public int getValue()
 {
  return i;
 }
}

public class Dog1 extends Animal
{
 int i=20;
 public int getValue()
 {
  return i;
 }
 public void run()
 {
  System.out.println("Dog的run()....");
 }
 public static void main(String argv[])
 {
  Animal animal1=new Animal();
  Dog1 dog1=new Dog1();
  //先判斷dog1物件是否可以轉型成Animal的方式....
  if(dog1 instanceof Animal)
  {	
   Animal a=(Animal)dog1;	
   System.out.println(a.getValue());	
   //a.run(); //不能執行,因為Animal沒有run的方法
  }
  
  Animal animal2=new Animal();
  if(animal2 instanceof Dog1)
  {
   //Dog dog2=(Dog1)animal2;	
   System.out.println("我有被執行到");
  }	
  System.out.println("animal2是否能轉型成Dog1的參考:"+(animal2 instanceof Dog1));
  
  
  
 }
}