import java.util.*;
class Tot{}
class Animal extends Tot {}
class Dog extends Animal{}
class Cat extends Animal{}
class Bird {}

public class ParameterTest3_1
{
 public static void main(String argv[])
 {
  List <Animal> animal=new ArrayList<Animal>();
  animal.add(new Animal());
  animal.add(new Dog());
  animal.add(new Cat());
  //animal.add(new Bird()); //½sÄ¶¿ù»~
  //test(animal);
  List<Tot>tot=new ArrayList<Tot>();
  tot.add(new Tot());
  tot.add(new Animal());
  tot.add(new Dog());
  tot.add(new Cat());
  test(tot);
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