package zoo;
import zoo.carnivorous.*;
import zoo.birds.*;
import zoo.aquatic.*;

public class Zoov1
{
 public static void main(String argv[])
 {
  Lionv1 lion1=new Lionv1();
  Fishv1 fish1=new Fishv1();
  Fishv1 fish2=new Fishv1();
  Birdv1 bird1=new Birdv1();
  Birdv1 bird2=new Birdv1();
  Ostrichv1 ostrich1=new Ostrichv1();
  System.out.println("Animal obj has = "+Animalv1.getCount());
  System.out.println("Lion obj has = "+Lionv1.getCount());
  System.out.println("Fish obj has = "+Fishv1.getCount());
  System.out.println("Bird obj has = "+Birdv1.getCount());
  System.out.println("Ostrich obj has = "+Ostrichv1.getCount());
 }
}