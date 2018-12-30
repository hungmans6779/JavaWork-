public class Animalv5
{
 private int legs;
 private String kind;
 public Animalv5()
 {
  setLegs(4);
 }
 public Animalv5(int l)
 {
  setLegs(l);
 }
 public void eat()
 {
  System.out.println("Eat.....");
 }
 public void move()
 {
  System.out.println("Moving.....");
 }
 public void setLegs(int l)
 {
  if (l!=0 && l!=2 && l!=4)
  {
   System.out.println("Wrong legs......");
   return;
  }
  else
  {
   legs=l;
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
}