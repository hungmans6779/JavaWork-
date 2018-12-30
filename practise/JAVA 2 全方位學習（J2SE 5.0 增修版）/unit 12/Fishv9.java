public class Fishv9 extends Animalv9
{
 private static int count;
 public Fishv9()
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