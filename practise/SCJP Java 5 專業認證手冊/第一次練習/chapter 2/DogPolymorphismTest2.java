class Animal
{
 int i=10;	
 public static void eat()
 {
  System.out.println("Animal eat");
 }
}
public class DogPolymorphismTest2 extends Animal
{
 int i=20;	
 public static void eat()
 {
  System.out.println("Dog eat");
  //super.eat();
 }
 public static void main(String argv[])
 {
  Animal a=new DogPolymorphismTest2();
  a.eat();
  System.out.println(a.i);
 }
}