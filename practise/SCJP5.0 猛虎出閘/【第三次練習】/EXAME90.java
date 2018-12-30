class Animal{}
class Dog extends Animal{}
class Mary extends Dog{}

public class EXAME90
{
 public static void main(String argv[])
 {
  Dog dog=new Dog();
  Animal a=(Mary)dog;
 }
}