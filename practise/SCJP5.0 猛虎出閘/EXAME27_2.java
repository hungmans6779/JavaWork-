class Animal
{
 static int legs=2;	
 static public String noise()
 {
  return "Animal";
 }
}

class Dog extends Animal
{
 static int legs=4;	
 static public String noise()
 {
  return "Dog";
 }
}

class Cat extends Animal
{
 static int legs=4;	
 static public String noise()
 {
  return "Cat";
 }
}

public class EXAME27_2
{
 public static void main(String argv[])
 {
 	Animal animal1=new Animal();
 	System.out.println("animal1 = "+animal1.noise());
 	System.out.println("animal1.legs = "+animal1.legs);
  Animal animal2=new Dog();
  System.out.println("animal2 = "+animal2.noise());
  System.out.println("animal2.legs = "+animal2.legs);
   System.out.println("(Dog)animal2.legs = "+((Dog)animal2).legs);
  Animal animal3=new Cat();
  System.out.println("animal3 = "+animal3.noise());
  System.out.println("(Cat)animal3.legs = "+((Cat)animal3).legs);
  
  Animal a1 =(Animal)new Dog();
  System.out.println("a1 = "+a1.noise());
  System.out.println("(Dog)a1 = "+((Dog)a1).legs);
  
  /*導致編譯錯誤
  Animal a2=(Dog)new Cat();
  System.out.println("a2 = "+a2.noise());
  */
  
  Animal a3=(Animal)new Cat();
  System.out.println("a3 = "+a3.noise());
  
  /* 導致執行時期錯誤
  Animal aa1=new Animal();
  System.out.println("aa1 = "+((Dog)aa1).noise());
  */
  
  Animal aa2=new Dog();
  System.out.println("aa2 = "+((Animal)aa2).noise());
  
  /* 導致執行時期錯誤
  Animal aa3=new Dog();
  System.out.println("aa3 = "+((Cat)aa3).noise());
  */
  
 
 }
}