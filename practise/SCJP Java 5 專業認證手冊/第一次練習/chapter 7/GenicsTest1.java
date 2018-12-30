import java.util.*;
//在函數的引數有指定泛型的條件下，傳入值只能為該泛型
//的型別（泛型是不能搞多型）
//在繼承的關係條件下，Collection可以存放子類別的物件
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

public class GenicsTest1
{
 public static void main(String argv[])
 {
  List<Animal> animal=new ArrayList<Animal>();
  List<Dog> dog=new ArrayList<Dog>();
  animal.add(new Animal());
  animal.add(new Dog());
  dog.add(new Dog());
  dog.add(new Dog());
  test(animal);
  test(dog);
 }
 public static void test(List<?>list)
 {
  for(Object a:list)
  {
   if(a instanceof Animal)
   {
    ((Animal)a).eat();
   }
  }
 }
}