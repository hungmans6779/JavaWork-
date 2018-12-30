class Animal 
{
 public void eat() 
 {
  System.out.println("Animal eat");
 }
}
public class DogPolymorphismTest4 extends Animal
{
 public void eat(int i) throws Exception
 {
  System.out.println("Dog eat");
 }
 public static void main(String argv[]) throws Exception
 {
  Animal a=new DogPolymorphismTest4();
  a.eat();
  ((DogPolymorphismTest4)a).eat(1);
 }
}