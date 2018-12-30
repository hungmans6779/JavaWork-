public class Lionv9 extends Animalv9
{
 private  static int count;
 public Lionv9()
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