public class Lionv7 extends Animalv7
{
 private  static int count;
 public Lionv7()
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