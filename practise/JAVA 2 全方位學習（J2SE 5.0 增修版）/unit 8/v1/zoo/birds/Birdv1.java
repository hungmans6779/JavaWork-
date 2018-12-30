package zoo.birds;

public class Birdv1 extends zoo.Animalv1
{
 private static int count;
 public Birdv1()
 {
  setLegs(2);
  setKind("Birs");
  count++;
 }
 public void move()
 {
  System.out.println("Flying.....");
 }
 public static int getCount()
 {
  return count;
 }

}