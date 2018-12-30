public class Bird extends Animal
{
 private static int count;
 public Bird()
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
 public void hideHead()
 {
  System.out.println("我不是駝鳥所以不會埋頭的....哈哈");
 }
}