public class Birdv9 extends Animalv9
{
 private static int count;
 public Birdv9()
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