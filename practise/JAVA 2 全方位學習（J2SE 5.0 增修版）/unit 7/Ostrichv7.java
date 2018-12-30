public class Ostrichv7 extends Birdv7
{
 private static int count;
 public Ostrichv7()
 {
  setLegs(2);
  setKind("Ostrich");
  count++;
 }
 public void move()
 {
  System.out.println("Runing......");
 }
 public void hideHead()
 {
  System.out.println("HideHead......");
 }
 public static int getCount()
 {
  return count;
 }
}