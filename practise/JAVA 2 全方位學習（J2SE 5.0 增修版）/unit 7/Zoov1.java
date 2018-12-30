public class Zoov1
{
 public static void main(String argv[])
 {
  Animalv1 animal1=new Animalv1();
  Animalv1 animal2=new Animalv1();
  animal1.legs=4;
  System.out.println("animal1 has "+animal1.legs+" legs");
  System.out.println("animal2 has "+animal2.legs+" legs");
  animal1.eat();
  animal2.move();
 }
}
