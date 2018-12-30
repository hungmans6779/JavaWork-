public class Ostrichv9 extends Birdv9
{
 private static int count;
 public Ostrichv9()
 {
  setLegs(2);
  setKind("Ostrich");
  count++;
  move();
  this.move();
  super.move();
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