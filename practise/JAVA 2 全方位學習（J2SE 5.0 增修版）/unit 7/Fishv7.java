public class Fishv7 extends Animalv7
{
 private static int count;
 public Fishv7()
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