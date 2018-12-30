public class Ostrich extends Bird
{
 private static int count;
 public Ostrich()
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