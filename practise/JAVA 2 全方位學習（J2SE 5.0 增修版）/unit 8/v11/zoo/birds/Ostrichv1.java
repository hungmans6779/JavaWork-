package zoo.birds;

public class Ostrichv1 extends Birdv1
{
 private static int count;
 public Ostrichv1()
 {
  setLegs(2);
  setKind("Ostrich");
  count++;
 }
 public void move()
 {
  System.out.println("Running.....");
 }
 public static int getCount()
 {
  return count;
 }
 public void hideHead()
 {
  System.out.println("HideHead.....");
 }
}