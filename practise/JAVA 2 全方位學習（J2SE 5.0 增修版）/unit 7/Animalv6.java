public class Animalv6
{
 private int legs;
 private String kind;
 
 public Animalv6()
 {
  setLegs(4);
 }
 public Animalv6(int l)
 {
  setLegs(l);
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
}