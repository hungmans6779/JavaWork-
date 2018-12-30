interface Play
{
 void play();
}
class Animal
{
 public void eat()
 { System.out.println("Animal eat"); }
}

class Dog extends Animal
{
 public void eat()
 { System.out.println("Dog eat"); }
}

class Pet extends Dog implements Play
{
 public void play()
 {
  System.out.println("Pet play");
 }
}

public class DogPolymorphismTest5
{
 public static void main(String argv[])
 {
  Pet p=new Pet();
  if(p instanceof Play)
  { System.out.println("p IS-A interface P : "+(p instanceof Play)); }	
  Animal a=p;
  a.eat();
  Dog d=new Dog();
  if(d instanceof Pet)
  {
   System.out.println("d instanceof Pet");	
  }	
  //Pet l=(Pet)d;
  //Dog dd=new Animal();
 }
}