public class Animalv7
{
 private int legs;
 private String kind;
 private static int count;
 
 public Animalv7()
 {
  setLegs(4);
  count++;
 }
 public Animalv7(int l)
 {
  setLegs(l);
  count++;
 }
 public void eat()
 {
  System.out.println("Eating.....");
 } 
 public void move()
 { 
  System.out.println("Moving......");
 }
 public void setLegs(int l)
 {
  if (l==0 || l==2 || l==4)
  {
   legs=l;
  }
  else
  {
   System.out.println("Wrong legs.......");
  }
 }
 public int getLegs()
 {
   return legs;
 }
 public void setKind(String str)
 {
  kind=str;
 }
 public String getKind()
 {
  return kind;
 }
 public static int getCount()
 {
  return count;
 }
}