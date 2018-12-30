 package zoo.carnivorous;
 
 public class Lionv1 extends zoo.Animalv1
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