class Animal
{
 void show()
 {
 	System.out.println("�ڬO�����OAnimal");
 }		
}	
class Cat extends Animal
{
 void show()
 {
 	System.out.println("�ڬO�l���OCat");
 }		
}

class Bird extends Animal
{
 void show()
 {
 	System.out.println("�ڬO�l���OBird");
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
 	 System.out.println("���O���~");	
 	}
 	
 	Animal a4;
 	if(new Cat() instanceof Animal)
 	{
 	 a4=(Animal)new Cat();
 	 a4.show();	
 	}	
 }		
}	