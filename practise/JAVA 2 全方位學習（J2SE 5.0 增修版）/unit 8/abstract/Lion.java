public class Lion extends Animal
{
 private  static int count;
 public Lion()
 {
  setLegs(4);
  setKind("Lion");
  count++;
 }
 public static int getCount()
 {
  return count;
 }
 public void move()
 {
  System.out.println("Running and Jumping .....");
 }
}