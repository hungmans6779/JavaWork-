import java.util.*;
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Bird {}

public class ParameterTest2_1
{
 public static void main(String argv[])
 {
  List<Dog> dog=new ArrayList<Dog>();
  dog.add(new Dog());
  dog.add(new Dog());
  add(dog);
  List<Bird> bird=new ArrayList<Bird>();
  bird.add(new Bird());
  //add(bird);  //½sÄ¶¿ù»~
 }
 public static void add(List<? extends Animal>animal)
 {
  for(Animal a:animal)
  {
   System.out.println(a);
  }
 }
}