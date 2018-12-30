public class Fish extends Animal
{
 private static int count;
 public Fish()
 {
  setLegs(0);
  setKind("Fish");
  count++;
 }
 public static int getCount()
 {
  return count;
 }
 public void move()
 {
  System.out.println("Swing.....");
 }
}