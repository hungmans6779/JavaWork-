import java.util.*;

class Animal
{
 public void eat()
 {
  System.out.println("Animal eat");
 }
}
class Dog extends Animal
{
 public void eat()
 {
  System.out.println("Dog eat");
 }
}
class Cat extends Animal
{
 public void eat()
 {
  System.out.println("Cat eat");
 }	
}	
class Bird extends Animal
{
 public void eat()
 {
  System.out.println("Bird eat");
 }	
}	

class Fish 
{
 public void eat()
 {
  System.out.println("Fish eat");
 }	
}	
public class GenericsTest3
{
 public static void main(String argv[])
 {
  List<Animal> animal=new ArrayList<Animal>();
  animal.add(new Animal());
  animal.add(new Dog());
  animal.add(new Cat());
  animal.add(new Bird());
  //animal.add(new Fish());
  eatAn(animal);
  System.out.println("==========================");
  List<Dog> dog=new ArrayList<Dog>();
 // dog.add(new Animal());
  dog.add(new Dog());
  dog.add(new Dog());
 }
 
 
 public static void eatAn(List<Animal>list)
 {
 	System.out.println("接受Animal的引數");
 	for(Animal a:list)
 	{
 	 a.eat();	
 	}	
 }	
 public static void eatAn(List<Dog>list)
 {
 	System.out.println("接受Dog的引數");
 	for(Dog a:list)
 	{
 	 a.eat();	
 	}	
 }	
 
}