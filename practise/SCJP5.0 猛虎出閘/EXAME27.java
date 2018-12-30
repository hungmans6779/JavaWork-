class Animal
{
 public String noise()
 {
  return "peep";
 }
}

class Dog extends Animal
{
 public String noise()
 {
  return "Dog";
 }
}

class Cat extends Animal
{
 public String noise()
 {
  return "Cat";
 }
}

public class EXAME27
{
 public static void main(String argv[])
 {
  //Animal animal=new Dog();
  //Cat cat=(Cat)animal;
  //System.out.println(cat.noise());
  
  //執行時期發生錯誤
  /*
  Animal a1=new Animal();
  Cat cat=(Cat)a1;
  */
  
  //Cat c=new Animal();  編譯錯誤
  
  Cat cat1=new Cat();
  Animal aaa1=(Animal)cat1;
  System.out.println("aaa1 = "+aaa1.noise());
  
  Animal a2=new Animal();
  Cat c1=(Cat)a2;
  
 }
}