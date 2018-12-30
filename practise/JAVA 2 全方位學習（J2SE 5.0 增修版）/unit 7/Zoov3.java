public class Zoov3
{
 public static void main(String argv[])
 {
  Animalv3 animal1=new Animalv3();
  Animalv3 animal2=new Animalv3(2);
  System.out.println("animal1 has "+animal1.legs+" legs");
  System.out.println("animal2 has "+animal2.legs+" legs");
  animal1.eat();
  animal2.move();
 }
}
