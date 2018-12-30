 package zoo.carnivorous;
 import zoo.*;
 
 public class Lionv1 extends Animalv1
 {
  private static int count;
  public Lionv1()
  {
   setLegs(4);
   setKind("Lion");
   count++;
  }
  public static int getCount()
  {
   return count;
  }
 }