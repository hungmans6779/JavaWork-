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
  System.out.println("Dog��run()....");
 }
 public static void main(String argv[])
 {
  Animal animal1=new Animal();
  Dog1 dog1=new Dog1();
  //���P�_dog1����O�_�i�H�૬��Animal���覡....
  if(dog1 instanceof Animal)
  {	
   Animal a=(Animal)dog1;	
   System.out.println(a.getValue());	
   //a.run(); //�������,�]��Animal�S��run����k
  }
  
  Animal animal2=new Animal();
  if(animal2 instanceof Dog1)
  {
   //Dog dog2=(Dog1)animal2;	
   System.out.println("�ڦ��Q�����");
  }	
  System.out.println("animal2�O�_���૬��Dog1���Ѧ�:"+(animal2 instanceof Dog1));
  
  
  
 }
}