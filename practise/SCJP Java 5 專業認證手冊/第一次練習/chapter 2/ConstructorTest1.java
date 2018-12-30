class Animal
{
 private String name;	
 private Animal()
 {
  System.out.println("Animal");
 }
 public Animal(String n)
 {
 	this();
  this.name=n;
 }	
}

class Dog extends Animal
{
 Dog()
 {
 	super("Animal");
  System.out.println("Dog");
 }
}

public class ConstructorTest1
{
 public static void main(String argv[])
 {
  new Dog();
 }
}