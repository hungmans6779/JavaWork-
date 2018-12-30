import java.util.*;
class Tot{}
class Animal extends Tot {}
class Dog extends Animal{}
class Cat extends Animal{}
class Bird {}

public class ParameterTest4
{
 public static void main(String argv[])
 {
  List <?> animal1=new ArrayList<Dog>();
  List <? extends Animal> animal2=new ArrayList<Dog>();
  List <? super Dog>animal3=new ArrayList<Animal>();
  List <? super Animal>animal4=new ArrayList<Tot>();

 }
}