class Animal
{
 void show()
 {
 	System.out.println("我是父類別Animal");
 }		
}	
class Cat extends Animal
{
 void show()
 {
 	System.out.println("我是子類別Cat");
 }		
}

class Bird extends Animal
{
 void show()
 {
 	System.out.println("我是子類別Bird");
 }		
}	

public class Test17
{
 public static void main(String argv[])
 {
 	Animal a=new Cat();
  a.show();
 	Animal a1=(Animal)new Cat();
 	a1.show();
 	
 	Animal a2=new Cat();
 	if(a2 instanceof Bird)
 	{
 	 ((Bird)a2).show();	
 	}	
 	else
 	{
 	 System.out.println("型別錯誤");	
 	}
 	
 	Animal a4;
 	if(new Cat() instanceof Animal)
 	{
 	 a4=(Animal)new Cat();
 	 a4.show();	
 	}	
 }		
}	