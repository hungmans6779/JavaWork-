public class Birdv7 extends Animalv7
{
 private static int count;
 public Birdv7()
 {
  setLegs(2);
  setKind("Bird");
  count++;
 }
 public void move()
 {
  System.out.println("Flying......");
 }
 public static int getCount()
 {
  return count;
 }
}