package zoo;

public class Zoov1
{
 public static void main(String argv[])
 {
  zoo.carnivorous.Lionv1 lion1=new zoo.carnivorous.Lionv1();
  zoo.aquatic.Fishv1 fish1=new zoo.aquatic.Fishv1();
  zoo.aquatic.Fishv1 fish2=new zoo.aquatic.Fishv1();
  zoo.birds.Birdv1 bird1=new zoo.birds.Birdv1();
  zoo.birds.Birdv1 bird2=new zoo.birds.Birdv1();
  zoo.birds.Ostrichv1 ostrich1=new zoo.birds.Ostrichv1();
  System.out.println("Animal obj has = "+zoo.Animalv1.getCount());
  System.out.println("Lion obj has = "+zoo.carnivorous.Lionv1.getCount());
  System.out.println("Fish obj has = "+zoo.aquatic.Fishv1.getCount());
  System.out.println("Bird obj has = "+zoo.birds.Birdv1.getCount());
  System.out.println("Ostrich obj has = "+zoo.birds.Ostrichv1.getCount());
 }
}