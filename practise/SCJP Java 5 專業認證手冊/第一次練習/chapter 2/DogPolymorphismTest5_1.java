interface Play
{
 void play();
}
class Animal
{
 public void eat()
 { System.out.println("Animal eat"); }
}

class Dog extends Animal implements Play
{
 public void eat()
 { System.out.println("Dog eat"); }
 public void play()
 { System.out.println("Pet play"); }
}

class Pet extends Dog 
{
 
}

public class DogPolymorphismTest5_1
{
 public static void main(String argv[])
 {
  Pet p=new Pet();
  if(p instanceof Play)
  { System.out.println("p IS-A interface Play : "+(p instanceof Play)); }	
  Animal a=p;
  a.eat();
  Dog d=new Dog();
  if(d instanceof Pet)
  { System.out.println("d IS-A class Pet : "+(d instanceof Pet)); }		
   if(d instanceof Play)
  { System.out.println("d IS-A interface Play : "+(d instanceof Play)); }		
 }
}