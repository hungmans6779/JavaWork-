class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Bird extends Animal{}

public class ParameterTest1
{
 public static void main(String argv[])
 {
  Dog dog[]={new Dog(),new Dog()};
  add(dog);
 }
 public static void add(Animal[] a)
 {
 	a[0]=new Dog();
 	//a[1]=new Cat();
 }	
}