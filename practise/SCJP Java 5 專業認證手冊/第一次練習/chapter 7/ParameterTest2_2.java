import java.util.*;
import java.io.*;
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Bird extends Animal{}

public class ParameterTest2_2
{
 public static void main(String argv[])
 {
  List<Dog> dog=new ArrayList<Dog>();
  dog.add(new Dog());
  dog.add(new Dog());
  //add(dog);
 }
 public static void add(List<? extends Serializable>animal)
 {
  Iterator it=animal.iterator();
  while(it.hasNext())
  {
   System.out.println(it.next()+"\t");
  }	
 }
}