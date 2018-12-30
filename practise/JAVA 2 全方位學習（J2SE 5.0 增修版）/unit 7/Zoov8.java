public class Zoov8
{
 public static void main(String argv[])
 {
  Birdv8 bird=new Birdv8();
  Fishv8 fish=new Fishv8();
  Lionv8 lion=new Lionv8();
  System.out.println(bird.getKind()+" has "+bird.getLegs()+" legs");
  System.out.println(fish.getKind()+" has " +fish.getLegs()+" legs");
  System.out.println(lion.getKind()+" has "+lion.getLegs()+" legs");
 } 
}