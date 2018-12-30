public class Zoov5
{
 public static void main(String argv[])
 {
  Birdv5 bird=new Birdv5();
  Fishv5 fish=new Fishv5();
  Lionv5 lion=new Lionv5();
  System.out.println(bird.getKind()+" has "+bird.getLegs()+" legs");
  System.out.println(fish.getKind()+" has " +fish.getLegs()+" legs");
  System.out.println(lion.getKind()+" has "+lion.getLegs()+" legs");
 } 
}