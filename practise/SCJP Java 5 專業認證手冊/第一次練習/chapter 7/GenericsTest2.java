import java.util.*;

class Animal{}

class Dog extends Animal{}

public class GenericsTest2
{
 public static void main(String argv[])
 {
  List<Animal> list1=new ArrayList<Animal>();
  List<Dog>list2=new ArrayList<Dog>();
  //List<Animal>list3=new ArrayList<Dog>(); //¿ù»~ªº§@ªk
 }
}