import java.util.*;
class Animal{} 
class Dog extends Animal{}
class Cat extends Animal{}
class Bird {}

public class ParameterTest3
{
 public static void main(String argv[])
 {
  List <Animal> animal=new ArrayList<Animal>();
  animal.add(new Animal());
  animal.add(new Dog());
  animal.add(new Cat());
  //animal.add(new Bird()); //½sÄ¶¿ù»~
  test(animal);
 }
 public static void test(List<? super Dog>a)
 {
  a.add(new Dog());
  for(Object aa:a)
  {
   System.out.println(aa);	
  }	
 }
}