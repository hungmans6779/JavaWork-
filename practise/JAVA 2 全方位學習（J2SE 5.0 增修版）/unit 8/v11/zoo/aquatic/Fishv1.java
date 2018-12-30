 package zoo.aquatic;
 import zoo.*;
 public class Fishv1 extends Animalv1
 {
  private static int count;
  public Fishv1()
  {
   setLegs(0);
   setKind("Fish");
   count++;
  }
  public static int getCount()
  {
   return count;
  }
 }
 