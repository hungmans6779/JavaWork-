public class Zoov2
{
 public static void main(String argv[])
 {
  Animalv2 animal1=new Animalv2(4);
  Animalv2 animal2=new Animalv2(2);
  System.out.println("animal1 has "+animal1.legs+" legs");
  System.out.println("animal2 has "+animal2.legs+" legs");
  animal1.eat();
  animal2.move();
 }
}
